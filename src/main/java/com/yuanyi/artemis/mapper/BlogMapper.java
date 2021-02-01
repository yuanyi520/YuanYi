package com.yuanyi.artemis.mapper;

import com.yuanyi.artemis.bean.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
     * 通过用户id查找所有博客并分页
     * @param userId
     * @param limit
     * @param page
     * @return
     * @throws Exception
     */
    List<Blog> findBlogListByUserId(@Param("userId") Integer userId,
                                    @Param("page")Integer page,
                                    @Param("limit")Integer limit) throws Exception;

    /**
     * 保存博客
     * @param blog
     * @throws Exception
     */
    void saveBlog(Blog blog) throws Exception;

    /**
     * 查询该用户下博客的数量
     * @param userId
     * @return
     * @throws Exception
     */
    int blogCount(Integer userId) throws Exception;
}
