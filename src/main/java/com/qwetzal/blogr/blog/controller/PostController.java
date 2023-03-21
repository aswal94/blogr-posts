package com.qwetzal.blogr.blog.controller;

import com.qwetzal.blogr.blog.api.PostApi;
import com.qwetzal.blogr.blog.dto.PostRequestDto;
import com.qwetzal.blogr.blog.services.impl.PostServiceImpl;
import com.qwetzal.blogr.blog.entitiy.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController implements PostApi {

    @Autowired
    private PostServiceImpl postService;

    @GetMapping(value = "/")
    public ResponseEntity<List<Post>> getPosts() {
        List<Post> postList = postService.getPosts();
        return new ResponseEntity<List<Post>>(postList, HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> getPostBySlug(@PathVariable Long id) {
        Post post = postService.getPostById(id);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Post> savePost(@RequestBody PostRequestDto postRequestDto) {
        Post post = postService.savePost(postRequestDto);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }
}
