
package com.red.linksnappy.userManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author AlejandroRC
 */

@Entity
@Table( name = "messages" )
public class Messages {
    
  public Messages(){
      
      
  }  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String content;
    
    private String image;
    
    private String video;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;   
    
    private LocalDateTime sentAt;
    
    private LocalDateTime deliveredAt;
    
    private LocalDateTime readAt; // cuándo fue leído

    
    
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    
    
   public Long getId(){
       
       return this.id;
       
   }   
   
   public String getContent(){
       
       return this.content;
       
   } 
   
   public String getImage(){
       
       return this.image;
       
   } 
   
   public String getVideo(){
       
       return this.video;
       
   } 

    public User getSender(){
       
       return this.sender;
       
   } 
    
   public User getReceiver(){
       
       return this.receiver;
       
   } 
   
  public LocalDateTime getSentAt(){
       
       return this.sentAt;
       
   }  
   
  public LocalDateTime getDeliveredAt(){
       
       return this.deliveredAt;
       
   }  
  
  public LocalDateTime getReadAt(){
       
       return this.readAt;
       
   }  

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------//


     public void getId( Long id){
       
        this.id = id;
       
   }   
   
   public void getContent( String content){
       
       this.content = content;
       
   } 
   
   public void getImage( String image ){
       
        this.image = image;
       
   } 
   
   public void  getVideo( String video ){
       
        this.video = video;
       
   } 

    public void getSender( User sender){
       
        this.sender = sender;
       
   } 
    
   public void getReceiver( User receiver ){
       
       this.receiver = receiver;
       
   } 
   
  public void getSentAt( LocalDateTime sentAt){
       
       this.sentAt = sentAt;
       
   } 
  
  public void getDeliveredAt( LocalDateTime deliveredAt){
       
       this.deliveredAt = deliveredAt;
       
   } 
  
  public void getReadAt( LocalDateTime readAt){
       
       this.readAt = readAt;
       
   } 


}
