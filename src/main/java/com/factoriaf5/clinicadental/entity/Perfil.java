package com.factoriaf5.clinicadental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perfiles")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(length = 45,nullable = false)
    private String name;
    private String lastName;
    private String email;

    public Perfil() {
    }
    
    
}
