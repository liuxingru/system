package com.csdj.pojo;

import java.util.Date;

/**
 * 同意书签字表
 */
public class LetterOfConsentSignature {
    private Integer id;//同意书签字id
    private String signatureMan;//签字（男）
    private String signatureFeman;//签字（女）
    private Date signatureDate;//签字时间
    private String serviceStaffSignature;//服务人员签字

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSignatureMan() {
        return signatureMan;
    }

    public void setSignatureMan(String signatureMan) {
        this.signatureMan = signatureMan;
    }

    public String getSignatureFeman() {
        return signatureFeman;
    }

    public void setSignatureFeman(String signatureFeman) {
        this.signatureFeman = signatureFeman;
    }

    public Date getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(Date signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getServiceStaffSignature() {
        return serviceStaffSignature;
    }

    public void setServiceStaffSignature(String serviceStaffSignature) {
        this.serviceStaffSignature = serviceStaffSignature;
    }
}
