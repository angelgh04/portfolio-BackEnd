package com.portfolioar.portfolioBackEndv1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 3, max = 50, message = "El apellido debe tener más de 3 caracteres")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    private String descripcion;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String perfil;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ubicacion;
    
    private String imagen;  

    public Persona() {
    }

    public Persona(String apellido, String nombre, String descripcion, String perfil, String ubicacion, String imagen) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.perfil = perfil;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
    }
    
}