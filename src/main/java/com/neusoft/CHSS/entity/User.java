package com.neusoft.CHSS.entity;

import java.io.Serializable;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户实体类
 * @time 2019/11/23 10:49
 */

public class User extends BaseEntity implements Serializable{

    private static final long serialVersionUID = 4720599661869328998L;

    // 用户ID
    private Integer userId;

    // 用户名
    private String userName;

    // 用户密码
    private String userPassword;

    // 用户年龄
    private Integer userAge;

    // 用户性别
    private Integer userGender;

    // 用户电话
    private String userPhone;

    // 用户地址
    private String userAddress;

    // 角色ID
    private Integer roleId;

    // 是否删除
    private Integer isDelete;

    // 原密备份
    private String pwdBak;

    // 密码盐值
    private String userSalt;

    // 用户账号
    private String userAccount;

    // 用户信息
    private String userInfo;

    // 是否管理
    private Integer isManager;

    // 用户编码
    private String userCode;

    // 用户身份证
    private String idNum;

    // 座机号
    private String landLine;

    // 用户名拼音简码
    private String pinyin;

    // 人员类型
    private String perType;

    // 所属科室
    private String subDept;

    // 医生职称
    private String docTitle;

    // 公卫权限
    private String pubHealth;

    // 医生执业编码
    private String docCode;

    // 数据总数totality
    private Integer totals;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getPwdBak() {
        return pwdBak;
    }

    public void setPwdBak(String pwdBak) {
        this.pwdBak = pwdBak;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public Integer getIsManager() {
        return isManager;
    }

    public void setIsManager(Integer isManager) {
        this.isManager = isManager;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getPerType() {
        return perType;
    }

    public void setPerType(String perType) {
        this.perType = perType;
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(String subDept) {
        this.subDept = subDept;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

    public String getPubHealth() {
        return pubHealth;
    }

    public void setPubHealth(String pubHealth) {
        this.pubHealth = pubHealth;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                ", userGender=" + userGender +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", roleId=" + roleId +
                ", isDelete=" + isDelete +
                ", pwdBak='" + pwdBak + '\'' +
                ", userSalt='" + userSalt + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", isManager=" + isManager +
                ", userCode='" + userCode + '\'' +
                ", idNum=" + idNum +
                ", landLine='" + landLine + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", perType='" + perType + '\'' +
                ", subDept='" + subDept + '\'' +
                ", docTitle='" + docTitle + '\'' +
                ", pubHealth='" + pubHealth + '\'' +
                ", docCode='" + docCode + '\'' +
                ", totals=" + totals +
                '}';
    }
}



































