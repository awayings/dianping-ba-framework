package com.dianping.ba.es.demo.generate.dao.po;

import lombok.ToString;

import java.util.Date;

@ToString
public class DPAccount {
    /**
     * 自增记录ID
     */
    private Integer id;

    /**
     * 账号类型
     */
    private Byte accountType;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号码
     */
    private String IDNumber;

    /**
     * 工号
     */
    private String employeeNumber;

    /**
     * 员工loginId
     */
    private Integer loginId;

    /**
     * sys账号状态
     */
    private Byte sysStatus;

    /**
     * 公司邮箱
     */
    private String gmail;

    /**
     * 邮箱状态
     */
    private Byte gmailStatus;

    /**
     * 域名
     */
    private String AD;

    /**
     * 域名状态
     */
    private Byte ADStatus;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 第二邮箱
     */
    private String gmail2;

    /**
     * 第二邮箱状态
     */
    private Byte gmail2Status;

    /**
     * 账号是否冻结: 0,不冻结; 1, 冻结
     */
    private Byte isFrozen;

    /**
     * 密码更新时间
     */
    private Date passwordUpdateTime;

    /**
     * 1号Office365邮箱
     */
    private String office1;

    /**
     * 1号Office365邮箱状态, 初始化 0, 激活 1, 暂停 2, 删除 3
     */
    private Byte office1Status;

    /**
     * 1号Office365邮箱的许可类型,如果许可类型为E1，那么值为 0，如果许可类型为E3，那么值为 1
     */
    private Byte office1LicenseType;

    /**
     * 2号Office365邮箱
     */
    private String office2;

    /**
     * 2号Office365邮箱状态, 初始化 0, 激活 1, 暂停 2, 删除 3
     */
    private Byte office2Status;

    /**
     * 2号Office365邮箱的许可类型,如果许可类型为E1，那么值为 0，如果许可类型为E3，那么值为 1
     */
    private Byte office2LicenseType;

    /**
     * 2号Office邮箱的账号类型，别名为 0 ，物理邮箱 为 1
     */
    private Byte office2Type;

    private String ctripCard;

    /**
     * 账号暂停时间
     */
    private Date pauseTime;

    /**
     * 离职转移邮箱,离职时可以将邮件发送到此处
     */
    private String transferEmail;

    /**
     * 删除账号时间
     */
    private Date deleteTime;

    /**
     * encrypt
     */
    private String encrypt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber == null ? null : IDNumber.trim();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public Byte getSysStatus() {
        return sysStatus;
    }

    public void setSysStatus(Byte sysStatus) {
        this.sysStatus = sysStatus;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail == null ? null : gmail.trim();
    }

    public Byte getGmailStatus() {
        return gmailStatus;
    }

    public void setGmailStatus(Byte gmailStatus) {
        this.gmailStatus = gmailStatus;
    }

    public String getAD() {
        return AD;
    }

    public void setAD(String AD) {
        this.AD = AD == null ? null : AD.trim();
    }

    public Byte getADStatus() {
        return ADStatus;
    }

    public void setADStatus(Byte ADStatus) {
        this.ADStatus = ADStatus;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getGmail2() {
        return gmail2;
    }

    public void setGmail2(String gmail2) {
        this.gmail2 = gmail2 == null ? null : gmail2.trim();
    }

    public Byte getGmail2Status() {
        return gmail2Status;
    }

    public void setGmail2Status(Byte gmail2Status) {
        this.gmail2Status = gmail2Status;
    }

    public Byte getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Byte isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Date getPasswordUpdateTime() {
        return passwordUpdateTime;
    }

    public void setPasswordUpdateTime(Date passwordUpdateTime) {
        this.passwordUpdateTime = passwordUpdateTime;
    }

    public String getOffice1() {
        return office1;
    }

    public void setOffice1(String office1) {
        this.office1 = office1 == null ? null : office1.trim();
    }

    public Byte getOffice1Status() {
        return office1Status;
    }

    public void setOffice1Status(Byte office1Status) {
        this.office1Status = office1Status;
    }

    public Byte getOffice1LicenseType() {
        return office1LicenseType;
    }

    public void setOffice1LicenseType(Byte office1LicenseType) {
        this.office1LicenseType = office1LicenseType;
    }

    public String getOffice2() {
        return office2;
    }

    public void setOffice2(String office2) {
        this.office2 = office2 == null ? null : office2.trim();
    }

    public Byte getOffice2Status() {
        return office2Status;
    }

    public void setOffice2Status(Byte office2Status) {
        this.office2Status = office2Status;
    }

    public Byte getOffice2LicenseType() {
        return office2LicenseType;
    }

    public void setOffice2LicenseType(Byte office2LicenseType) {
        this.office2LicenseType = office2LicenseType;
    }

    public Byte getOffice2Type() {
        return office2Type;
    }

    public void setOffice2Type(Byte office2Type) {
        this.office2Type = office2Type;
    }

    public String getCtripCard() {
        return ctripCard;
    }

    public void setCtripCard(String ctripCard) {
        this.ctripCard = ctripCard == null ? null : ctripCard.trim();
    }

    public Date getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(Date pauseTime) {
        this.pauseTime = pauseTime;
    }

    public String getTransferEmail() {
        return transferEmail;
    }

    public void setTransferEmail(String transferEmail) {
        this.transferEmail = transferEmail == null ? null : transferEmail.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt == null ? null : encrypt.trim();
    }
}