package com.emg.projectsmanage.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessModelExample {
    protected String orderByClause;
    
    protected Integer limit;
    
    protected Integer offset;

    protected boolean distinct;

    protected List<CriteriaC> oredCriteria;

    public ProcessModelExample() {
        oredCriteria = new ArrayList<CriteriaC>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<CriteriaC> getOredCriteria() {
        return oredCriteria;
    }

    public void or(CriteriaC criteria) {
        oredCriteria.add(criteria);
    }

    public CriteriaC or() {
        CriteriaC criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public CriteriaC createCriteria() {
        CriteriaC criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected CriteriaC createCriteriaInternal() {
        CriteriaC criteria = new CriteriaC();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public CriteriaC andIdIsNull() {
            addCriterion("id is null");
            return (CriteriaC) this;
        }

        public CriteriaC andIdIsNotNull() {
            addCriterion("id is not null");
            return (CriteriaC) this;
        }

        public CriteriaC andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (CriteriaC) this;
        }

        public CriteriaC andNameIsNull() {
            addCriterion("name is null");
            return (CriteriaC) this;
        }

        public CriteriaC andNameIsNotNull() {
            addCriterion("name is not null");
            return (CriteriaC) this;
        }

        public CriteriaC andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (CriteriaC) this;
        }

        public CriteriaC andStateIsNull() {
            addCriterion("state is null");
            return (CriteriaC) this;
        }

        public CriteriaC andStateIsNotNull() {
            addCriterion("state is not null");
            return (CriteriaC) this;
        }

        public CriteriaC andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (CriteriaC) this;
        }

        public CriteriaC andStageStateEqualTo(Integer value) {
            addCriterion("stagestate =", value, "stagestate");
            return (CriteriaC) this;
        }
        
        public CriteriaC andStageIsNull() {
            addCriterion("stage is null");
            return (CriteriaC) this;
        }

        public CriteriaC andStageIsNotNull() {
            addCriterion("stage is not null");
            return (CriteriaC) this;
        }

        public CriteriaC andStageEqualTo(Integer value) {
            addCriterion("stage =", value, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageNotEqualTo(Integer value) {
            addCriterion("stage <>", value, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageGreaterThan(Integer value) {
            addCriterion("stage >", value, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("stage >=", value, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageLessThan(Integer value) {
            addCriterion("stage <", value, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageLessThanOrEqualTo(Integer value) {
            addCriterion("stage <=", value, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageIn(List<Integer> values) {
            addCriterion("stage in", values, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageNotIn(List<Integer> values) {
            addCriterion("stage not in", values, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageBetween(Integer value1, Integer value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andStageNotBetween(Integer value1, Integer value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressIsNull() {
            addCriterion("progress is null");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressEqualTo(String value) {
            addCriterion("progress =", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressNotEqualTo(String value) {
            addCriterion("progress <>", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressGreaterThan(String value) {
            addCriterion("progress >", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressGreaterThanOrEqualTo(String value) {
            addCriterion("progress >=", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressLessThan(String value) {
            addCriterion("progress <", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressLessThanOrEqualTo(String value) {
            addCriterion("progress <=", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressLike(String value) {
            addCriterion("progress like", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressNotLike(String value) {
            addCriterion("progress not like", value, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressIn(List<String> values) {
            addCriterion("progress in", values, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressNotIn(List<String> values) {
            addCriterion("progress not in", values, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressBetween(String value1, String value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andProgressNotBetween(String value1, String value2) {
            addCriterion("progress not between", value1, value2, "progress");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridIsNull() {
            addCriterion("userid is null");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeIsNull() {
            addCriterion("time is null");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeIsNotNull() {
            addCriterion("time is not null");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (CriteriaC) this;
        }

        public CriteriaC andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (CriteriaC) this;
        }
    }

    public static class CriteriaC extends GeneratedCriteria {

        protected CriteriaC() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
}