package com.csdj.pojo;

import java.util.Date;

/**
 * 常规项目表
 */
public class RegularProject {
    private Integer id;//常规项目id
    private String certificate;//证件号码（外键 对应档案表中男或女的身份证号码）
    private Integer beforeDiseaseType;//以前疾病类型(外键 对应疾病类型表)
    private String beforeDiseaseName;//以前疾病名称(可以输入疾病类型表中没有的疾病)
    private Integer nowDiseaseType;//现在疾病类型(外键 对应疾病类型表)
    private String nowDiseaseName;//现在疾病名称(可以输入疾病类型表中没有的疾病)
    private Integer morbidityNumber;//发病次数
    private Date lastMorbidityDate;//最近发病时间
    private Integer whetherMedicine;//是否服药(0代表没有服药 1代表已经服药)
    private Integer whetherOperation;//是否进行过手术(0代表没有做过手术 1代表做过手术)
    private String operationName;//手术名称
    private Date operationDate;//手术时间
    private Integer whetherMarried;//是否结婚(0没结婚 1结婚)
    private Integer boyNumber;//男孩个数
    private Integer girlNumber;//女孩个数
    private Integer whetherHereditaryDisease;//子女是否有遗传性疾病(0没有 1有)
    private Integer eId;//检查医生与时间(检查医生与时间)

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

    public Integer getBeforeDiseaseType() {
        return beforeDiseaseType;
    }

    public void setBeforeDiseaseType(Integer beforeDiseaseType) {
        this.beforeDiseaseType = beforeDiseaseType;
    }

    public String getBeforeDiseaseName() {
        return beforeDiseaseName;
    }

    public void setBeforeDiseaseName(String beforeDiseaseName) {
        this.beforeDiseaseName = beforeDiseaseName;
    }

    public Integer getNowDiseaseType() {
        return nowDiseaseType;
    }

    public void setNowDiseaseType(Integer nowDiseaseType) {
        this.nowDiseaseType = nowDiseaseType;
    }

    public String getNowDiseaseName() {
        return nowDiseaseName;
    }

    public void setNowDiseaseName(String nowDiseaseName) {
        this.nowDiseaseName = nowDiseaseName;
    }

    public Integer getMorbidityNumber() {
        return morbidityNumber;
    }

    public void setMorbidityNumber(Integer morbidityNumber) {
        this.morbidityNumber = morbidityNumber;
    }

    public Date getLastMorbidityDate() {
        return lastMorbidityDate;
    }

    public void setLastMorbidityDate(Date lastMorbidityDate) {
        this.lastMorbidityDate = lastMorbidityDate;
    }

    public Integer getWhetherMedicine() {
        return whetherMedicine;
    }

    public void setWhetherMedicine(Integer whetherMedicine) {
        this.whetherMedicine = whetherMedicine;
    }

    public Integer getWhetherOperation() {
        return whetherOperation;
    }

    public void setWhetherOperation(Integer whetherOperation) {
        this.whetherOperation = whetherOperation;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public Integer getWhetherMarried() {
        return whetherMarried;
    }

    public void setWhetherMarried(Integer whetherMarried) {
        this.whetherMarried = whetherMarried;
    }

    public Integer getBoyNumber() {
        return boyNumber;
    }

    public void setBoyNumber(Integer boyNumber) {
        this.boyNumber = boyNumber;
    }

    public Integer getGirlNumber() {
        return girlNumber;
    }

    public void setGirlNumber(Integer girlNumber) {
        this.girlNumber = girlNumber;
    }

    public Integer getWhetherHereditaryDisease() {
        return whetherHereditaryDisease;
    }

    public void setWhetherHereditaryDisease(Integer whetherHereditaryDisease) {
        this.whetherHereditaryDisease = whetherHereditaryDisease;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }
}
