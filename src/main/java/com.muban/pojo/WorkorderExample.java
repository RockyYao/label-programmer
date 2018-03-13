package com.muban.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkorderExample() {
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

        public Criteria andPlanqtyIsNull() {
            addCriterion("PlanQty is null");
            return (Criteria) this;
        }

        public Criteria andPlanqtyIsNotNull() {
            addCriterion("PlanQty is not null");
            return (Criteria) this;
        }

        public Criteria andPlanqtyEqualTo(BigDecimal value) {
            addCriterion("PlanQty =", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyNotEqualTo(BigDecimal value) {
            addCriterion("PlanQty <>", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyGreaterThan(BigDecimal value) {
            addCriterion("PlanQty >", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PlanQty >=", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyLessThan(BigDecimal value) {
            addCriterion("PlanQty <", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PlanQty <=", value, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyIn(List<BigDecimal> values) {
            addCriterion("PlanQty in", values, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyNotIn(List<BigDecimal> values) {
            addCriterion("PlanQty not in", values, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PlanQty between", value1, value2, "planqty");
            return (Criteria) this;
        }

        public Criteria andPlanqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PlanQty not between", value1, value2, "planqty");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPartnoIsNull() {
            addCriterion("PartNo is null");
            return (Criteria) this;
        }

        public Criteria andPartnoIsNotNull() {
            addCriterion("PartNo is not null");
            return (Criteria) this;
        }

        public Criteria andPartnoEqualTo(String value) {
            addCriterion("PartNo =", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotEqualTo(String value) {
            addCriterion("PartNo <>", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoGreaterThan(String value) {
            addCriterion("PartNo >", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoGreaterThanOrEqualTo(String value) {
            addCriterion("PartNo >=", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoLessThan(String value) {
            addCriterion("PartNo <", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoLessThanOrEqualTo(String value) {
            addCriterion("PartNo <=", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoLike(String value) {
            addCriterion("PartNo like", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotLike(String value) {
            addCriterion("PartNo not like", value, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoIn(List<String> values) {
            addCriterion("PartNo in", values, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotIn(List<String> values) {
            addCriterion("PartNo not in", values, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoBetween(String value1, String value2) {
            addCriterion("PartNo between", value1, value2, "partno");
            return (Criteria) this;
        }

        public Criteria andPartnoNotBetween(String value1, String value2) {
            addCriterion("PartNo not between", value1, value2, "partno");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
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

        public Criteria andOrdertypeIsNull() {
            addCriterion("OrderType is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("OrderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(String value) {
            addCriterion("OrderType =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(String value) {
            addCriterion("OrderType <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(String value) {
            addCriterion("OrderType >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderType >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(String value) {
            addCriterion("OrderType <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(String value) {
            addCriterion("OrderType <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLike(String value) {
            addCriterion("OrderType like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotLike(String value) {
            addCriterion("OrderType not like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<String> values) {
            addCriterion("OrderType in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<String> values) {
            addCriterion("OrderType not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(String value1, String value2) {
            addCriterion("OrderType between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(String value1, String value2) {
            addCriterion("OrderType not between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatIsNull() {
            addCriterion("CreatedOrderAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatIsNotNull() {
            addCriterion("CreatedOrderAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatEqualTo(Date value) {
            addCriterion("CreatedOrderAt =", value, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatNotEqualTo(Date value) {
            addCriterion("CreatedOrderAt <>", value, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatGreaterThan(Date value) {
            addCriterion("CreatedOrderAt >", value, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedOrderAt >=", value, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatLessThan(Date value) {
            addCriterion("CreatedOrderAt <", value, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatLessThanOrEqualTo(Date value) {
            addCriterion("CreatedOrderAt <=", value, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatIn(List<Date> values) {
            addCriterion("CreatedOrderAt in", values, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatNotIn(List<Date> values) {
            addCriterion("CreatedOrderAt not in", values, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatBetween(Date value1, Date value2) {
            addCriterion("CreatedOrderAt between", value1, value2, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andCreatedorderatNotBetween(Date value1, Date value2) {
            addCriterion("CreatedOrderAt not between", value1, value2, "createdorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatIsNull() {
            addCriterion("SentOrderAt is null");
            return (Criteria) this;
        }

        public Criteria andSentorderatIsNotNull() {
            addCriterion("SentOrderAt is not null");
            return (Criteria) this;
        }

        public Criteria andSentorderatEqualTo(Date value) {
            addCriterion("SentOrderAt =", value, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatNotEqualTo(Date value) {
            addCriterion("SentOrderAt <>", value, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatGreaterThan(Date value) {
            addCriterion("SentOrderAt >", value, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatGreaterThanOrEqualTo(Date value) {
            addCriterion("SentOrderAt >=", value, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatLessThan(Date value) {
            addCriterion("SentOrderAt <", value, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatLessThanOrEqualTo(Date value) {
            addCriterion("SentOrderAt <=", value, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatIn(List<Date> values) {
            addCriterion("SentOrderAt in", values, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatNotIn(List<Date> values) {
            addCriterion("SentOrderAt not in", values, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatBetween(Date value1, Date value2) {
            addCriterion("SentOrderAt between", value1, value2, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andSentorderatNotBetween(Date value1, Date value2) {
            addCriterion("SentOrderAt not between", value1, value2, "sentorderat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatIsNull() {
            addCriterion("PlanStartAt is null");
            return (Criteria) this;
        }

        public Criteria andPlanstartatIsNotNull() {
            addCriterion("PlanStartAt is not null");
            return (Criteria) this;
        }

        public Criteria andPlanstartatEqualTo(Date value) {
            addCriterion("PlanStartAt =", value, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatNotEqualTo(Date value) {
            addCriterion("PlanStartAt <>", value, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatGreaterThan(Date value) {
            addCriterion("PlanStartAt >", value, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatGreaterThanOrEqualTo(Date value) {
            addCriterion("PlanStartAt >=", value, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatLessThan(Date value) {
            addCriterion("PlanStartAt <", value, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatLessThanOrEqualTo(Date value) {
            addCriterion("PlanStartAt <=", value, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatIn(List<Date> values) {
            addCriterion("PlanStartAt in", values, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatNotIn(List<Date> values) {
            addCriterion("PlanStartAt not in", values, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatBetween(Date value1, Date value2) {
            addCriterion("PlanStartAt between", value1, value2, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanstartatNotBetween(Date value1, Date value2) {
            addCriterion("PlanStartAt not between", value1, value2, "planstartat");
            return (Criteria) this;
        }

        public Criteria andPlanendatIsNull() {
            addCriterion("PlanEndAt is null");
            return (Criteria) this;
        }

        public Criteria andPlanendatIsNotNull() {
            addCriterion("PlanEndAt is not null");
            return (Criteria) this;
        }

        public Criteria andPlanendatEqualTo(Date value) {
            addCriterion("PlanEndAt =", value, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatNotEqualTo(Date value) {
            addCriterion("PlanEndAt <>", value, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatGreaterThan(Date value) {
            addCriterion("PlanEndAt >", value, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatGreaterThanOrEqualTo(Date value) {
            addCriterion("PlanEndAt >=", value, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatLessThan(Date value) {
            addCriterion("PlanEndAt <", value, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatLessThanOrEqualTo(Date value) {
            addCriterion("PlanEndAt <=", value, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatIn(List<Date> values) {
            addCriterion("PlanEndAt in", values, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatNotIn(List<Date> values) {
            addCriterion("PlanEndAt not in", values, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatBetween(Date value1, Date value2) {
            addCriterion("PlanEndAt between", value1, value2, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlanendatNotBetween(Date value1, Date value2) {
            addCriterion("PlanEndAt not between", value1, value2, "planendat");
            return (Criteria) this;
        }

        public Criteria andPlnnrIsNull() {
            addCriterion("plnnr is null");
            return (Criteria) this;
        }

        public Criteria andPlnnrIsNotNull() {
            addCriterion("plnnr is not null");
            return (Criteria) this;
        }

        public Criteria andPlnnrEqualTo(String value) {
            addCriterion("plnnr =", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrNotEqualTo(String value) {
            addCriterion("plnnr <>", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrGreaterThan(String value) {
            addCriterion("plnnr >", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrGreaterThanOrEqualTo(String value) {
            addCriterion("plnnr >=", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrLessThan(String value) {
            addCriterion("plnnr <", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrLessThanOrEqualTo(String value) {
            addCriterion("plnnr <=", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrLike(String value) {
            addCriterion("plnnr like", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrNotLike(String value) {
            addCriterion("plnnr not like", value, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrIn(List<String> values) {
            addCriterion("plnnr in", values, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrNotIn(List<String> values) {
            addCriterion("plnnr not in", values, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrBetween(String value1, String value2) {
            addCriterion("plnnr between", value1, value2, "plnnr");
            return (Criteria) this;
        }

        public Criteria andPlnnrNotBetween(String value1, String value2) {
            addCriterion("plnnr not between", value1, value2, "plnnr");
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