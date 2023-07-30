package com.portfolioar.portfolioBackEndv1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Usamos Entity para decirle que es una entidad
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String nombreE;
    private String descripcionE;
    private String lugarE;
    private String fechaE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String lugarE, String fechaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.lugarE = lugarE;
        this.fechaE = fechaE;
    }
    
    //Insertamos los Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    public String getLugarE() {
        return lugarE;
    }

    public void setLugarE(String lugarE) {
        this.lugarE = lugarE;
    }
    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }
    
}
