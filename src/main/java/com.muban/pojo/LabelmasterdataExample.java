package com.muban.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabelmasterdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabelmasterdataExample() {
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

        public Criteria andHasprintedqtyIsNull() {
            addCriterion("HasPrintedQty is null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyIsNotNull() {
            addCriterion("HasPrintedQty is not null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyEqualTo(Integer value) {
            addCriterion("HasPrintedQty =", value, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyNotEqualTo(Integer value) {
            addCriterion("HasPrintedQty <>", value, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyGreaterThan(Integer value) {
            addCriterion("HasPrintedQty >", value, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQty >=", value, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyLessThan(Integer value) {
            addCriterion("HasPrintedQty <", value, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyLessThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQty <=", value, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyIn(List<Integer> values) {
            addCriterion("HasPrintedQty in", values, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyNotIn(List<Integer> values) {
            addCriterion("HasPrintedQty not in", values, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQty between", value1, value2, "hasprintedqty");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQty not between", value1, value2, "hasprintedqty");
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

        public Criteria andUpdatebyIsNull() {
            addCriterion("UpdateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UpdateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("UpdateBy =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("UpdateBy <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("UpdateBy >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("UpdateBy >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("UpdateBy <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("UpdateBy <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("UpdateBy like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("UpdateBy not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("UpdateBy in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("UpdateBy not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("UpdateBy between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("UpdateBy not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andLsizeIsNull() {
            addCriterion("LSize is null");
            return (Criteria) this;
        }

        public Criteria andLsizeIsNotNull() {
            addCriterion("LSize is not null");
            return (Criteria) this;
        }

        public Criteria andLsizeEqualTo(Integer value) {
            addCriterion("LSize =", value, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeNotEqualTo(Integer value) {
            addCriterion("LSize <>", value, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeGreaterThan(Integer value) {
            addCriterion("LSize >", value, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LSize >=", value, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeLessThan(Integer value) {
            addCriterion("LSize <", value, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeLessThanOrEqualTo(Integer value) {
            addCriterion("LSize <=", value, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeIn(List<Integer> values) {
            addCriterion("LSize in", values, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeNotIn(List<Integer> values) {
            addCriterion("LSize not in", values, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeBetween(Integer value1, Integer value2) {
            addCriterion("LSize between", value1, value2, "lsize");
            return (Criteria) this;
        }

        public Criteria andLsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("LSize not between", value1, value2, "lsize");
            return (Criteria) this;
        }

        public Criteria andMsizeIsNull() {
            addCriterion("MSize is null");
            return (Criteria) this;
        }

        public Criteria andMsizeIsNotNull() {
            addCriterion("MSize is not null");
            return (Criteria) this;
        }

        public Criteria andMsizeEqualTo(Integer value) {
            addCriterion("MSize =", value, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeNotEqualTo(Integer value) {
            addCriterion("MSize <>", value, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeGreaterThan(Integer value) {
            addCriterion("MSize >", value, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MSize >=", value, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeLessThan(Integer value) {
            addCriterion("MSize <", value, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeLessThanOrEqualTo(Integer value) {
            addCriterion("MSize <=", value, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeIn(List<Integer> values) {
            addCriterion("MSize in", values, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeNotIn(List<Integer> values) {
            addCriterion("MSize not in", values, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeBetween(Integer value1, Integer value2) {
            addCriterion("MSize between", value1, value2, "msize");
            return (Criteria) this;
        }

        public Criteria andMsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("MSize not between", value1, value2, "msize");
            return (Criteria) this;
        }

        public Criteria andSsizeIsNull() {
            addCriterion("SSize is null");
            return (Criteria) this;
        }

        public Criteria andSsizeIsNotNull() {
            addCriterion("SSize is not null");
            return (Criteria) this;
        }

        public Criteria andSsizeEqualTo(Integer value) {
            addCriterion("SSize =", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeNotEqualTo(Integer value) {
            addCriterion("SSize <>", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeGreaterThan(Integer value) {
            addCriterion("SSize >", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSize >=", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeLessThan(Integer value) {
            addCriterion("SSize <", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeLessThanOrEqualTo(Integer value) {
            addCriterion("SSize <=", value, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeIn(List<Integer> values) {
            addCriterion("SSize in", values, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeNotIn(List<Integer> values) {
            addCriterion("SSize not in", values, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeBetween(Integer value1, Integer value2) {
            addCriterion("SSize between", value1, value2, "ssize");
            return (Criteria) this;
        }

        public Criteria andSsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("SSize not between", value1, value2, "ssize");
            return (Criteria) this;
        }

        public Criteria andShelflifeIsNull() {
            addCriterion("shelflife is null");
            return (Criteria) this;
        }

        public Criteria andShelflifeIsNotNull() {
            addCriterion("shelflife is not null");
            return (Criteria) this;
        }

        public Criteria andShelflifeEqualTo(String value) {
            addCriterion("shelflife =", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotEqualTo(String value) {
            addCriterion("shelflife <>", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeGreaterThan(String value) {
            addCriterion("shelflife >", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeGreaterThanOrEqualTo(String value) {
            addCriterion("shelflife >=", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeLessThan(String value) {
            addCriterion("shelflife <", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeLessThanOrEqualTo(String value) {
            addCriterion("shelflife <=", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeLike(String value) {
            addCriterion("shelflife like", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotLike(String value) {
            addCriterion("shelflife not like", value, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeIn(List<String> values) {
            addCriterion("shelflife in", values, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotIn(List<String> values) {
            addCriterion("shelflife not in", values, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeBetween(String value1, String value2) {
            addCriterion("shelflife between", value1, value2, "shelflife");
            return (Criteria) this;
        }

        public Criteria andShelflifeNotBetween(String value1, String value2) {
            addCriterion("shelflife not between", value1, value2, "shelflife");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullIsNull() {
            addCriterion("HasPrintedQtyLNotFull is null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullIsNotNull() {
            addCriterion("HasPrintedQtyLNotFull is not null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullEqualTo(Integer value) {
            addCriterion("HasPrintedQtyLNotFull =", value, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullNotEqualTo(Integer value) {
            addCriterion("HasPrintedQtyLNotFull <>", value, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullGreaterThan(Integer value) {
            addCriterion("HasPrintedQtyLNotFull >", value, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyLNotFull >=", value, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullLessThan(Integer value) {
            addCriterion("HasPrintedQtyLNotFull <", value, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullLessThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyLNotFull <=", value, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullIn(List<Integer> values) {
            addCriterion("HasPrintedQtyLNotFull in", values, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullNotIn(List<Integer> values) {
            addCriterion("HasPrintedQtyLNotFull not in", values, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyLNotFull between", value1, value2, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtylnotfullNotBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyLNotFull not between", value1, value2, "hasprintedqtylnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymIsNull() {
            addCriterion("HasPrintedQtyM is null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymIsNotNull() {
            addCriterion("HasPrintedQtyM is not null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymEqualTo(Integer value) {
            addCriterion("HasPrintedQtyM =", value, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymNotEqualTo(Integer value) {
            addCriterion("HasPrintedQtyM <>", value, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymGreaterThan(Integer value) {
            addCriterion("HasPrintedQtyM >", value, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyM >=", value, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymLessThan(Integer value) {
            addCriterion("HasPrintedQtyM <", value, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymLessThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyM <=", value, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymIn(List<Integer> values) {
            addCriterion("HasPrintedQtyM in", values, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymNotIn(List<Integer> values) {
            addCriterion("HasPrintedQtyM not in", values, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyM between", value1, value2, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymNotBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyM not between", value1, value2, "hasprintedqtym");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullIsNull() {
            addCriterion("HasPrintedQtyMNotFull is null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullIsNotNull() {
            addCriterion("HasPrintedQtyMNotFull is not null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullEqualTo(Integer value) {
            addCriterion("HasPrintedQtyMNotFull =", value, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullNotEqualTo(Integer value) {
            addCriterion("HasPrintedQtyMNotFull <>", value, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullGreaterThan(Integer value) {
            addCriterion("HasPrintedQtyMNotFull >", value, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyMNotFull >=", value, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullLessThan(Integer value) {
            addCriterion("HasPrintedQtyMNotFull <", value, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullLessThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyMNotFull <=", value, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullIn(List<Integer> values) {
            addCriterion("HasPrintedQtyMNotFull in", values, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullNotIn(List<Integer> values) {
            addCriterion("HasPrintedQtyMNotFull not in", values, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyMNotFull between", value1, value2, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtymnotfullNotBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyMNotFull not between", value1, value2, "hasprintedqtymnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysIsNull() {
            addCriterion("HasPrintedQtyS is null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysIsNotNull() {
            addCriterion("HasPrintedQtyS is not null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysEqualTo(Integer value) {
            addCriterion("HasPrintedQtyS =", value, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysNotEqualTo(Integer value) {
            addCriterion("HasPrintedQtyS <>", value, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysGreaterThan(Integer value) {
            addCriterion("HasPrintedQtyS >", value, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyS >=", value, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysLessThan(Integer value) {
            addCriterion("HasPrintedQtyS <", value, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysLessThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtyS <=", value, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysIn(List<Integer> values) {
            addCriterion("HasPrintedQtyS in", values, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysNotIn(List<Integer> values) {
            addCriterion("HasPrintedQtyS not in", values, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyS between", value1, value2, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysNotBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtyS not between", value1, value2, "hasprintedqtys");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullIsNull() {
            addCriterion("HasPrintedQtySNotFull is null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullIsNotNull() {
            addCriterion("HasPrintedQtySNotFull is not null");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullEqualTo(Integer value) {
            addCriterion("HasPrintedQtySNotFull =", value, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullNotEqualTo(Integer value) {
            addCriterion("HasPrintedQtySNotFull <>", value, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullGreaterThan(Integer value) {
            addCriterion("HasPrintedQtySNotFull >", value, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtySNotFull >=", value, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullLessThan(Integer value) {
            addCriterion("HasPrintedQtySNotFull <", value, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullLessThanOrEqualTo(Integer value) {
            addCriterion("HasPrintedQtySNotFull <=", value, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullIn(List<Integer> values) {
            addCriterion("HasPrintedQtySNotFull in", values, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullNotIn(List<Integer> values) {
            addCriterion("HasPrintedQtySNotFull not in", values, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtySNotFull between", value1, value2, "hasprintedqtysnotfull");
            return (Criteria) this;
        }

        public Criteria andHasprintedqtysnotfullNotBetween(Integer value1, Integer value2) {
            addCriterion("HasPrintedQtySNotFull not between", value1, value2, "hasprintedqtysnotfull");
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

        public Criteria andSapmaterialbatchnoIsNull() {
            addCriterion("SapMaterialBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoIsNotNull() {
            addCriterion("SapMaterialBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoEqualTo(String value) {
            addCriterion("SapMaterialBatchNo =", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotEqualTo(String value) {
            addCriterion("SapMaterialBatchNo <>", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoGreaterThan(String value) {
            addCriterion("SapMaterialBatchNo >", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("SapMaterialBatchNo >=", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoLessThan(String value) {
            addCriterion("SapMaterialBatchNo <", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoLessThanOrEqualTo(String value) {
            addCriterion("SapMaterialBatchNo <=", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoLike(String value) {
            addCriterion("SapMaterialBatchNo like", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotLike(String value) {
            addCriterion("SapMaterialBatchNo not like", value, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoIn(List<String> values) {
            addCriterion("SapMaterialBatchNo in", values, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotIn(List<String> values) {
            addCriterion("SapMaterialBatchNo not in", values, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoBetween(String value1, String value2) {
            addCriterion("SapMaterialBatchNo between", value1, value2, "sapmaterialbatchno");
            return (Criteria) this;
        }

        public Criteria andSapmaterialbatchnoNotBetween(String value1, String value2) {
            addCriterion("SapMaterialBatchNo not between", value1, value2, "sapmaterialbatchno");
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