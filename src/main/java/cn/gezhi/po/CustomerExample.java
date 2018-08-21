package cn.gezhi.po;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andIdcardnumIsNull() {
            addCriterion("idCardNum is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIsNotNull() {
            addCriterion("idCardNum is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumEqualTo(String value) {
            addCriterion("idCardNum =", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotEqualTo(String value) {
            addCriterion("idCardNum <>", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumGreaterThan(String value) {
            addCriterion("idCardNum >", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumGreaterThanOrEqualTo(String value) {
            addCriterion("idCardNum >=", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLessThan(String value) {
            addCriterion("idCardNum <", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLessThanOrEqualTo(String value) {
            addCriterion("idCardNum <=", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLike(String value) {
            addCriterion("idCardNum like", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotLike(String value) {
            addCriterion("idCardNum not like", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIn(List<String> values) {
            addCriterion("idCardNum in", values, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotIn(List<String> values) {
            addCriterion("idCardNum not in", values, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumBetween(String value1, String value2) {
            addCriterion("idCardNum between", value1, value2, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotBetween(String value1, String value2) {
            addCriterion("idCardNum not between", value1, value2, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("loanAmount is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("loanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(Double value) {
            addCriterion("loanAmount =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(Double value) {
            addCriterion("loanAmount <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(Double value) {
            addCriterion("loanAmount >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(Double value) {
            addCriterion("loanAmount >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(Double value) {
            addCriterion("loanAmount <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(Double value) {
            addCriterion("loanAmount <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<Double> values) {
            addCriterion("loanAmount in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<Double> values) {
            addCriterion("loanAmount not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(Double value1, Double value2) {
            addCriterion("loanAmount between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(Double value1, Double value2) {
            addCriterion("loanAmount not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andFinalloanIsNull() {
            addCriterion("finalLoan is null");
            return (Criteria) this;
        }

        public Criteria andFinalloanIsNotNull() {
            addCriterion("finalLoan is not null");
            return (Criteria) this;
        }

        public Criteria andFinalloanEqualTo(Double value) {
            addCriterion("finalLoan =", value, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanNotEqualTo(Double value) {
            addCriterion("finalLoan <>", value, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanGreaterThan(Double value) {
            addCriterion("finalLoan >", value, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanGreaterThanOrEqualTo(Double value) {
            addCriterion("finalLoan >=", value, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanLessThan(Double value) {
            addCriterion("finalLoan <", value, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanLessThanOrEqualTo(Double value) {
            addCriterion("finalLoan <=", value, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanIn(List<Double> values) {
            addCriterion("finalLoan in", values, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanNotIn(List<Double> values) {
            addCriterion("finalLoan not in", values, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanBetween(Double value1, Double value2) {
            addCriterion("finalLoan between", value1, value2, "finalloan");
            return (Criteria) this;
        }

        public Criteria andFinalloanNotBetween(Double value1, Double value2) {
            addCriterion("finalLoan not between", value1, value2, "finalloan");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Double value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Double value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Double value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Double value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Double value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Double value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Double> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Double> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Double value1, Double value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Double value1, Double value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andFocuslevelIsNull() {
            addCriterion("focusLevel is null");
            return (Criteria) this;
        }

        public Criteria andFocuslevelIsNotNull() {
            addCriterion("focusLevel is not null");
            return (Criteria) this;
        }

        public Criteria andFocuslevelEqualTo(String value) {
            addCriterion("focusLevel =", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelNotEqualTo(String value) {
            addCriterion("focusLevel <>", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelGreaterThan(String value) {
            addCriterion("focusLevel >", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelGreaterThanOrEqualTo(String value) {
            addCriterion("focusLevel >=", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelLessThan(String value) {
            addCriterion("focusLevel <", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelLessThanOrEqualTo(String value) {
            addCriterion("focusLevel <=", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelLike(String value) {
            addCriterion("focusLevel like", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelNotLike(String value) {
            addCriterion("focusLevel not like", value, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelIn(List<String> values) {
            addCriterion("focusLevel in", values, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelNotIn(List<String> values) {
            addCriterion("focusLevel not in", values, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelBetween(String value1, String value2) {
            addCriterion("focusLevel between", value1, value2, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andFocuslevelNotBetween(String value1, String value2) {
            addCriterion("focusLevel not between", value1, value2, "focuslevel");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityIsNull() {
            addCriterion("socialSecurity is null");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityIsNotNull() {
            addCriterion("socialSecurity is not null");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityEqualTo(String value) {
            addCriterion("socialSecurity =", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityNotEqualTo(String value) {
            addCriterion("socialSecurity <>", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityGreaterThan(String value) {
            addCriterion("socialSecurity >", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityGreaterThanOrEqualTo(String value) {
            addCriterion("socialSecurity >=", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityLessThan(String value) {
            addCriterion("socialSecurity <", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityLessThanOrEqualTo(String value) {
            addCriterion("socialSecurity <=", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityLike(String value) {
            addCriterion("socialSecurity like", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityNotLike(String value) {
            addCriterion("socialSecurity not like", value, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityIn(List<String> values) {
            addCriterion("socialSecurity in", values, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityNotIn(List<String> values) {
            addCriterion("socialSecurity not in", values, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityBetween(String value1, String value2) {
            addCriterion("socialSecurity between", value1, value2, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andSocialsecurityNotBetween(String value1, String value2) {
            addCriterion("socialSecurity not between", value1, value2, "socialsecurity");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSalesmanidIsNull() {
            addCriterion("salesmanId is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanidIsNotNull() {
            addCriterion("salesmanId is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanidEqualTo(Integer value) {
            addCriterion("salesmanId =", value, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidNotEqualTo(Integer value) {
            addCriterion("salesmanId <>", value, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidGreaterThan(Integer value) {
            addCriterion("salesmanId >", value, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesmanId >=", value, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidLessThan(Integer value) {
            addCriterion("salesmanId <", value, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidLessThanOrEqualTo(Integer value) {
            addCriterion("salesmanId <=", value, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidIn(List<Integer> values) {
            addCriterion("salesmanId in", values, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidNotIn(List<Integer> values) {
            addCriterion("salesmanId not in", values, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidBetween(Integer value1, Integer value2) {
            addCriterion("salesmanId between", value1, value2, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andSalesmanidNotBetween(Integer value1, Integer value2) {
            addCriterion("salesmanId not between", value1, value2, "salesmanid");
            return (Criteria) this;
        }

        public Criteria andAuditoridIsNull() {
            addCriterion("auditorId is null");
            return (Criteria) this;
        }

        public Criteria andAuditoridIsNotNull() {
            addCriterion("auditorId is not null");
            return (Criteria) this;
        }

        public Criteria andAuditoridEqualTo(Integer value) {
            addCriterion("auditorId =", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotEqualTo(Integer value) {
            addCriterion("auditorId <>", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridGreaterThan(Integer value) {
            addCriterion("auditorId >", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditorId >=", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridLessThan(Integer value) {
            addCriterion("auditorId <", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridLessThanOrEqualTo(Integer value) {
            addCriterion("auditorId <=", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridIn(List<Integer> values) {
            addCriterion("auditorId in", values, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotIn(List<Integer> values) {
            addCriterion("auditorId not in", values, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridBetween(Integer value1, Integer value2) {
            addCriterion("auditorId between", value1, value2, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotBetween(Integer value1, Integer value2) {
            addCriterion("auditorId not between", value1, value2, "auditorid");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankId is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankId is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Integer value) {
            addCriterion("bankId =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Integer value) {
            addCriterion("bankId <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Integer value) {
            addCriterion("bankId >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankId >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Integer value) {
            addCriterion("bankId <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Integer value) {
            addCriterion("bankId <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Integer> values) {
            addCriterion("bankId in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Integer> values) {
            addCriterion("bankId not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Integer value1, Integer value2) {
            addCriterion("bankId between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Integer value1, Integer value2) {
            addCriterion("bankId not between", value1, value2, "bankid");
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