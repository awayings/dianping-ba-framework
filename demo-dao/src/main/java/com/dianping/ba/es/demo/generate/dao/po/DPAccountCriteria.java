package com.dianping.ba.es.demo.generate.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DPAccountCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DPAccountCriteria() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("AccountType is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("AccountType is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Byte value) {
            addCriterion("AccountType =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Byte value) {
            addCriterion("AccountType <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Byte value) {
            addCriterion("AccountType >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("AccountType >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Byte value) {
            addCriterion("AccountType <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Byte value) {
            addCriterion("AccountType <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Byte> values) {
            addCriterion("AccountType in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Byte> values) {
            addCriterion("AccountType not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Byte value1, Byte value2) {
            addCriterion("AccountType between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("AccountType not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIDNumberIsNull() {
            addCriterion("IDNumber is null");
            return (Criteria) this;
        }

        public Criteria andIDNumberIsNotNull() {
            addCriterion("IDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIDNumberEqualTo(String value) {
            addCriterion("IDNumber =", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotEqualTo(String value) {
            addCriterion("IDNumber <>", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberGreaterThan(String value) {
            addCriterion("IDNumber >", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumber >=", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberLessThan(String value) {
            addCriterion("IDNumber <", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberLessThanOrEqualTo(String value) {
            addCriterion("IDNumber <=", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberLike(String value) {
            addCriterion("IDNumber like", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotLike(String value) {
            addCriterion("IDNumber not like", value, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberIn(List<String> values) {
            addCriterion("IDNumber in", values, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotIn(List<String> values) {
            addCriterion("IDNumber not in", values, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberBetween(String value1, String value2) {
            addCriterion("IDNumber between", value1, value2, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andIDNumberNotBetween(String value1, String value2) {
            addCriterion("IDNumber not between", value1, value2, "IDNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNull() {
            addCriterion("EmployeeNumber is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNotNull() {
            addCriterion("EmployeeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberEqualTo(String value) {
            addCriterion("EmployeeNumber =", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotEqualTo(String value) {
            addCriterion("EmployeeNumber <>", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThan(String value) {
            addCriterion("EmployeeNumber >", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeNumber >=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThan(String value) {
            addCriterion("EmployeeNumber <", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("EmployeeNumber <=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLike(String value) {
            addCriterion("EmployeeNumber like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotLike(String value) {
            addCriterion("EmployeeNumber not like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIn(List<String> values) {
            addCriterion("EmployeeNumber in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotIn(List<String> values) {
            addCriterion("EmployeeNumber not in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberBetween(String value1, String value2) {
            addCriterion("EmployeeNumber between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("EmployeeNumber not between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("LoginId is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("LoginId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(Integer value) {
            addCriterion("LoginId =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(Integer value) {
            addCriterion("LoginId <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(Integer value) {
            addCriterion("LoginId >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginId >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(Integer value) {
            addCriterion("LoginId <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(Integer value) {
            addCriterion("LoginId <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<Integer> values) {
            addCriterion("LoginId in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<Integer> values) {
            addCriterion("LoginId not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(Integer value1, Integer value2) {
            addCriterion("LoginId between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginId not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andSysStatusIsNull() {
            addCriterion("SysStatus is null");
            return (Criteria) this;
        }

        public Criteria andSysStatusIsNotNull() {
            addCriterion("SysStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSysStatusEqualTo(Byte value) {
            addCriterion("SysStatus =", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotEqualTo(Byte value) {
            addCriterion("SysStatus <>", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusGreaterThan(Byte value) {
            addCriterion("SysStatus >", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("SysStatus >=", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusLessThan(Byte value) {
            addCriterion("SysStatus <", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusLessThanOrEqualTo(Byte value) {
            addCriterion("SysStatus <=", value, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusIn(List<Byte> values) {
            addCriterion("SysStatus in", values, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotIn(List<Byte> values) {
            addCriterion("SysStatus not in", values, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusBetween(Byte value1, Byte value2) {
            addCriterion("SysStatus between", value1, value2, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andSysStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("SysStatus not between", value1, value2, "sysStatus");
            return (Criteria) this;
        }

        public Criteria andGmailIsNull() {
            addCriterion("Gmail is null");
            return (Criteria) this;
        }

        public Criteria andGmailIsNotNull() {
            addCriterion("Gmail is not null");
            return (Criteria) this;
        }

        public Criteria andGmailEqualTo(String value) {
            addCriterion("Gmail =", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailNotEqualTo(String value) {
            addCriterion("Gmail <>", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailGreaterThan(String value) {
            addCriterion("Gmail >", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailGreaterThanOrEqualTo(String value) {
            addCriterion("Gmail >=", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailLessThan(String value) {
            addCriterion("Gmail <", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailLessThanOrEqualTo(String value) {
            addCriterion("Gmail <=", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailLike(String value) {
            addCriterion("Gmail like", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailNotLike(String value) {
            addCriterion("Gmail not like", value, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailIn(List<String> values) {
            addCriterion("Gmail in", values, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailNotIn(List<String> values) {
            addCriterion("Gmail not in", values, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailBetween(String value1, String value2) {
            addCriterion("Gmail between", value1, value2, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailNotBetween(String value1, String value2) {
            addCriterion("Gmail not between", value1, value2, "gmail");
            return (Criteria) this;
        }

        public Criteria andGmailStatusIsNull() {
            addCriterion("GmailStatus is null");
            return (Criteria) this;
        }

        public Criteria andGmailStatusIsNotNull() {
            addCriterion("GmailStatus is not null");
            return (Criteria) this;
        }

        public Criteria andGmailStatusEqualTo(Byte value) {
            addCriterion("GmailStatus =", value, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusNotEqualTo(Byte value) {
            addCriterion("GmailStatus <>", value, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusGreaterThan(Byte value) {
            addCriterion("GmailStatus >", value, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("GmailStatus >=", value, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusLessThan(Byte value) {
            addCriterion("GmailStatus <", value, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusLessThanOrEqualTo(Byte value) {
            addCriterion("GmailStatus <=", value, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusIn(List<Byte> values) {
            addCriterion("GmailStatus in", values, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusNotIn(List<Byte> values) {
            addCriterion("GmailStatus not in", values, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusBetween(Byte value1, Byte value2) {
            addCriterion("GmailStatus between", value1, value2, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andGmailStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("GmailStatus not between", value1, value2, "gmailStatus");
            return (Criteria) this;
        }

        public Criteria andADIsNull() {
            addCriterion("AD is null");
            return (Criteria) this;
        }

        public Criteria andADIsNotNull() {
            addCriterion("AD is not null");
            return (Criteria) this;
        }

        public Criteria andADEqualTo(String value) {
            addCriterion("AD =", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADNotEqualTo(String value) {
            addCriterion("AD <>", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADGreaterThan(String value) {
            addCriterion("AD >", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADGreaterThanOrEqualTo(String value) {
            addCriterion("AD >=", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADLessThan(String value) {
            addCriterion("AD <", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADLessThanOrEqualTo(String value) {
            addCriterion("AD <=", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADLike(String value) {
            addCriterion("AD like", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADNotLike(String value) {
            addCriterion("AD not like", value, "AD");
            return (Criteria) this;
        }

        public Criteria andADIn(List<String> values) {
            addCriterion("AD in", values, "AD");
            return (Criteria) this;
        }

        public Criteria andADNotIn(List<String> values) {
            addCriterion("AD not in", values, "AD");
            return (Criteria) this;
        }

        public Criteria andADBetween(String value1, String value2) {
            addCriterion("AD between", value1, value2, "AD");
            return (Criteria) this;
        }

        public Criteria andADNotBetween(String value1, String value2) {
            addCriterion("AD not between", value1, value2, "AD");
            return (Criteria) this;
        }

        public Criteria andADStatusIsNull() {
            addCriterion("ADStatus is null");
            return (Criteria) this;
        }

        public Criteria andADStatusIsNotNull() {
            addCriterion("ADStatus is not null");
            return (Criteria) this;
        }

        public Criteria andADStatusEqualTo(Byte value) {
            addCriterion("ADStatus =", value, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusNotEqualTo(Byte value) {
            addCriterion("ADStatus <>", value, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusGreaterThan(Byte value) {
            addCriterion("ADStatus >", value, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ADStatus >=", value, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusLessThan(Byte value) {
            addCriterion("ADStatus <", value, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusLessThanOrEqualTo(Byte value) {
            addCriterion("ADStatus <=", value, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusIn(List<Byte> values) {
            addCriterion("ADStatus in", values, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusNotIn(List<Byte> values) {
            addCriterion("ADStatus not in", values, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusBetween(Byte value1, Byte value2) {
            addCriterion("ADStatus between", value1, value2, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andADStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ADStatus not between", value1, value2, "ADStatus");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andGmail2IsNull() {
            addCriterion("Gmail2 is null");
            return (Criteria) this;
        }

        public Criteria andGmail2IsNotNull() {
            addCriterion("Gmail2 is not null");
            return (Criteria) this;
        }

        public Criteria andGmail2EqualTo(String value) {
            addCriterion("Gmail2 =", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2NotEqualTo(String value) {
            addCriterion("Gmail2 <>", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2GreaterThan(String value) {
            addCriterion("Gmail2 >", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2GreaterThanOrEqualTo(String value) {
            addCriterion("Gmail2 >=", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2LessThan(String value) {
            addCriterion("Gmail2 <", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2LessThanOrEqualTo(String value) {
            addCriterion("Gmail2 <=", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2Like(String value) {
            addCriterion("Gmail2 like", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2NotLike(String value) {
            addCriterion("Gmail2 not like", value, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2In(List<String> values) {
            addCriterion("Gmail2 in", values, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2NotIn(List<String> values) {
            addCriterion("Gmail2 not in", values, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2Between(String value1, String value2) {
            addCriterion("Gmail2 between", value1, value2, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2NotBetween(String value1, String value2) {
            addCriterion("Gmail2 not between", value1, value2, "gmail2");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusIsNull() {
            addCriterion("Gmail2Status is null");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusIsNotNull() {
            addCriterion("Gmail2Status is not null");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusEqualTo(Byte value) {
            addCriterion("Gmail2Status =", value, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusNotEqualTo(Byte value) {
            addCriterion("Gmail2Status <>", value, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusGreaterThan(Byte value) {
            addCriterion("Gmail2Status >", value, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Gmail2Status >=", value, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusLessThan(Byte value) {
            addCriterion("Gmail2Status <", value, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusLessThanOrEqualTo(Byte value) {
            addCriterion("Gmail2Status <=", value, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusIn(List<Byte> values) {
            addCriterion("Gmail2Status in", values, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusNotIn(List<Byte> values) {
            addCriterion("Gmail2Status not in", values, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusBetween(Byte value1, Byte value2) {
            addCriterion("Gmail2Status between", value1, value2, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andGmail2StatusNotBetween(Byte value1, Byte value2) {
            addCriterion("Gmail2Status not between", value1, value2, "gmail2Status");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNull() {
            addCriterion("IsFrozen is null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNotNull() {
            addCriterion("IsFrozen is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenEqualTo(Byte value) {
            addCriterion("IsFrozen =", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotEqualTo(Byte value) {
            addCriterion("IsFrozen <>", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThan(Byte value) {
            addCriterion("IsFrozen >", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsFrozen >=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThan(Byte value) {
            addCriterion("IsFrozen <", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThanOrEqualTo(Byte value) {
            addCriterion("IsFrozen <=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIn(List<Byte> values) {
            addCriterion("IsFrozen in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotIn(List<Byte> values) {
            addCriterion("IsFrozen not in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenBetween(Byte value1, Byte value2) {
            addCriterion("IsFrozen between", value1, value2, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotBetween(Byte value1, Byte value2) {
            addCriterion("IsFrozen not between", value1, value2, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIsNull() {
            addCriterion("PasswordUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIsNotNull() {
            addCriterion("PasswordUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeEqualTo(Date value) {
            addCriterion("PasswordUpdateTime =", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotEqualTo(Date value) {
            addCriterion("PasswordUpdateTime <>", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeGreaterThan(Date value) {
            addCriterion("PasswordUpdateTime >", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PasswordUpdateTime >=", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeLessThan(Date value) {
            addCriterion("PasswordUpdateTime <", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("PasswordUpdateTime <=", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIn(List<Date> values) {
            addCriterion("PasswordUpdateTime in", values, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotIn(List<Date> values) {
            addCriterion("PasswordUpdateTime not in", values, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("PasswordUpdateTime between", value1, value2, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("PasswordUpdateTime not between", value1, value2, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOffice1IsNull() {
            addCriterion("Office1 is null");
            return (Criteria) this;
        }

        public Criteria andOffice1IsNotNull() {
            addCriterion("Office1 is not null");
            return (Criteria) this;
        }

        public Criteria andOffice1EqualTo(String value) {
            addCriterion("Office1 =", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1NotEqualTo(String value) {
            addCriterion("Office1 <>", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1GreaterThan(String value) {
            addCriterion("Office1 >", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1GreaterThanOrEqualTo(String value) {
            addCriterion("Office1 >=", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1LessThan(String value) {
            addCriterion("Office1 <", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1LessThanOrEqualTo(String value) {
            addCriterion("Office1 <=", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1Like(String value) {
            addCriterion("Office1 like", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1NotLike(String value) {
            addCriterion("Office1 not like", value, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1In(List<String> values) {
            addCriterion("Office1 in", values, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1NotIn(List<String> values) {
            addCriterion("Office1 not in", values, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1Between(String value1, String value2) {
            addCriterion("Office1 between", value1, value2, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1NotBetween(String value1, String value2) {
            addCriterion("Office1 not between", value1, value2, "office1");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusIsNull() {
            addCriterion("Office1Status is null");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusIsNotNull() {
            addCriterion("Office1Status is not null");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusEqualTo(Byte value) {
            addCriterion("Office1Status =", value, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusNotEqualTo(Byte value) {
            addCriterion("Office1Status <>", value, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusGreaterThan(Byte value) {
            addCriterion("Office1Status >", value, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office1Status >=", value, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusLessThan(Byte value) {
            addCriterion("Office1Status <", value, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusLessThanOrEqualTo(Byte value) {
            addCriterion("Office1Status <=", value, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusIn(List<Byte> values) {
            addCriterion("Office1Status in", values, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusNotIn(List<Byte> values) {
            addCriterion("Office1Status not in", values, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusBetween(Byte value1, Byte value2) {
            addCriterion("Office1Status between", value1, value2, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1StatusNotBetween(Byte value1, Byte value2) {
            addCriterion("Office1Status not between", value1, value2, "office1Status");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeIsNull() {
            addCriterion("Office1LicenseType is null");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeIsNotNull() {
            addCriterion("Office1LicenseType is not null");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeEqualTo(Byte value) {
            addCriterion("Office1LicenseType =", value, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeNotEqualTo(Byte value) {
            addCriterion("Office1LicenseType <>", value, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeGreaterThan(Byte value) {
            addCriterion("Office1LicenseType >", value, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office1LicenseType >=", value, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeLessThan(Byte value) {
            addCriterion("Office1LicenseType <", value, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("Office1LicenseType <=", value, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeIn(List<Byte> values) {
            addCriterion("Office1LicenseType in", values, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeNotIn(List<Byte> values) {
            addCriterion("Office1LicenseType not in", values, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeBetween(Byte value1, Byte value2) {
            addCriterion("Office1LicenseType between", value1, value2, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice1LicenseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("Office1LicenseType not between", value1, value2, "office1LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2IsNull() {
            addCriterion("Office2 is null");
            return (Criteria) this;
        }

        public Criteria andOffice2IsNotNull() {
            addCriterion("Office2 is not null");
            return (Criteria) this;
        }

        public Criteria andOffice2EqualTo(String value) {
            addCriterion("Office2 =", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2NotEqualTo(String value) {
            addCriterion("Office2 <>", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2GreaterThan(String value) {
            addCriterion("Office2 >", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2GreaterThanOrEqualTo(String value) {
            addCriterion("Office2 >=", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2LessThan(String value) {
            addCriterion("Office2 <", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2LessThanOrEqualTo(String value) {
            addCriterion("Office2 <=", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2Like(String value) {
            addCriterion("Office2 like", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2NotLike(String value) {
            addCriterion("Office2 not like", value, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2In(List<String> values) {
            addCriterion("Office2 in", values, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2NotIn(List<String> values) {
            addCriterion("Office2 not in", values, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2Between(String value1, String value2) {
            addCriterion("Office2 between", value1, value2, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2NotBetween(String value1, String value2) {
            addCriterion("Office2 not between", value1, value2, "office2");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusIsNull() {
            addCriterion("Office2Status is null");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusIsNotNull() {
            addCriterion("Office2Status is not null");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusEqualTo(Byte value) {
            addCriterion("Office2Status =", value, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusNotEqualTo(Byte value) {
            addCriterion("Office2Status <>", value, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusGreaterThan(Byte value) {
            addCriterion("Office2Status >", value, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office2Status >=", value, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusLessThan(Byte value) {
            addCriterion("Office2Status <", value, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusLessThanOrEqualTo(Byte value) {
            addCriterion("Office2Status <=", value, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusIn(List<Byte> values) {
            addCriterion("Office2Status in", values, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusNotIn(List<Byte> values) {
            addCriterion("Office2Status not in", values, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusBetween(Byte value1, Byte value2) {
            addCriterion("Office2Status between", value1, value2, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2StatusNotBetween(Byte value1, Byte value2) {
            addCriterion("Office2Status not between", value1, value2, "office2Status");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeIsNull() {
            addCriterion("Office2LicenseType is null");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeIsNotNull() {
            addCriterion("Office2LicenseType is not null");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeEqualTo(Byte value) {
            addCriterion("Office2LicenseType =", value, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeNotEqualTo(Byte value) {
            addCriterion("Office2LicenseType <>", value, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeGreaterThan(Byte value) {
            addCriterion("Office2LicenseType >", value, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office2LicenseType >=", value, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeLessThan(Byte value) {
            addCriterion("Office2LicenseType <", value, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("Office2LicenseType <=", value, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeIn(List<Byte> values) {
            addCriterion("Office2LicenseType in", values, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeNotIn(List<Byte> values) {
            addCriterion("Office2LicenseType not in", values, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeBetween(Byte value1, Byte value2) {
            addCriterion("Office2LicenseType between", value1, value2, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2LicenseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("Office2LicenseType not between", value1, value2, "office2LicenseType");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeIsNull() {
            addCriterion("Office2Type is null");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeIsNotNull() {
            addCriterion("Office2Type is not null");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeEqualTo(Byte value) {
            addCriterion("Office2Type =", value, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeNotEqualTo(Byte value) {
            addCriterion("Office2Type <>", value, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeGreaterThan(Byte value) {
            addCriterion("Office2Type >", value, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office2Type >=", value, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeLessThan(Byte value) {
            addCriterion("Office2Type <", value, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeLessThanOrEqualTo(Byte value) {
            addCriterion("Office2Type <=", value, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeIn(List<Byte> values) {
            addCriterion("Office2Type in", values, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeNotIn(List<Byte> values) {
            addCriterion("Office2Type not in", values, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeBetween(Byte value1, Byte value2) {
            addCriterion("Office2Type between", value1, value2, "office2Type");
            return (Criteria) this;
        }

        public Criteria andOffice2TypeNotBetween(Byte value1, Byte value2) {
            addCriterion("Office2Type not between", value1, value2, "office2Type");
            return (Criteria) this;
        }

        public Criteria andCtripCardIsNull() {
            addCriterion("CtripCard is null");
            return (Criteria) this;
        }

        public Criteria andCtripCardIsNotNull() {
            addCriterion("CtripCard is not null");
            return (Criteria) this;
        }

        public Criteria andCtripCardEqualTo(String value) {
            addCriterion("CtripCard =", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardNotEqualTo(String value) {
            addCriterion("CtripCard <>", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardGreaterThan(String value) {
            addCriterion("CtripCard >", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardGreaterThanOrEqualTo(String value) {
            addCriterion("CtripCard >=", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardLessThan(String value) {
            addCriterion("CtripCard <", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardLessThanOrEqualTo(String value) {
            addCriterion("CtripCard <=", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardLike(String value) {
            addCriterion("CtripCard like", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardNotLike(String value) {
            addCriterion("CtripCard not like", value, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardIn(List<String> values) {
            addCriterion("CtripCard in", values, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardNotIn(List<String> values) {
            addCriterion("CtripCard not in", values, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardBetween(String value1, String value2) {
            addCriterion("CtripCard between", value1, value2, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andCtripCardNotBetween(String value1, String value2) {
            addCriterion("CtripCard not between", value1, value2, "ctripCard");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNull() {
            addCriterion("PauseTime is null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNotNull() {
            addCriterion("PauseTime is not null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeEqualTo(Date value) {
            addCriterion("PauseTime =", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotEqualTo(Date value) {
            addCriterion("PauseTime <>", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThan(Date value) {
            addCriterion("PauseTime >", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PauseTime >=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThan(Date value) {
            addCriterion("PauseTime <", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThanOrEqualTo(Date value) {
            addCriterion("PauseTime <=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIn(List<Date> values) {
            addCriterion("PauseTime in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotIn(List<Date> values) {
            addCriterion("PauseTime not in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeBetween(Date value1, Date value2) {
            addCriterion("PauseTime between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotBetween(Date value1, Date value2) {
            addCriterion("PauseTime not between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andTransferEmailIsNull() {
            addCriterion("TransferEmail is null");
            return (Criteria) this;
        }

        public Criteria andTransferEmailIsNotNull() {
            addCriterion("TransferEmail is not null");
            return (Criteria) this;
        }

        public Criteria andTransferEmailEqualTo(String value) {
            addCriterion("TransferEmail =", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailNotEqualTo(String value) {
            addCriterion("TransferEmail <>", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailGreaterThan(String value) {
            addCriterion("TransferEmail >", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TransferEmail >=", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailLessThan(String value) {
            addCriterion("TransferEmail <", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailLessThanOrEqualTo(String value) {
            addCriterion("TransferEmail <=", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailLike(String value) {
            addCriterion("TransferEmail like", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailNotLike(String value) {
            addCriterion("TransferEmail not like", value, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailIn(List<String> values) {
            addCriterion("TransferEmail in", values, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailNotIn(List<String> values) {
            addCriterion("TransferEmail not in", values, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailBetween(String value1, String value2) {
            addCriterion("TransferEmail between", value1, value2, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andTransferEmailNotBetween(String value1, String value2) {
            addCriterion("TransferEmail not between", value1, value2, "transferEmail");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("DeleteTime =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("DeleteTime <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("DeleteTime >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DeleteTime >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("DeleteTime <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("DeleteTime <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("DeleteTime in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("DeleteTime not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("DeleteTime between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("DeleteTime not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNull() {
            addCriterion("Encrypt is null");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNotNull() {
            addCriterion("Encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptEqualTo(String value) {
            addCriterion("Encrypt =", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotEqualTo(String value) {
            addCriterion("Encrypt <>", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThan(String value) {
            addCriterion("Encrypt >", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("Encrypt >=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThan(String value) {
            addCriterion("Encrypt <", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThanOrEqualTo(String value) {
            addCriterion("Encrypt <=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLike(String value) {
            addCriterion("Encrypt like", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotLike(String value) {
            addCriterion("Encrypt not like", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptIn(List<String> values) {
            addCriterion("Encrypt in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotIn(List<String> values) {
            addCriterion("Encrypt not in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptBetween(String value1, String value2) {
            addCriterion("Encrypt between", value1, value2, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotBetween(String value1, String value2) {
            addCriterion("Encrypt not between", value1, value2, "encrypt");
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