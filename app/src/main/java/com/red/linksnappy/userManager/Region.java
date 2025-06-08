
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
@Table(name="region")
public class Region {
    
    public Region(){
        
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)      
    private Long id;
    
    @Column( name = "region_id")
    private Long regionId;
    
    private String name;
      
    @Column( name = "type_id")
    private Byte typeId;
    
    @Column( name = "country_id")
    private Long countryId;
   
    
//------------------------------------------------------------------------- Getters ---------------------------------------------------------------------------------------------//       
    
 
    public Long getId(){
        
        return this.id;
        
    }
    
    public Long getRegionId(){
        
        return this.regionId;
        
    }
    
    public String getName(){
        
        return this.name;
        
    }
    
    public Byte getTypeId(){
        
        return this.typeId;
        
    }
    
    public Long getCountryId(){
        
        return this.countryId;
        
    }
    
    
//------------------------------------------------------------------------- Setters ---------------------------------------------------------------------------------------------//   
    
    
     public void setName(String name){
        
        this.name = name;
        
    }
    
    public void setTypeId(byte typeId){
        
        this.typeId = typeId;
        
    }
    
    public void setCountryId( Long countryId){
        
         this.countryId = countryId;
        
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
