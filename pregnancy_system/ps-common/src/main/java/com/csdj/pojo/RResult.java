package com.csdj.pojo;

/**
 *结果表
 */
public class RResult {
   private Integer rid;
   private String rEntryName;
   private String rEsult;
   private Integer eid;
   private String certificate;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getrEntryName() {
        return rEntryName;
    }

    public void setrEntryName(String rEntryName) {
        this.rEntryName = rEntryName;
    }

    public String getrEsult() {
        return rEsult;
    }

    public void setrEsult(String rEsult) {
        this.rEsult = rEsult;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}
