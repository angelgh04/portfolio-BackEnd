package com.portfolioar.portfolioBackEndv1.Service;

import com.portfolioar.portfolioBackEndv1.Entity.Educacion;
import com.portfolioar.portfolioBackEndv1.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//Para la persistencia de datos.
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    //Para armar una lista con todos los datos
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByTituloE (String tituloE){
        return rEducacion.findByTituloE(tituloE);
    }
    
    public void save (Educacion educacion){
        rEducacion.save(educacion);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByTituloE(String tituloE){
        return rEducacion.existsByTituloE(tituloE);
    }
}
