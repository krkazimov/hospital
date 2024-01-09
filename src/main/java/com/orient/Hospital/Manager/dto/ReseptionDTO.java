package com.orient.Hospital.Manager.dto;

import com.orient.Hospital.Manager.utils.ReseptionType;

import java.time.LocalDateTime;

public class ReseptionDTO {
    private Long doctorId;
    private ReseptionType reseptionType;
    private LocalDateTime reseptionDate;
    private String reseptionInfo;
    private PaitientDTO patient;

    public Long getDoctorId() {
        return doctorId;
    }

    public PaitientDTO getPaitient() {
        return patient;
    }

    public ReseptionType getReseptionType() {
        return reseptionType;
    }

    public LocalDateTime getReseptionDate() {
        return reseptionDate;
    }

    public String getReseptionInfo() {
        return reseptionInfo;
    }

    public ReseptionDTO(ReseptionType reseptionType, LocalDateTime reseptionDate, String reseptionInfo, PaitientDTO paitient, Long doctorId) {
        this.reseptionType = reseptionType;
        this.reseptionDate = reseptionDate;
        this.reseptionInfo = reseptionInfo;
        this.patient = paitient;
        this.doctorId = doctorId;
    }
}
