package com.yuanyi.artemis.mapper.dao;

import com.yuanyi.artemis.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentTest01 {

    List<User> selectAll();

    User findUserById(Integer id);
}
