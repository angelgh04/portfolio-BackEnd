package com.portfolioar.portfolioBackEndv1.Security.Service;

import com.portfolioar.portfolioBackEndv1.Security.Entity.Rol;
import com.portfolioar.portfolioBackEndv1.Security.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolioar.portfolioBackEndv1.Security.Repository.iRolRepository;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        irolRepository.save(rol);
    }
    
}
