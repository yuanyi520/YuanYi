package com.yuanyi.artemis.service;

import com.yuanyi.artemis.bean.Blog;

public interface BlogService {

    Blog findBlogById(Integer id) throws Exception;
}
