

package com.red.linksnappy.userManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author AlejandroRC
 */

@Entity
@Table( name = "user_roles" )
public class UserRoles { 
    
   
    public UserRoles(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String roles;
      
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    
  
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    
    
    public Long getId() {
        
        return this.id;
        
    }
    
   public String getRol(){ 
       
     return this.roles;
       
   }
   
   public Long getUserId(){
       
       return this.user != null ? this.user.getId() : null;
           
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
