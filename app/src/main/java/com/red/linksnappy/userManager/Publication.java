

package com.red.linksnappy.userManager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author AlejandroRC
 */

@Entity
@Table( name = "publication" )
public class Publication {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;
    
   // Relación muchos a uno
    @ManyToOne
    @JoinColumn(name = "users_id") // esta es la foreign key en la tabla "publication"
    private User user;
    
    private String content;
    
    @Column( name = "image_url")
    private String imageUrl;
    
    @Column( name = "image_src")
    private String imageSrc;
    
    @Column( name = "video_url")
    private String videoUrl;
    
    @Column( name = "video_src")
    private String videoSrc;
    
    @Column( name = "publication_date")
    private LocalDate publicationDate;
    
    
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    
    
    public Long getId(){
        
        return this.Id;
        
    }
    
    public String getContent(){
        
        return this.content;
        
    }
    
    public String getImageUrl(){
        
        return this.imageUrl;
        
    }
    
    public String getImageSrc(){
        
        return this.imageSrc;
        
    }
    
    public String getVideoUrl(){
        
        return this.videoUrl;
        
    }
    
    public String getVideoSrc(){
        
        return this.videoSrc;
        
    }   
    
    public LocalDate getPublicationDate(){
        
        return this.publicationDate;
        
    }
       
    
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------//    
    
   
  public void setContent( String content ){
  
     this.content = content;
  
  } 
    
 public void setImageUrl( String imageUrl ){
  
     this.imageUrl= imageUrl;
  
  }
 
 public void setImageSrc( String imageSrc ){
  
     this.imageSrc = imageSrc;
  
  }
 
 public void setVideoUrl( String videoUrl ){
  
     this.videoUrl = videoUrl;
  
  }
 
 public void setVideoSrc( String videoSrc ){
  
     this.videoSrc = videoSrc;
  
  }
    
 public void setPublicationDate( LocalDate publicationDate){
     
     this.publicationDate = publicationDate;
     
 }   
    
    
    
}
