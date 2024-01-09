package com.orient.Hospital.Manager.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ResponseError {

    public ResponseEntity<Object> handleInvalitArgument(MethodArgumentNotValidException e){
        Map<String, String> errorMap = new HashMap<String, String>();
        e.getBindingResult().getFieldErrors().forEach(fieldError -> {
            errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return ResponseHandler.generatedErrorResponse(errorMap, HttpStatus.BAD_REQUEST);
    }
}
