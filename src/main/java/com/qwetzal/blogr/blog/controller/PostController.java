package com.qwetzal.blogr.blog.controller;

import com.qwetzal.blogr.blog.dto.PostRequestDto;
import com.qwetzal.blogr.blog.services.impl.PostServiceImpl;
import com.qwetzal.blogr.blog.entitiy.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostServiceImpl postService;

    @GetMapping(value = "/")
    public List<Post> getPosts() {
        List<Post> postList = postService.getPosts();
        return postList;
    }

    @GetMapping(value = "/{id}")
    public Post getPostBySlug(@PathVariable Long id) {
        Post post = postService.getPostById(id);
        return post;
    }

    @PostMapping(value = "/")
    public Post savePost(@RequestBody PostRequestDto postRequestDto) {
        return postService.savePost(postRequestDto);
    }
}
