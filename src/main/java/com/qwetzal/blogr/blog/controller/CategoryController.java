package com.qwetzal.blogr.blog.controller;

import com.qwetzal.blogr.blog.api.CategoryApi;
import com.qwetzal.blogr.blog.dto.CategoryRequestDto;
import com.qwetzal.blogr.blog.entitiy.Category;
import com.qwetzal.blogr.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class CategoryController implements CategoryApi {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(value="/")
    public ResponseEntity<List<Category>> getCategories(){

        return new ResponseEntity<>(categoryService.getCategories(), HttpStatus.OK);
    }

    @Override
    @PostMapping(value="/")
    public Category saveCategory(@RequestBody CategoryRequestDto categoryDto){
        return categoryService.saveCategory(categoryDto);
    }

}
