package com.csdj.pojo;

/**
 * 疾病类型表
 */
public class DiseaseType {
    private Integer id;  //id
    private String name;  //疾病名称
    private Integer type;  //0其它 1男 2女

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
