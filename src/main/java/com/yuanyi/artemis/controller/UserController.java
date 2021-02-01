package com.yuanyi.artemis.controller;

import com.yuanyi.artemis.mapper.BlogMapper;
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


}
