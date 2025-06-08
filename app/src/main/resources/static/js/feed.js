

//panel-messages//

const messages = document.getElementById("messages");

messages.addEventListener("click", ()=>{
    
    const panelMessage = document.querySelector(".panel-messages");
    const panelNotifications = document.querySelector(".panel-notifications");
    const panelProfile = document.querySelector(".panel-profile");
    
    if(panelMessage instanceof HTMLElement){
        
      if(panelMessage.style.display === "block"){
        
        panelMessage.style.display = "none";
        
    } else {
        
        panelMessage.style.display = "block";
        panelNotifications.style.display = "none";
        panelProfile.style.display = "none";
    
    }
    
}
});








//panel-notifications//

const notifications = document.getElementById("notifications");

notifications.addEventListener("click", ()=>{
    
    const panelMessage = document.querySelector(".panel-messages");
    const panelNotifications = document.querySelector(".panel-notifications");
    const panelProfile = document.querySelector(".panel-profile");
    
    if(panelNotifications instanceof HTMLElement){
        
        
        if(panelNotifications.style.display === "block"){
            
            panelNotifications.style.display = "none";
            
        } else {
            
        panelMessage.style.display = "none";
        panelNotifications.style.display = "block";
        panelProfile.style.display = "none";
        
        }
        
    }
    
});










//panel-profile//

const profile = document.getElementById("profile");

profile.addEventListener("click", ()=>{
    
    const panelMessage = document.querySelector(".panel-messages");
    const panelNotifications = document.querySelector(".panel-notifications");
    const panelProfile = document.querySelector(".panel-profile");
    
    if(panelProfile instanceof HTMLElement){
        
        if(panelProfile.style.display === "block"){
            
            panelProfile.style.display = "none";
            
        } else {
            
        panelMessage.style.display = "none";
        panelNotifications.style.display = "none";
        panelProfile.style.display = "block";
            
            
        }
        
      
        
    }
    
});























































