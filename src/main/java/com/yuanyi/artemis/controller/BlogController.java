package com.yuanyi.artemis.controller;

import com.yuanyi.artemis.service.BlogService;
import com.yuanyi.artemis.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @name: 博客控制器
 * @author: yuanyi
 * @time：2021/01/29 15:28
 * @version：ver 1.0
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    /**
     * 数据返回工具类
     */
    @Autowired
    private ResponseUtil responseUtil;

    /**
     * 博客service
     */
    @Autowired
    private BlogService blogService;

    /**
     * 通过用户id查询该用户所有的博客
     * @param userid
     * @return
     */
    @GetMapping(value = "/findbloglistbyuserid/{userid}", produces = "application/json;charset=UTF-8")
    public String findBlogListByUserId(@PathVariable("userid") Integer userid) {
        try {
            return responseUtil.success("请求成功", blogService.findBlogById(userid));
        }catch (Exception e){
            e.printStackTrace();
            return responseUtil.error(e.getMessage(), e);
        }
    }

    /**
     * 保存所写的博客
     * @param json
     * @return
     */
    @PostMapping(value = "/saveblog", produces = "application/json;charset=UTF-8")
    public String saveBlog(@RequestBody String json) {
        try {
            return responseUtil.success("保存成功", null);
        }catch (Exception e){
            e.printStackTrace();
            return responseUtil.error(e.getMessage(), e);
        }
    }
}
