package com.portfolioar.portfolioBackEndv1.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String lugarE;
    @NotBlank
    private String fechaE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String lugarE, String fechaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.lugarE = lugarE;
        this.fechaE = fechaE;
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
