package com.qwetzal.blogr.blog.services;

import com.qwetzal.blogr.blog.dto.CategoryRequestDto;
import com.qwetzal.blogr.blog.entitiy.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories();

    Category saveCategory(CategoryRequestDto categoryRequestDto);
}
