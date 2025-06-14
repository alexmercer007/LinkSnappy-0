

package com.red.LinkSnappy.Controller.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author AlejandroRC
 */

@Controller
public class UserControllerGet {
    
    
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
    public String feed(){
        
        
        return"feed/feed";
        
    }
    
     @GetMapping("/profile")
    public String profile(){
        
        
        return"setting/profile";
        
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
