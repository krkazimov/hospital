package com.orient.Hospital.Manager.entities;

import jakarta.persistence.*;

@Table
@Entity(name = "doctore")
public class Doctore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "d_id")
    private Long id;

    @JoinColumn(name = "h_id_id",referencedColumnName = "h_id")
    @ManyToOne
    private Hospital hospital;

    @JoinColumn(name = "S_id_id", referencedColumnName = "s_id")
    @ManyToOne
    private Structure structure;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "fullName")
    private String fullName;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }
}
