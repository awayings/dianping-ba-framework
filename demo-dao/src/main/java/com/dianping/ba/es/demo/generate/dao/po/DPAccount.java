package com.dianping.ba.es.demo.generate.dao.po;

import lombok.Data;

import java.util.Date;

@Data
public class DPAccount {
    /**
     * 自增记录ID
     */
    private Integer id;

    /**
     * 账号类型
     */
    private Byte accounttype;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号码
     */
    private String idnumber;

    /**
     * 工号
     */
    private String employeenumber;

    /**
     * 员工loginId
     */
    private Integer loginid;

    /**
     * sys账号状态
     */
    private Byte sysstatus;

    /**
     * 公司邮箱
     */
    private String gmail;

    /**
     * 邮箱状态
     */
    private Byte gmailstatus;

    /**
     * 域名
     */
    private String ad;

    /**
     * 域名状态
     */
    private Byte adstatus;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 第二邮箱
     */
    private String gmail2;

    /**
     * 第二邮箱状态
     */
    private Byte gmail2status;

    /**
     * 账号是否冻结: 0,不冻结; 1, 冻结
     */
    private Byte isfrozen;

    /**
     * 密码更新时间
     */
    private Date passwordupdatetime;

    /**
     * 1号Office365邮箱
     */
    private String office1;

    /**
     * 1号Office365邮箱状态, 初始化 0, 激活 1, 暂停 2, 删除 3
     */
    private Byte office1status;

    /**
     * 1号Office365邮箱的许可类型,如果许可类型为E1，那么值为 0，如果许可类型为E3，那么值为 1
     */
    private Byte office1licensetype;

    /**
     * 2号Office365邮箱
     */
    private String office2;

    /**
     * 2号Office365邮箱状态, 初始化 0, 激活 1, 暂停 2, 删除 3
     */
    private Byte office2status;

    /**
     * 2号Office365邮箱的许可类型,如果许可类型为E1，那么值为 0，如果许可类型为E3，那么值为 1
     */
    private Byte office2licensetype;

    /**
     * 2号Office邮箱的账号类型，别名为 0 ，物理邮箱 为 1
     */
    private Byte office2type;

    private String ctripcard;

    /**
     * 账号暂停时间
     */
    private Date pausetime;

    /**
     * 离职转移邮箱,离职时可以将邮件发送到此处
     */
    private String transferemail;

    /**
     * 删除账号时间
     */
    private Date deletetime;

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

    public Byte getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(Byte accounttype) {
        this.accounttype = accounttype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber == null ? null : employeenumber.trim();
    }

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public Byte getSysstatus() {
        return sysstatus;
    }

    public void setSysstatus(Byte sysstatus) {
        this.sysstatus = sysstatus;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail == null ? null : gmail.trim();
    }

    public Byte getGmailstatus() {
        return gmailstatus;
    }

    public void setGmailstatus(Byte gmailstatus) {
        this.gmailstatus = gmailstatus;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad == null ? null : ad.trim();
    }

    public Byte getAdstatus() {
        return adstatus;
    }

    public void setAdstatus(Byte adstatus) {
        this.adstatus = adstatus;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getGmail2() {
        return gmail2;
    }

    public void setGmail2(String gmail2) {
        this.gmail2 = gmail2 == null ? null : gmail2.trim();
    }

    public Byte getGmail2status() {
        return gmail2status;
    }

    public void setGmail2status(Byte gmail2status) {
        this.gmail2status = gmail2status;
    }

    public Byte getIsfrozen() {
        return isfrozen;
    }

    public void setIsfrozen(Byte isfrozen) {
        this.isfrozen = isfrozen;
    }

    public Date getPasswordupdatetime() {
        return passwordupdatetime;
    }

    public void setPasswordupdatetime(Date passwordupdatetime) {
        this.passwordupdatetime = passwordupdatetime;
    }

    public String getOffice1() {
        return office1;
    }

    public void setOffice1(String office1) {
        this.office1 = office1 == null ? null : office1.trim();
    }

    public Byte getOffice1status() {
        return office1status;
    }

    public void setOffice1status(Byte office1status) {
        this.office1status = office1status;
    }

    public Byte getOffice1licensetype() {
        return office1licensetype;
    }

    public void setOffice1licensetype(Byte office1licensetype) {
        this.office1licensetype = office1licensetype;
    }

    public String getOffice2() {
        return office2;
    }

    public void setOffice2(String office2) {
        this.office2 = office2 == null ? null : office2.trim();
    }

    public Byte getOffice2status() {
        return office2status;
    }

    public void setOffice2status(Byte office2status) {
        this.office2status = office2status;
    }

    public Byte getOffice2licensetype() {
        return office2licensetype;
    }

    public void setOffice2licensetype(Byte office2licensetype) {
        this.office2licensetype = office2licensetype;
    }

    public Byte getOffice2type() {
        return office2type;
    }

    public void setOffice2type(Byte office2type) {
        this.office2type = office2type;
    }

    public String getCtripcard() {
        return ctripcard;
    }

    public void setCtripcard(String ctripcard) {
        this.ctripcard = ctripcard == null ? null : ctripcard.trim();
    }

    public Date getPausetime() {
        return pausetime;
    }

    public void setPausetime(Date pausetime) {
        this.pausetime = pausetime;
    }

    public String getTransferemail() {
        return transferemail;
    }

    public void setTransferemail(String transferemail) {
        this.transferemail = transferemail == null ? null : transferemail.trim();
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt == null ? null : encrypt.trim();
    }
}