package com.factoriaf5.clinicadental.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="treatment")

public class Treatment {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) @Column(name="id_treatment")
    private Long id;

    @Column(length = 45,nullable = false)
    private String treatment;

    public Treatment() {

    }

    public Treatment(String treatment) {
        this.treatment = treatment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    


    
}
