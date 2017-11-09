package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


/**
 * Created by dllo on 17/11/9.
 */@Controller
public class HomeController {

    /**
     * 访问localhost:8080/时进入的页面
     * @return
     */
    @RequestMapping("/")
    public String home(){

        return "fileUpload";
    }


    @RequestMapping(value = "/login")
    public String login(String[] ids, String departId, String postId, Model model){

        for (String id : ids) {
            System.out.println(id);
        }

        System.out.println(departId);
        System.out.println(postId);

        model.addAttribute("departId", departId);
        model.addAttribute("postId", postId);

        //转发,重定向
//        return "forward:/hr/findAll";
        return "redirect:main";
    }

    @RequestMapping(value = "/main")
    public String main(){

        return "error";
    }

    /**
     * 文件上传
     * @return
     */
    @RequestMapping(value = "/fileUpload")
    public String fileUpload(MultipartFile picture, HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println(picture);

        String path = request.getSession().getServletContext().getRealPath("picture");
        System.out.println(path);

        File dirFile = new File(path);
        if (!dirFile.exists() || dirFile.isFile()){
            dirFile.mkdirs();//构建这个目录
        }

        // 构建要存储的文件对象
        File file = new File(dirFile, UUID.randomUUID() + picture.getOriginalFilename());

        // 将临时文件保存到指定目录
        picture.transferTo(file);

        System.out.println("文件存储路径: " + file.getAbsolutePath());



        return "success";
    }
}
