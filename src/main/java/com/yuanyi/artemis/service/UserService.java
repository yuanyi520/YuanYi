package com.yuanyi.artemis.service;

import com.yuanyi.artemis.bean.User;

public interface UserService {

    User findUserById(Integer id) throws Exception;
}
