package com.baidu.service.impl;

import com.baidu.domain.Department;
import com.baidu.mapper.DepartmentMapper;
import com.baidu.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }

    @Override
    public Department findById(String depId) {
        return departmentMapper.findById(depId);
    }

    @Override
    public Department findPostByDepId(String depId) {
        return departmentMapper.findPostByDepId(depId);
    }
}
