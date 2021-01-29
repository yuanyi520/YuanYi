package com.yuanyi.artemis.mapper;

import com.yuanyi.artemis.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findUserById(Integer id) throws Exception;
}
