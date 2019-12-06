package com.neusoft.CHSS.entity;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 人类
 * @time 2019/12/5 22:59
 */

public class Person {

    private Integer pid;
    private String pName;
    private String pSex;
    private String pAge;
    private String pAddr;

    public Person() {
    }

    public Person(Integer pid, String pName, String pSex, String pAge, String pAddr) {
        this.pid = pid;
        this.pName = pName;
        this.pSex = pSex;
        this.pAge = pAge;
        this.pAddr = pAddr;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }

    public String getpAge() {
        return pAge;
    }

    public void setpAge(String pAge) {
        this.pAge = pAge;
    }

    public String getpAddr() {
        return pAddr;
    }

    public void setpAddr(String pAddr) {
        this.pAddr = pAddr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", pSex='" + pSex + '\'' +
                ", pAge='" + pAge + '\'' +
                ", pAddr='" + pAddr + '\'' +
                '}';
    }
}
