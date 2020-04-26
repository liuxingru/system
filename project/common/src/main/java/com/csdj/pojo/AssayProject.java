package com.csdj.pojo;

/**
 * 化验项目表
 */
public class AssayProject {
    private Integer id; //id
    private String certificate; //证件id（外键 对应档案表）
    private String sex; //性别
    private String projectName; //项目名称
    private Integer unit; //单位
    private Integer referenceRange; //参考范围
    private Integer eid; //检查医生与检查时表id（外键 对应检查医生与检查时间表）

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getReferenceRange() {
        return referenceRange;
    }

    public void setReferenceRange(Integer referenceRange) {
        this.referenceRange = referenceRange;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}
