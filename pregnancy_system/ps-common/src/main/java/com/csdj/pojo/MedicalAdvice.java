package com.csdj.pojo;

/**
 * 医学建议表
 */
public class MedicalAdvice {
    private Integer id;//医学建议表
    private Integer result2Id;//结果id(外键 对应结果表2)
    private Integer medicalAdviceType;//医学建议类型(外键 对应医学建议类型表)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResult2Id() {
        return result2Id;
    }

    public void setResult2Id(Integer result2Id) {
        this.result2Id = result2Id;
    }

    public Integer getMedicalAdviceType() {
        return medicalAdviceType;
    }

    public void setMedicalAdviceType(Integer medicalAdviceType) {
        this.medicalAdviceType = medicalAdviceType;
    }
}
