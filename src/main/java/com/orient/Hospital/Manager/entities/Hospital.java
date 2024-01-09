package com.orient.Hospital.Manager.entities;

import jakarta.persistence.*;

@Table
@Entity(name = "/hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name ="h_id")
    private  Long hospitalId;
    @Column(name = "h_logo" )
    private String hospitalLogo;
    @Column(name = "h_info" )
    private String hospitalInfo;
    @Column(name = "h_name" )
    private String hospitalName;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalLogo() {
        return hospitalLogo;
    }

    public void setHospitalLogo(String hospitalLogo) {
        this.hospitalLogo = hospitalLogo;
    }

    public String getHospitalInfo() {
        return hospitalInfo;
    }

    public void setHospitalInfo(String hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
