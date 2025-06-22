

package com.red.LinkSnappy.Controller.GetMapping;

import com.red.linkSnappy.repository.UserRepository;
import com.red.linksnappy.dto.UserDTO;
import com.red.linksnappy.repository.MessagesRepository;
import com.red.linksnappy.userManager.Messages;
import com.red.linksnappy.userManager.User;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author AlejandroRC
 */

@Controller
public class UserControllerGet {
    
    @Autowired
    private UserRepository userRepository;
    private MessagesRepository messagesRepository;
    private User user;
    private Messages messages;
    
    
    private UserDTO userDto;
    
    
    @GetMapping("/login")
    public String login(){
        
        
        return"auth/auth";
        
    } 
    
   @GetMapping("/register")
    public String register(){
        
        
        return"auth/register";
        
    }
    
     @GetMapping("/recovery")
    public String recover(){
        
        
        return"auth/recovery";
        
    }
    
     @GetMapping("/term")
    public String term(){
        
        
        return"auth/term";
        
    }
    
     @GetMapping("/feed")
     public String feed(@AuthenticationPrincipal UserDetails userDetails, Model model){ 
        
         String username = userDetails.getUsername();  // este es el nombre de usuario

       // Luego buscas tu usuario completo desde la base de datos
       Optional<User> optionalUser = userRepository.findByUserName(username); 
       
       this.user = optionalUser.get();   
       
       Optional<Messages> optinalMessage = messagesRepository.findById(user.getId());
         
       this.messages = optinalMessage.get();
        
        model.addAttribute("username",user.getUserName());
        
        model.addAttribute("chat",messages.getContent());
        
        
        
        
       return "feed/feed";
        
    }
     
     @GetMapping("/user/search")
     @ResponseBody
     public List<User> buscarUsuarios(@RequestParam String query) {
         
         if (query == null || query.isBlank()) {
             
        return Collections.emptyList();
        
   
         }
         
       return userRepository.findByUserNameContainingIgnoreCase(query); 
       
     }

    
     @GetMapping("/profile")
    public String profile(@AuthenticationPrincipal UserDetails userDetails, Model model){
        
        String username = userDetails.getUsername();  // este es el nombre de usuario

       // Luego buscas tu usuario completo desde la base de datos
       Optional<User> optionalUser = userRepository.findByUserName(username);  
         
       this.user = optionalUser.get(); 
        
        String userName = user.getUserName(); 
        String lasName = user.getLastName();
        String email = user.getEmail();
        LocalDate birthDate = user.getBirthdate();
        String maritalStatus = user.getMaritalStatus().getName();
        String numberPhone = user.getNumberPhone();
   
        model.addAttribute("username", userName);
        model.addAttribute("lastname", lasName);
        model.addAttribute("email", email);
        model.addAttribute("birthDate",  birthDate); 
        model.addAttribute("maritalStatus",maritalStatus);
        model.addAttribute("numberPhone",numberPhone);
        
        String country = user.getCountry().getCountry();
        String state = user.getRegionId().getName();
        String county = user.getRegionId().getName();
        String province = user.getRegionId().getName();
        
        model.addAttribute("country", country);
        model.addAttribute("state", state);
        model.addAttribute("county", county);
        model.addAttribute("province", province);
    
        String primarySchool = user.getPrimaySchool();
        String highSchool = user.gethighSchool();
        String university = user.getUniversity();
        String profession = user.getUniversity();
        
        model.addAttribute("primarySchool", primarySchool);
        model.addAttribute("highSchool", highSchool);
        model.addAttribute("university", university);
        model.addAttribute("profession", profession);
        
        
       return "setting/profile";
        
    }
    
     @GetMapping("/setting")
    public String setting(){
        
        
        return"setting/setting";
        
    }
    
     @GetMapping("/admin")
    public String admin(){
        
        
        return"admin/admin";
        
    }
    
    
    
    
    
}
