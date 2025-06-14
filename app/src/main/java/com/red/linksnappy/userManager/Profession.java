

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

@Table(name ="profession")
@Entity
public class Profession {
    
    public Profession(){
      
    }
    
  @GeneratedValue(strategy = GenerationType.IDENTITY)   
  @Id
  private Long id;   
  
  @Column( name = "type_id")
  private Byte typeId;
    
  @Column( name = "name_profession")
  private String nameProfession;
    
  
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    
    
 public Long getId(){
     
     return this.id;
     
 }    
    
 public Byte getTypeId(){ 
     
     return this.typeId;
     
 }     
    
 public String getNameProfession(){
     
     return this.nameProfession;
     
 } 
 
 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
 
 
 public void setId( Long Id) {
     
    this.id = Id;
     
 }
 
 public void setTypeId( byte typeId) {
     
    this.typeId = typeId;
     
 }
 
 public void setNameProfession( String profession ){
 
    this.nameProfession = profession;
 
 }
    
}
