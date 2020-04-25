package com.csdj.pojo;

/**
 * 智力表
 */
public class Intelligence {
    private Integer id;//智力id
    private String certificate;//证件id（外键 对应档案表）
    private Integer intelligenceType;//智力类型（外键 对应疫苗类型）

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

    public Integer getIntelligenceType() {
        return intelligenceType;
    }

    public void setIntelligenceType(Integer intelligenceType) {
        this.intelligenceType = intelligenceType;
    }
}
