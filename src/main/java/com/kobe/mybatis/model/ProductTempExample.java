package com.kobe.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class ProductTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductTempExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNull() {
            addCriterion("producttypeid is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNotNull() {
            addCriterion("producttypeid is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidEqualTo(Integer value) {
            addCriterion("producttypeid =", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotEqualTo(Integer value) {
            addCriterion("producttypeid <>", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThan(Integer value) {
            addCriterion("producttypeid >", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("producttypeid >=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThan(Integer value) {
            addCriterion("producttypeid <", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("producttypeid <=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIn(List<Integer> values) {
            addCriterion("producttypeid in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotIn(List<Integer> values) {
            addCriterion("producttypeid not in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidBetween(Integer value1, Integer value2) {
            addCriterion("producttypeid between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("producttypeid not between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandid is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandid =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandid <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandid >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandid >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandid <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandid <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandid in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandid not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandid between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandid not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("marketprice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("marketprice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(Double value) {
            addCriterion("marketprice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(Double value) {
            addCriterion("marketprice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(Double value) {
            addCriterion("marketprice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("marketprice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(Double value) {
            addCriterion("marketprice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(Double value) {
            addCriterion("marketprice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<Double> values) {
            addCriterion("marketprice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<Double> values) {
            addCriterion("marketprice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(Double value1, Double value2) {
            addCriterion("marketprice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(Double value1, Double value2) {
            addCriterion("marketprice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNull() {
            addCriterion("salesprice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("salesprice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(Double value) {
            addCriterion("salesprice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(Double value) {
            addCriterion("salesprice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(Double value) {
            addCriterion("salesprice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(Double value) {
            addCriterion("salesprice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(Double value) {
            addCriterion("salesprice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(Double value) {
            addCriterion("salesprice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<Double> values) {
            addCriterion("salesprice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<Double> values) {
            addCriterion("salesprice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(Double value1, Double value2) {
            addCriterion("salesprice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(Double value1, Double value2) {
            addCriterion("salesprice not between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andStockupdateIsNull() {
            addCriterion("stockupdate is null");
            return (Criteria) this;
        }

        public Criteria andStockupdateIsNotNull() {
            addCriterion("stockupdate is not null");
            return (Criteria) this;
        }

        public Criteria andStockupdateEqualTo(Integer value) {
            addCriterion("stockupdate =", value, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateNotEqualTo(Integer value) {
            addCriterion("stockupdate <>", value, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateGreaterThan(Integer value) {
            addCriterion("stockupdate >", value, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockupdate >=", value, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateLessThan(Integer value) {
            addCriterion("stockupdate <", value, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateLessThanOrEqualTo(Integer value) {
            addCriterion("stockupdate <=", value, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateIn(List<Integer> values) {
            addCriterion("stockupdate in", values, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateNotIn(List<Integer> values) {
            addCriterion("stockupdate not in", values, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateBetween(Integer value1, Integer value2) {
            addCriterion("stockupdate between", value1, value2, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andStockupdateNotBetween(Integer value1, Integer value2) {
            addCriterion("stockupdate not between", value1, value2, "stockupdate");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andLogoimgIsNull() {
            addCriterion("logoimg is null");
            return (Criteria) this;
        }

        public Criteria andLogoimgIsNotNull() {
            addCriterion("logoimg is not null");
            return (Criteria) this;
        }

        public Criteria andLogoimgEqualTo(String value) {
            addCriterion("logoimg =", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgNotEqualTo(String value) {
            addCriterion("logoimg <>", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgGreaterThan(String value) {
            addCriterion("logoimg >", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgGreaterThanOrEqualTo(String value) {
            addCriterion("logoimg >=", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgLessThan(String value) {
            addCriterion("logoimg <", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgLessThanOrEqualTo(String value) {
            addCriterion("logoimg <=", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgLike(String value) {
            addCriterion("logoimg like", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgNotLike(String value) {
            addCriterion("logoimg not like", value, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgIn(List<String> values) {
            addCriterion("logoimg in", values, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgNotIn(List<String> values) {
            addCriterion("logoimg not in", values, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgBetween(String value1, String value2) {
            addCriterion("logoimg between", value1, value2, "logoimg");
            return (Criteria) this;
        }

        public Criteria andLogoimgNotBetween(String value1, String value2) {
            addCriterion("logoimg not between", value1, value2, "logoimg");
            return (Criteria) this;
        }

        public Criteria andFunctiondescIsNull() {
            addCriterion("functiondesc is null");
            return (Criteria) this;
        }

        public Criteria andFunctiondescIsNotNull() {
            addCriterion("functiondesc is not null");
            return (Criteria) this;
        }

        public Criteria andFunctiondescEqualTo(String value) {
            addCriterion("functiondesc =", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotEqualTo(String value) {
            addCriterion("functiondesc <>", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescGreaterThan(String value) {
            addCriterion("functiondesc >", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescGreaterThanOrEqualTo(String value) {
            addCriterion("functiondesc >=", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescLessThan(String value) {
            addCriterion("functiondesc <", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescLessThanOrEqualTo(String value) {
            addCriterion("functiondesc <=", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescLike(String value) {
            addCriterion("functiondesc like", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotLike(String value) {
            addCriterion("functiondesc not like", value, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescIn(List<String> values) {
            addCriterion("functiondesc in", values, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotIn(List<String> values) {
            addCriterion("functiondesc not in", values, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescBetween(String value1, String value2) {
            addCriterion("functiondesc between", value1, value2, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andFunctiondescNotBetween(String value1, String value2) {
            addCriterion("functiondesc not between", value1, value2, "functiondesc");
            return (Criteria) this;
        }

        public Criteria andStorenumberIsNull() {
            addCriterion("storenumber is null");
            return (Criteria) this;
        }

        public Criteria andStorenumberIsNotNull() {
            addCriterion("storenumber is not null");
            return (Criteria) this;
        }

        public Criteria andStorenumberEqualTo(Integer value) {
            addCriterion("storenumber =", value, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberNotEqualTo(Integer value) {
            addCriterion("storenumber <>", value, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberGreaterThan(Integer value) {
            addCriterion("storenumber >", value, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("storenumber >=", value, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberLessThan(Integer value) {
            addCriterion("storenumber <", value, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberLessThanOrEqualTo(Integer value) {
            addCriterion("storenumber <=", value, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberIn(List<Integer> values) {
            addCriterion("storenumber in", values, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberNotIn(List<Integer> values) {
            addCriterion("storenumber not in", values, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberBetween(Integer value1, Integer value2) {
            addCriterion("storenumber between", value1, value2, "storenumber");
            return (Criteria) this;
        }

        public Criteria andStorenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("storenumber not between", value1, value2, "storenumber");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameIsNull() {
            addCriterion("measuringunitname is null");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameIsNotNull() {
            addCriterion("measuringunitname is not null");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameEqualTo(String value) {
            addCriterion("measuringunitname =", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameNotEqualTo(String value) {
            addCriterion("measuringunitname <>", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameGreaterThan(String value) {
            addCriterion("measuringunitname >", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("measuringunitname >=", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameLessThan(String value) {
            addCriterion("measuringunitname <", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameLessThanOrEqualTo(String value) {
            addCriterion("measuringunitname <=", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameLike(String value) {
            addCriterion("measuringunitname like", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameNotLike(String value) {
            addCriterion("measuringunitname not like", value, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameIn(List<String> values) {
            addCriterion("measuringunitname in", values, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameNotIn(List<String> values) {
            addCriterion("measuringunitname not in", values, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameBetween(String value1, String value2) {
            addCriterion("measuringunitname between", value1, value2, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andMeasuringunitnameNotBetween(String value1, String value2) {
            addCriterion("measuringunitname not between", value1, value2, "measuringunitname");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelIsNull() {
            addCriterion("manufacturermodel is null");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelIsNotNull() {
            addCriterion("manufacturermodel is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelEqualTo(String value) {
            addCriterion("manufacturermodel =", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelNotEqualTo(String value) {
            addCriterion("manufacturermodel <>", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelGreaterThan(String value) {
            addCriterion("manufacturermodel >", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturermodel >=", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelLessThan(String value) {
            addCriterion("manufacturermodel <", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelLessThanOrEqualTo(String value) {
            addCriterion("manufacturermodel <=", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelLike(String value) {
            addCriterion("manufacturermodel like", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelNotLike(String value) {
            addCriterion("manufacturermodel not like", value, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelIn(List<String> values) {
            addCriterion("manufacturermodel in", values, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelNotIn(List<String> values) {
            addCriterion("manufacturermodel not in", values, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelBetween(String value1, String value2) {
            addCriterion("manufacturermodel between", value1, value2, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andManufacturermodelNotBetween(String value1, String value2) {
            addCriterion("manufacturermodel not between", value1, value2, "manufacturermodel");
            return (Criteria) this;
        }

        public Criteria andFromidIsNull() {
            addCriterion("fromId is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("fromId is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(Integer value) {
            addCriterion("fromId =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(Integer value) {
            addCriterion("fromId <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(Integer value) {
            addCriterion("fromId >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromId >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(Integer value) {
            addCriterion("fromId <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(Integer value) {
            addCriterion("fromId <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<Integer> values) {
            addCriterion("fromId in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<Integer> values) {
            addCriterion("fromId not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(Integer value1, Integer value2) {
            addCriterion("fromId between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(Integer value1, Integer value2) {
            addCriterion("fromId not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewIsNull() {
            addCriterion("functiondescnew is null");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewIsNotNull() {
            addCriterion("functiondescnew is not null");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewEqualTo(String value) {
            addCriterion("functiondescnew =", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewNotEqualTo(String value) {
            addCriterion("functiondescnew <>", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewGreaterThan(String value) {
            addCriterion("functiondescnew >", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewGreaterThanOrEqualTo(String value) {
            addCriterion("functiondescnew >=", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewLessThan(String value) {
            addCriterion("functiondescnew <", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewLessThanOrEqualTo(String value) {
            addCriterion("functiondescnew <=", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewLike(String value) {
            addCriterion("functiondescnew like", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewNotLike(String value) {
            addCriterion("functiondescnew not like", value, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewIn(List<String> values) {
            addCriterion("functiondescnew in", values, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewNotIn(List<String> values) {
            addCriterion("functiondescnew not in", values, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewBetween(String value1, String value2) {
            addCriterion("functiondescnew between", value1, value2, "functiondescnew");
            return (Criteria) this;
        }

        public Criteria andFunctiondescnewNotBetween(String value1, String value2) {
            addCriterion("functiondescnew not between", value1, value2, "functiondescnew");
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