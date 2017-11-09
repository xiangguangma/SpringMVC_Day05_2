package com.baidu.mapper;

import com.baidu.domain.Post;

/**
 * Created by dllo on 17/11/9.
 */
public interface PostMapper {

    /**
     *  根据职务id 查询职务 对象
     */
    Post findById(String postId);
}
