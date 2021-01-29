package com.yuanyi.artemis.mapper;

import com.yuanyi.artemis.bean.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogMapper {

    /**
     * 通过id查找博客
     * @param id
     * @return
     * @throws Exception
     */
    Blog findBlogById(Integer id) throws Exception;

    /**
     * 通过用户id查找所有博客
     * @param id
     * @return
     * @throws Exception
     */
    List<Blog> findBlogListByUserId(Integer id) throws Exception;
}
