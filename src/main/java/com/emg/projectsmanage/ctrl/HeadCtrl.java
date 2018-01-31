package com.emg.projectsmanage.ctrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.emg.projectsmanage.common.CommonConstants;
import com.emg.projectsmanage.common.ParamUtils;
import com.emg.projectsmanage.pojo.EmployeeModel;
import com.emg.projectsmanage.pojo.SystemModel;
import com.emg.projectsmanage.service.CommService;
import com.emg.projectsmanage.service.EmapgoAccountService;
import com.emg.projectsmanage.service.MessageModelService;

@Controller
@RequestMapping("/head.web")
public class HeadCtrl extends BaseCtrl {

	private static final Logger logger = LoggerFactory.getLogger(HeadCtrl.class);
	@Autowired
	private CommService commService;
	@Autowired
	private EmapgoAccountService emapgoAccountService;
	@Autowired
	private MessageModelService messageModelService;

	@RequestMapping()
	public String head(Model model, HttpSession session, HttpServletRequest request) {
		logger.debug("Head-head start.");
		String account = getLoginAccount(session);
		logger.debug("account:" + account);
		EmployeeModel record = new EmployeeModel();
		record.setUsername(account);
		EmployeeModel user = emapgoAccountService.getOneEmployee(record);
		String fromurl = ParamUtils.getParameter(request, "fromurl");
		model.addAttribute("fromurl", fromurl);
		if ("".equals(account)) {
			model.addAttribute("islogin", false);
		} else {
			model.addAttribute("islogin", true);
			model.addAttribute("account", user.getRealname());

			List<SystemModel> systems = commService.getAllSystems();
			model.addAttribute("systems", systems);
		}

		logger.debug("Head-head end.");
		return "head";
	}

	@RequestMapping(params = "atn=changesys")
	public ModelAndView changeSys(Model model, HttpSession session, HttpServletRequest request) {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		int sysid = ParamUtils.getIntParameter(request, "sysid", CommonConstants.SYSTEM_POIVIDEOEDIT_ID);
		session.setAttribute(CommonConstants.SESSION_CURRENTSYSTEMID, sysid);
		json.addObject("result", 1);

		return json;
	}
}
