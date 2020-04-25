package com.csdj.pojo;

/**
 * 妇科疾病表
 */
public class Gynecology {
    private Integer id;//妇科疾病id
    private String certificate;//证件id（外键 对应档案表）
    private Integer diseaseType;//疾病类型（外键 对应疾病类型表）

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

    public Integer getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(Integer diseaseType) {
        this.diseaseType = diseaseType;
    }
}
