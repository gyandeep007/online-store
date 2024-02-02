package com.example.onlinestore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleCustomException(Exception ex,
                                                          WebRequest request){

        return handleExceptionInternal(ex,ex.getMessage(),null, HttpStatus.INTERNAL_SERVER_ERROR,request);
    }

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<Object> handleCustomerException(CustomerException ex,
                                                          WebRequest request){
       return handleExceptionInternal(ex,ex.getMessage(),null, HttpStatus.NOT_FOUND,request);
    }
}
