package com.csdj.pojo;

/**
 * 体格检查表
 */
public class HealthCheckup {
    private Integer id;//体格检查id
    private Integer height;//身高(cm)
    private Integer weight;//体重(kg)
    private Integer heartRate;//心率
    private Integer bodyMassIndex;//体重指数
    private Integer systolicPressure;//收缩压
    private Integer diastolicPressure;//舒张压
    private Integer mentality;//精神状态(0代表正常，1代表不正常)
    private String stateAbnormality;//精神状态异常描述
    private Integer intelligence;//智力情况（外键 对应智力表）
    private String facialFeatures;//五官情况
    private String specialPosture;//特殊体态情况
    private String specialFaceCondition;//特殊面容情况
    private String skinAndHair;//皮肤毛发情况
    private String thyroidCondition;//甲状腺情况
    private Integer eid;//检查医生与检查时表id（外键 对应检查医生与检查时间表）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getBodyMassIndex() {
        return bodyMassIndex;
    }

    public void setBodyMassIndex(Integer bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }

    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Integer getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public Integer getMentality() {
        return mentality;
    }

    public void setMentality(Integer mentality) {
        this.mentality = mentality;
    }

    public String getStateAbnormality() {
        return stateAbnormality;
    }

    public void setStateAbnormality(String stateAbnormality) {
        this.stateAbnormality = stateAbnormality;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public String getFacialFeatures() {
        return facialFeatures;
    }

    public void setFacialFeatures(String facialFeatures) {
        this.facialFeatures = facialFeatures;
    }

    public String getSpecialPosture() {
        return specialPosture;
    }

    public void setSpecialPosture(String specialPosture) {
        this.specialPosture = specialPosture;
    }

    public String getSpecialFaceCondition() {
        return specialFaceCondition;
    }

    public void setSpecialFaceCondition(String specialFaceCondition) {
        this.specialFaceCondition = specialFaceCondition;
    }

    public String getSkinAndHair() {
        return skinAndHair;
    }

    public void setSkinAndHair(String skinAndHair) {
        this.skinAndHair = skinAndHair;
    }

    public String getThyroidCondition() {
        return thyroidCondition;
    }

    public void setThyroidCondition(String thyroidCondition) {
        this.thyroidCondition = thyroidCondition;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}
