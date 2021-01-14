package com.yuanyi.artemis.controller;

import com.yuanyi.artemis.service.UserService;
import com.yuanyi.artemis.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 数据返回工具类
     */
    @Autowired
    private ResponseUtil responseUtil;

    /**
     * 用户
     */
    @Autowired
    private UserService userService;

    @GetMapping(value = "/userList", produces = "application/json;charset=UTF-8")
    public String userList(){
        try {
            return responseUtil.success("请求成功",userService.getUserList());
        }catch (Exception e){
            e.printStackTrace();
            return responseUtil.error(e.getMessage(),null);
        }
    }
}
