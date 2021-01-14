package com.yuanyi.artemis.service.impl;

import com.yuanyi.artemis.bean.User;
import com.yuanyi.artemis.mapper.UserMapper;
import com.yuanyi.artemis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() throws Exception{
        return userMapper.userList();
    }
}
