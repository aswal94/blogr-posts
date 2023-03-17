package com.qwetzal.blogr.blog.services;

import com.qwetzal.blogr.blog.dto.PostRequestDto;
import com.qwetzal.blogr.blog.entitiy.Post;

import java.util.List;

public interface PostService {
    List<Post> getPosts();

    Post savePost(PostRequestDto postRequestDto);

    Post getPostById(Long id);

    Post getPostBySlug(String slug);

    Post updatePostBySlub(String slug);

    Post deletePostById(Long id);
    Post deletePostBySlug(String slug);
}
