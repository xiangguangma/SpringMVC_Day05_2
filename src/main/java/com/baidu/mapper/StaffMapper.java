package com.baidu.mapper;

import com.baidu.domain.Staff;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public interface StaffMapper {

    /**
     * 查询所有
     */
    List<Staff> findAll();
}
