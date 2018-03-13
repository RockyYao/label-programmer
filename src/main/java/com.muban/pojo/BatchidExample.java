package com.muban.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchidExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWorkorderidIsNull() {
            addCriterion("WorkOrderId is null");
            return (Criteria) this;
        }

        public Criteria andWorkorderidIsNotNull() {
            addCriterion("WorkOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkorderidEqualTo(String value) {
            addCriterion("WorkOrderId =", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidNotEqualTo(String value) {
            addCriterion("WorkOrderId <>", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidGreaterThan(String value) {
            addCriterion("WorkOrderId >", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidGreaterThanOrEqualTo(String value) {
            addCriterion("WorkOrderId >=", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidLessThan(String value) {
            addCriterion("WorkOrderId <", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidLessThanOrEqualTo(String value) {
            addCriterion("WorkOrderId <=", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidLike(String value) {
            addCriterion("WorkOrderId like", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidNotLike(String value) {
            addCriterion("WorkOrderId not like", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidIn(List<String> values) {
            addCriterion("WorkOrderId in", values, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidNotIn(List<String> values) {
            addCriterion("WorkOrderId not in", values, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidBetween(String value1, String value2) {
            addCriterion("WorkOrderId between", value1, value2, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidNotBetween(String value1, String value2) {
            addCriterion("WorkOrderId not between", value1, value2, "workorderid");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BatchNo is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BatchNo =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BatchNo <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BatchNo >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BatchNo >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BatchNo <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BatchNo <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BatchNo like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BatchNo not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BatchNo in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BatchNo not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BatchNo between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BatchNo not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoIsNull() {
            addCriterion("MBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andMbatchnoIsNotNull() {
            addCriterion("MBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andMbatchnoEqualTo(String value) {
            addCriterion("MBatchNo =", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoNotEqualTo(String value) {
            addCriterion("MBatchNo <>", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoGreaterThan(String value) {
            addCriterion("MBatchNo >", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("MBatchNo >=", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoLessThan(String value) {
            addCriterion("MBatchNo <", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoLessThanOrEqualTo(String value) {
            addCriterion("MBatchNo <=", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoLike(String value) {
            addCriterion("MBatchNo like", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoNotLike(String value) {
            addCriterion("MBatchNo not like", value, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoIn(List<String> values) {
            addCriterion("MBatchNo in", values, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoNotIn(List<String> values) {
            addCriterion("MBatchNo not in", values, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoBetween(String value1, String value2) {
            addCriterion("MBatchNo between", value1, value2, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andMbatchnoNotBetween(String value1, String value2) {
            addCriterion("MBatchNo not between", value1, value2, "mbatchno");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNull() {
            addCriterion("UpdatedAt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNotNull() {
            addCriterion("UpdatedAt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatEqualTo(Date value) {
            addCriterion("UpdatedAt =", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotEqualTo(Date value) {
            addCriterion("UpdatedAt <>", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThan(Date value) {
            addCriterion("UpdatedAt >", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdatedAt >=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThan(Date value) {
            addCriterion("UpdatedAt <", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThanOrEqualTo(Date value) {
            addCriterion("UpdatedAt <=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIn(List<Date> values) {
            addCriterion("UpdatedAt in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotIn(List<Date> values) {
            addCriterion("UpdatedAt not in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatBetween(Date value1, Date value2) {
            addCriterion("UpdatedAt between", value1, value2, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotBetween(Date value1, Date value2) {
            addCriterion("UpdatedAt not between", value1, value2, "updatedat");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNull() {
            addCriterion("MaterialNo is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNotNull() {
            addCriterion("MaterialNo is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoEqualTo(String value) {
            addCriterion("MaterialNo =", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotEqualTo(String value) {
            addCriterion("MaterialNo <>", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThan(String value) {
            addCriterion("MaterialNo >", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThanOrEqualTo(String value) {
            addCriterion("MaterialNo >=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThan(String value) {
            addCriterion("MaterialNo <", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThanOrEqualTo(String value) {
            addCriterion("MaterialNo <=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLike(String value) {
            addCriterion("MaterialNo like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotLike(String value) {
            addCriterion("MaterialNo not like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIn(List<String> values) {
            addCriterion("MaterialNo in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotIn(List<String> values) {
            addCriterion("MaterialNo not in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoBetween(String value1, String value2) {
            addCriterion("MaterialNo between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotBetween(String value1, String value2) {
            addCriterion("MaterialNo not between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNull() {
            addCriterion("SourceType is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("SourceType is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(String value) {
            addCriterion("SourceType =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(String value) {
            addCriterion("SourceType <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(String value) {
            addCriterion("SourceType >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SourceType >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(String value) {
            addCriterion("SourceType <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(String value) {
            addCriterion("SourceType <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLike(String value) {
            addCriterion("SourceType like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotLike(String value) {
            addCriterion("SourceType not like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<String> values) {
            addCriterion("SourceType in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<String> values) {
            addCriterion("SourceType not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(String value1, String value2) {
            addCriterion("SourceType between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(String value1, String value2) {
            addCriterion("SourceType not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNull() {
            addCriterion("SourceId is null");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNotNull() {
            addCriterion("SourceId is not null");
            return (Criteria) this;
        }

        public Criteria andSourceidEqualTo(String value) {
            addCriterion("SourceId =", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotEqualTo(String value) {
            addCriterion("SourceId <>", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThan(String value) {
            addCriterion("SourceId >", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThanOrEqualTo(String value) {
            addCriterion("SourceId >=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThan(String value) {
            addCriterion("SourceId <", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThanOrEqualTo(String value) {
            addCriterion("SourceId <=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLike(String value) {
            addCriterion("SourceId like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotLike(String value) {
            addCriterion("SourceId not like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidIn(List<String> values) {
            addCriterion("SourceId in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotIn(List<String> values) {
            addCriterion("SourceId not in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidBetween(String value1, String value2) {
            addCriterion("SourceId between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotBetween(String value1, String value2) {
            addCriterion("SourceId not between", value1, value2, "sourceid");
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