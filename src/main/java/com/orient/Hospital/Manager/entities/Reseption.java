package com.orient.Hospital.Manager.entities;

import com.orient.Hospital.Manager.utils.ReseptionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table
@Entity(name = "reseption")
public class Reseption {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "r_id")
    private Long id;
    @Column(name = "r_type",columnDefinition = "default None")
    private ReseptionType reseptionType;
    @Column(name = "r_date")
    private LocalDateTime reseptionDate;
    @Column(name = "r_info")
    private  String reseptionInfo;
    @Column(name = "r_active",columnDefinition = "default true")
    private Boolean reseptionActive;
    @JoinColumn(name = "d_id_id",referencedColumnName = "d_id")
    @ManyToOne
    private Doctore doctore;
    @JoinColumn(name = "p_id_id",referencedColumnName = "p_id")
    @ManyToOne
    private Patient patient;

    public ReseptionType getReseptionType() {
        return reseptionType;
    }

    public void setReseptionType(ReseptionType reseptionType) {
        this.reseptionType = reseptionType;
    }

    public LocalDateTime getReseptionDate() {
        return reseptionDate;
    }

    public void setReseptionDate(LocalDateTime reseptionDate) {
        this.reseptionDate = reseptionDate;
    }

    public String getReseptionInfo() {
        return reseptionInfo;
    }

    public void setReseptionInfo(String reseptionInfo) {
        this.reseptionInfo = reseptionInfo;
    }

    public Boolean getReseptionActive() {
        return reseptionActive;
    }

    public void setReseptionActive(Boolean reseptionActive) {
        this.reseptionActive = reseptionActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Doctore getDoctore() {
        return doctore;
    }

    public void setDoctore(Doctore doctore) {
        this.doctore = doctore;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
