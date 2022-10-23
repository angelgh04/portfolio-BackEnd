package com.portfolioar.portfolioBackEndv1.Security.Repository;

import com.portfolioar.portfolioBackEndv1.Security.Entity.Rol;
import com.portfolioar.portfolioBackEndv1.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
