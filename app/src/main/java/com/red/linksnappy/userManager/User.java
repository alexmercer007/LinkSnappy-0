

package com.red.linksnappy.userManager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
   
 @Column(name="username")  
 private String userName; 
 
 @Column(name="lastname")
 private String lastName;
 
 @Column(name="passwordhash")
 @JsonIgnore
 private String passwordHash;
 
 @Column(name="birthdate")
 private  LocalDate birthdate;
 
 @NotNull(message="not null")
 @Email(message="incorrect email")
 @Column(name="email")
 private String email;
 
 @Column(name="primaryschool")
 private String primarySchool;
 
 @Column(name="highschool")
 private String highSchool;
 
 @Column(name="university")
 private String university;
 
 @ManyToOne
 @JoinColumn( name = "country_id") 
 private Country country;
 
 @Column(name="profile_picture")
 private String profilePicture;
 
 private String address;
 
 @JsonIgnore
 private String numberPhone;
 
 @ManyToOne
 @JoinColumn( name = "maritalstatus_id")
 private MaritalStatus maritalStatus;   
 
 @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
 @JsonIgnore
 private Biography biography;
 
 // Relación uno a muchos
 @OneToMany(mappedBy = "user")
 @JsonIgnore
 private List<Publication> publications;
    
 @ManyToOne
 @JoinColumn(name="region_id")
 private Region region; 
 
 @ManyToOne
 @JoinColumn(name="region_type_id")
 private RegionType regionType; 
 
 @ManyToOne
 @JoinColumn(name="profession")
 private Profession profession; 
 
 @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
 @JsonIgnore
private List<Messages> messages = new ArrayList<>(); 
 
@OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
@JsonIgnore
private List<Messages> sentMessages;

@OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL)
@JsonIgnore
private List<Messages> receivedMessages;

 @Column(name="created_at")
 private LocalDateTime createdAt; 
 
 @Column(name="is_active")
  private boolean isActive; 
   
 @Column(name="is_verified") 
 private boolean isVerified;
 
 @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
 @JsonManagedReference
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

public Country getCountry(){
    
    return this.country;
    
}

public Biography getBiography() {
        
    return biography;
    
}

public String getEmail(){

    return this.email;
    
}

public String getPrimaySchool(){

    return this.primarySchool;
    
}

public String gethighSchool(){

    return this.highSchool;
    
}

public String getUniversity(){

    return this.university;
    
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

public String getNumberPhone(){

     return this.numberPhone;

}

public MaritalStatus getMaritalStatus(){
    
     return this.maritalStatus;
    
}

public List<Publication> getPublications(){
    
    return this.publications;
    
}

public List<Messages> getSentMessages() {
    
    return sentMessages;
    
}

public List<Messages> getReceivedMessages() {
    
    return receivedMessages;
    
}


public Region getRegionId(){
    
    return this.region;
    
}

public RegionType getRegionTypeId(){
    
    return this.regionType;
    
}


public LocalDateTime getCreatedAt(){
    
    return this.createdAt;
    
}

public boolean getIsActive(){
    
    return this.isActive;
    
}

public boolean getIsVerified(){
    
    return this.isVerified;
    
}

public UserRoles getRole() {
    
    return role;
    
}

public List<Messages> getMessages(){
    
    return this.messages;
    
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

public void setCountry( Country country){
    
    this.country = country;
    
}

public void setBiography(Biography biography) {
        
    this.biography = biography;        
    biography.setUser(this);  // mantener relación bidireccional
   
}

public void setEmail( String email){

   this.email = email;
    
}

public void setPrimaySchool( String primarySchool ){

    this.primarySchool = primarySchool;
    
}

public void setHighSchool( String highSchool){

     this.highSchool = highSchool;
    
}

public void setUniversity( String university){

     this.university = university;
    
}

public void setPasswordHash(String passwordHash) {
    // Verifica si ya está codificada (opcional)
    if (passwordHash != null && !passwordHash.startsWith("$2a$")) {
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        this.passwordHash = encoder.encode(passwordHash);
        
    } else {
        
        this.passwordHash = passwordHash;
    }
}

public void setProfilePicture( String profilePicture){

    this.profilePicture = profilePicture;

}

public void setAddress( String address ){

    this.address = address;

}

public void setNumberPhone( String numberPhone ){

     this.numberPhone = numberPhone;

}

public void setMaritalStatusId( MaritalStatus maritalStatus ){
    
    this.maritalStatus = maritalStatus;
    
}

public void setRegionId( Region regionId){
    
     this.region = regionId;
    
}

public void setRegionTypeId( RegionType regionTypeId){
    
     this.regionType = regionTypeId;
    
}

public void setProfessionId( Long professionId){
    
     this.profession.setId(professionId); 
    
}

public void setProfession( Profession profession){
    
     this.profession = profession;
    
}

public void setCreatedAt( LocalDateTime createdAt ){
    
    this.createdAt = createdAt;
    
}

public void setIsActive( boolean isActive ){
    
    this.isActive = isActive;
    
}

public void setIsVerified( boolean isVerified){
    
    this.isVerified = isVerified;
    
}

public void setRole(UserRoles role) {
    
    this.role = role;
    
    if (role != null) {
        
        role.setUser(this);  // sincroniza el lado inverso de la relación
        
    }
}






























































 }