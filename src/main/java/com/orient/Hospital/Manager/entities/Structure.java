package com.orient.Hospital.Manager.entities;

import jakarta.persistence.*;

@Table
@Entity(name = "sturucture")
public class Structure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "s_id")
    private Long id;
    @Column(name = "s_name")
    private String  stuructureName  ;
    @Column(name = "s_logo")
    private String stuructureLogo;
    @JoinColumn(name = "h_id", referencedColumnName = "h_id")
    @ManyToOne
    private Hospital hospital;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getStuructureName() {
        return stuructureName;
    }

    public void setStuructureName(String stuructureName) {
        this.stuructureName = stuructureName;
    }

    public String getStuructureLogo() {
        return stuructureLogo;
    }

    public void setStuructureLogo(String stuructureLogo) {
        this.stuructureLogo = stuructureLogo;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
