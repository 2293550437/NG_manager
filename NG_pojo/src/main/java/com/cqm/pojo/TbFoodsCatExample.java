package com.cqm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbFoodsCatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFoodsCatExample() {
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

        public Criteria andFoodsidIsNull() {
            addCriterion("foodsId is null");
            return (Criteria) this;
        }

        public Criteria andFoodsidIsNotNull() {
            addCriterion("foodsId is not null");
            return (Criteria) this;
        }

        public Criteria andFoodsidEqualTo(Long value) {
            addCriterion("foodsId =", value, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidNotEqualTo(Long value) {
            addCriterion("foodsId <>", value, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidGreaterThan(Long value) {
            addCriterion("foodsId >", value, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidGreaterThanOrEqualTo(Long value) {
            addCriterion("foodsId >=", value, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidLessThan(Long value) {
            addCriterion("foodsId <", value, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidLessThanOrEqualTo(Long value) {
            addCriterion("foodsId <=", value, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidIn(List<Long> values) {
            addCriterion("foodsId in", values, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidNotIn(List<Long> values) {
            addCriterion("foodsId not in", values, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidBetween(Long value1, Long value2) {
            addCriterion("foodsId between", value1, value2, "foodsid");
            return (Criteria) this;
        }

        public Criteria andFoodsidNotBetween(Long value1, Long value2) {
            addCriterion("foodsId not between", value1, value2, "foodsid");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andFoodsImgIsNull() {
            addCriterion("foods_img is null");
            return (Criteria) this;
        }

        public Criteria andFoodsImgIsNotNull() {
            addCriterion("foods_img is not null");
            return (Criteria) this;
        }

        public Criteria andFoodsImgEqualTo(String value) {
            addCriterion("foods_img =", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgNotEqualTo(String value) {
            addCriterion("foods_img <>", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgGreaterThan(String value) {
            addCriterion("foods_img >", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("foods_img >=", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgLessThan(String value) {
            addCriterion("foods_img <", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgLessThanOrEqualTo(String value) {
            addCriterion("foods_img <=", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgLike(String value) {
            addCriterion("foods_img like", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgNotLike(String value) {
            addCriterion("foods_img not like", value, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgIn(List<String> values) {
            addCriterion("foods_img in", values, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgNotIn(List<String> values) {
            addCriterion("foods_img not in", values, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgBetween(String value1, String value2) {
            addCriterion("foods_img between", value1, value2, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andFoodsImgNotBetween(String value1, String value2) {
            addCriterion("foods_img not between", value1, value2, "foodsImg");
            return (Criteria) this;
        }

        public Criteria andPackagestyleIsNull() {
            addCriterion("packagestyle is null");
            return (Criteria) this;
        }

        public Criteria andPackagestyleIsNotNull() {
            addCriterion("packagestyle is not null");
            return (Criteria) this;
        }

        public Criteria andPackagestyleEqualTo(String value) {
            addCriterion("packagestyle =", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleNotEqualTo(String value) {
            addCriterion("packagestyle <>", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleGreaterThan(String value) {
            addCriterion("packagestyle >", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleGreaterThanOrEqualTo(String value) {
            addCriterion("packagestyle >=", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleLessThan(String value) {
            addCriterion("packagestyle <", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleLessThanOrEqualTo(String value) {
            addCriterion("packagestyle <=", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleLike(String value) {
            addCriterion("packagestyle like", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleNotLike(String value) {
            addCriterion("packagestyle not like", value, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleIn(List<String> values) {
            addCriterion("packagestyle in", values, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleNotIn(List<String> values) {
            addCriterion("packagestyle not in", values, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleBetween(String value1, String value2) {
            addCriterion("packagestyle between", value1, value2, "packagestyle");
            return (Criteria) this;
        }

        public Criteria andPackagestyleNotBetween(String value1, String value2) {
            addCriterion("packagestyle not between", value1, value2, "packagestyle");
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