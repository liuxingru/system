package com.csdj.pojo;

import java.util.Date;

/**
 * 检查医生与检查时间表
 */
public class ExamineDoctorDate {
    private Integer id;
    private String certificate;
    private Integer examineDoctorId;
    private Date examineDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public Integer getExamineDoctorId() {
        return examineDoctorId;
    }

    public void setExamineDoctorId(Integer examineDoctorId) {
        this.examineDoctorId = examineDoctorId;
    }

    public Date getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(Date examineDate) {
        this.examineDate = examineDate;
    }
}
