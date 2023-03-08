package com.factoriaf5.clinicadental.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.factoriaf5.clinicadental.models.Patient;
import com.factoriaf5.clinicadental.service.PatientService;











@RestController
@RequestMapping(path = "api/patients")
public class PatientController{
    private PatientService service;

    public PatientController(PatientService service){
        this.service = service;
    }

    @GetMapping("")
    public List<Patient> listAll(){
        return service.getAll();
    }

    @GetMapping("{/id}")
    public Patient listOne(@PathVariable Long id){
        return service.getOne(id);
    }

    @PostMapping("")
    @ResponseStatus( value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Patient newpatient){
        try{
            return ResponseEntity.ok(service.save(newpatient));
        } catch(Exception e){
            return ResponseEntity.status(500).body("error");
        }

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}