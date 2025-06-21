

package com.red.linksnappy.service;


import com.red.linkSnappy.repository.UserRepository;
import com.red.linksnappy.userManager.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author AlejandroRC
 */

@Service 
public class UserService {
    
    private User user;
    
    @Autowired
    private UserRepository userRepository;
    
    
    public boolean searchUser( String userName, String passwordhash){

        Optional<User> userOptional = userRepository.findByUserName(userName);
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        
       if(userOptional.isPresent() ){
           
         user = userOptional.get();
           
            return encoder.matches(passwordhash, user.getPasswordHash()); //  no existe
       
 }    return false;    
    
    }
    
    public boolean searchEmail( String email, String passwordhash){

        Optional<User> emailOptional = userRepository.findByEmail(email);
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        
       if(emailOptional.isPresent() ){
           
         user = emailOptional.get();
           
            return encoder.matches(passwordhash, user.getPasswordHash()); //  no existe
       
 }    return false;    
    
    }
    
 
   public String loginUser(String userName, String password) {
       
    Optional<User> userOptional = userRepository.findByUserName(userName);

    if (userOptional.isEmpty()) {
        
        throw new UsernameNotFoundException("Usuario no encontrado");
        
    }

     user = userOptional.get();

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    if (!encoder.matches(password, user.getPasswordHash())) {
        
        throw new BadCredentialsException("Contraseña incorrecta");
        
    }

    return user.getUserName(); // o retornar un DTO con más info si quieres
}

    
    
    
}
