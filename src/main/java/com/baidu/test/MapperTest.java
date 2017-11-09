package com.baidu.test;

import com.baidu.domain.Department;
import com.baidu.domain.Post;
import com.baidu.mapper.DepartmentMapper;
import com.baidu.service.DepartmentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class MapperTest {

    private ApplicationContext context;
    private DepartmentMapper departmentMapper;
    private DepartmentService departmentService;

    @Before
    public void init() {
        //启动spring容器
        context = new ClassPathXmlApplicationContext("spring-config.xml");

        departmentMapper = (DepartmentMapper) context.getBean("departmentMapper");

        departmentService = (DepartmentService) context.getBean("departmentService");
    }

    @Test
    public void testDepatt() {
        System.out.println(departmentMapper);

        Department depart = departmentMapper.findPostByDepId("2c9090cb5f585a97015f585b1cdd0001");

        System.out.println(depart);

        for (Post post : depart.getPostList()) {
            System.out.println(post);
        }
    }

    @Test
    public void testDepartService() {
        List<Department> departments = departmentService.findAll();

        for (Department department : departments) {
            System.out.println(department);

            Department depart = departmentService.findPostByDepId(department.getDepId());
            if (depart != null) {
                System.out.println(department.getDepId() + " 部门对应的职务集合: " + depart.getPostList());
            }
        }

    }
}
