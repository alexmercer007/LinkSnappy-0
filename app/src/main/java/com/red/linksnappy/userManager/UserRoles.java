

package com.red.linksnappy.userManager;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author AlejandroRC
 */

@Entity
@Table( name = "roles" )
public class UserRoles { 
    
   
    public UserRoles(){
        
    }
    
    @Id
    private Long id;
    
    private String name;
      
    @OneToOne
    @MapsId  // <- le dice a Hibernate que este ID viene de user.getId() 
    @JoinColumn(name = "id")
    @JsonBackReference
    private User user;
    
  
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    
    
    public Long getId() {
        
        return this.id;
        
    }
    
    public void setUser(User user) {
        
    this.user = user;
}

    
   public String getRol(){ 
       
     return this.name;
       
   }
   
   public Long getUserId(){
       
       return this.user != null ? this.user.getId() : null;
           
   }
   
   public User getUser() {
    
    return user;
    
}
    
 
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
   
    
   public void setRol( String rol ){ 
       
       if( rol.equals("ROLE_ADMIN")){
       
           //rol acceso denegado
           throw new SecurityException("Acceso denegado para ROLE_ADMIN");
       
       } else if( rol.equals("ROLE_USER")){ 
           
          Long id_rol = 1L; 
           
         this.id = id_rol ;  
           
       } else {
           
        throw new IllegalArgumentException("Rol desconocido: " + rol);
       
       }    
       
   }
   

    
    
    
    
    
    
}
