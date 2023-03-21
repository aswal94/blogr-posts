package com.qwetzal.blogr.blog;

import com.qwetzal.blogr.blog.entitiy.Post;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class PostResponse<T> {
    T data;
    String error;
    String links;

}
