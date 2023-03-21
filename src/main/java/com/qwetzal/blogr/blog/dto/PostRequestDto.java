package com.qwetzal.blogr.blog.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class PostRequestDto {
    String title;
    String body;
    List<String> categories;
    List<String> tags;
}
