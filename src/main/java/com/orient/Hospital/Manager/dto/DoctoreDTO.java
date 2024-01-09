package com.orient.Hospital.Manager.dto;

public class DoctoreDTO {

    private String fullName;
    private Long hospitalId;
    private Long structureId;

    public String getFullname() {
        return fullName;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public Long getStructureId() {
        return structureId;
    }

    public DoctoreDTO(String fullname, Long hospitalId, Long structureId) {
        this.fullName = fullname;
        this.hospitalId = hospitalId;
        this.structureId = structureId;
    }
}
