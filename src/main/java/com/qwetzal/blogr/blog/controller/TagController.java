package com.qwetzal.blogr.blog.controller;

import com.qwetzal.blogr.blog.api.TagApi;
import com.qwetzal.blogr.blog.entitiy.Tag;
import com.qwetzal.blogr.blog.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/tags")
public class TagController implements TagApi {

    @Autowired
    private TagService tagService;
    @GetMapping(value = "/")
    public ResponseEntity<List<Tag>> getTags(){
        return new ResponseEntity<>(tagService.getTags(), HttpStatus.OK);
    }
}
