package com.portfolioar.portfolioBackEndv1.Repository;

import com.portfolioar.portfolioBackEndv1.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
  
}
