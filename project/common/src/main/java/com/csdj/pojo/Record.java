package com.csdj.pojo;

import java.util.Date;

/**
 * 档案表
 */
public class Record {
  private Integer rid;//档案id
  private String bname;//姓名（男）
  private String fname;//姓名（女）
  private String bcertificate;//证件号（男）
  private String fcertificate;//证件号（女）
  private Date birth;//出生日期（男）
  private Date fbirth;//出生日期（女）
  private String boccupation;//职业（男）
  private String foccupation;//职业（女）
  private String bnation;//民族（男）
  private String fnation;//民族（女）
  private Integer bdocumentId;//证件类型（男）外键 对应证件类型表
  private Integer fdocumentId;//证件类型（女）外键 对应证件类型表
  private Integer bage;//年龄（男）
  private Integer fage;//年龄（女）
  private Integer beducation;//文化程度（男）外键 对应文化程度
  private Integer feducation;//文化程度（女）外键 对应文化程度
  private String baccount;//户口性质（男）
  private String faccount;//户口性质（女）
  private String bphone;//手机号码（男）
  private String fphone;//手机号码（女）
  private Date marriage;//结婚时间
  private String bregistered;//户口所在地（男）
  private String fregistered;//户口所在地（女）
  private String present;//现住址
  private char zipCode;//邮编
  private Integer telephoneNumber;//座机号码
  private Integer informedConsent;//同意类型（外键 对应同意书类型表）
  private Date creationtime;//档案创建时间
   private Integer agef;//年龄女
    private Integer ageb;//年龄男

    public Integer getAgef() {
        Date date=new Date();
        if (date.getMonth()>this.fbirth.getMonth()){
           return date.getYear()-this.fbirth.getYear()+1;
        }else if(date.getMonth()==this.fbirth.getMonth() && date.getDay()>=this.fbirth.getDay()){
            return date.getYear()-this.fbirth.getYear()+1;
        }else{
            return date.getYear()-this.fbirth.getYear();
        }
    }


    public Integer getAgeb() {
        Date date=new Date();
        if (date.getMonth()>this.birth.getMonth()){
            return date.getYear()-this.birth.getYear()+1;
        }else if(date.getMonth()==this.birth.getMonth() && date.getDay()>=this.birth.getDay()){
            return date.getYear()-this.birth.getYear()+1;
        }else{
            return date.getYear()-this.birth.getYear();
        }
    }


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getBcertificate() {
        return bcertificate;
    }

    public void setBcertificate(String bcertificate) {
        this.bcertificate = bcertificate;
    }

    public String getFcertificate() {
        return fcertificate;
    }

    public void setFcertificate(String fcertificate) {
        this.fcertificate = fcertificate;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getFbirth() {
        return fbirth;
    }

    public void setFbirth(Date fbirth) {
        this.fbirth = fbirth;
    }

    public String getBoccupation() {
        return boccupation;
    }

    public void setBoccupation(String boccupation) {
        this.boccupation = boccupation;
    }

    public String getFoccupation() {
        return foccupation;
    }

    public void setFoccupation(String foccupation) {
        this.foccupation = foccupation;
    }

    public String getBnation() {
        return bnation;
    }

    public void setBnation(String bnation) {
        this.bnation = bnation;
    }

    public String getFnation() {
        return fnation;
    }

    public void setFnation(String fnation) {
        this.fnation = fnation;
    }

    public Integer getBdocumentId() {
        return bdocumentId;
    }

    public void setBdocumentId(Integer bdocumentId) {
        this.bdocumentId = bdocumentId;
    }

    public Integer getFdocumentId() {
        return fdocumentId;
    }

    public void setFdocumentId(Integer fdocumentId) {
        this.fdocumentId = fdocumentId;
    }

    public Integer getBage() {
        return bage;
    }

    public void setBage(Integer bage) {
        this.bage = bage;
    }

    public Integer getFage() {
        return fage;
    }

    public void setFage(Integer fage) {
        this.fage = fage;
    }

    public Integer getBeducation() {
        return beducation;
    }

    public void setBeducation(Integer beducation) {
        this.beducation = beducation;
    }

    public Integer getFeducation() {
        return feducation;
    }

    public void setFeducation(Integer feducation) {
        this.feducation = feducation;
    }

    public String getBaccount() {
        return baccount;
    }

    public void setBaccount(String baccount) {
        this.baccount = baccount;
    }

    public String getFaccount() {
        return faccount;
    }

    public void setFaccount(String faccount) {
        this.faccount = faccount;
    }

    public String getBphone() {
        return bphone;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public Date getMarriage() {
        return marriage;
    }

    public void setMarriage(Date marriage) {
        this.marriage = marriage;
    }

    public String getBregistered() {
        return bregistered;
    }

    public void setBregistered(String bregistered) {
        this.bregistered = bregistered;
    }

    public String getFregistered() {
        return fregistered;
    }

    public void setFregistered(String fregistered) {
        this.fregistered = fregistered;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public char getZipCode() {
        return zipCode;
    }

    public void setZipCode(char zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Integer telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Integer getInformedConsent() {
        return informedConsent;
    }

    public void setInformedConsent(Integer informedConsent) {
        this.informedConsent = informedConsent;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }
}
