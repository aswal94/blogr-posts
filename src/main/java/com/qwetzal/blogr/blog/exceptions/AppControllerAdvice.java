package com.qwetzal.blogr.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppControllerAdvice {
    @ExceptionHandler(PostNotFoundException.class)
    public ResponseEntity<AppError> postNotFoundAdvice(PostNotFoundException ex){
        AppError app = new AppError();
        app.setStatus(404);
        app.setMessage(ex.getMessage());
        return new ResponseEntity<>(app, HttpStatus.NOT_FOUND);
    }
}
