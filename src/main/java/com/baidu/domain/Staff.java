package com.baidu.domain;

import javax.xml.crypto.Data;

/**
 * Created by dllo on 17/11/9.
 */
public class Staff {

    private String staffId;
    private String loginName;
    private String loginPwd;
    private String staffName;
    private String gender;
    private Data onDutyDate;//入职时间
    private String postId;

    public Staff() {
    }

    public Staff(String loginName, String loginPwd, String staffName, String gender, Data onDutyDate, String postId) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.staffName = staffName;
        this.gender = gender;
        this.onDutyDate = onDutyDate;
        this.postId = postId;
    }

    public Staff(String staffId, String loginName, String loginPwd, String staffName, String gender, Data onDutyDate, String postId) {
        this.staffId = staffId;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.staffName = staffName;
        this.gender = gender;
        this.onDutyDate = onDutyDate;
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", staffName='" + staffName + '\'' +
                ", gender='" + gender + '\'' +
                ", onDutyDate=" + onDutyDate +
                ", postId='" + postId + '\'' +
                '}';
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Data getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Data onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}
