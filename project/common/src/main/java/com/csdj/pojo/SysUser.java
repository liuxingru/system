package com.csdj.pojo;

import java.util.Date;

/**
 * 用户表
 */
public class SysUser {
   private Integer id;//用户id
   private String userName;//用户名
   private String password;//用户密码
   private Date createDate;//创建时间
   private String identity;//身份（超级管理员、普通医生、化验医生）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
