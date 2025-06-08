

package com.red.linksnappy.service;


import com.red.linkSnappy.repository.UserRepository;
import com.red.linksnappy.userManager.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    
    public boolean searchUser( String email, String passwordhash){

        Optional<User> emailOptional = userRepository.findByEmail(email);
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        
       if(emailOptional.isPresent() ){
           
         user = emailOptional.get();
           
            return encoder.matches(passwordhash, user.getPasswordHash()); //  no existe
       
 }    return false;    
    
    }
    
    
    
}
