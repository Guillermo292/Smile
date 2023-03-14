package com.factoriaf5.clinicadental.models;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "patients")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private Long id;
    @Column(name = "dni")
    private String dni;

    @ManyToMany
    @JoinTable(
    name = "patients_treatments",
    joinColumns = @JoinColumn(name = "id_patient"),
    inverseJoinColumns = @JoinColumn(name = "id_treatment"))
    Set<Treatment> treatments;


    public Patient() {

    }


    public Patient(Long id, String dni) {
        this.id = id;
        this.dni = dni;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }




    


    
    
}
