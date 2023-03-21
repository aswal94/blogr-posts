package com.qwetzal.blogr.blog.services.impl;

import com.qwetzal.blogr.blog.dto.CategoryRequestDto;
import com.qwetzal.blogr.blog.entitiy.Category;
import com.qwetzal.blogr.blog.repositories.CategoryRepository;
import com.qwetzal.blogr.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveCategory(CategoryRequestDto categoryRequestDto) {
        Category category = new Category();
        category.setName(categoryRequestDto.getName());
        return categoryRepository.save(category);
    }
}
