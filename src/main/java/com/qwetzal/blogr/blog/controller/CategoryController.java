package com.qwetzal.blogr.blog.controller;

import com.qwetzal.blogr.blog.entitiy.Category;
import com.qwetzal.blogr.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(value="/")
    List<Category> getCategories(){

        return categoryService.getCategories();
    }

}
