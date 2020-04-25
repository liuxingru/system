package com.csdj.pojo;

/**
 * X射线检查结果表
 */
public class XRayExamineResult {
    private Integer id;//X射线id
    private Integer equipmentNumber;//检查设备号码
    private Integer examineResult;//检查结果（外键 对应x射线检查结果类型表）
    private String examineResultDescribe;//检查结果描述
    private Integer eId;//检查医生与时间（外键 对应检查医生与检查时间表）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(Integer equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public Integer getExamineResult() {
        return examineResult;
    }

    public void setExamineResult(Integer examineResult) {
        this.examineResult = examineResult;
    }

    public String getExamineResultDescribe() {
        return examineResultDescribe;
    }

    public void setExamineResultDescribe(String examineResultDescribe) {
        this.examineResultDescribe = examineResultDescribe;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }
}
