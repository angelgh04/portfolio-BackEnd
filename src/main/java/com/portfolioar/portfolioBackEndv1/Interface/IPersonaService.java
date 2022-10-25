package com.portfolioar.portfolioBackEndv1.Interface;

import com.portfolioar.portfolioBackEndv1.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscado por ID
    public void deletePersona(Long id);
    
    //Buscar una persolna por ID
    public Persona findPersona (Long id);
}