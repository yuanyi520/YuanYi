package com.yuanyi.artemis.service;

import com.yuanyi.artemis.bean.User;

import java.util.List;

public interface UserService {

    List<User> getUserList()throws Exception;
}
