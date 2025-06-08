

package com.red.linksnappy.userManager;

import jakarta.persistence.Column;
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
@Table( name = "maritalstatus")
public class MaritalStatus {
    
    public MaritalStatus(){
        
        
    }
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private Long id;

 @Column( name = "type_id")
  private byte typeId;
  
  private String name;  
    
    
 //------------------------------------------------------------------------------ Getters -------------------------------------------------------------------------------//   
    
    
  public Long getId(){
         
    return this.id;
    
}
  
  public byte getTypeId(){
      
      return this.typeId;
      
  }
 
 public String getName(){
     
     return this.name;
     
 }   
    
  
//------------------------------------------------------------------------------ Getters -------------------------------------------------------------------------------//
    
 
 public void setTypeId( byte typeId) {
     
   this.typeId = typeId;
     
 }
 
 public void setName( String name) {
     
     this.name = name;
     
 }
 
 
}
