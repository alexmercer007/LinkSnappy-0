

package com.red.linksnappy.dto;

import com.red.linksnappy.userManager.MaritalStatus;
import com.red.linksnappy.userManager.Publication;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;



/**
 *
 * @author AlejandroRC
 */
public class UserDTO {
    
    private Long  id; 
    
    private String userName; 
    
    private String lastName;
    
    private String email;
    
    private String passwordHass;
     
    private  LocalDate birthdate;

   private String primarySchool;
 
   private String highSchool;
 
   private String university;
 
   private String country;

   private String profilePicture;
 
   private String address;

   private String numberPhone;

   private MaritalStatus maritalStatus;   

   private String biography;  

   private List<Publication> publications;

   private String profession; 

   private LocalDateTime createdAt; 
 
   private boolean isActive; 
 
   private boolean isVerified;
 
    
   public void userSearchForIdDto( Long id ){
        
        this.id = id;
        
    }
   
    public void userSearchForUserDto( String userName){
        
        this.userName = userName;
        
    }
    
    public void userSearchForEmail( String email ){
        
        this.email = email;
             
    }
    
    private boolean isEmail(String input) {
        
    return input.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    
}

    public void setSearchByCredentials(String input, String password) {
        
    if (isEmail(input)) {
        
        this.email = input;
        
    } else {
        
        this.userName = input;
        
    }
    
    this.passwordHass = password;
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
