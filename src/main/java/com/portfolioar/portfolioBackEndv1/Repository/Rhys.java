package com.portfolioar.portfolioBackEndv1.Repository;

import com.portfolioar.portfolioBackEndv1.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rhys  extends JpaRepository<Hys, Integer>{
    //Solo se menciona los métodos. NO SE DESARROLLAN
    Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
