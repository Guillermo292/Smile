package com.factoriaf5.clinicadental.service;
// import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.factoriaf5.clinicadental.models.Perfil;
import com.factoriaf5.clinicadental.repository.PerfilRepository;




import java.util.List;

    @Service
    public class PerfilService{
        private PerfilRepository repository;
    
    
    public PerfilService(PerfilRepository repository) {
        this.repository = repository;
        
    }
    
    public List<Perfil> getAll(){
        return repository.findAll();
    }

    public Perfil getOne(Long id){
        Perfil profile = repository.findById(id) .orElse(null);
        return profile;
    }
    public Perfil save(Perfil profile){
        Perfil newprofile = repository.save(profile);
        return newprofile;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
        

