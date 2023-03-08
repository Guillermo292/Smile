package com.factoriaf5.clinicadental.service;
import org.springframework.stereotype.Service;

import com.factoriaf5.clinicadental.models.Patient;
import com.factoriaf5.clinicadental.repository.PatientRepository;

import java.util.List;


@Service
public class PatientService {
    private PatientRepository repository;

public PatientService(PatientRepository repository) {
        this.repository= repository;
    }


public List<Patient> getAll(){
    return repository.findAll();
}

public Patient getOne(Long id){
    Patient patients = repository.findById(id) .orElse(null);
    return patients;    
}

public Patient save(Patient patients){
    Patient newpatients = repository.save(patients);
    return newpatients;
}

public void delete(Long id){
    repository.deleteById(id);

}
}




