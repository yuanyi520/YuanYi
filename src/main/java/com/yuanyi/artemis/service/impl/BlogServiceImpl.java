package com.yuanyi.artemis.service.impl;

import com.yuanyi.artemis.bean.Blog;
import com.yuanyi.artemis.mapper.BlogMapper;
import com.yuanyi.artemis.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;


    @Override
    public Blog findBlogById(Integer id) throws Exception {
        return blogMapper.findBlogById(id);
    }
}
