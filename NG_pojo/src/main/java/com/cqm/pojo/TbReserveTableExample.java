package com.cqm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbReserveTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbReserveTableExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andReserveIdIsNull() {
            addCriterion("reserve_id is null");
            return (Criteria) this;
        }

        public Criteria andReserveIdIsNotNull() {
            addCriterion("reserve_id is not null");
            return (Criteria) this;
        }

        public Criteria andReserveIdEqualTo(Long value) {
            addCriterion("reserve_id =", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotEqualTo(Long value) {
            addCriterion("reserve_id <>", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThan(Long value) {
            addCriterion("reserve_id >", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reserve_id >=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThan(Long value) {
            addCriterion("reserve_id <", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThanOrEqualTo(Long value) {
            addCriterion("reserve_id <=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdIn(List<Long> values) {
            addCriterion("reserve_id in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotIn(List<Long> values) {
            addCriterion("reserve_id not in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdBetween(Long value1, Long value2) {
            addCriterion("reserve_id between", value1, value2, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotBetween(Long value1, Long value2) {
            addCriterion("reserve_id not between", value1, value2, "reserveId");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Long value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Long value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Long value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Long value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Long value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Long value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Long> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Long> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Long value1, Long value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Long value1, Long value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andTableidIsNull() {
            addCriterion("tableId is null");
            return (Criteria) this;
        }

        public Criteria andTableidIsNotNull() {
            addCriterion("tableId is not null");
            return (Criteria) this;
        }

        public Criteria andTableidEqualTo(Long value) {
            addCriterion("tableId =", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotEqualTo(Long value) {
            addCriterion("tableId <>", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThan(Long value) {
            addCriterion("tableId >", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThanOrEqualTo(Long value) {
            addCriterion("tableId >=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThan(Long value) {
            addCriterion("tableId <", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThanOrEqualTo(Long value) {
            addCriterion("tableId <=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidIn(List<Long> values) {
            addCriterion("tableId in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotIn(List<Long> values) {
            addCriterion("tableId not in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidBetween(Long value1, Long value2) {
            addCriterion("tableId between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotBetween(Long value1, Long value2) {
            addCriterion("tableId not between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andMumberidIsNull() {
            addCriterion("mumberId is null");
            return (Criteria) this;
        }

        public Criteria andMumberidIsNotNull() {
            addCriterion("mumberId is not null");
            return (Criteria) this;
        }

        public Criteria andMumberidEqualTo(Long value) {
            addCriterion("mumberId =", value, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidNotEqualTo(Long value) {
            addCriterion("mumberId <>", value, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidGreaterThan(Long value) {
            addCriterion("mumberId >", value, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidGreaterThanOrEqualTo(Long value) {
            addCriterion("mumberId >=", value, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidLessThan(Long value) {
            addCriterion("mumberId <", value, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidLessThanOrEqualTo(Long value) {
            addCriterion("mumberId <=", value, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidIn(List<Long> values) {
            addCriterion("mumberId in", values, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidNotIn(List<Long> values) {
            addCriterion("mumberId not in", values, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidBetween(Long value1, Long value2) {
            addCriterion("mumberId between", value1, value2, "mumberid");
            return (Criteria) this;
        }

        public Criteria andMumberidNotBetween(Long value1, Long value2) {
            addCriterion("mumberId not between", value1, value2, "mumberid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIsNull() {
            addCriterion("dinnertime is null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIsNotNull() {
            addCriterion("dinnertime is not null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeEqualTo(Date value) {
            addCriterionForJDBCDate("dinnertime =", value, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("dinnertime <>", value, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("dinnertime >", value, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dinnertime >=", value, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeLessThan(Date value) {
            addCriterionForJDBCDate("dinnertime <", value, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dinnertime <=", value, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIn(List<Date> values) {
            addCriterionForJDBCDate("dinnertime in", values, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("dinnertime not in", values, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dinnertime between", value1, value2, "dinnertime");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dinnertime not between", value1, value2, "dinnertime");
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