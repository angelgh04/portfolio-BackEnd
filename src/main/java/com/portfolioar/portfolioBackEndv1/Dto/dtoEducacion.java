package com.portfolioar.portfolioBackEndv1.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String tituloE;
    
    @NotBlank
    private String institutoE;
    
    @NotBlank
    private String lugarE;
    
    @NotBlank
    private String fechaE;

    public dtoEducacion() {
    }

    public dtoEducacion(String tituloE, String institutoE, String lugarE, String fechaE) {
        this.tituloE = tituloE;
        this.institutoE = institutoE;
        this.lugarE = lugarE;
        this.fechaE = fechaE;
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
