

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
@Table(name="country")
public class Country {
    
    public Country(){
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    private Long Id;
    
    @Column( name = "country_id")
    private Long countryId;
    
    @Column( name = "country_name")
    private String country;
    

    
 //------------------------------------------------------------------------ Getters ------------------------------------------------------------------------//   
    
    
  public Long getId(){
      
      return this.Id;
      
  }
  
  public Long getCountryId(){
     
     return this.countryId;
     
 }  
    
 public String getCountry(){
     
     return this.country;
     
 }   
    
 

//---------------------------------------------------------------------------- Setters ---------------------------------------------------------------------//


public void setCountry(String country){
    
    this.country = country;
       
}  
    
}