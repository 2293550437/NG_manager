package com.cqm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbMenuClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMenuClassExample() {
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

        public Criteria andMeclassIdIsNull() {
            addCriterion("meclass_id is null");
            return (Criteria) this;
        }

        public Criteria andMeclassIdIsNotNull() {
            addCriterion("meclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeclassIdEqualTo(Long value) {
            addCriterion("meclass_id =", value, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdNotEqualTo(Long value) {
            addCriterion("meclass_id <>", value, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdGreaterThan(Long value) {
            addCriterion("meclass_id >", value, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("meclass_id >=", value, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdLessThan(Long value) {
            addCriterion("meclass_id <", value, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdLessThanOrEqualTo(Long value) {
            addCriterion("meclass_id <=", value, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdIn(List<Long> values) {
            addCriterion("meclass_id in", values, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdNotIn(List<Long> values) {
            addCriterion("meclass_id not in", values, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdBetween(Long value1, Long value2) {
            addCriterion("meclass_id between", value1, value2, "meclassId");
            return (Criteria) this;
        }

        public Criteria andMeclassIdNotBetween(Long value1, Long value2) {
            addCriterion("meclass_id not between", value1, value2, "meclassId");
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

        public Criteria andGreensBrandIsNull() {
            addCriterion("greens_brand is null");
            return (Criteria) this;
        }

        public Criteria andGreensBrandIsNotNull() {
            addCriterion("greens_brand is not null");
            return (Criteria) this;
        }

        public Criteria andGreensBrandEqualTo(String value) {
            addCriterion("greens_brand =", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandNotEqualTo(String value) {
            addCriterion("greens_brand <>", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandGreaterThan(String value) {
            addCriterion("greens_brand >", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandGreaterThanOrEqualTo(String value) {
            addCriterion("greens_brand >=", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandLessThan(String value) {
            addCriterion("greens_brand <", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandLessThanOrEqualTo(String value) {
            addCriterion("greens_brand <=", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandLike(String value) {
            addCriterion("greens_brand like", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandNotLike(String value) {
            addCriterion("greens_brand not like", value, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandIn(List<String> values) {
            addCriterion("greens_brand in", values, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandNotIn(List<String> values) {
            addCriterion("greens_brand not in", values, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandBetween(String value1, String value2) {
            addCriterion("greens_brand between", value1, value2, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensBrandNotBetween(String value1, String value2) {
            addCriterion("greens_brand not between", value1, value2, "greensBrand");
            return (Criteria) this;
        }

        public Criteria andGreensTasteIsNull() {
            addCriterion("greens_taste is null");
            return (Criteria) this;
        }

        public Criteria andGreensTasteIsNotNull() {
            addCriterion("greens_taste is not null");
            return (Criteria) this;
        }

        public Criteria andGreensTasteEqualTo(String value) {
            addCriterion("greens_taste =", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteNotEqualTo(String value) {
            addCriterion("greens_taste <>", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteGreaterThan(String value) {
            addCriterion("greens_taste >", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteGreaterThanOrEqualTo(String value) {
            addCriterion("greens_taste >=", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteLessThan(String value) {
            addCriterion("greens_taste <", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteLessThanOrEqualTo(String value) {
            addCriterion("greens_taste <=", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteLike(String value) {
            addCriterion("greens_taste like", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteNotLike(String value) {
            addCriterion("greens_taste not like", value, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteIn(List<String> values) {
            addCriterion("greens_taste in", values, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteNotIn(List<String> values) {
            addCriterion("greens_taste not in", values, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteBetween(String value1, String value2) {
            addCriterion("greens_taste between", value1, value2, "greensTaste");
            return (Criteria) this;
        }

        public Criteria andGreensTasteNotBetween(String value1, String value2) {
            addCriterion("greens_taste not between", value1, value2, "greensTaste");
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