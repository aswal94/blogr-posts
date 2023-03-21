package com.qwetzal.blogr.blog.api;

import com.qwetzal.blogr.blog.dto.CategoryRequestDto;
import com.qwetzal.blogr.blog.entitiy.Category;
import com.qwetzal.blogr.blog.entitiy.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TagApi {
    @GetMapping(value="/")
    ResponseEntity<List<Tag>> getTags();

}
