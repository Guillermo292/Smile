package com.factoriaf5.clinicadental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factoriaf5.clinicadental.models.Perfil;

public interface PatientRepository extends JpaRepository<Perfil,Long>{
    
}
