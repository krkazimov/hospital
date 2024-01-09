package com.orient.Hospital.Manager.utils;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class HospitalException extends Exception{

    private Map<String,String> messages;
    private HttpStatus status;
    public Map<String, String> getMessages() {
        return messages;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public HospitalException(String message, HttpStatus status) {
        super();
        this.messages = new HashMap<>();
        this.messages.put("text" , message);
        this.status = status;
    }
}
