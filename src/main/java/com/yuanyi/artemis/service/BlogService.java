package com.yuanyi.artemis.service;

import com.yuanyi.artemis.bean.Blog;

import java.util.List;

public interface BlogService {

    Blog findBlogById(Integer id) throws Exception;

    void saveBlog(Blog blog) throws Exception;

    List<Blog> findBlogListByUserId(Integer userId, Integer page, Integer limit) throws Exception;

    int blogCount(Integer userId) throws Exception;
}
