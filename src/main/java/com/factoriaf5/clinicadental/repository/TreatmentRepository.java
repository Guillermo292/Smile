package com.factoriaf5.clinicadental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.factoriaf5.clinicadental.models.Treatment;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
    
}
