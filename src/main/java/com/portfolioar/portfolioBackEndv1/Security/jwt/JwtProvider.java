package com.portfolioar.portfolioBackEndv1.Security.jwt;

import com.portfolioar.portfolioBackEndv1.Security.Entity.UsuarioPrincipal;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.core.support.UnsupportedFragmentException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);
    @Value("${jwt.secret}")
    private String secret;
    
    @Value("${jwt.expiration}")
    private int expiration;
    
    public String generateToken(Authentication authentication){
        UsuarioPrincipal usuarioPrincipal=(UsuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime()+expiration*1000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact ();
    }
    
    public String getnombreUsuarioFromToken (String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }
    
    public boolean validateToken (String token){
        try{
            Jwts.parser().setSigningKey(secret).parseClaimsJwt(token);
            return true;
        } catch (MalformedJwtException e) {
            logger.error("Token mal formado");
        }catch (UnsupportedFragmentException e) {
            logger.error("Token no soportado");
        }catch (ExpiredJwtException e) {
            logger.error("Token expirado");
        }catch (IllegalArgumentException e) {
            logger.error("Token vacio");
        }catch (SignatureException e) {
            logger.error("Firma no válida");
        }
        
        return false;
    }
}
