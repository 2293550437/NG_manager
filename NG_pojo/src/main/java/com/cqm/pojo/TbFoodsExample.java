package com.cqm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbFoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFoodsExample() {
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

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Long value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Long value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Long value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Long value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Long value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Long> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Long> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Long value1, Long value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Long value1, Long value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andMeclassidIsNull() {
            addCriterion("meclassId is null");
            return (Criteria) this;
        }

        public Criteria andMeclassidIsNotNull() {
            addCriterion("meclassId is not null");
            return (Criteria) this;
        }

        public Criteria andMeclassidEqualTo(Long value) {
            addCriterion("meclassId =", value, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidNotEqualTo(Long value) {
            addCriterion("meclassId <>", value, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidGreaterThan(Long value) {
            addCriterion("meclassId >", value, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidGreaterThanOrEqualTo(Long value) {
            addCriterion("meclassId >=", value, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidLessThan(Long value) {
            addCriterion("meclassId <", value, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidLessThanOrEqualTo(Long value) {
            addCriterion("meclassId <=", value, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidIn(List<Long> values) {
            addCriterion("meclassId in", values, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidNotIn(List<Long> values) {
            addCriterion("meclassId not in", values, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidBetween(Long value1, Long value2) {
            addCriterion("meclassId between", value1, value2, "meclassid");
            return (Criteria) this;
        }

        public Criteria andMeclassidNotBetween(Long value1, Long value2) {
            addCriterion("meclassId not between", value1, value2, "meclassid");
            return (Criteria) this;
        }

        public Criteria andTasteidIsNull() {
            addCriterion("tasteId is null");
            return (Criteria) this;
        }

        public Criteria andTasteidIsNotNull() {
            addCriterion("tasteId is not null");
            return (Criteria) this;
        }

        public Criteria andTasteidEqualTo(Long value) {
            addCriterion("tasteId =", value, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidNotEqualTo(Long value) {
            addCriterion("tasteId <>", value, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidGreaterThan(Long value) {
            addCriterion("tasteId >", value, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidGreaterThanOrEqualTo(Long value) {
            addCriterion("tasteId >=", value, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidLessThan(Long value) {
            addCriterion("tasteId <", value, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidLessThanOrEqualTo(Long value) {
            addCriterion("tasteId <=", value, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidIn(List<Long> values) {
            addCriterion("tasteId in", values, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidNotIn(List<Long> values) {
            addCriterion("tasteId not in", values, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidBetween(Long value1, Long value2) {
            addCriterion("tasteId between", value1, value2, "tasteid");
            return (Criteria) this;
        }

        public Criteria andTasteidNotBetween(Long value1, Long value2) {
            addCriterion("tasteId not between", value1, value2, "tasteid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Long value) {
            addCriterion("brandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Long value) {
            addCriterion("brandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Long value) {
            addCriterion("brandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Long value) {
            addCriterion("brandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Long value) {
            addCriterion("brandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Long value) {
            addCriterion("brandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Long> values) {
            addCriterion("brandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Long> values) {
            addCriterion("brandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Long value1, Long value2) {
            addCriterion("brandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Long value1, Long value2) {
            addCriterion("brandId not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andScreattimeIsNull() {
            addCriterion("screattime is null");
            return (Criteria) this;
        }

        public Criteria andScreattimeIsNotNull() {
            addCriterion("screattime is not null");
            return (Criteria) this;
        }

        public Criteria andScreattimeEqualTo(Date value) {
            addCriterionForJDBCDate("screattime =", value, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("screattime <>", value, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeGreaterThan(Date value) {
            addCriterionForJDBCDate("screattime >", value, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("screattime >=", value, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeLessThan(Date value) {
            addCriterionForJDBCDate("screattime <", value, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("screattime <=", value, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeIn(List<Date> values) {
            addCriterionForJDBCDate("screattime in", values, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("screattime not in", values, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("screattime between", value1, value2, "screattime");
            return (Criteria) this;
        }

        public Criteria andScreattimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("screattime not between", value1, value2, "screattime");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("empId is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empId is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("empId =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("empId <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("empId >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("empId >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("empId <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("empId <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("empId like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("empId not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("empId in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("empId not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("empId between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("empId not between", value1, value2, "empid");
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