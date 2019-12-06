package com.neusoft.CHSS.entity;

import java.io.Serializable;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 行政区域
 * @time 2019/11/26 15:15
 */

public class Area extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3355006325686673353L;

    private Integer areaId;
    private String areaName;
    private String areaState;
    private String areaIcon;
    private Integer areaPid;
    private Integer areaType;
    private String areaUrl;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaState() {
        return areaState;
    }

    public void setAreaState(String areaState) {
        this.areaState = areaState;
    }

    public String getAreaIcon() {
        return areaIcon;
    }

    public void setAreaIcon(String areaIcon) {
        this.areaIcon = areaIcon;
    }

    public Integer getAreaPid() {
        return areaPid;
    }

    public void setAreaPid(Integer areaPid) {
        this.areaPid = areaPid;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public String getAreaUrl() {
        return areaUrl;
    }

    public void setAreaUrl(String areaUrl) {
        this.areaUrl = areaUrl;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", areaState='" + areaState + '\'' +
                ", areaIcon='" + areaIcon + '\'' +
                ", areaPid=" + areaPid +
                ", areaType=" + areaType +
                ", areaUrl='" + areaUrl + '\'' +
                '}';
    }
}



































