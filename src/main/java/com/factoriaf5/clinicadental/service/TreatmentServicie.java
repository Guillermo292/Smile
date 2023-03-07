package com.factoriaf5.clinicadental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factoriaf5.clinicadental.models.Treatment;
import com.factoriaf5.clinicadental.repository.TreatmentRepository;

@Service
public class TreatmentServicie {
    private  TreatmentRepository repository;

    public TreatmentServicie(TreatmentRepository repository) {
        this.repository = repository;
        
    }

    public List<Treatment> getAll(){
        return repository.findAll();
    }

    public Treatment getOne(Long id){
        Treatment treatment = repository.findById(id) .orElse(null);
        return treatment;
    }

    public Treatment save(Treatment treatment){
        Treatment newtreatment = repository.save(treatment);
        return newtreatment;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
