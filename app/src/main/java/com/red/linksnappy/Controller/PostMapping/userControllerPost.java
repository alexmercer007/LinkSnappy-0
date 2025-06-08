

package com.red.linksnappy.Controller.PostMapping;


import com.red.linkSnappy.repository.UserRepository;
import com.red.linksnappy.service.UserService;
import com.red.linksnappy.userManager.Country;
import com.red.linksnappy.userManager.Profession;
import com.red.linksnappy.userManager.Region;
import com.red.linksnappy.userManager.User;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author AlejandroRC
 */

@Controller
public class userControllerPost {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserService userService;
    
    private User user;
    private Country countryUser;
    
    @Autowired
    private AuthenticationManager authenticationManager;
  
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
    
        try {
        // Creamos el token con el usuario y contraseña
        UsernamePasswordAuthenticationToken authRequest =  new UsernamePasswordAuthenticationToken(email, password);

        // Autenticamos el token (Spring verifica todo)
        Authentication authentication = authenticationManager.authenticate(authRequest);

        // Colocamos al usuario autenticado en el contexto de seguridad
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return ResponseEntity.ok("Login exitoso");
  
        } catch (AuthenticationException ex) {
        
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login fallido: " + ex.getMessage());
            
    }
}
    
    
    @PostMapping("/register")
    public String register( @RequestParam String name,
                                         @RequestParam String lastName,
                                         @RequestParam String email,
                                         @RequestParam String password,
                                         @RequestParam LocalDate birthDate,
                                         @RequestParam String country, //int
                                         @RequestParam String state, //int
                                         @RequestParam String province, //int
                                         @RequestParam String region,//int
                                         @RequestParam String address,
                                         @RequestParam String maritalStatus, //int
                                         @RequestParam Profession profession, //int
                                         @RequestParam String primarySchool,
                                         @RequestParam String highSchool,
                                         @RequestParam String university,
                                         @RequestParam String cellPhoneNumber){
        
        
        
        
        user = new User();
        
        user.setUserName(name);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPasswordHash(password);
        user.setBirthdate(birthDate);
        

        userRepository.save(user);
        
        
        return "/feed";
        
    }
    
    
    
    
    
}
