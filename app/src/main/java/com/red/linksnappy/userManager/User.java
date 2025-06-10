

package com.red.linksnappy.userManager;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 *
 * @author AlejandroRC
 */

@Entity
@Table(name = "users")
public class User {
    
   public User(){ 
       
       
   } 
   
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)       
 private Long  id;
   
 @Column(name="usename")  
 private String userName; 
 
 @Column(name="lastname")
 private String lastName;
   
 @Column(name="birthdate")
 private  LocalDate birthdate;
 
 @NotNull(message="not null")
 @Email(message="incorrect email")
 @Column(name="email")
 private String email;
 
 @Column(name="passwordhash")
 private String passwordHash;
 
 @Column(name="profile_picture")
 private String profilePicture;
 
 private String address;
 
 @ManyToOne
 @JoinColumn( name = "maritalstatus_id")
 private MaritalStatus maritalStatus;   
 
 @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
 private Biography biography;
 
 @ManyToOne
 @JoinColumn( name = "user_id") 
 private Publication publicationId;
 
 @ManyToOne
 @JoinColumn(name="country_id")
 private Country country; 
 
 @ManyToOne
 @JoinColumn(name="region_id")
 private Region region; 
 
 @ManyToOne
 @JoinColumn(name="region_type_id")
 private RegionType regionType; 
 
 @Column(name="created_at")
 private LocalDate createdAt;
 
 @Column(name="is_active")
  private boolean isActive; 
   
 @Column(name="is_verified") 
 private boolean isVerified;
 
 @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
  private UserRoles role; 
 
 
 //------------------------------------------------------------------------------ Getters -------------------------------------------------------------------------------//
 
 public Long getId(){
         
    return this.id;
    
}
 
 public String getUserName(){
     
     return this.userName;
     
 }
 
 public String getLastName(){
 
     return this.lastName;

 }

public LocalDate getBirthdate(){
    
    return this.birthdate;
    
}

public Biography getBiography() {
        
    return biography;
    
}

public String getEmail(){

    return this.email;
    
}

public String getPasswordHash(){

    return this.passwordHash;

}

public String getProfilePicture(){

     return this.profilePicture;

}

public String getAddress(){

     return this.address;

}

public MaritalStatus getMaritalStatus(){
    
     return this.maritalStatus;
    
}

public Publication getPublicationId(){
    
    return this.publicationId;
    
}

public Country getCountry(){
    
    return this.country;
    
}

public Region getRegionId(){
    
    return this.region;
    
}

public RegionType getRegionTypeId(){
    
    return this.regionType;
    
}


public LocalDate getCreatedAt(){
    
    return this.createdAt;
    
}

public boolean getIsActive(){
    
    return this.isActive;
    
}

public boolean getIsVerified(){
    
    return this.isVerified;
    
}

public UserRoles getRol(){
         
    return this.role;
    
}


//-------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------------//

 
 public void setUserName( String userName){
     
    this.userName = userName;
     
 }
 
 public void setLastName( String lastName){
 
    this.lastName = lastName;

 }

public void setBirthdate( LocalDate birthDate){
    
    this.birthdate = birthDate;
    
}

public void setBiography(Biography biography) {
        
    this.biography = biography;        
    biography.setUser(this);  // mantener relación bidireccional
   
}

public void setEmail( String email){

   this.email = email;
    
}

public void setPasswordHash( String passwordHash){

   this.passwordHash = passwordHash;

}

public void setProfilePicture( String profilePicture){

    this.profilePicture = profilePicture;

}

public void setAddress( String address ){

    this.address = address;

}

public void setMaritalStatusId( MaritalStatus maritalStatus ){
    
    this.maritalStatus = maritalStatus;
    
}

public void setPublicationId( Publication publicationId ){
    
   this.publicationId = publicationId; 
    
}

public void getCountry( Country country ){
    
    this.country = country;
    
}

public void setRegionId( Region regionId){
    
     this.region = regionId;
    
}

public void setRegionTypeId( RegionType regionTypeId){
    
     this.regionType = regionTypeId;
    
}

public void setCreatedAt( LocalDate createdAt ){
    
    this.createdAt = createdAt;
    
}

public void setIsActive( boolean isActive ){
    
    this.isActive = isActive;
    
}

public void setIsVerified( boolean isVerified){
    
    this.isVerified = isVerified;
    
}

public void setSol( String roles ){
     
  if (this.role == null) {
      
        this.role = new UserRoles(); // asegúrate de tener un objeto
        
    }

    this.role.setRol(roles); // ahora sí, llama al método correctamente
     
 }































































 }