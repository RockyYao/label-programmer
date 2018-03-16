package com.muban.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabelprintconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabelprintconfigExample() {
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

        public Criteria andConfigidIsNull() {
            addCriterion("ConfigID is null");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNotNull() {
            addCriterion("ConfigID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigidEqualTo(Long value) {
            addCriterion("ConfigID =", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotEqualTo(Long value) {
            addCriterion("ConfigID <>", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThan(Long value) {
            addCriterion("ConfigID >", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThanOrEqualTo(Long value) {
            addCriterion("ConfigID >=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThan(Long value) {
            addCriterion("ConfigID <", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThanOrEqualTo(Long value) {
            addCriterion("ConfigID <=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidIn(List<Long> values) {
            addCriterion("ConfigID in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotIn(List<Long> values) {
            addCriterion("ConfigID not in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidBetween(Long value1, Long value2) {
            addCriterion("ConfigID between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotBetween(Long value1, Long value2) {
            addCriterion("ConfigID not between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIsNull() {
            addCriterion("TemplateName is null");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIsNotNull() {
            addCriterion("TemplateName is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatenameEqualTo(String value) {
            addCriterion("TemplateName =", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotEqualTo(String value) {
            addCriterion("TemplateName <>", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameGreaterThan(String value) {
            addCriterion("TemplateName >", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameGreaterThanOrEqualTo(String value) {
            addCriterion("TemplateName >=", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLessThan(String value) {
            addCriterion("TemplateName <", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLessThanOrEqualTo(String value) {
            addCriterion("TemplateName <=", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLike(String value) {
            addCriterion("TemplateName like", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotLike(String value) {
            addCriterion("TemplateName not like", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIn(List<String> values) {
            addCriterion("TemplateName in", values, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotIn(List<String> values) {
            addCriterion("TemplateName not in", values, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameBetween(String value1, String value2) {
            addCriterion("TemplateName between", value1, value2, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotBetween(String value1, String value2) {
            addCriterion("TemplateName not between", value1, value2, "templatename");
            return (Criteria) this;
        }

        public Criteria andPrinternameIsNull() {
            addCriterion("PrinterName is null");
            return (Criteria) this;
        }

        public Criteria andPrinternameIsNotNull() {
            addCriterion("PrinterName is not null");
            return (Criteria) this;
        }

        public Criteria andPrinternameEqualTo(String value) {
            addCriterion("PrinterName =", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotEqualTo(String value) {
            addCriterion("PrinterName <>", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameGreaterThan(String value) {
            addCriterion("PrinterName >", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameGreaterThanOrEqualTo(String value) {
            addCriterion("PrinterName >=", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameLessThan(String value) {
            addCriterion("PrinterName <", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameLessThanOrEqualTo(String value) {
            addCriterion("PrinterName <=", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameLike(String value) {
            addCriterion("PrinterName like", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotLike(String value) {
            addCriterion("PrinterName not like", value, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameIn(List<String> values) {
            addCriterion("PrinterName in", values, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotIn(List<String> values) {
            addCriterion("PrinterName not in", values, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameBetween(String value1, String value2) {
            addCriterion("PrinterName between", value1, value2, "printername");
            return (Criteria) this;
        }

        public Criteria andPrinternameNotBetween(String value1, String value2) {
            addCriterion("PrinterName not between", value1, value2, "printername");
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

        public Criteria andPrinteripIsNull() {
            addCriterion("PrinterIP is null");
            return (Criteria) this;
        }

        public Criteria andPrinteripIsNotNull() {
            addCriterion("PrinterIP is not null");
            return (Criteria) this;
        }

        public Criteria andPrinteripEqualTo(String value) {
            addCriterion("PrinterIP =", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripNotEqualTo(String value) {
            addCriterion("PrinterIP <>", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripGreaterThan(String value) {
            addCriterion("PrinterIP >", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripGreaterThanOrEqualTo(String value) {
            addCriterion("PrinterIP >=", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripLessThan(String value) {
            addCriterion("PrinterIP <", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripLessThanOrEqualTo(String value) {
            addCriterion("PrinterIP <=", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripLike(String value) {
            addCriterion("PrinterIP like", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripNotLike(String value) {
            addCriterion("PrinterIP not like", value, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripIn(List<String> values) {
            addCriterion("PrinterIP in", values, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripNotIn(List<String> values) {
            addCriterion("PrinterIP not in", values, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripBetween(String value1, String value2) {
            addCriterion("PrinterIP between", value1, value2, "printerip");
            return (Criteria) this;
        }

        public Criteria andPrinteripNotBetween(String value1, String value2) {
            addCriterion("PrinterIP not between", value1, value2, "printerip");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
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