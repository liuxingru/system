package com.csdj.pojo;

import java.util.Date;

/**
 * 结果表2
 */
public class RResult2 {
    private Integer rid;//结果表2id
    private Integer certificate;//证件id（外键 对应档案表）
    private Integer whetherAbnormal;//是否异常（0异常 1正常）
    private String abnormalCondition;//异常情况
    private String premaritalHealthExamination;//婚前卫生检查
    private String resultsOfConsultationAndGuidance;//咨询指导结果
    private String medicalHistory;//病史
    private Integer examineSuggest;//检查建议（0不需要检查 1本院进一步检查 2外院进一步检查）
    private String examineSuggestProject;//建议检查项目
    private Integer examineAttitude;//对于进一步检查的态度（0不接受检查 1接受检查）
    private String referralHospital;//转诊医院
    private Date referralDate;//转诊时间
    private Date subsequentVisitDate;//复诊时间
    private Date premaritalExaminationCertificateDate;//出具婚检证明时间
    private Integer eid;//检查医生与检查时表id(外键 对应检查医生与检查时间表)

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getCertificate() {
        return certificate;
    }

    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    public Integer getWhetherAbnormal() {
        return whetherAbnormal;
    }

    public void setWhetherAbnormal(Integer whetherAbnormal) {
        this.whetherAbnormal = whetherAbnormal;
    }

    public String getAbnormalCondition() {
        return abnormalCondition;
    }

    public void setAbnormalCondition(String abnormalCondition) {
        this.abnormalCondition = abnormalCondition;
    }

    public String getPremaritalHealthExamination() {
        return premaritalHealthExamination;
    }

    public void setPremaritalHealthExamination(String premaritalHealthExamination) {
        this.premaritalHealthExamination = premaritalHealthExamination;
    }

    public String getResultsOfConsultationAndGuidance() {
        return resultsOfConsultationAndGuidance;
    }

    public void setResultsOfConsultationAndGuidance(String resultsOfConsultationAndGuidance) {
        this.resultsOfConsultationAndGuidance = resultsOfConsultationAndGuidance;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Integer getExamineSuggest() {
        return examineSuggest;
    }

    public void setExamineSuggest(Integer examineSuggest) {
        this.examineSuggest = examineSuggest;
    }

    public String getExamineSuggestProject() {
        return examineSuggestProject;
    }

    public void setExamineSuggestProject(String examineSuggestProject) {
        this.examineSuggestProject = examineSuggestProject;
    }

    public Integer getExamineAttitude() {
        return examineAttitude;
    }

    public void setExamineAttitude(Integer examineAttitude) {
        this.examineAttitude = examineAttitude;
    }

    public String getReferralHospital() {
        return referralHospital;
    }

    public void setReferralHospital(String referralHospital) {
        this.referralHospital = referralHospital;
    }

    public Date getReferralDate() {
        return referralDate;
    }

    public void setReferralDate(Date referralDate) {
        this.referralDate = referralDate;
    }

    public Date getSubsequentVisitDate() {
        return subsequentVisitDate;
    }

    public void setSubsequentVisitDate(Date subsequentVisitDate) {
        this.subsequentVisitDate = subsequentVisitDate;
    }

    public Date getPremaritalExaminationCertificateDate() {
        return premaritalExaminationCertificateDate;
    }

    public void setPremaritalExaminationCertificateDate(Date premaritalExaminationCertificateDate) {
        this.premaritalExaminationCertificateDate = premaritalExaminationCertificateDate;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}
