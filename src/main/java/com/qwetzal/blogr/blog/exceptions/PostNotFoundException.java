package com.qwetzal.blogr.blog.exceptions;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(Long id) {

        super("Post with id: " + id + " not found");
    }
}
