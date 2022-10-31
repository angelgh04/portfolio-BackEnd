package com.portfolioar.portfolioBackEndv1.Controller;

import com.portfolioar.portfolioBackEndv1.Dto.dtoEducacion;
import com.portfolioar.portfolioBackEndv1.Entity.Educacion;
import com.portfolioar.portfolioBackEndv1.Security.Controller.Mensaje;
import com.portfolioar.portfolioBackEndv1.Service.SEducacion;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    //Desarrollamos los métodos
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity (list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id")int id){
        //Verificamos ID
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("La ID ingresada no existe"), HttpStatus.BAD_REQUEST);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!sEducacion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeducacion){
        if(StringUtils.isBlank(dtoeducacion.getTituloE()))
            return  new ResponseEntity(new Mensaje("El Título es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByTituloE(dtoeducacion.getTituloE()))
            return new ResponseEntity(new Mensaje("El título ya existe"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = new Educacion(dtoeducacion.getTituloE(), dtoeducacion.getInstitutoE(), dtoeducacion.getLugarE(), dtoeducacion.getFechaE());
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Educación creada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoeducacion){
        if(!sEducacion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sEducacion.existsByTituloE(dtoeducacion.getTituloE()) && sEducacion.getByTituloE(dtoeducacion.getTituloE()).get().getId() !=id){
            return new ResponseEntity(new Mensaje("El Título ingresado ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoeducacion.getTituloE())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setTituloE(dtoeducacion.getTituloE());
        educacion.setInstitutoE(dtoeducacion.getInstitutoE());
        educacion.setLugarE(dtoeducacion.getLugarE());
        educacion.setFechaE(dtoeducacion.getFechaE());
        
        sEducacion.save(educacion);
        return new ResponseEntity (new Mensaje ("Los datos de Educación se actulizaron"), HttpStatus.OK);
        
    }
}
