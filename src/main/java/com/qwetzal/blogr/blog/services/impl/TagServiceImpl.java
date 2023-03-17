package com.qwetzal.blogr.blog.services.impl;

import com.qwetzal.blogr.blog.entitiy.Tag;
import com.qwetzal.blogr.blog.repositories.TagRepository;
import com.qwetzal.blogr.blog.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAll();
    }

    // TODO: Merge Tag
    // TODO: Rename tags
    // TODO: Delete tags
}
