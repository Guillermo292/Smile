package com.factoriaf5.clinicadental.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoriaf5.clinicadental.models.Perfil;
import com.factoriaf5.clinicadental.service.PerfilService;

@RestController
@RequestMapping(path = "/api/")
public class PerfilController {
  
  @Autowired
  private PerfilService service;
  // public PerfilController(PerfilService service) {
  //   this.service = service;
  // } 
  // @GetMapping(path="")
  // public List<Perfil> getAll() {
  //   return service.getAll();
  // }
  // @GetMapping
  //   public ResponseEntity<?> getAll() {
  //       return ResponseEntity.ok(service.findAll());
  //   }
  @GetMapping("/profiles")
    public List<Perfil> readAll() {
        return service.findAll();
    }
    

    }













