package com.example.mobiliteinternational.advice;

import com.example.mobiliteinternational.dto.ResponseMessage;
import com.example.mobiliteinternational.exceptions.UniversiteNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UniversiteAdvisor {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UniversiteNotFoundException.class)
    public ResponseMessage universiteNotFoundHandle(UniversiteNotFoundException ex) {
        return new ResponseMessage(ex.getMessage());
    }
}