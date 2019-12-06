package com.neusoft.CHSS.entity;

import java.io.Serializable;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 实体类的基类
 * @time 2019/11/24 18:27
 */

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -324848826804982104L;

    private String createUser;
    private String createTime;
    private String modifiedUser;
    private String modifiedTime;

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createUser='" + createUser + '\'' +
                ", createTime='" + createTime + '\'' +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                '}';
    }
}
