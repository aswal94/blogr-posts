package com.qwetzal.blogr.blog.dto;

import lombok.Getter;

@Getter
public class PostRequestDto {
    String title;
    String body;
    String[] categories;
    String[] tags;
}
