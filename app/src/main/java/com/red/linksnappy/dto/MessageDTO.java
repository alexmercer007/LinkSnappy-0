/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.linksnappy.dto;

import java.time.LocalDateTime;

/**
 *
 * @author AlejandroRC
 */
public class MessageDTO {
    
    private String content; 
    
    private String image;
    
    private String video;

    private LocalDateTime sentAt;
    
    private LocalDateTime deliveredAt;
    
    private LocalDateTime readAt; // cuándo fue leído
    
    private Long senderId;

    private Long receiverId;  
   
    
public void setMessageContentDto( String content ){
    
    this.content = content;
      
}   

public void setMessageImageDto( String image ){
    
    this.image = image;
    
}  

public void setMessageVideoDto( String video ){
     
    this.video = video;
    
}  

public void setMessageSentAtDto( LocalDateTime sentAt ){
     
    this.sentAt = sentAt;
    
}

public void setMessageDeliveredAtDto( LocalDateTime deliveredAt ){
     
    this.deliveredAt = deliveredAt;
    
}

public void setMessageReadAtDto( LocalDateTime readAt ){
     
    this.readAt = readAt;
    
}    

public void setSenderId(Long senderId) {
    this.senderId = senderId;
}

public void setReceiverId(Long receiverId) {
    this.receiverId = receiverId;
}



//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//


public String getContent() {
    return content;
}

public String getImage() {
    return image;
}

public String getVideo() {
    return video;
}

public LocalDateTime getSentAt() {
    return sentAt;
}

public LocalDateTime getDeliveredAt() {
    return deliveredAt;
}

public LocalDateTime getReadAt() {
    return readAt;
}

public Long getSenderId() {
    return senderId;
}

public Long getReceiverId() {
    return receiverId;
}

    
    
    
    
    
    
}
