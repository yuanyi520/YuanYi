package com.yuanyi.artemis.service.impl;

import com.yuanyi.artemis.bean.Blog;
import com.yuanyi.artemis.mapper.BlogMapper;
import com.yuanyi.artemis.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;


    /**
     * 通过用户id查询博客
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Blog findBlogById(Integer id) throws Exception {
        return blogMapper.findBlogById(id);
    }

    /**
     * 保存博客
     * @param blog
     * @throws Exception
     */
    @Override
    public void saveBlog(Blog blog) throws Exception {
        blogMapper.saveBlog(blog);
    }

    /**
     * 分页查询用户博客
     * @param userId
     * @param page
     * @param limit
     * @return
     * @throws Exception
     */
    @Override
    public List<Blog> findBlogListByUserId(Integer userId, Integer page, Integer limit) throws Exception {
        return null;
    }
}
