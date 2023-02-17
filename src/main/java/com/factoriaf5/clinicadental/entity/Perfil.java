package com.factoriaf5.clinicadental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    private int age;
    private int phoneNumber;
    private String city;
    private String direction;
   
    @OneToOne
    private Patient patient;
    @OneToOne 
    private Perfil perfil;
    @OneToMany
    private Patient patients;
    @OneToMany
    private Treatment treatment;
   
    public Perfil() {
    
    }

    
     public Perfil(Long id, String name, String lastName, String email, int age, int phoneNumber, String city,
            String direction) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.direction = direction;
    }






    public Long getId() {
        return id;
    }




    public String getCity() {
        return city;
    }




    public void setCity(String city) {
        this.city = city;
    }




    public String getDirection() {
        return direction;
    }




    public void setDirection(String direction) {
        this.direction = direction;
    }




    public void setId(Long id) {
        this.id = id;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public String getLastName() {
        return lastName;
    }




    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public String getEmail() {
        return email;
    }




    public void setEmail(String email) {
        this.email = email;
    }




    public int getAge() {
        return age;
    }




    public void setAge(int age) {
        this.age = age;
    }




    public int getPhoneNumber() {
        return phoneNumber;
    }




    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




   
    }
    
    

