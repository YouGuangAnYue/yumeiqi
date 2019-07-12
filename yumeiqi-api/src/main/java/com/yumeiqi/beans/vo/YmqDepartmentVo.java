package com.yumeiqi.beans.vo;

/**
 * create by lvyifan
 */
public class YmqDepartmentVo {

    private Integer did;

    private String name;

    private String other;

    public YmqDepartmentVo() {

    }

    public YmqDepartmentVo(Integer did, String name, String other) {
        this.did = did;
        this.name = name;
        this.other = other;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
