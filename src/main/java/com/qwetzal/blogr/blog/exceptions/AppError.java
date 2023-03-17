package com.qwetzal.blogr.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppError {
    private int status;
    private String message;
}
