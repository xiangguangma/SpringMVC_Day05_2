package com.baidu.mapper;

import com.baidu.domain.Department;
import com.baidu.domain.Post;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public interface DepartmentMapper {
    /**
     * 查询所有部门
     */
    List<Department> findAll();

    /**
     *  根据id查询对应的部门
     * @param depId 要查询的部门id
     */
    Department findById(String depId);

    /**
     *  根据id查询带集合对应的部门
     * @param depId 要查询的部门id
     */
    Department findPostByDepId(String depId);
}
