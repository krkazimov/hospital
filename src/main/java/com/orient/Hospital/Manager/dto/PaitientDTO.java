package com.orient.Hospital.Manager.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PaitientDTO {
    private String fullName;
    private LocalDateTime birthday;
    private String  phone;
    private String info;
    public String getFullName() {
        return fullName;
    }
    public LocalDateTime getBirthday() {
        return birthday;
    }
    public String getPhone() {
        return phone;
    }
    public String getInfo() {
        return info;
    }
    public PaitientDTO(String fullName, LocalDateTime birthday, String phone, String info) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.info = info;
    }
}
