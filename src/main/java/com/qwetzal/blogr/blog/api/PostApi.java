package com.qwetzal.blogr.blog.api;

import com.qwetzal.blogr.blog.dto.PostRequestDto;
import com.qwetzal.blogr.blog.entitiy.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PostApi {
    ResponseEntity<List<Post>> getPosts();

    ResponseEntity<Post> getPostBySlug(@PathVariable Long id);

    ResponseEntity<Post> savePost(@RequestBody PostRequestDto body);

}
