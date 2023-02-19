package com.factoriaf5.clinicadental.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.factoriaf5.clinicadental.models.Perfil;
import com.factoriaf5.clinicadental.repository.PerfilRepository;
@Service
public class PerfilServiceImpl implements PerfilService{
    @Autowired
    private PerfilRepository repository;
    @Override
    @Transactional(readOnly = true)
    public List<Perfil> findAll() {
        return repository.findAll();
    }

    
}

