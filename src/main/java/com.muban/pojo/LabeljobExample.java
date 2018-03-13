package com.muban.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabeljobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabeljobExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
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

        public Criteria andJobidIsNull() {
            addCriterion("JobId is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("JobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(String value) {
            addCriterion("JobId =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(String value) {
            addCriterion("JobId <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(String value) {
            addCriterion("JobId >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(String value) {
            addCriterion("JobId >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(String value) {
            addCriterion("JobId <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(String value) {
            addCriterion("JobId <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLike(String value) {
            addCriterion("JobId like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotLike(String value) {
            addCriterion("JobId not like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<String> values) {
            addCriterion("JobId in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<String> values) {
            addCriterion("JobId not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(String value1, String value2) {
            addCriterion("JobId between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(String value1, String value2) {
            addCriterion("JobId not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobownerIsNull() {
            addCriterion("JobOwner is null");
            return (Criteria) this;
        }

        public Criteria andJobownerIsNotNull() {
            addCriterion("JobOwner is not null");
            return (Criteria) this;
        }

        public Criteria andJobownerEqualTo(String value) {
            addCriterion("JobOwner =", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerNotEqualTo(String value) {
            addCriterion("JobOwner <>", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerGreaterThan(String value) {
            addCriterion("JobOwner >", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerGreaterThanOrEqualTo(String value) {
            addCriterion("JobOwner >=", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerLessThan(String value) {
            addCriterion("JobOwner <", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerLessThanOrEqualTo(String value) {
            addCriterion("JobOwner <=", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerLike(String value) {
            addCriterion("JobOwner like", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerNotLike(String value) {
            addCriterion("JobOwner not like", value, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerIn(List<String> values) {
            addCriterion("JobOwner in", values, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerNotIn(List<String> values) {
            addCriterion("JobOwner not in", values, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerBetween(String value1, String value2) {
            addCriterion("JobOwner between", value1, value2, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobownerNotBetween(String value1, String value2) {
            addCriterion("JobOwner not between", value1, value2, "jobowner");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("JobType is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("JobType is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(String value) {
            addCriterion("JobType =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(String value) {
            addCriterion("JobType <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(String value) {
            addCriterion("JobType >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("JobType >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(String value) {
            addCriterion("JobType <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(String value) {
            addCriterion("JobType <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLike(String value) {
            addCriterion("JobType like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotLike(String value) {
            addCriterion("JobType not like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<String> values) {
            addCriterion("JobType in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<String> values) {
            addCriterion("JobType not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(String value1, String value2) {
            addCriterion("JobType between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(String value1, String value2) {
            addCriterion("JobType not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNull() {
            addCriterion("JobStatus is null");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNotNull() {
            addCriterion("JobStatus is not null");
            return (Criteria) this;
        }

        public Criteria andJobstatusEqualTo(Integer value) {
            addCriterion("JobStatus =", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotEqualTo(Integer value) {
            addCriterion("JobStatus <>", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThan(Integer value) {
            addCriterion("JobStatus >", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobStatus >=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThan(Integer value) {
            addCriterion("JobStatus <", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThanOrEqualTo(Integer value) {
            addCriterion("JobStatus <=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusIn(List<Integer> values) {
            addCriterion("JobStatus in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotIn(List<Integer> values) {
            addCriterion("JobStatus not in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusBetween(Integer value1, Integer value2) {
            addCriterion("JobStatus between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("JobStatus not between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CreatedBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CreatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("CreatedBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("CreatedBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("CreatedBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("CreatedBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("CreatedBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("CreatedBy like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("CreatedBy not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("CreatedBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("CreatedBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("CreatedBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("CreatedBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreateddttmIsNull() {
            addCriterion("CreatedDttm is null");
            return (Criteria) this;
        }

        public Criteria andCreateddttmIsNotNull() {
            addCriterion("CreatedDttm is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddttmEqualTo(Date value) {
            addCriterion("CreatedDttm =", value, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmNotEqualTo(Date value) {
            addCriterion("CreatedDttm <>", value, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmGreaterThan(Date value) {
            addCriterion("CreatedDttm >", value, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedDttm >=", value, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmLessThan(Date value) {
            addCriterion("CreatedDttm <", value, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmLessThanOrEqualTo(Date value) {
            addCriterion("CreatedDttm <=", value, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmIn(List<Date> values) {
            addCriterion("CreatedDttm in", values, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmNotIn(List<Date> values) {
            addCriterion("CreatedDttm not in", values, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmBetween(Date value1, Date value2) {
            addCriterion("CreatedDttm between", value1, value2, "createddttm");
            return (Criteria) this;
        }

        public Criteria andCreateddttmNotBetween(Date value1, Date value2) {
            addCriterion("CreatedDttm not between", value1, value2, "createddttm");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNull() {
            addCriterion("UpdatedBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNotNull() {
            addCriterion("UpdatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyEqualTo(String value) {
            addCriterion("UpdatedBy =", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotEqualTo(String value) {
            addCriterion("UpdatedBy <>", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThan(String value) {
            addCriterion("UpdatedBy >", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("UpdatedBy >=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThan(String value) {
            addCriterion("UpdatedBy <", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThanOrEqualTo(String value) {
            addCriterion("UpdatedBy <=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLike(String value) {
            addCriterion("UpdatedBy like", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotLike(String value) {
            addCriterion("UpdatedBy not like", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIn(List<String> values) {
            addCriterion("UpdatedBy in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotIn(List<String> values) {
            addCriterion("UpdatedBy not in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyBetween(String value1, String value2) {
            addCriterion("UpdatedBy between", value1, value2, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotBetween(String value1, String value2) {
            addCriterion("UpdatedBy not between", value1, value2, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmIsNull() {
            addCriterion("UpdatedDttm is null");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmIsNotNull() {
            addCriterion("UpdatedDttm is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmEqualTo(Date value) {
            addCriterion("UpdatedDttm =", value, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmNotEqualTo(Date value) {
            addCriterion("UpdatedDttm <>", value, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmGreaterThan(Date value) {
            addCriterion("UpdatedDttm >", value, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdatedDttm >=", value, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmLessThan(Date value) {
            addCriterion("UpdatedDttm <", value, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmLessThanOrEqualTo(Date value) {
            addCriterion("UpdatedDttm <=", value, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmIn(List<Date> values) {
            addCriterion("UpdatedDttm in", values, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmNotIn(List<Date> values) {
            addCriterion("UpdatedDttm not in", values, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmBetween(Date value1, Date value2) {
            addCriterion("UpdatedDttm between", value1, value2, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andUpdateddttmNotBetween(Date value1, Date value2) {
            addCriterion("UpdatedDttm not between", value1, value2, "updateddttm");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNull() {
            addCriterion("Template is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("Template is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("Template =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("Template <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("Template >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("Template >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("Template <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("Template <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("Template like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("Template not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("Template in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("Template not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("Template between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("Template not between", value1, value2, "template");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
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
}