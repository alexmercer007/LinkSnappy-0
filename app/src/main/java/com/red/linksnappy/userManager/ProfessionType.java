

package com.red.linksnappy.userManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author AlejandroRC
 */

@Entity
@Table( name = "profession_type")
public class ProfessionType {
    
    public ProfessionType(){
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;
    
    private String name;
    
    
 //------------------------------------------------------------------------------ Getters -------------------------------------------------------------------------------//


 public Byte getId(){
 
    return this.id;
 
 }    
    
 public String getName(){
     
   return this.name;  
     
 }
 
 
//------------------------------------------------------------------------------ Setters -------------------------------------------------------------------------------//
    

 public void setId( byte id) {
     
   this.id = id;
     
 }
 
 public void setName( String name){
 
     this.name = name;
     
 }
 
}
