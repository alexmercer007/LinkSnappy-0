

package com.red.linksnappy.Controller.PostMapping;



import com.red.linkSnappy.repository.CountryRepository;
import com.red.linkSnappy.repository.UserRepository;
import com.red.linksnappy.repository.MaritalStatusRepository;
import com.red.linksnappy.repository.ProfessionRepository;
import com.red.linksnappy.repository.RegionRepository;
import com.red.linksnappy.repository.RegionTypeRepository;
import com.red.linksnappy.service.UserService;
import com.red.linksnappy.userManager.Country;
import com.red.linksnappy.userManager.MaritalStatus;
import com.red.linksnappy.userManager.Profession;
import com.red.linksnappy.userManager.Region;
import com.red.linksnappy.userManager.RegionType;
import com.red.linksnappy.userManager.User;
import com.red.linksnappy.userManager.UserRoles;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author AlejandroRC
 */

@Controller
public class userControllerPost {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private CountryRepository countryRepository;
    
    @Autowired
    private RegionRepository regionRepository; 
    
    @Autowired
    private MaritalStatusRepository maritalStatusRepository; 
    
    @Autowired
    private ProfessionRepository professionRepository; 
    
    @Autowired
    private UserService userService;
    
    private User user;
    
  
    

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
                                         @RequestParam String countryRaw, 
                                         @RequestParam String stateRaw, 
                                         @RequestParam String provinceRaw, 
                                         @RequestParam String countyRaw,
                                         @RequestParam String address,
                                         @RequestParam String maritalStatusRaw, 
                                         @RequestParam String professionRaw, 
                                         @RequestParam String primarySchool,
                                         @RequestParam String highSchool,
                                         @RequestParam String university,
                                         @RequestParam String cellPhoneNumber,
                                         Model model){ 
   
   System.out.println("countryRaw"+ countryRaw);
   System.out.println("stateRaw"+ stateRaw);
   System.out.println("provinceRaw"+ provinceRaw);
   System.out.println("countyRaw"+ countyRaw);
   System.out.println("maritalStatusRaw"+ maritalStatusRaw);
   System.out.println("professionRaw"+ professionRaw);

        

  if (countryRaw == null || countryRaw.trim().isEmpty()) {
      
    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No se seleccionó un país");
    
}
   
   Long country = Long.parseLong(countryRaw);
    
  if( country.equals(0L)){ //campo obligatorio
      
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not selected");
   
  }      
      
       
   Long state = Long.parseLong(stateRaw);
   Long province = Long.parseLong(provinceRaw);
   Long county = Long.parseLong(countyRaw);
       
       
        UserRoles role = new UserRoles();
        
        role.setRol("ROLE_USER");
   
        user = new User();
        
        user.setUserName(name);
        user.setLastName(lastName);
           
      Optional<User> optionalUserEmail = userRepository.findByEmail(email);
      
      if (optionalUserEmail.isPresent()) {
    
          throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El correo ya está en uso.");

      }
      
   
        user.setEmail(email);
        user.setPasswordHash(password);
        user.setBirthdate(birthDate);
        user.setAddress(address);
        
        if (country != null && !country.equals(0L)) { // campo opcional
    
            Optional<Country>  optionalCountry = countryRepository.findById(country);
            
            Country countryKey = optionalCountry.orElseThrow(
            () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "State not selected"));
  
             user.setCountry(countryKey);
  
           } else {
      
    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country is required");
}  
        
        if (!state.equals(0L)) { // campo opcional
    
            Optional<Region>  optionalRegionState = regionRepository.findById(state);
            
            Region stateKey = optionalRegionState.orElseThrow(
            () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "State not selected"));
  
             user.setRegionId(stateKey);
  
           }
        
        if (!province.equals(0L)) { // campo opcional
    
            Optional<Region> optionalRegionProvince = regionRepository.findById(province);
            
             Region provinceKey = optionalRegionProvince.orElseThrow(
             () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not selected"));
  
             user.setRegionId(provinceKey);
  
           }
        
        if (!county.equals(0L)) { // campo opcional
    
            Optional<Region> optionalRegionCounty = regionRepository.findById(county);
            
             Region countyKey = optionalRegionCounty.orElseThrow(
             () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not selected"));
  
             user.setRegionId(countyKey);
  
           }
        
        
        
        
        
        if(maritalStatusRaw != null && !maritalStatusRaw.trim().isEmpty() && !maritalStatusRaw.equals("0")) {
            
            Long maritalStatus = Long.parseLong(maritalStatusRaw);
            
         Optional<MaritalStatus> optionalMaritalStatus = maritalStatusRepository.findById(maritalStatus);        
         
        MaritalStatus maritalStatusKey = optionalMaritalStatus.orElseThrow(
                 () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not selected"));
            
         user.setMaritalStatusId(maritalStatusKey);
         
        } else {
           
            System.out.print("es MaritalStatus vacio");
        user.setMaritalStatusId(null); // O simplemente no asignar nada si es opcional
        
    }
        
       
        
        if(professionRaw != null && !professionRaw.trim().isEmpty() && !professionRaw.equals("0")) {
            
            Long profession = Long.parseLong(professionRaw);
            
         Optional<Profession> optionalProfession = professionRepository.findById(profession);     
         
        Profession professionKey = optionalProfession.orElseThrow(
                 () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Country not selected"));
            
         user.setProfession(professionKey);
         
        } else {
            
            System.out.print("es profession vacio");
        user.setProfession(null); // O simplemente no asignar nada si es opcional
        
    }
        
        
        user.setPrimaySchool(primarySchool);
        user.setHighSchool(highSchool);
        user.setUniversity(university);
        
        
        
        user.setRole(role);
        
        LocalDateTime CreatedAt =  LocalDateTime.now();
        
        user.setCreatedAt(CreatedAt);
        
        userRepository.save(user);
        
        // Autenticación manual
        UsernamePasswordAuthenticationToken authToken =
                
        new UsernamePasswordAuthenticationToken(user.getUserName(), password);

        Authentication authentication = authenticationManager.authenticate(authToken);

        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        return "redirect:/feed";

        
    }
    
  
    
}
