package com.baidu.domain;

/**
 * Created by dllo on 17/11/9.
 */
public class Post {
    private String postId;
    private String postName;
    private String depId;

    public Post() {
    }

    public Post(String postName, String depId) {
        this.postName = postName;
        this.depId = depId;
    }

    public Post(String postId, String postName, String depId) {
        this.postId = postId;
        this.postName = postName;
        this.depId = depId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", postName='" + postName + '\'' +
                ", depId='" + depId + '\'' +
                '}';
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }
}
