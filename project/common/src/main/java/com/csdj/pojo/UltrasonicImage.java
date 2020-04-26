package com.csdj.pojo;

/**
 * 超声影像表
 */
public class UltrasonicImage {
    private Integer id;//超声影像id
    private String image;//b超图片
    private Integer result;//检查结果
    private String resultDescribe;//结果描述
    private Integer eId;//检查医生与时间（外键 对应检查医生与检查时间表）
    private String certificate;//证件号码

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getResultDescribe() {
        return resultDescribe;
    }

    public void setResultDescribe(String resultDescribe) {
        this.resultDescribe = resultDescribe;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }
}
