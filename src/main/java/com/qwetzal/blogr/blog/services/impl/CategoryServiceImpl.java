package com.qwetzal.blogr.blog.services.impl;

import com.qwetzal.blogr.blog.entitiy.Category;
import com.qwetzal.blogr.blog.repositories.CategoryRepository;
import com.qwetzal.blogr.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
