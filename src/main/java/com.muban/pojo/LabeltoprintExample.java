package com.muban.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabeltoprintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabeltoprintExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoIsNull() {
            addCriterion("SAPMaterialNo is null");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoIsNotNull() {
            addCriterion("SAPMaterialNo is not null");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoEqualTo(String value) {
            addCriterion("SAPMaterialNo =", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoNotEqualTo(String value) {
            addCriterion("SAPMaterialNo <>", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoGreaterThan(String value) {
            addCriterion("SAPMaterialNo >", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoGreaterThanOrEqualTo(String value) {
            addCriterion("SAPMaterialNo >=", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoLessThan(String value) {
            addCriterion("SAPMaterialNo <", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoLessThanOrEqualTo(String value) {
            addCriterion("SAPMaterialNo <=", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoLike(String value) {
            addCriterion("SAPMaterialNo like", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoNotLike(String value) {
            addCriterion("SAPMaterialNo not like", value, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoIn(List<String> values) {
            addCriterion("SAPMaterialNo in", values, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoNotIn(List<String> values) {
            addCriterion("SAPMaterialNo not in", values, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoBetween(String value1, String value2) {
            addCriterion("SAPMaterialNo between", value1, value2, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialnoNotBetween(String value1, String value2) {
            addCriterion("SAPMaterialNo not between", value1, value2, "sapmaterialno");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CustomerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CustomerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CustomerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CustomerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CustomerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CustomerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CustomerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CustomerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CustomerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CustomerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CustomerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("ProductNo is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("ProductNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("ProductNo =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("ProductNo <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("ProductNo >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("ProductNo >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("ProductNo <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("ProductNo <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("ProductNo like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("ProductNo not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("ProductNo in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("ProductNo not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("ProductNo between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("ProductNo not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andVersionindexIsNull() {
            addCriterion("VersionIndex is null");
            return (Criteria) this;
        }

        public Criteria andVersionindexIsNotNull() {
            addCriterion("VersionIndex is not null");
            return (Criteria) this;
        }

        public Criteria andVersionindexEqualTo(String value) {
            addCriterion("VersionIndex =", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexNotEqualTo(String value) {
            addCriterion("VersionIndex <>", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexGreaterThan(String value) {
            addCriterion("VersionIndex >", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexGreaterThanOrEqualTo(String value) {
            addCriterion("VersionIndex >=", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexLessThan(String value) {
            addCriterion("VersionIndex <", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexLessThanOrEqualTo(String value) {
            addCriterion("VersionIndex <=", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexLike(String value) {
            addCriterion("VersionIndex like", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexNotLike(String value) {
            addCriterion("VersionIndex not like", value, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexIn(List<String> values) {
            addCriterion("VersionIndex in", values, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexNotIn(List<String> values) {
            addCriterion("VersionIndex not in", values, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexBetween(String value1, String value2) {
            addCriterion("VersionIndex between", value1, value2, "versionindex");
            return (Criteria) this;
        }

        public Criteria andVersionindexNotBetween(String value1, String value2) {
            addCriterion("VersionIndex not between", value1, value2, "versionindex");
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

        public Criteria andMaterialbatchnoIsNull() {
            addCriterion("MaterialBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoIsNotNull() {
            addCriterion("MaterialBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoEqualTo(String value) {
            addCriterion("MaterialBatchNo =", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoNotEqualTo(String value) {
            addCriterion("MaterialBatchNo <>", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoGreaterThan(String value) {
            addCriterion("MaterialBatchNo >", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("MaterialBatchNo >=", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoLessThan(String value) {
            addCriterion("MaterialBatchNo <", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoLessThanOrEqualTo(String value) {
            addCriterion("MaterialBatchNo <=", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoLike(String value) {
            addCriterion("MaterialBatchNo like", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoNotLike(String value) {
            addCriterion("MaterialBatchNo not like", value, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoIn(List<String> values) {
            addCriterion("MaterialBatchNo in", values, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoNotIn(List<String> values) {
            addCriterion("MaterialBatchNo not in", values, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoBetween(String value1, String value2) {
            addCriterion("MaterialBatchNo between", value1, value2, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andMaterialbatchnoNotBetween(String value1, String value2) {
            addCriterion("MaterialBatchNo not between", value1, value2, "materialbatchno");
            return (Criteria) this;
        }

        public Criteria andEmploynoIsNull() {
            addCriterion("EmployNo is null");
            return (Criteria) this;
        }

        public Criteria andEmploynoIsNotNull() {
            addCriterion("EmployNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmploynoEqualTo(String value) {
            addCriterion("EmployNo =", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoNotEqualTo(String value) {
            addCriterion("EmployNo <>", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoGreaterThan(String value) {
            addCriterion("EmployNo >", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoGreaterThanOrEqualTo(String value) {
            addCriterion("EmployNo >=", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoLessThan(String value) {
            addCriterion("EmployNo <", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoLessThanOrEqualTo(String value) {
            addCriterion("EmployNo <=", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoLike(String value) {
            addCriterion("EmployNo like", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoNotLike(String value) {
            addCriterion("EmployNo not like", value, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoIn(List<String> values) {
            addCriterion("EmployNo in", values, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoNotIn(List<String> values) {
            addCriterion("EmployNo not in", values, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoBetween(String value1, String value2) {
            addCriterion("EmployNo between", value1, value2, "employno");
            return (Criteria) this;
        }

        public Criteria andEmploynoNotBetween(String value1, String value2) {
            addCriterion("EmployNo not between", value1, value2, "employno");
            return (Criteria) this;
        }

        public Criteria andTonernameIsNull() {
            addCriterion("TonerName is null");
            return (Criteria) this;
        }

        public Criteria andTonernameIsNotNull() {
            addCriterion("TonerName is not null");
            return (Criteria) this;
        }

        public Criteria andTonernameEqualTo(String value) {
            addCriterion("TonerName =", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameNotEqualTo(String value) {
            addCriterion("TonerName <>", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameGreaterThan(String value) {
            addCriterion("TonerName >", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameGreaterThanOrEqualTo(String value) {
            addCriterion("TonerName >=", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameLessThan(String value) {
            addCriterion("TonerName <", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameLessThanOrEqualTo(String value) {
            addCriterion("TonerName <=", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameLike(String value) {
            addCriterion("TonerName like", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameNotLike(String value) {
            addCriterion("TonerName not like", value, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameIn(List<String> values) {
            addCriterion("TonerName in", values, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameNotIn(List<String> values) {
            addCriterion("TonerName not in", values, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameBetween(String value1, String value2) {
            addCriterion("TonerName between", value1, value2, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonernameNotBetween(String value1, String value2) {
            addCriterion("TonerName not between", value1, value2, "tonername");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoIsNull() {
            addCriterion("TonerBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoIsNotNull() {
            addCriterion("TonerBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoEqualTo(String value) {
            addCriterion("TonerBatchNo =", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoNotEqualTo(String value) {
            addCriterion("TonerBatchNo <>", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoGreaterThan(String value) {
            addCriterion("TonerBatchNo >", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("TonerBatchNo >=", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoLessThan(String value) {
            addCriterion("TonerBatchNo <", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoLessThanOrEqualTo(String value) {
            addCriterion("TonerBatchNo <=", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoLike(String value) {
            addCriterion("TonerBatchNo like", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoNotLike(String value) {
            addCriterion("TonerBatchNo not like", value, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoIn(List<String> values) {
            addCriterion("TonerBatchNo in", values, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoNotIn(List<String> values) {
            addCriterion("TonerBatchNo not in", values, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoBetween(String value1, String value2) {
            addCriterion("TonerBatchNo between", value1, value2, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andTonerbatchnoNotBetween(String value1, String value2) {
            addCriterion("TonerBatchNo not between", value1, value2, "tonerbatchno");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeIsNull() {
            addCriterion("DifferentCode is null");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeIsNotNull() {
            addCriterion("DifferentCode is not null");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeEqualTo(String value) {
            addCriterion("DifferentCode =", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeNotEqualTo(String value) {
            addCriterion("DifferentCode <>", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeGreaterThan(String value) {
            addCriterion("DifferentCode >", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DifferentCode >=", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeLessThan(String value) {
            addCriterion("DifferentCode <", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeLessThanOrEqualTo(String value) {
            addCriterion("DifferentCode <=", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeLike(String value) {
            addCriterion("DifferentCode like", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeNotLike(String value) {
            addCriterion("DifferentCode not like", value, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeIn(List<String> values) {
            addCriterion("DifferentCode in", values, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeNotIn(List<String> values) {
            addCriterion("DifferentCode not in", values, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeBetween(String value1, String value2) {
            addCriterion("DifferentCode between", value1, value2, "differentcode");
            return (Criteria) this;
        }

        public Criteria andDifferentcodeNotBetween(String value1, String value2) {
            addCriterion("DifferentCode not between", value1, value2, "differentcode");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("Size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("Size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andVendorcodeIsNull() {
            addCriterion("VendorCode is null");
            return (Criteria) this;
        }

        public Criteria andVendorcodeIsNotNull() {
            addCriterion("VendorCode is not null");
            return (Criteria) this;
        }

        public Criteria andVendorcodeEqualTo(String value) {
            addCriterion("VendorCode =", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeNotEqualTo(String value) {
            addCriterion("VendorCode <>", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeGreaterThan(String value) {
            addCriterion("VendorCode >", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("VendorCode >=", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeLessThan(String value) {
            addCriterion("VendorCode <", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeLessThanOrEqualTo(String value) {
            addCriterion("VendorCode <=", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeLike(String value) {
            addCriterion("VendorCode like", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeNotLike(String value) {
            addCriterion("VendorCode not like", value, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeIn(List<String> values) {
            addCriterion("VendorCode in", values, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeNotIn(List<String> values) {
            addCriterion("VendorCode not in", values, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeBetween(String value1, String value2) {
            addCriterion("VendorCode between", value1, value2, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andVendorcodeNotBetween(String value1, String value2) {
            addCriterion("VendorCode not between", value1, value2, "vendorcode");
            return (Criteria) this;
        }

        public Criteria andUptimesIsNull() {
            addCriterion("UpTimes is null");
            return (Criteria) this;
        }

        public Criteria andUptimesIsNotNull() {
            addCriterion("UpTimes is not null");
            return (Criteria) this;
        }

        public Criteria andUptimesEqualTo(Integer value) {
            addCriterion("UpTimes =", value, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesNotEqualTo(Integer value) {
            addCriterion("UpTimes <>", value, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesGreaterThan(Integer value) {
            addCriterion("UpTimes >", value, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpTimes >=", value, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesLessThan(Integer value) {
            addCriterion("UpTimes <", value, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesLessThanOrEqualTo(Integer value) {
            addCriterion("UpTimes <=", value, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesIn(List<Integer> values) {
            addCriterion("UpTimes in", values, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesNotIn(List<Integer> values) {
            addCriterion("UpTimes not in", values, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesBetween(Integer value1, Integer value2) {
            addCriterion("UpTimes between", value1, value2, "uptimes");
            return (Criteria) this;
        }

        public Criteria andUptimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UpTimes not between", value1, value2, "uptimes");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNull() {
            addCriterion("NetWeight is null");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNotNull() {
            addCriterion("NetWeight is not null");
            return (Criteria) this;
        }

        public Criteria andNetweightEqualTo(BigDecimal value) {
            addCriterion("NetWeight =", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotEqualTo(BigDecimal value) {
            addCriterion("NetWeight <>", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThan(BigDecimal value) {
            addCriterion("NetWeight >", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NetWeight >=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThan(BigDecimal value) {
            addCriterion("NetWeight <", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NetWeight <=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightIn(List<BigDecimal> values) {
            addCriterion("NetWeight in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotIn(List<BigDecimal> values) {
            addCriterion("NetWeight not in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NetWeight between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NetWeight not between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNull() {
            addCriterion("GrossWeight is null");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNotNull() {
            addCriterion("GrossWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossweightEqualTo(BigDecimal value) {
            addCriterion("GrossWeight =", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotEqualTo(BigDecimal value) {
            addCriterion("GrossWeight <>", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThan(BigDecimal value) {
            addCriterion("GrossWeight >", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GrossWeight >=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThan(BigDecimal value) {
            addCriterion("GrossWeight <", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GrossWeight <=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightIn(List<BigDecimal> values) {
            addCriterion("GrossWeight in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotIn(List<BigDecimal> values) {
            addCriterion("GrossWeight not in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GrossWeight between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GrossWeight not between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andModelnoIsNull() {
            addCriterion("ModelNo is null");
            return (Criteria) this;
        }

        public Criteria andModelnoIsNotNull() {
            addCriterion("ModelNo is not null");
            return (Criteria) this;
        }

        public Criteria andModelnoEqualTo(String value) {
            addCriterion("ModelNo =", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotEqualTo(String value) {
            addCriterion("ModelNo <>", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoGreaterThan(String value) {
            addCriterion("ModelNo >", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoGreaterThanOrEqualTo(String value) {
            addCriterion("ModelNo >=", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoLessThan(String value) {
            addCriterion("ModelNo <", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoLessThanOrEqualTo(String value) {
            addCriterion("ModelNo <=", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoLike(String value) {
            addCriterion("ModelNo like", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotLike(String value) {
            addCriterion("ModelNo not like", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoIn(List<String> values) {
            addCriterion("ModelNo in", values, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotIn(List<String> values) {
            addCriterion("ModelNo not in", values, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoBetween(String value1, String value2) {
            addCriterion("ModelNo between", value1, value2, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotBetween(String value1, String value2) {
            addCriterion("ModelNo not between", value1, value2, "modelno");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionIsNull() {
            addCriterion("MaterialDescription is null");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionIsNotNull() {
            addCriterion("MaterialDescription is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionEqualTo(String value) {
            addCriterion("MaterialDescription =", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionNotEqualTo(String value) {
            addCriterion("MaterialDescription <>", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionGreaterThan(String value) {
            addCriterion("MaterialDescription >", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("MaterialDescription >=", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionLessThan(String value) {
            addCriterion("MaterialDescription <", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionLessThanOrEqualTo(String value) {
            addCriterion("MaterialDescription <=", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionLike(String value) {
            addCriterion("MaterialDescription like", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionNotLike(String value) {
            addCriterion("MaterialDescription not like", value, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionIn(List<String> values) {
            addCriterion("MaterialDescription in", values, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionNotIn(List<String> values) {
            addCriterion("MaterialDescription not in", values, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionBetween(String value1, String value2) {
            addCriterion("MaterialDescription between", value1, value2, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andMaterialdescriptionNotBetween(String value1, String value2) {
            addCriterion("MaterialDescription not between", value1, value2, "materialdescription");
            return (Criteria) this;
        }

        public Criteria andPonoIsNull() {
            addCriterion("PoNo is null");
            return (Criteria) this;
        }

        public Criteria andPonoIsNotNull() {
            addCriterion("PoNo is not null");
            return (Criteria) this;
        }

        public Criteria andPonoEqualTo(String value) {
            addCriterion("PoNo =", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotEqualTo(String value) {
            addCriterion("PoNo <>", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoGreaterThan(String value) {
            addCriterion("PoNo >", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoGreaterThanOrEqualTo(String value) {
            addCriterion("PoNo >=", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLessThan(String value) {
            addCriterion("PoNo <", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLessThanOrEqualTo(String value) {
            addCriterion("PoNo <=", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLike(String value) {
            addCriterion("PoNo like", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotLike(String value) {
            addCriterion("PoNo not like", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoIn(List<String> values) {
            addCriterion("PoNo in", values, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotIn(List<String> values) {
            addCriterion("PoNo not in", values, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoBetween(String value1, String value2) {
            addCriterion("PoNo between", value1, value2, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotBetween(String value1, String value2) {
            addCriterion("PoNo not between", value1, value2, "pono");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoIsNull() {
            addCriterion("SAPMaterialBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoIsNotNull() {
            addCriterion("SAPMaterialBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoEqualTo(String value) {
            addCriterion("SAPMaterialBatchNo =", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotEqualTo(String value) {
            addCriterion("SAPMaterialBatchNo <>", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoGreaterThan(String value) {
            addCriterion("SAPMaterialBatchNo >", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("SAPMaterialBatchNo >=", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoLessThan(String value) {
            addCriterion("SAPMaterialBatchNo <", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoLessThanOrEqualTo(String value) {
            addCriterion("SAPMaterialBatchNo <=", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoLike(String value) {
            addCriterion("SAPMaterialBatchNo like", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotLike(String value) {
            addCriterion("SAPMaterialBatchNo not like", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoIn(List<String> values) {
            addCriterion("SAPMaterialBatchNo in", values, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotIn(List<String> values) {
            addCriterion("SAPMaterialBatchNo not in", values, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoBetween(String value1, String value2) {
            addCriterion("SAPMaterialBatchNo between", value1, value2, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotBetween(String value1, String value2) {
            addCriterion("SAPMaterialBatchNo not between", value1, value2, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceIsNull() {
            addCriterion("BoxSequence is null");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceIsNotNull() {
            addCriterion("BoxSequence is not null");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceEqualTo(Long value) {
            addCriterion("BoxSequence =", value, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceNotEqualTo(Long value) {
            addCriterion("BoxSequence <>", value, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceGreaterThan(Long value) {
            addCriterion("BoxSequence >", value, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceGreaterThanOrEqualTo(Long value) {
            addCriterion("BoxSequence >=", value, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceLessThan(Long value) {
            addCriterion("BoxSequence <", value, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceLessThanOrEqualTo(Long value) {
            addCriterion("BoxSequence <=", value, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceIn(List<Long> values) {
            addCriterion("BoxSequence in", values, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceNotIn(List<Long> values) {
            addCriterion("BoxSequence not in", values, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceBetween(Long value1, Long value2) {
            addCriterion("BoxSequence between", value1, value2, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxsequenceNotBetween(Long value1, Long value2) {
            addCriterion("BoxSequence not between", value1, value2, "boxsequence");
            return (Criteria) this;
        }

        public Criteria andBoxnoIsNull() {
            addCriterion("BoxNo is null");
            return (Criteria) this;
        }

        public Criteria andBoxnoIsNotNull() {
            addCriterion("BoxNo is not null");
            return (Criteria) this;
        }

        public Criteria andBoxnoEqualTo(String value) {
            addCriterion("BoxNo =", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotEqualTo(String value) {
            addCriterion("BoxNo <>", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoGreaterThan(String value) {
            addCriterion("BoxNo >", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoGreaterThanOrEqualTo(String value) {
            addCriterion("BoxNo >=", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoLessThan(String value) {
            addCriterion("BoxNo <", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoLessThanOrEqualTo(String value) {
            addCriterion("BoxNo <=", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoLike(String value) {
            addCriterion("BoxNo like", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotLike(String value) {
            addCriterion("BoxNo not like", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoIn(List<String> values) {
            addCriterion("BoxNo in", values, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotIn(List<String> values) {
            addCriterion("BoxNo not in", values, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoBetween(String value1, String value2) {
            addCriterion("BoxNo between", value1, value2, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotBetween(String value1, String value2) {
            addCriterion("BoxNo not between", value1, value2, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxsumIsNull() {
            addCriterion("BoxSum is null");
            return (Criteria) this;
        }

        public Criteria andBoxsumIsNotNull() {
            addCriterion("BoxSum is not null");
            return (Criteria) this;
        }

        public Criteria andBoxsumEqualTo(Long value) {
            addCriterion("BoxSum =", value, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumNotEqualTo(Long value) {
            addCriterion("BoxSum <>", value, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumGreaterThan(Long value) {
            addCriterion("BoxSum >", value, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumGreaterThanOrEqualTo(Long value) {
            addCriterion("BoxSum >=", value, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumLessThan(Long value) {
            addCriterion("BoxSum <", value, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumLessThanOrEqualTo(Long value) {
            addCriterion("BoxSum <=", value, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumIn(List<Long> values) {
            addCriterion("BoxSum in", values, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumNotIn(List<Long> values) {
            addCriterion("BoxSum not in", values, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumBetween(Long value1, Long value2) {
            addCriterion("BoxSum between", value1, value2, "boxsum");
            return (Criteria) this;
        }

        public Criteria andBoxsumNotBetween(Long value1, Long value2) {
            addCriterion("BoxSum not between", value1, value2, "boxsum");
            return (Criteria) this;
        }

        public Criteria andWorkorderIsNull() {
            addCriterion("WorkOrder is null");
            return (Criteria) this;
        }

        public Criteria andWorkorderIsNotNull() {
            addCriterion("WorkOrder is not null");
            return (Criteria) this;
        }

        public Criteria andWorkorderEqualTo(String value) {
            addCriterion("WorkOrder =", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderNotEqualTo(String value) {
            addCriterion("WorkOrder <>", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderGreaterThan(String value) {
            addCriterion("WorkOrder >", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderGreaterThanOrEqualTo(String value) {
            addCriterion("WorkOrder >=", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderLessThan(String value) {
            addCriterion("WorkOrder <", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderLessThanOrEqualTo(String value) {
            addCriterion("WorkOrder <=", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderLike(String value) {
            addCriterion("WorkOrder like", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderNotLike(String value) {
            addCriterion("WorkOrder not like", value, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderIn(List<String> values) {
            addCriterion("WorkOrder in", values, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderNotIn(List<String> values) {
            addCriterion("WorkOrder not in", values, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderBetween(String value1, String value2) {
            addCriterion("WorkOrder between", value1, value2, "workorder");
            return (Criteria) this;
        }

        public Criteria andWorkorderNotBetween(String value1, String value2) {
            addCriterion("WorkOrder not between", value1, value2, "workorder");
            return (Criteria) this;
        }

        public Criteria andUomIsNull() {
            addCriterion("UOM is null");
            return (Criteria) this;
        }

        public Criteria andUomIsNotNull() {
            addCriterion("UOM is not null");
            return (Criteria) this;
        }

        public Criteria andUomEqualTo(String value) {
            addCriterion("UOM =", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotEqualTo(String value) {
            addCriterion("UOM <>", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomGreaterThan(String value) {
            addCriterion("UOM >", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomGreaterThanOrEqualTo(String value) {
            addCriterion("UOM >=", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomLessThan(String value) {
            addCriterion("UOM <", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomLessThanOrEqualTo(String value) {
            addCriterion("UOM <=", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomLike(String value) {
            addCriterion("UOM like", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotLike(String value) {
            addCriterion("UOM not like", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomIn(List<String> values) {
            addCriterion("UOM in", values, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotIn(List<String> values) {
            addCriterion("UOM not in", values, "uom");
            return (Criteria) this;
        }

        public Criteria andUomBetween(String value1, String value2) {
            addCriterion("UOM between", value1, value2, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotBetween(String value1, String value2) {
            addCriterion("UOM not between", value1, value2, "uom");
            return (Criteria) this;
        }

        public Criteria andShelflifeIsNull() {
            addCriterion("ShelfLife is null");
            return (Criteria) this;
        }

        public Criteria andShelflifeIsNotNull() {
            addCriterion("ShelfLife is not null");
            return (Criteria) this;
        }

        public Criteria andShelflifeEqualTo(String value) {
            addCriterion("ShelfLife =", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotEqualTo(String value) {
            addCriterion("ShelfLife <>", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeGreaterThan(String value) {
            addCriterion("ShelfLife >", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeGreaterThanOrEqualTo(String value) {
            addCriterion("ShelfLife >=", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeLessThan(String value) {
            addCriterion("ShelfLife <", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeLessThanOrEqualTo(String value) {
            addCriterion("ShelfLife <=", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeLike(String value) {
            addCriterion("ShelfLife like", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotLike(String value) {
            addCriterion("ShelfLife not like", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeIn(List<String> values) {
            addCriterion("ShelfLife in", values, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotIn(List<String> values) {
            addCriterion("ShelfLife not in", values, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeBetween(String value1, String value2) {
            addCriterion("ShelfLife between", value1, value2, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotBetween(String value1, String value2) {
            addCriterion("ShelfLife not between", value1, value2, "shelflife");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyIsNull() {
            addCriterion("WorkOrderQty is null");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyIsNotNull() {
            addCriterion("WorkOrderQty is not null");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyEqualTo(BigDecimal value) {
            addCriterion("WorkOrderQty =", value, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyNotEqualTo(BigDecimal value) {
            addCriterion("WorkOrderQty <>", value, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyGreaterThan(BigDecimal value) {
            addCriterion("WorkOrderQty >", value, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WorkOrderQty >=", value, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyLessThan(BigDecimal value) {
            addCriterion("WorkOrderQty <", value, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WorkOrderQty <=", value, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyIn(List<BigDecimal> values) {
            addCriterion("WorkOrderQty in", values, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyNotIn(List<BigDecimal> values) {
            addCriterion("WorkOrderQty not in", values, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WorkOrderQty between", value1, value2, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andWorkorderqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WorkOrderQty not between", value1, value2, "workorderqty");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoIsNull() {
            addCriterion("FinishGoodNo is null");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoIsNotNull() {
            addCriterion("FinishGoodNo is not null");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoEqualTo(String value) {
            addCriterion("FinishGoodNo =", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoNotEqualTo(String value) {
            addCriterion("FinishGoodNo <>", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoGreaterThan(String value) {
            addCriterion("FinishGoodNo >", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoGreaterThanOrEqualTo(String value) {
            addCriterion("FinishGoodNo >=", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoLessThan(String value) {
            addCriterion("FinishGoodNo <", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoLessThanOrEqualTo(String value) {
            addCriterion("FinishGoodNo <=", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoLike(String value) {
            addCriterion("FinishGoodNo like", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoNotLike(String value) {
            addCriterion("FinishGoodNo not like", value, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoIn(List<String> values) {
            addCriterion("FinishGoodNo in", values, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoNotIn(List<String> values) {
            addCriterion("FinishGoodNo not in", values, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoBetween(String value1, String value2) {
            addCriterion("FinishGoodNo between", value1, value2, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andFinishgoodnoNotBetween(String value1, String value2) {
            addCriterion("FinishGoodNo not between", value1, value2, "finishgoodno");
            return (Criteria) this;
        }

        public Criteria andProducttoolsIsNull() {
            addCriterion("ProductTools is null");
            return (Criteria) this;
        }

        public Criteria andProducttoolsIsNotNull() {
            addCriterion("ProductTools is not null");
            return (Criteria) this;
        }

        public Criteria andProducttoolsEqualTo(String value) {
            addCriterion("ProductTools =", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsNotEqualTo(String value) {
            addCriterion("ProductTools <>", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsGreaterThan(String value) {
            addCriterion("ProductTools >", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsGreaterThanOrEqualTo(String value) {
            addCriterion("ProductTools >=", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsLessThan(String value) {
            addCriterion("ProductTools <", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsLessThanOrEqualTo(String value) {
            addCriterion("ProductTools <=", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsLike(String value) {
            addCriterion("ProductTools like", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsNotLike(String value) {
            addCriterion("ProductTools not like", value, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsIn(List<String> values) {
            addCriterion("ProductTools in", values, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsNotIn(List<String> values) {
            addCriterion("ProductTools not in", values, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsBetween(String value1, String value2) {
            addCriterion("ProductTools between", value1, value2, "producttools");
            return (Criteria) this;
        }

        public Criteria andProducttoolsNotBetween(String value1, String value2) {
            addCriterion("ProductTools not between", value1, value2, "producttools");
            return (Criteria) this;
        }

        public Criteria andWbsIsNull() {
            addCriterion("WBS is null");
            return (Criteria) this;
        }

        public Criteria andWbsIsNotNull() {
            addCriterion("WBS is not null");
            return (Criteria) this;
        }

        public Criteria andWbsEqualTo(String value) {
            addCriterion("WBS =", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsNotEqualTo(String value) {
            addCriterion("WBS <>", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsGreaterThan(String value) {
            addCriterion("WBS >", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsGreaterThanOrEqualTo(String value) {
            addCriterion("WBS >=", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsLessThan(String value) {
            addCriterion("WBS <", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsLessThanOrEqualTo(String value) {
            addCriterion("WBS <=", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsLike(String value) {
            addCriterion("WBS like", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsNotLike(String value) {
            addCriterion("WBS not like", value, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsIn(List<String> values) {
            addCriterion("WBS in", values, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsNotIn(List<String> values) {
            addCriterion("WBS not in", values, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsBetween(String value1, String value2) {
            addCriterion("WBS between", value1, value2, "wbs");
            return (Criteria) this;
        }

        public Criteria andWbsNotBetween(String value1, String value2) {
            addCriterion("WBS not between", value1, value2, "wbs");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateIsNull() {
            addCriterion("PrintTemplate is null");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateIsNotNull() {
            addCriterion("PrintTemplate is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateEqualTo(String value) {
            addCriterion("PrintTemplate =", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateNotEqualTo(String value) {
            addCriterion("PrintTemplate <>", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateGreaterThan(String value) {
            addCriterion("PrintTemplate >", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateGreaterThanOrEqualTo(String value) {
            addCriterion("PrintTemplate >=", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateLessThan(String value) {
            addCriterion("PrintTemplate <", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateLessThanOrEqualTo(String value) {
            addCriterion("PrintTemplate <=", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateLike(String value) {
            addCriterion("PrintTemplate like", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateNotLike(String value) {
            addCriterion("PrintTemplate not like", value, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateIn(List<String> values) {
            addCriterion("PrintTemplate in", values, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateNotIn(List<String> values) {
            addCriterion("PrintTemplate not in", values, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateBetween(String value1, String value2) {
            addCriterion("PrintTemplate between", value1, value2, "printtemplate");
            return (Criteria) this;
        }

        public Criteria andPrinttemplateNotBetween(String value1, String value2) {
            addCriterion("PrintTemplate not between", value1, value2, "printtemplate");
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

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIsNull() {
            addCriterion("PrintTime is null");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIsNotNull() {
            addCriterion("PrintTime is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttimeEqualTo(Date value) {
            addCriterion("PrintTime =", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotEqualTo(Date value) {
            addCriterion("PrintTime <>", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThan(Date value) {
            addCriterion("PrintTime >", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PrintTime >=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThan(Date value) {
            addCriterion("PrintTime <", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThanOrEqualTo(Date value) {
            addCriterion("PrintTime <=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIn(List<Date> values) {
            addCriterion("PrintTime in", values, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotIn(List<Date> values) {
            addCriterion("PrintTime not in", values, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeBetween(Date value1, Date value2) {
            addCriterion("PrintTime between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotBetween(Date value1, Date value2) {
            addCriterion("PrintTime not between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinIsNull() {
            addCriterion("PrintByMachin is null");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinIsNotNull() {
            addCriterion("PrintByMachin is not null");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinEqualTo(String value) {
            addCriterion("PrintByMachin =", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinNotEqualTo(String value) {
            addCriterion("PrintByMachin <>", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinGreaterThan(String value) {
            addCriterion("PrintByMachin >", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinGreaterThanOrEqualTo(String value) {
            addCriterion("PrintByMachin >=", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinLessThan(String value) {
            addCriterion("PrintByMachin <", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinLessThanOrEqualTo(String value) {
            addCriterion("PrintByMachin <=", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinLike(String value) {
            addCriterion("PrintByMachin like", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinNotLike(String value) {
            addCriterion("PrintByMachin not like", value, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinIn(List<String> values) {
            addCriterion("PrintByMachin in", values, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinNotIn(List<String> values) {
            addCriterion("PrintByMachin not in", values, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinBetween(String value1, String value2) {
            addCriterion("PrintByMachin between", value1, value2, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andPrintbymachinNotBetween(String value1, String value2) {
            addCriterion("PrintByMachin not between", value1, value2, "printbymachin");
            return (Criteria) this;
        }

        public Criteria andItemcodeIsNull() {
            addCriterion("ItemCode is null");
            return (Criteria) this;
        }

        public Criteria andItemcodeIsNotNull() {
            addCriterion("ItemCode is not null");
            return (Criteria) this;
        }

        public Criteria andItemcodeEqualTo(String value) {
            addCriterion("ItemCode =", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotEqualTo(String value) {
            addCriterion("ItemCode <>", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThan(String value) {
            addCriterion("ItemCode >", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ItemCode >=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThan(String value) {
            addCriterion("ItemCode <", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThanOrEqualTo(String value) {
            addCriterion("ItemCode <=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLike(String value) {
            addCriterion("ItemCode like", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotLike(String value) {
            addCriterion("ItemCode not like", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeIn(List<String> values) {
            addCriterion("ItemCode in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotIn(List<String> values) {
            addCriterion("ItemCode not in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeBetween(String value1, String value2) {
            addCriterion("ItemCode between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotBetween(String value1, String value2) {
            addCriterion("ItemCode not between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("MaterialName is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("MaterialName is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("MaterialName =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("MaterialName <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("MaterialName >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("MaterialName >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("MaterialName <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("MaterialName <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("MaterialName like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("MaterialName not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("MaterialName in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("MaterialName not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("MaterialName between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("MaterialName not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andProductiondateIsNull() {
            addCriterion("ProductionDate is null");
            return (Criteria) this;
        }

        public Criteria andProductiondateIsNotNull() {
            addCriterion("ProductionDate is not null");
            return (Criteria) this;
        }

        public Criteria andProductiondateEqualTo(String value) {
            addCriterion("ProductionDate =", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotEqualTo(String value) {
            addCriterion("ProductionDate <>", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateGreaterThan(String value) {
            addCriterion("ProductionDate >", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionDate >=", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLessThan(String value) {
            addCriterion("ProductionDate <", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLessThanOrEqualTo(String value) {
            addCriterion("ProductionDate <=", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLike(String value) {
            addCriterion("ProductionDate like", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotLike(String value) {
            addCriterion("ProductionDate not like", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateIn(List<String> values) {
            addCriterion("ProductionDate in", values, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotIn(List<String> values) {
            addCriterion("ProductionDate not in", values, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateBetween(String value1, String value2) {
            addCriterion("ProductionDate between", value1, value2, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotBetween(String value1, String value2) {
            addCriterion("ProductionDate not between", value1, value2, "productiondate");
            return (Criteria) this;
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

        public Criteria andMaterspecIsNull() {
            addCriterion("MaterSpec is null");
            return (Criteria) this;
        }

        public Criteria andMaterspecIsNotNull() {
            addCriterion("MaterSpec is not null");
            return (Criteria) this;
        }

        public Criteria andMaterspecEqualTo(String value) {
            addCriterion("MaterSpec =", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecNotEqualTo(String value) {
            addCriterion("MaterSpec <>", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecGreaterThan(String value) {
            addCriterion("MaterSpec >", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecGreaterThanOrEqualTo(String value) {
            addCriterion("MaterSpec >=", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecLessThan(String value) {
            addCriterion("MaterSpec <", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecLessThanOrEqualTo(String value) {
            addCriterion("MaterSpec <=", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecLike(String value) {
            addCriterion("MaterSpec like", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecNotLike(String value) {
            addCriterion("MaterSpec not like", value, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecIn(List<String> values) {
            addCriterion("MaterSpec in", values, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecNotIn(List<String> values) {
            addCriterion("MaterSpec not in", values, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecBetween(String value1, String value2) {
            addCriterion("MaterSpec between", value1, value2, "materspec");
            return (Criteria) this;
        }

        public Criteria andMaterspecNotBetween(String value1, String value2) {
            addCriterion("MaterSpec not between", value1, value2, "materspec");
            return (Criteria) this;
        }

        public Criteria andPrintqtyIsNull() {
            addCriterion("PrintQty is null");
            return (Criteria) this;
        }

        public Criteria andPrintqtyIsNotNull() {
            addCriterion("PrintQty is not null");
            return (Criteria) this;
        }

        public Criteria andPrintqtyEqualTo(Integer value) {
            addCriterion("PrintQty =", value, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyNotEqualTo(Integer value) {
            addCriterion("PrintQty <>", value, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyGreaterThan(Integer value) {
            addCriterion("PrintQty >", value, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintQty >=", value, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyLessThan(Integer value) {
            addCriterion("PrintQty <", value, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyLessThanOrEqualTo(Integer value) {
            addCriterion("PrintQty <=", value, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyIn(List<Integer> values) {
            addCriterion("PrintQty in", values, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyNotIn(List<Integer> values) {
            addCriterion("PrintQty not in", values, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyBetween(Integer value1, Integer value2) {
            addCriterion("PrintQty between", value1, value2, "printqty");
            return (Criteria) this;
        }

        public Criteria andPrintqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintQty not between", value1, value2, "printqty");
            return (Criteria) this;
        }

        public Criteria andUbatchidIsNull() {
            addCriterion("UBatchId is null");
            return (Criteria) this;
        }

        public Criteria andUbatchidIsNotNull() {
            addCriterion("UBatchId is not null");
            return (Criteria) this;
        }

        public Criteria andUbatchidEqualTo(String value) {
            addCriterion("UBatchId =", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidNotEqualTo(String value) {
            addCriterion("UBatchId <>", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidGreaterThan(String value) {
            addCriterion("UBatchId >", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidGreaterThanOrEqualTo(String value) {
            addCriterion("UBatchId >=", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidLessThan(String value) {
            addCriterion("UBatchId <", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidLessThanOrEqualTo(String value) {
            addCriterion("UBatchId <=", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidLike(String value) {
            addCriterion("UBatchId like", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidNotLike(String value) {
            addCriterion("UBatchId not like", value, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidIn(List<String> values) {
            addCriterion("UBatchId in", values, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidNotIn(List<String> values) {
            addCriterion("UBatchId not in", values, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidBetween(String value1, String value2) {
            addCriterion("UBatchId between", value1, value2, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andUbatchidNotBetween(String value1, String value2) {
            addCriterion("UBatchId not between", value1, value2, "ubatchid");
            return (Criteria) this;
        }

        public Criteria andQtysumIsNull() {
            addCriterion("QtySum is null");
            return (Criteria) this;
        }

        public Criteria andQtysumIsNotNull() {
            addCriterion("QtySum is not null");
            return (Criteria) this;
        }

        public Criteria andQtysumEqualTo(Integer value) {
            addCriterion("QtySum =", value, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumNotEqualTo(Integer value) {
            addCriterion("QtySum <>", value, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumGreaterThan(Integer value) {
            addCriterion("QtySum >", value, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumGreaterThanOrEqualTo(Integer value) {
            addCriterion("QtySum >=", value, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumLessThan(Integer value) {
            addCriterion("QtySum <", value, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumLessThanOrEqualTo(Integer value) {
            addCriterion("QtySum <=", value, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumIn(List<Integer> values) {
            addCriterion("QtySum in", values, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumNotIn(List<Integer> values) {
            addCriterion("QtySum not in", values, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumBetween(Integer value1, Integer value2) {
            addCriterion("QtySum between", value1, value2, "qtysum");
            return (Criteria) this;
        }

        public Criteria andQtysumNotBetween(Integer value1, Integer value2) {
            addCriterion("QtySum not between", value1, value2, "qtysum");
            return (Criteria) this;
        }

        public Criteria andBoxszieIsNull() {
            addCriterion("BoxSzie is null");
            return (Criteria) this;
        }

        public Criteria andBoxszieIsNotNull() {
            addCriterion("BoxSzie is not null");
            return (Criteria) this;
        }

        public Criteria andBoxszieEqualTo(String value) {
            addCriterion("BoxSzie =", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieNotEqualTo(String value) {
            addCriterion("BoxSzie <>", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieGreaterThan(String value) {
            addCriterion("BoxSzie >", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieGreaterThanOrEqualTo(String value) {
            addCriterion("BoxSzie >=", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieLessThan(String value) {
            addCriterion("BoxSzie <", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieLessThanOrEqualTo(String value) {
            addCriterion("BoxSzie <=", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieLike(String value) {
            addCriterion("BoxSzie like", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieNotLike(String value) {
            addCriterion("BoxSzie not like", value, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieIn(List<String> values) {
            addCriterion("BoxSzie in", values, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieNotIn(List<String> values) {
            addCriterion("BoxSzie not in", values, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieBetween(String value1, String value2) {
            addCriterion("BoxSzie between", value1, value2, "boxszie");
            return (Criteria) this;
        }

        public Criteria andBoxszieNotBetween(String value1, String value2) {
            addCriterion("BoxSzie not between", value1, value2, "boxszie");
            return (Criteria) this;
        }

        public Criteria andNotfullIsNull() {
            addCriterion("NotFull is null");
            return (Criteria) this;
        }

        public Criteria andNotfullIsNotNull() {
            addCriterion("NotFull is not null");
            return (Criteria) this;
        }

        public Criteria andNotfullEqualTo(String value) {
            addCriterion("NotFull =", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullNotEqualTo(String value) {
            addCriterion("NotFull <>", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullGreaterThan(String value) {
            addCriterion("NotFull >", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullGreaterThanOrEqualTo(String value) {
            addCriterion("NotFull >=", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullLessThan(String value) {
            addCriterion("NotFull <", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullLessThanOrEqualTo(String value) {
            addCriterion("NotFull <=", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullLike(String value) {
            addCriterion("NotFull like", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullNotLike(String value) {
            addCriterion("NotFull not like", value, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullIn(List<String> values) {
            addCriterion("NotFull in", values, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullNotIn(List<String> values) {
            addCriterion("NotFull not in", values, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullBetween(String value1, String value2) {
            addCriterion("NotFull between", value1, value2, "notfull");
            return (Criteria) this;
        }

        public Criteria andNotfullNotBetween(String value1, String value2) {
            addCriterion("NotFull not between", value1, value2, "notfull");
            return (Criteria) this;
        }

        public Criteria andCncolorIsNull() {
            addCriterion("cnColor is null");
            return (Criteria) this;
        }

        public Criteria andCncolorIsNotNull() {
            addCriterion("cnColor is not null");
            return (Criteria) this;
        }

        public Criteria andCncolorEqualTo(String value) {
            addCriterion("cnColor =", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorNotEqualTo(String value) {
            addCriterion("cnColor <>", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorGreaterThan(String value) {
            addCriterion("cnColor >", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorGreaterThanOrEqualTo(String value) {
            addCriterion("cnColor >=", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorLessThan(String value) {
            addCriterion("cnColor <", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorLessThanOrEqualTo(String value) {
            addCriterion("cnColor <=", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorLike(String value) {
            addCriterion("cnColor like", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorNotLike(String value) {
            addCriterion("cnColor not like", value, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorIn(List<String> values) {
            addCriterion("cnColor in", values, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorNotIn(List<String> values) {
            addCriterion("cnColor not in", values, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorBetween(String value1, String value2) {
            addCriterion("cnColor between", value1, value2, "cncolor");
            return (Criteria) this;
        }

        public Criteria andCncolorNotBetween(String value1, String value2) {
            addCriterion("cnColor not between", value1, value2, "cncolor");
            return (Criteria) this;
        }

        public Criteria andMachineidIsNull() {
            addCriterion("MachineId is null");
            return (Criteria) this;
        }

        public Criteria andMachineidIsNotNull() {
            addCriterion("MachineId is not null");
            return (Criteria) this;
        }

        public Criteria andMachineidEqualTo(String value) {
            addCriterion("MachineId =", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotEqualTo(String value) {
            addCriterion("MachineId <>", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidGreaterThan(String value) {
            addCriterion("MachineId >", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidGreaterThanOrEqualTo(String value) {
            addCriterion("MachineId >=", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLessThan(String value) {
            addCriterion("MachineId <", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLessThanOrEqualTo(String value) {
            addCriterion("MachineId <=", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLike(String value) {
            addCriterion("MachineId like", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotLike(String value) {
            addCriterion("MachineId not like", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidIn(List<String> values) {
            addCriterion("MachineId in", values, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotIn(List<String> values) {
            addCriterion("MachineId not in", values, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidBetween(String value1, String value2) {
            addCriterion("MachineId between", value1, value2, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotBetween(String value1, String value2) {
            addCriterion("MachineId not between", value1, value2, "machineid");
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