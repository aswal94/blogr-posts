package com.qwetzal.blogr.blog.api;

import com.qwetzal.blogr.blog.dto.CategoryRequestDto;
import com.qwetzal.blogr.blog.entitiy.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/categories")
public interface CategoryApi {

    @GetMapping(value="/")
    ResponseEntity<List<Category>> getCategories();

    @PostMapping(value="/")
    Category saveCategory(@RequestBody CategoryRequestDto categoryDto);
}
