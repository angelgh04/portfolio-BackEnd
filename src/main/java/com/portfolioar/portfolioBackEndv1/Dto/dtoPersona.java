package com.portfolioar.portfolioBackEndv1.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String apellido;
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String perfil;
    
    @NotBlank
    private String ubicacion;
    
    @NotBlank
    private String imagen;

    public dtoPersona() {
    }

    public dtoPersona(String apellido, String nombre, String descripcion, String perfil, String ubicacion, String imagen) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.perfil = perfil;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImg(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}
