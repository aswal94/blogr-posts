package com.qwetzal.blogr.blog.dto;

import com.qwetzal.blogr.blog.entitiy.Post;

import java.util.List;

public class PostCollectionResponse {

    public PostCollectionResponse(List<Post> posts){

    }
    List<Post> data;
    Links links;
}
