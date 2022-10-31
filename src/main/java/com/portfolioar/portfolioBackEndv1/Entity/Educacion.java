package com.portfolioar.portfolioBackEndv1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloE;
    private String institutoE;
    private String lugarE;
    private String fechaE;
    //Generamos los contructores
    public Educacion() {
    }

    public Educacion(String tituloE, String institutoE, String lugarE, String fechaE) {
        this.tituloE = tituloE;
        this.institutoE = institutoE;
        this.lugarE = lugarE;
        this.fechaE = fechaE;
    }
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public String getInstitutoE() {
        return institutoE;
    }

    public void setInstitutoE(String institutoE) {
        this.institutoE = institutoE;
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
