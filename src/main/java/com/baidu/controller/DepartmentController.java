package com.baidu.controller;

import com.baidu.domain.Department;
import com.baidu.domain.Post;
import com.baidu.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 在类上面定义的@RequestMapping注解, 代表该类中的方法前都需要加的路径,
 * 相当于Struts2中的package
 */
@Controller
@RequestMapping("/hr")
public class DepartmentController {


    @Qualifier("departmentService")
    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询部门集合
     * 返回json数据
     * 访问地址: /hr/findAll
     */
    @ResponseBody
    @RequestMapping(value = "/findAll")
    public List<Department> findAll() {

        // 调用业务层获取部门集合
        return departmentService.findAll();
    }

    /**
     * 根据部门id查询部门集合
     * 返回json数据
     * 访问地址: /hr/findPostByDepId
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findPostByDepId")
    public List<Post> findPostByDepId(String depId) {
        System.out.println("要查找的部门id: " + depId);
        Department department = departmentService.findPostByDepId(depId);

        if (department != null) {
            return department.getPostList();
        }
        return null;
    }

}
