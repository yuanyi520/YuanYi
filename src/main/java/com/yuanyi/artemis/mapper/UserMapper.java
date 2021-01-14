package com.yuanyi.artemis.mapper;

import com.yuanyi.artemis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查找所有的用户
     * @return
     * @throws Exception
     */
    @Select("select * from user")
    List<User> userList() throws Exception;

    /**
     * 通过用户查找指定的用户
     * @param username
     * @return
     * @throws Exception
     */
    @Select("select * from user where username = #{username}")
    User findUserByUsername(@Param("username") String username) throws Exception;
}
