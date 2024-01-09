package com.orient.Hospital.Manager.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public  static <T> ResponseEntity<Object> generatedResponse(String message, HttpStatus status , T response){
        Map<String ,Object> result = new HashMap<String , Object>();
        result.put("message", message);
        result.put("status", status);
        result.put("data",response);

        return new ResponseEntity<Object>(result,status);
    }

    public static ResponseEntity<Object> generatedErrorResponse(Map<String,String> message, HttpStatus status){
        Map<String ,Object> result = new HashMap<String , Object>();
        result.put("message", message);
        result.put("status", status);

        return new ResponseEntity<Object>(result,status);
    }
}
