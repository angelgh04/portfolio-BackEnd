package com.portfolioar.portfolioBackEndv1.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoHys {
    @NotBlank
    private String nombre;
    
    @NotBlank
    private int porcentaje;
    
    @NotBlank
    private String colorOuter;
    
    @NotBlank
    private String colorInner;
    
    @NotBlank
    private String imagSrc;

    public dtoHys() {
    }

    public dtoHys(String nombre, int porcentaje, String colorOuter, String colorInner, String imagSrc) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.colorOuter = colorOuter;
        this.colorInner = colorInner;
        this.imagSrc = imagSrc;
    }
    
}
