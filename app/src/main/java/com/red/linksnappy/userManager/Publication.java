

package com.red.linksnappy.userManager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    
    @Column( name = "user_id")
    private Long userId;
    
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
    
    public Long getUserId(){
        
        return this.userId;
        
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
    
    
    
    
}
