package com.baidu.domain;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class Department {
    private String depId;
    private String depName;
    private List<Post> postList;//该部门下的职务集合(一对多)

    public Department() {
    }

    public Department(String depName) {
        this.depName = depName;
    }

    public Department(String depId, String depName) {
        this.depId = depId;
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
