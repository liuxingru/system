package com.csdj.pojo;

/**
 *男性疾病表
 */
public class MaleDisease {
    private Integer id;//男性疾病id
    private String certificate;//证件id（外键 对应档案表）
    private Integer vaccineType;//疫苗类型（疫苗类型）

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

    public Integer getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(Integer vaccineType) {
        this.vaccineType = vaccineType;
    }
}
