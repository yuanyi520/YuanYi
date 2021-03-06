package com.yuanyi.artemis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 页面跳转控制器
 */
@Controller
public class JumpPageController {

    /**
     * 主页跳转
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 新增博客
     * @return
     */
    @RequestMapping("/addBlog")
    public String addBlog(){
        return "addBlog";
    }

    /**
     * 博客详情
     * @return
     */
    @RequestMapping("/detailBlog")
    public String detailBlog(@RequestParam String blogid, HttpServletRequest request){
        request.setAttribute("blogid",blogid);
        return "detailBlog";
    }
}
