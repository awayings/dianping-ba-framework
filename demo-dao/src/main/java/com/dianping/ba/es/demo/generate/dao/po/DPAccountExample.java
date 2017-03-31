package com.dianping.ba.es.demo.generate.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DPAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DPAccountExample() {
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

        public Criteria andAccounttypeIsNull() {
            addCriterion("AccountType is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("AccountType is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(Byte value) {
            addCriterion("AccountType =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(Byte value) {
            addCriterion("AccountType <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(Byte value) {
            addCriterion("AccountType >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("AccountType >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(Byte value) {
            addCriterion("AccountType <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(Byte value) {
            addCriterion("AccountType <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<Byte> values) {
            addCriterion("AccountType in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<Byte> values) {
            addCriterion("AccountType not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(Byte value1, Byte value2) {
            addCriterion("AccountType between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("AccountType not between", value1, value2, "accounttype");
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

        public Criteria andIdnumberIsNull() {
            addCriterion("IDNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("IDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("IDNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("IDNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("IDNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("IDNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("IDNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("IDNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("IDNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("IDNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("IDNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("IDNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("IDNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberIsNull() {
            addCriterion("EmployeeNumber is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberIsNotNull() {
            addCriterion("EmployeeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberEqualTo(String value) {
            addCriterion("EmployeeNumber =", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberNotEqualTo(String value) {
            addCriterion("EmployeeNumber <>", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberGreaterThan(String value) {
            addCriterion("EmployeeNumber >", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeNumber >=", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberLessThan(String value) {
            addCriterion("EmployeeNumber <", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberLessThanOrEqualTo(String value) {
            addCriterion("EmployeeNumber <=", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberLike(String value) {
            addCriterion("EmployeeNumber like", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberNotLike(String value) {
            addCriterion("EmployeeNumber not like", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberIn(List<String> values) {
            addCriterion("EmployeeNumber in", values, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberNotIn(List<String> values) {
            addCriterion("EmployeeNumber not in", values, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberBetween(String value1, String value2) {
            addCriterion("EmployeeNumber between", value1, value2, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberNotBetween(String value1, String value2) {
            addCriterion("EmployeeNumber not between", value1, value2, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNull() {
            addCriterion("LoginId is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("LoginId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(Integer value) {
            addCriterion("LoginId =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(Integer value) {
            addCriterion("LoginId <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(Integer value) {
            addCriterion("LoginId >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginId >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(Integer value) {
            addCriterion("LoginId <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(Integer value) {
            addCriterion("LoginId <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<Integer> values) {
            addCriterion("LoginId in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<Integer> values) {
            addCriterion("LoginId not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(Integer value1, Integer value2) {
            addCriterion("LoginId between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginId not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andSysstatusIsNull() {
            addCriterion("SysStatus is null");
            return (Criteria) this;
        }

        public Criteria andSysstatusIsNotNull() {
            addCriterion("SysStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSysstatusEqualTo(Byte value) {
            addCriterion("SysStatus =", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotEqualTo(Byte value) {
            addCriterion("SysStatus <>", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusGreaterThan(Byte value) {
            addCriterion("SysStatus >", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("SysStatus >=", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusLessThan(Byte value) {
            addCriterion("SysStatus <", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusLessThanOrEqualTo(Byte value) {
            addCriterion("SysStatus <=", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusIn(List<Byte> values) {
            addCriterion("SysStatus in", values, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotIn(List<Byte> values) {
            addCriterion("SysStatus not in", values, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusBetween(Byte value1, Byte value2) {
            addCriterion("SysStatus between", value1, value2, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("SysStatus not between", value1, value2, "sysstatus");
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

        public Criteria andGmailstatusIsNull() {
            addCriterion("GmailStatus is null");
            return (Criteria) this;
        }

        public Criteria andGmailstatusIsNotNull() {
            addCriterion("GmailStatus is not null");
            return (Criteria) this;
        }

        public Criteria andGmailstatusEqualTo(Byte value) {
            addCriterion("GmailStatus =", value, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusNotEqualTo(Byte value) {
            addCriterion("GmailStatus <>", value, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusGreaterThan(Byte value) {
            addCriterion("GmailStatus >", value, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("GmailStatus >=", value, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusLessThan(Byte value) {
            addCriterion("GmailStatus <", value, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusLessThanOrEqualTo(Byte value) {
            addCriterion("GmailStatus <=", value, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusIn(List<Byte> values) {
            addCriterion("GmailStatus in", values, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusNotIn(List<Byte> values) {
            addCriterion("GmailStatus not in", values, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusBetween(Byte value1, Byte value2) {
            addCriterion("GmailStatus between", value1, value2, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andGmailstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("GmailStatus not between", value1, value2, "gmailstatus");
            return (Criteria) this;
        }

        public Criteria andAdIsNull() {
            addCriterion("AD is null");
            return (Criteria) this;
        }

        public Criteria andAdIsNotNull() {
            addCriterion("AD is not null");
            return (Criteria) this;
        }

        public Criteria andAdEqualTo(String value) {
            addCriterion("AD =", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdNotEqualTo(String value) {
            addCriterion("AD <>", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdGreaterThan(String value) {
            addCriterion("AD >", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdGreaterThanOrEqualTo(String value) {
            addCriterion("AD >=", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdLessThan(String value) {
            addCriterion("AD <", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdLessThanOrEqualTo(String value) {
            addCriterion("AD <=", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdLike(String value) {
            addCriterion("AD like", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdNotLike(String value) {
            addCriterion("AD not like", value, "ad");
            return (Criteria) this;
        }

        public Criteria andAdIn(List<String> values) {
            addCriterion("AD in", values, "ad");
            return (Criteria) this;
        }

        public Criteria andAdNotIn(List<String> values) {
            addCriterion("AD not in", values, "ad");
            return (Criteria) this;
        }

        public Criteria andAdBetween(String value1, String value2) {
            addCriterion("AD between", value1, value2, "ad");
            return (Criteria) this;
        }

        public Criteria andAdNotBetween(String value1, String value2) {
            addCriterion("AD not between", value1, value2, "ad");
            return (Criteria) this;
        }

        public Criteria andAdstatusIsNull() {
            addCriterion("ADStatus is null");
            return (Criteria) this;
        }

        public Criteria andAdstatusIsNotNull() {
            addCriterion("ADStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAdstatusEqualTo(Byte value) {
            addCriterion("ADStatus =", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusNotEqualTo(Byte value) {
            addCriterion("ADStatus <>", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusGreaterThan(Byte value) {
            addCriterion("ADStatus >", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ADStatus >=", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusLessThan(Byte value) {
            addCriterion("ADStatus <", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusLessThanOrEqualTo(Byte value) {
            addCriterion("ADStatus <=", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusIn(List<Byte> values) {
            addCriterion("ADStatus in", values, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusNotIn(List<Byte> values) {
            addCriterion("ADStatus not in", values, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusBetween(Byte value1, Byte value2) {
            addCriterion("ADStatus between", value1, value2, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ADStatus not between", value1, value2, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addtime");
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

        public Criteria andGmail2statusIsNull() {
            addCriterion("Gmail2Status is null");
            return (Criteria) this;
        }

        public Criteria andGmail2statusIsNotNull() {
            addCriterion("Gmail2Status is not null");
            return (Criteria) this;
        }

        public Criteria andGmail2statusEqualTo(Byte value) {
            addCriterion("Gmail2Status =", value, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusNotEqualTo(Byte value) {
            addCriterion("Gmail2Status <>", value, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusGreaterThan(Byte value) {
            addCriterion("Gmail2Status >", value, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Gmail2Status >=", value, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusLessThan(Byte value) {
            addCriterion("Gmail2Status <", value, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusLessThanOrEqualTo(Byte value) {
            addCriterion("Gmail2Status <=", value, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusIn(List<Byte> values) {
            addCriterion("Gmail2Status in", values, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusNotIn(List<Byte> values) {
            addCriterion("Gmail2Status not in", values, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusBetween(Byte value1, Byte value2) {
            addCriterion("Gmail2Status between", value1, value2, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andGmail2statusNotBetween(Byte value1, Byte value2) {
            addCriterion("Gmail2Status not between", value1, value2, "gmail2status");
            return (Criteria) this;
        }

        public Criteria andIsfrozenIsNull() {
            addCriterion("IsFrozen is null");
            return (Criteria) this;
        }

        public Criteria andIsfrozenIsNotNull() {
            addCriterion("IsFrozen is not null");
            return (Criteria) this;
        }

        public Criteria andIsfrozenEqualTo(Byte value) {
            addCriterion("IsFrozen =", value, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenNotEqualTo(Byte value) {
            addCriterion("IsFrozen <>", value, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenGreaterThan(Byte value) {
            addCriterion("IsFrozen >", value, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsFrozen >=", value, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenLessThan(Byte value) {
            addCriterion("IsFrozen <", value, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenLessThanOrEqualTo(Byte value) {
            addCriterion("IsFrozen <=", value, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenIn(List<Byte> values) {
            addCriterion("IsFrozen in", values, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenNotIn(List<Byte> values) {
            addCriterion("IsFrozen not in", values, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenBetween(Byte value1, Byte value2) {
            addCriterion("IsFrozen between", value1, value2, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andIsfrozenNotBetween(Byte value1, Byte value2) {
            addCriterion("IsFrozen not between", value1, value2, "isfrozen");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeIsNull() {
            addCriterion("PasswordUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeIsNotNull() {
            addCriterion("PasswordUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeEqualTo(Date value) {
            addCriterion("PasswordUpdateTime =", value, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeNotEqualTo(Date value) {
            addCriterion("PasswordUpdateTime <>", value, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeGreaterThan(Date value) {
            addCriterion("PasswordUpdateTime >", value, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PasswordUpdateTime >=", value, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeLessThan(Date value) {
            addCriterion("PasswordUpdateTime <", value, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("PasswordUpdateTime <=", value, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeIn(List<Date> values) {
            addCriterion("PasswordUpdateTime in", values, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeNotIn(List<Date> values) {
            addCriterion("PasswordUpdateTime not in", values, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeBetween(Date value1, Date value2) {
            addCriterion("PasswordUpdateTime between", value1, value2, "passwordupdatetime");
            return (Criteria) this;
        }

        public Criteria andPasswordupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("PasswordUpdateTime not between", value1, value2, "passwordupdatetime");
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

        public Criteria andOffice1statusIsNull() {
            addCriterion("Office1Status is null");
            return (Criteria) this;
        }

        public Criteria andOffice1statusIsNotNull() {
            addCriterion("Office1Status is not null");
            return (Criteria) this;
        }

        public Criteria andOffice1statusEqualTo(Byte value) {
            addCriterion("Office1Status =", value, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusNotEqualTo(Byte value) {
            addCriterion("Office1Status <>", value, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusGreaterThan(Byte value) {
            addCriterion("Office1Status >", value, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office1Status >=", value, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusLessThan(Byte value) {
            addCriterion("Office1Status <", value, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusLessThanOrEqualTo(Byte value) {
            addCriterion("Office1Status <=", value, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusIn(List<Byte> values) {
            addCriterion("Office1Status in", values, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusNotIn(List<Byte> values) {
            addCriterion("Office1Status not in", values, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusBetween(Byte value1, Byte value2) {
            addCriterion("Office1Status between", value1, value2, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1statusNotBetween(Byte value1, Byte value2) {
            addCriterion("Office1Status not between", value1, value2, "office1status");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeIsNull() {
            addCriterion("Office1LicenseType is null");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeIsNotNull() {
            addCriterion("Office1LicenseType is not null");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeEqualTo(Byte value) {
            addCriterion("Office1LicenseType =", value, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeNotEqualTo(Byte value) {
            addCriterion("Office1LicenseType <>", value, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeGreaterThan(Byte value) {
            addCriterion("Office1LicenseType >", value, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office1LicenseType >=", value, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeLessThan(Byte value) {
            addCriterion("Office1LicenseType <", value, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeLessThanOrEqualTo(Byte value) {
            addCriterion("Office1LicenseType <=", value, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeIn(List<Byte> values) {
            addCriterion("Office1LicenseType in", values, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeNotIn(List<Byte> values) {
            addCriterion("Office1LicenseType not in", values, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeBetween(Byte value1, Byte value2) {
            addCriterion("Office1LicenseType between", value1, value2, "office1licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice1licensetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("Office1LicenseType not between", value1, value2, "office1licensetype");
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

        public Criteria andOffice2statusIsNull() {
            addCriterion("Office2Status is null");
            return (Criteria) this;
        }

        public Criteria andOffice2statusIsNotNull() {
            addCriterion("Office2Status is not null");
            return (Criteria) this;
        }

        public Criteria andOffice2statusEqualTo(Byte value) {
            addCriterion("Office2Status =", value, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusNotEqualTo(Byte value) {
            addCriterion("Office2Status <>", value, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusGreaterThan(Byte value) {
            addCriterion("Office2Status >", value, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office2Status >=", value, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusLessThan(Byte value) {
            addCriterion("Office2Status <", value, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusLessThanOrEqualTo(Byte value) {
            addCriterion("Office2Status <=", value, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusIn(List<Byte> values) {
            addCriterion("Office2Status in", values, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusNotIn(List<Byte> values) {
            addCriterion("Office2Status not in", values, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusBetween(Byte value1, Byte value2) {
            addCriterion("Office2Status between", value1, value2, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2statusNotBetween(Byte value1, Byte value2) {
            addCriterion("Office2Status not between", value1, value2, "office2status");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeIsNull() {
            addCriterion("Office2LicenseType is null");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeIsNotNull() {
            addCriterion("Office2LicenseType is not null");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeEqualTo(Byte value) {
            addCriterion("Office2LicenseType =", value, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeNotEqualTo(Byte value) {
            addCriterion("Office2LicenseType <>", value, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeGreaterThan(Byte value) {
            addCriterion("Office2LicenseType >", value, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office2LicenseType >=", value, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeLessThan(Byte value) {
            addCriterion("Office2LicenseType <", value, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeLessThanOrEqualTo(Byte value) {
            addCriterion("Office2LicenseType <=", value, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeIn(List<Byte> values) {
            addCriterion("Office2LicenseType in", values, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeNotIn(List<Byte> values) {
            addCriterion("Office2LicenseType not in", values, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeBetween(Byte value1, Byte value2) {
            addCriterion("Office2LicenseType between", value1, value2, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2licensetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("Office2LicenseType not between", value1, value2, "office2licensetype");
            return (Criteria) this;
        }

        public Criteria andOffice2typeIsNull() {
            addCriterion("Office2Type is null");
            return (Criteria) this;
        }

        public Criteria andOffice2typeIsNotNull() {
            addCriterion("Office2Type is not null");
            return (Criteria) this;
        }

        public Criteria andOffice2typeEqualTo(Byte value) {
            addCriterion("Office2Type =", value, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeNotEqualTo(Byte value) {
            addCriterion("Office2Type <>", value, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeGreaterThan(Byte value) {
            addCriterion("Office2Type >", value, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Office2Type >=", value, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeLessThan(Byte value) {
            addCriterion("Office2Type <", value, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeLessThanOrEqualTo(Byte value) {
            addCriterion("Office2Type <=", value, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeIn(List<Byte> values) {
            addCriterion("Office2Type in", values, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeNotIn(List<Byte> values) {
            addCriterion("Office2Type not in", values, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeBetween(Byte value1, Byte value2) {
            addCriterion("Office2Type between", value1, value2, "office2type");
            return (Criteria) this;
        }

        public Criteria andOffice2typeNotBetween(Byte value1, Byte value2) {
            addCriterion("Office2Type not between", value1, value2, "office2type");
            return (Criteria) this;
        }

        public Criteria andCtripcardIsNull() {
            addCriterion("CtripCard is null");
            return (Criteria) this;
        }

        public Criteria andCtripcardIsNotNull() {
            addCriterion("CtripCard is not null");
            return (Criteria) this;
        }

        public Criteria andCtripcardEqualTo(String value) {
            addCriterion("CtripCard =", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardNotEqualTo(String value) {
            addCriterion("CtripCard <>", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardGreaterThan(String value) {
            addCriterion("CtripCard >", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardGreaterThanOrEqualTo(String value) {
            addCriterion("CtripCard >=", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardLessThan(String value) {
            addCriterion("CtripCard <", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardLessThanOrEqualTo(String value) {
            addCriterion("CtripCard <=", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardLike(String value) {
            addCriterion("CtripCard like", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardNotLike(String value) {
            addCriterion("CtripCard not like", value, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardIn(List<String> values) {
            addCriterion("CtripCard in", values, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardNotIn(List<String> values) {
            addCriterion("CtripCard not in", values, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardBetween(String value1, String value2) {
            addCriterion("CtripCard between", value1, value2, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andCtripcardNotBetween(String value1, String value2) {
            addCriterion("CtripCard not between", value1, value2, "ctripcard");
            return (Criteria) this;
        }

        public Criteria andPausetimeIsNull() {
            addCriterion("PauseTime is null");
            return (Criteria) this;
        }

        public Criteria andPausetimeIsNotNull() {
            addCriterion("PauseTime is not null");
            return (Criteria) this;
        }

        public Criteria andPausetimeEqualTo(Date value) {
            addCriterion("PauseTime =", value, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeNotEqualTo(Date value) {
            addCriterion("PauseTime <>", value, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeGreaterThan(Date value) {
            addCriterion("PauseTime >", value, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PauseTime >=", value, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeLessThan(Date value) {
            addCriterion("PauseTime <", value, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeLessThanOrEqualTo(Date value) {
            addCriterion("PauseTime <=", value, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeIn(List<Date> values) {
            addCriterion("PauseTime in", values, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeNotIn(List<Date> values) {
            addCriterion("PauseTime not in", values, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeBetween(Date value1, Date value2) {
            addCriterion("PauseTime between", value1, value2, "pausetime");
            return (Criteria) this;
        }

        public Criteria andPausetimeNotBetween(Date value1, Date value2) {
            addCriterion("PauseTime not between", value1, value2, "pausetime");
            return (Criteria) this;
        }

        public Criteria andTransferemailIsNull() {
            addCriterion("TransferEmail is null");
            return (Criteria) this;
        }

        public Criteria andTransferemailIsNotNull() {
            addCriterion("TransferEmail is not null");
            return (Criteria) this;
        }

        public Criteria andTransferemailEqualTo(String value) {
            addCriterion("TransferEmail =", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailNotEqualTo(String value) {
            addCriterion("TransferEmail <>", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailGreaterThan(String value) {
            addCriterion("TransferEmail >", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailGreaterThanOrEqualTo(String value) {
            addCriterion("TransferEmail >=", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailLessThan(String value) {
            addCriterion("TransferEmail <", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailLessThanOrEqualTo(String value) {
            addCriterion("TransferEmail <=", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailLike(String value) {
            addCriterion("TransferEmail like", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailNotLike(String value) {
            addCriterion("TransferEmail not like", value, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailIn(List<String> values) {
            addCriterion("TransferEmail in", values, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailNotIn(List<String> values) {
            addCriterion("TransferEmail not in", values, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailBetween(String value1, String value2) {
            addCriterion("TransferEmail between", value1, value2, "transferemail");
            return (Criteria) this;
        }

        public Criteria andTransferemailNotBetween(String value1, String value2) {
            addCriterion("TransferEmail not between", value1, value2, "transferemail");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNull() {
            addCriterion("DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNotNull() {
            addCriterion("DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeEqualTo(Date value) {
            addCriterion("DeleteTime =", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotEqualTo(Date value) {
            addCriterion("DeleteTime <>", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThan(Date value) {
            addCriterion("DeleteTime >", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DeleteTime >=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThan(Date value) {
            addCriterion("DeleteTime <", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("DeleteTime <=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIn(List<Date> values) {
            addCriterion("DeleteTime in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotIn(List<Date> values) {
            addCriterion("DeleteTime not in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeBetween(Date value1, Date value2) {
            addCriterion("DeleteTime between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("DeleteTime not between", value1, value2, "deletetime");
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