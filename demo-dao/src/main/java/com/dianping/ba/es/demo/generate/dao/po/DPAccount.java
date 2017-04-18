package com.dianping.ba.es.demo.generate.dao.po;

import java.util.Date;

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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DPAccount other = (DPAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIDNumber() == null ? other.getIDNumber() == null : this.getIDNumber().equals(other.getIDNumber()))
            && (this.getEmployeeNumber() == null ? other.getEmployeeNumber() == null : this.getEmployeeNumber().equals(other.getEmployeeNumber()))
            && (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getSysStatus() == null ? other.getSysStatus() == null : this.getSysStatus().equals(other.getSysStatus()))
            && (this.getGmail() == null ? other.getGmail() == null : this.getGmail().equals(other.getGmail()))
            && (this.getGmailStatus() == null ? other.getGmailStatus() == null : this.getGmailStatus().equals(other.getGmailStatus()))
            && (this.getAD() == null ? other.getAD() == null : this.getAD().equals(other.getAD()))
            && (this.getADStatus() == null ? other.getADStatus() == null : this.getADStatus().equals(other.getADStatus()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getGmail2() == null ? other.getGmail2() == null : this.getGmail2().equals(other.getGmail2()))
            && (this.getGmail2Status() == null ? other.getGmail2Status() == null : this.getGmail2Status().equals(other.getGmail2Status()))
            && (this.getIsFrozen() == null ? other.getIsFrozen() == null : this.getIsFrozen().equals(other.getIsFrozen()))
            && (this.getPasswordUpdateTime() == null ? other.getPasswordUpdateTime() == null : this.getPasswordUpdateTime().equals(other.getPasswordUpdateTime()))
            && (this.getOffice1() == null ? other.getOffice1() == null : this.getOffice1().equals(other.getOffice1()))
            && (this.getOffice1Status() == null ? other.getOffice1Status() == null : this.getOffice1Status().equals(other.getOffice1Status()))
            && (this.getOffice1LicenseType() == null ? other.getOffice1LicenseType() == null : this.getOffice1LicenseType().equals(other.getOffice1LicenseType()))
            && (this.getOffice2() == null ? other.getOffice2() == null : this.getOffice2().equals(other.getOffice2()))
            && (this.getOffice2Status() == null ? other.getOffice2Status() == null : this.getOffice2Status().equals(other.getOffice2Status()))
            && (this.getOffice2LicenseType() == null ? other.getOffice2LicenseType() == null : this.getOffice2LicenseType().equals(other.getOffice2LicenseType()))
            && (this.getOffice2Type() == null ? other.getOffice2Type() == null : this.getOffice2Type().equals(other.getOffice2Type()))
            && (this.getCtripCard() == null ? other.getCtripCard() == null : this.getCtripCard().equals(other.getCtripCard()))
            && (this.getPauseTime() == null ? other.getPauseTime() == null : this.getPauseTime().equals(other.getPauseTime()))
            && (this.getTransferEmail() == null ? other.getTransferEmail() == null : this.getTransferEmail().equals(other.getTransferEmail()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()))
            && (this.getEncrypt() == null ? other.getEncrypt() == null : this.getEncrypt().equals(other.getEncrypt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIDNumber() == null) ? 0 : getIDNumber().hashCode());
        result = prime * result + ((getEmployeeNumber() == null) ? 0 : getEmployeeNumber().hashCode());
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getSysStatus() == null) ? 0 : getSysStatus().hashCode());
        result = prime * result + ((getGmail() == null) ? 0 : getGmail().hashCode());
        result = prime * result + ((getGmailStatus() == null) ? 0 : getGmailStatus().hashCode());
        result = prime * result + ((getAD() == null) ? 0 : getAD().hashCode());
        result = prime * result + ((getADStatus() == null) ? 0 : getADStatus().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getGmail2() == null) ? 0 : getGmail2().hashCode());
        result = prime * result + ((getGmail2Status() == null) ? 0 : getGmail2Status().hashCode());
        result = prime * result + ((getIsFrozen() == null) ? 0 : getIsFrozen().hashCode());
        result = prime * result + ((getPasswordUpdateTime() == null) ? 0 : getPasswordUpdateTime().hashCode());
        result = prime * result + ((getOffice1() == null) ? 0 : getOffice1().hashCode());
        result = prime * result + ((getOffice1Status() == null) ? 0 : getOffice1Status().hashCode());
        result = prime * result + ((getOffice1LicenseType() == null) ? 0 : getOffice1LicenseType().hashCode());
        result = prime * result + ((getOffice2() == null) ? 0 : getOffice2().hashCode());
        result = prime * result + ((getOffice2Status() == null) ? 0 : getOffice2Status().hashCode());
        result = prime * result + ((getOffice2LicenseType() == null) ? 0 : getOffice2LicenseType().hashCode());
        result = prime * result + ((getOffice2Type() == null) ? 0 : getOffice2Type().hashCode());
        result = prime * result + ((getCtripCard() == null) ? 0 : getCtripCard().hashCode());
        result = prime * result + ((getPauseTime() == null) ? 0 : getPauseTime().hashCode());
        result = prime * result + ((getTransferEmail() == null) ? 0 : getTransferEmail().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        result = prime * result + ((getEncrypt() == null) ? 0 : getEncrypt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountType=").append(accountType);
        sb.append(", name=").append(name);
        sb.append(", IDNumber=").append(IDNumber);
        sb.append(", employeeNumber=").append(employeeNumber);
        sb.append(", loginId=").append(loginId);
        sb.append(", sysStatus=").append(sysStatus);
        sb.append(", gmail=").append(gmail);
        sb.append(", gmailStatus=").append(gmailStatus);
        sb.append(", AD=").append(AD);
        sb.append(", ADStatus=").append(ADStatus);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", gmail2=").append(gmail2);
        sb.append(", gmail2Status=").append(gmail2Status);
        sb.append(", isFrozen=").append(isFrozen);
        sb.append(", passwordUpdateTime=").append(passwordUpdateTime);
        sb.append(", office1=").append(office1);
        sb.append(", office1Status=").append(office1Status);
        sb.append(", office1LicenseType=").append(office1LicenseType);
        sb.append(", office2=").append(office2);
        sb.append(", office2Status=").append(office2Status);
        sb.append(", office2LicenseType=").append(office2LicenseType);
        sb.append(", office2Type=").append(office2Type);
        sb.append(", ctripCard=").append(ctripCard);
        sb.append(", pauseTime=").append(pauseTime);
        sb.append(", transferEmail=").append(transferEmail);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", encrypt=").append(encrypt);
        sb.append("]");
        return sb.toString();
    }
}