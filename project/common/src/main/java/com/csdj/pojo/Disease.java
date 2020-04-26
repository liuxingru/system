package com.csdj.pojo;

/**
 * 疾病表
 */
public class Disease {
    private Integer id; //id
    private String certificate; //证件id（外键 对应档案表）
    private Integer disease_type; //疾病类型（外键 对应疾病类型表）

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

    public Integer getDisease_type() {
        return disease_type;
    }

    public void setDisease_type(Integer disease_type) {
        this.disease_type = disease_type;
    }
}
