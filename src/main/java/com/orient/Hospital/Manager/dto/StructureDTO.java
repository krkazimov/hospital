package com.orient.Hospital.Manager.dto;

public class StructureDTO {

    private String name;
    private String logo;
    private Long hospitalId;

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public StructureDTO(String name, String logo, Long id) {
        this.name = name;
        this.logo = logo;
        this.hospitalId = id;
    }
}
