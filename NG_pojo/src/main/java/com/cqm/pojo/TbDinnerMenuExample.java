package com.cqm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbDinnerMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDinnerMenuExample() {
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

        public Criteria andCusttypeIsNull() {
            addCriterion("custtype is null");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNotNull() {
            addCriterion("custtype is not null");
            return (Criteria) this;
        }

        public Criteria andCusttypeEqualTo(String value) {
            addCriterion("custtype =", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotEqualTo(String value) {
            addCriterion("custtype <>", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThan(String value) {
            addCriterion("custtype >", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThanOrEqualTo(String value) {
            addCriterion("custtype >=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThan(String value) {
            addCriterion("custtype <", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThanOrEqualTo(String value) {
            addCriterion("custtype <=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLike(String value) {
            addCriterion("custtype like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotLike(String value) {
            addCriterion("custtype not like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeIn(List<String> values) {
            addCriterion("custtype in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotIn(List<String> values) {
            addCriterion("custtype not in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeBetween(String value1, String value2) {
            addCriterion("custtype between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotBetween(String value1, String value2) {
            addCriterion("custtype not between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Long value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Long value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Long value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Long value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Long value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Long value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Long> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Long> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Long value1, Long value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Long value1, Long value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andCustcountIsNull() {
            addCriterion("custcount is null");
            return (Criteria) this;
        }

        public Criteria andCustcountIsNotNull() {
            addCriterion("custcount is not null");
            return (Criteria) this;
        }

        public Criteria andCustcountEqualTo(Long value) {
            addCriterion("custcount =", value, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountNotEqualTo(Long value) {
            addCriterion("custcount <>", value, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountGreaterThan(Long value) {
            addCriterion("custcount >", value, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountGreaterThanOrEqualTo(Long value) {
            addCriterion("custcount >=", value, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountLessThan(Long value) {
            addCriterion("custcount <", value, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountLessThanOrEqualTo(Long value) {
            addCriterion("custcount <=", value, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountIn(List<Long> values) {
            addCriterion("custcount in", values, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountNotIn(List<Long> values) {
            addCriterion("custcount not in", values, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountBetween(Long value1, Long value2) {
            addCriterion("custcount between", value1, value2, "custcount");
            return (Criteria) this;
        }

        public Criteria andCustcountNotBetween(Long value1, Long value2) {
            addCriterion("custcount not between", value1, value2, "custcount");
            return (Criteria) this;
        }

        public Criteria andAddstatusIsNull() {
            addCriterion("addStatus is null");
            return (Criteria) this;
        }

        public Criteria andAddstatusIsNotNull() {
            addCriterion("addStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAddstatusEqualTo(String value) {
            addCriterion("addStatus =", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusNotEqualTo(String value) {
            addCriterion("addStatus <>", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusGreaterThan(String value) {
            addCriterion("addStatus >", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusGreaterThanOrEqualTo(String value) {
            addCriterion("addStatus >=", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusLessThan(String value) {
            addCriterion("addStatus <", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusLessThanOrEqualTo(String value) {
            addCriterion("addStatus <=", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusLike(String value) {
            addCriterion("addStatus like", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusNotLike(String value) {
            addCriterion("addStatus not like", value, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusIn(List<String> values) {
            addCriterion("addStatus in", values, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusNotIn(List<String> values) {
            addCriterion("addStatus not in", values, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusBetween(String value1, String value2) {
            addCriterion("addStatus between", value1, value2, "addstatus");
            return (Criteria) this;
        }

        public Criteria andAddstatusNotBetween(String value1, String value2) {
            addCriterion("addStatus not between", value1, value2, "addstatus");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEmployidIsNull() {
            addCriterion("employId is null");
            return (Criteria) this;
        }

        public Criteria andEmployidIsNotNull() {
            addCriterion("employId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployidEqualTo(Long value) {
            addCriterion("employId =", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidNotEqualTo(Long value) {
            addCriterion("employId <>", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidGreaterThan(Long value) {
            addCriterion("employId >", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidGreaterThanOrEqualTo(Long value) {
            addCriterion("employId >=", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidLessThan(Long value) {
            addCriterion("employId <", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidLessThanOrEqualTo(Long value) {
            addCriterion("employId <=", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidIn(List<Long> values) {
            addCriterion("employId in", values, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidNotIn(List<Long> values) {
            addCriterion("employId not in", values, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidBetween(Long value1, Long value2) {
            addCriterion("employId between", value1, value2, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidNotBetween(Long value1, Long value2) {
            addCriterion("employId not between", value1, value2, "employid");
            return (Criteria) this;
        }

        public Criteria andFoodslistIsNull() {
            addCriterion("foodsList is null");
            return (Criteria) this;
        }

        public Criteria andFoodslistIsNotNull() {
            addCriterion("foodsList is not null");
            return (Criteria) this;
        }

        public Criteria andFoodslistEqualTo(String value) {
            addCriterion("foodsList =", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistNotEqualTo(String value) {
            addCriterion("foodsList <>", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistGreaterThan(String value) {
            addCriterion("foodsList >", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistGreaterThanOrEqualTo(String value) {
            addCriterion("foodsList >=", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistLessThan(String value) {
            addCriterion("foodsList <", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistLessThanOrEqualTo(String value) {
            addCriterion("foodsList <=", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistLike(String value) {
            addCriterion("foodsList like", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistNotLike(String value) {
            addCriterion("foodsList not like", value, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistIn(List<String> values) {
            addCriterion("foodsList in", values, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistNotIn(List<String> values) {
            addCriterion("foodsList not in", values, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistBetween(String value1, String value2) {
            addCriterion("foodsList between", value1, value2, "foodslist");
            return (Criteria) this;
        }

        public Criteria andFoodslistNotBetween(String value1, String value2) {
            addCriterion("foodsList not between", value1, value2, "foodslist");
            return (Criteria) this;
        }

        public Criteria andIspackageIsNull() {
            addCriterion("ispackage is null");
            return (Criteria) this;
        }

        public Criteria andIspackageIsNotNull() {
            addCriterion("ispackage is not null");
            return (Criteria) this;
        }

        public Criteria andIspackageEqualTo(String value) {
            addCriterion("ispackage =", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageNotEqualTo(String value) {
            addCriterion("ispackage <>", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageGreaterThan(String value) {
            addCriterion("ispackage >", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageGreaterThanOrEqualTo(String value) {
            addCriterion("ispackage >=", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageLessThan(String value) {
            addCriterion("ispackage <", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageLessThanOrEqualTo(String value) {
            addCriterion("ispackage <=", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageLike(String value) {
            addCriterion("ispackage like", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageNotLike(String value) {
            addCriterion("ispackage not like", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageIn(List<String> values) {
            addCriterion("ispackage in", values, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageNotIn(List<String> values) {
            addCriterion("ispackage not in", values, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageBetween(String value1, String value2) {
            addCriterion("ispackage between", value1, value2, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageNotBetween(String value1, String value2) {
            addCriterion("ispackage not between", value1, value2, "ispackage");
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