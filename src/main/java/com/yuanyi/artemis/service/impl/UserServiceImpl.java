package com.yuanyi.artemis.service.impl;

import com.yuanyi.artemis.bean.User;
import com.yuanyi.artemis.mapper.UserMapper;
import com.yuanyi.artemis.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }
}
