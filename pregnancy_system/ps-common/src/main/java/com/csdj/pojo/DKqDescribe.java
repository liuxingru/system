package com.csdj.pojo;

/**
 * 口腔检查描述表
 */
public class DKqDescribe {
    private Integer id; //id
    private Integer dNumber;
    private Integer dNormal;
    private String describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getdNumber() {
        return dNumber;
    }

    public void setdNumber(Integer dNumber) {
        this.dNumber = dNumber;
    }

    public Integer getdNormal() {
        return dNormal;
    }

    public void setdNormal(Integer dNormal) {
        this.dNormal = dNormal;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    private Integer eid;
}
