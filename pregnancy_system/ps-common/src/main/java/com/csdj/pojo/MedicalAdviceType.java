package com.csdj.pojo;

/**
 * 医学建议类型表
 */
public class MedicalAdviceType {
    private Integer mid;//医学建议类型id
    private String mname;//建议名称

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
