

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

@Table(name="region_type")
@Entity
public class RegionType {
    
  public RegionType(){
        
        
    }
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;
   
   @Column( name = "region_type_id" )
   private Long regionTypeId;
   
   private String name;
   
   
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
   
   
   public Byte getId(){
       
       return this.id;
       
   }
   
   public Long getRegionTypeId(){
       
       return this.regionTypeId;
       
   }
   
   public String getName(){
       
       return this.name;
       
   }
   
   
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
   
   
   public void setId( byte number ){
   
      this.id = number;
   
   }
   
   public void setName( String name){
       
      this.name =  name;
       
   }
   
    
}
