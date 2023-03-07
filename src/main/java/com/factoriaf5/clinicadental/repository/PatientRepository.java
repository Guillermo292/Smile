package com.factoriaf5.clinicadental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factoriaf5.clinicadental.models.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{
    
}
