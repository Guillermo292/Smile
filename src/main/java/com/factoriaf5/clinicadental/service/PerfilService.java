package com.factoriaf5.clinicadental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factoriaf5.clinicadental.models.Perfil;
import com.factoriaf5.clinicadental.repository.PerfilRepository;

public interface PerfilService {

    // public List<Perfil> findAll() {
    //     return repository.findAll();
    // }
    

    // public PerfilService(PerfilRepository repository) {
    //     this.repository = repository;
    // }
    public List<Perfil> findAll();

}
