package com.qwetzal.blogr.blog.controller;

import com.qwetzal.blogr.blog.dto.CategoryRequestDto;
import com.qwetzal.blogr.blog.entitiy.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryApi {

    @GetMapping(value="/")
    ResponseEntity<List<Category>> getCategories();

    @PostMapping(value="/")
    Category saveCategory(@RequestBody CategoryRequestDto categoryDto);
}
