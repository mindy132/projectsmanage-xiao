<%@page import="com.emg.projectsmanage.common.ParamUtils"%>
<%@page import="com.emg.projectsmanage.common.CommonConstants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%!String getMenuCode(String url) {
		if (url.indexOf("/usersmanage.web") > 0) {
			return "999";
		} else if (url.indexOf("/skillsmanage.web") > 0) {
			return "1000";
		} else if (url.indexOf("/processesmanage.web") > 0) {
			return "1001";
		} else if (url.indexOf("/projectsmanage.web") > 0) {
			return "1002";
		} else if (url.indexOf("/worktasks.web") > 0) {
			return "1003";
		} else if (url.indexOf("/projectsprocess.web") > 0) {
			return "1004";
		} else if (url.indexOf("/capacitycount.web") > 0) {
			return "1005";
		}
		return "0000";
	}%>
<%
	String menucode = getMenuCode(ParamUtils.getAttribute(request,
			"fromurl"));
	Integer userID = (Integer) session.getAttribute(CommonConstants.SESSION_USER_ID);
%>

<script type="text/javascript">
	$("#systems").change(function() {
		var sysname = $("#systems  option:selected").attr("title");
		var sysid = $("#systems").val();
		$.ajax({
			async : false,
			type : 'POST',
			url : './head.web',
			data : {
				atn : "changesys",
				sysname : sysname,
				sysid : sysid
			},
			dataType : 'json',
			success : function(result) {
			}
		}).done(function(json) {
			if (json.result == 1) {
				window.location.reload();
			} else {
				$.webeditor.showMsgLabel("alert", "平台变更失败");
			}
		});

	});
</script>
<div class="headline">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header" style="width: 16%; min-width: 160px;">
				<a class="navbar-brand headicon" href="#"></a> <span
					class="headword"><strong>任务管理系统</strong></span>
			</div>

			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<sec:authorize access="hasAnyRole('ROLE_ADMIN' )">
						<li class="<%="999".equals(menucode) ? "active" : ""%>"><a
							href="<c:url value='usersmanage.web'/>">人员信息管理</a></li>
					</sec:authorize>
					<!--<sec:authorize access="hasAnyRole('ROLE_ADMIN' )">
						<li class="<%="1000".equals(menucode) ? "active" : ""%>">
							<a href="<c:url value='skillsmanage.web'/>">人员技能管理</a>
						</li>processesconfig.jsp
					</sec:authorize>-->
					<sec:authorize access="hasAnyRole('ROLE_POIVIDEOEDIT' )">
						<li class="<%="1001".equals(menucode) ? "active" : ""%>"><a
							href="<c:url value='processesmanage.web'/>">流程管理</a></li>
					</sec:authorize>
					<sec:authorize access="hasAnyRole('ROLE_POIVIDEOEDIT' )">
						<li class="<%="1002".equals(menucode) ? "active" : ""%>"><a
							href="<c:url value='projectsmanage.web'/>">项目管理</a></li>
					</sec:authorize>
					<sec:authorize
						access="hasAnyRole('ROLE_POIVIDEOEDIT' ,'ROLE_WORKER' ,'ROLE_CHECKER')">
						<li class="<%="1003".equals(menucode) ? "active" : ""%>"><a
							href="<c:url value='worktasks.web'/>">作业任务</a></li>
					</sec:authorize>
					<sec:authorize
						access="hasAnyRole('ROLE_POIVIDEOEDIT' ,'ROLE_WORKER' ,'ROLE_CHECKER')">
						<li class="<%="1004".equals(menucode) ? "active" : ""%>"><a
							href="<c:url value='projectsprocess.web'/>">项目进度</a></li>
					</sec:authorize>
					<sec:authorize
						access="hasAnyRole('ROLE_POIVIDEOEDIT' ,'ROLE_WORKER' ,'ROLE_CHECKER')">
						<li class="<%="1005".equals(menucode) ? "active" : ""%>"><a
							href="<c:url value='capacitycount.web'/>">产能统计</a></li>
					</sec:authorize>
				</ul>

				<ul class="nav navbar-nav navbar-right" style="width: 40%;">
					<c:if test="${systems.size() >0 }">
						<li style="padding-top: 10px; width: 40%;"><select id="systems" class="form-control">
								<c:forEach items="${systems }" var="sys">
									<c:choose>
										<c:when
											test="${sys['id'].equals(com_emg_webeditor_CURRENTSYSTEMID) }">
											<option value="${sys['id'] }" selected="selected">${sys['desc']
												}</option>
										</c:when>
										<c:otherwise>
											<option value="${sys['id'] }">${sys['desc'] }</option>
										</c:otherwise>
									</c:choose>
								</c:forEach>
						</select></li>
					</c:if>
					<c:choose>
						<c:when test="${islogin}">
							<li><a href="#"><c:out value="${account}" /></a></li>
							<li id="limsg"></li>
							<li><a href="<c:url value='./logout'/>">退出</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="javascript:void(0);" id="loginbtn">登陆</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</nav>
</div>
<script type="text/javascript">
	$("#loginbtn").bind('click', function() {
		$.webeditor.gotoLogin('<c:url value="/"/>');
	});
</script>

<div></div>