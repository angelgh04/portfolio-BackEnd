package com.portfolioar.portfolioBackEndv1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Hys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int porcentaje;
    private String colorOuter;
    private String colorInner;
    private String imagSrc;
    
    //Constructores

    public Hys() {
    }

    public Hys(String nombre, int porcentaje, String colorOuter, String colorInner, String imagSrc) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.colorOuter = colorOuter;
        this.colorInner = colorInner;
        this.imagSrc = imagSrc;
    }
    
    
}
