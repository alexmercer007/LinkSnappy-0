
/// <reference lib="dom" />

// @ts-check


//----------------------------------------------------------------------------------- Buttons -----------------------------------------------------------------------------------------//


// BasicInformation

const personalInformation = document.getElementById("personalInformation");

if(personalInformation){

personalInformation.addEventListener("click",()=>{
    
    const personalInformationDiv = document.querySelector(".divContainer"); 
    const albumDiv = document.querySelector(".Album");
    const friendDiv = document.querySelector(".Friends");
    const communityAndGroupDiv = document.querySelector(".Community");
    const projectDiv = document.querySelector(".Projects");
    const gamingDiv = document.querySelector(".Gaming");
    
    if( personalInformationDiv instanceof HTMLElement){
        
        personalInformationDiv.style.display = "flex";
        albumDiv.style.display = "none";
        friendDiv.style.display = "none";
        communityAndGroupDiv.style.display = "none";
        projectDiv.style.display = "none";
        gamingDiv.style.display = "none";
        
    }
    
    
    
});
}


//Albums

const album = document.getElementById("albums");

if(album){

album.addEventListener("click",()=>{
    
    const personalInformationDiv = document.querySelector(".divContainer"); 
    const albumDiv = document.querySelector(".Album");
    const friendDiv = document.querySelector(".Friends");
    const communityAndGroupDiv = document.querySelector(".Community");
    const projectDiv = document.querySelector(".Projects");
    const gamingDiv = document.querySelector(".Gaming");
    
      if( albumDiv instanceof HTMLElement){
        
        personalInformationDiv.style.display = "none";
        albumDiv.style.display = "flex";
        friendDiv.style.display = "none";
        communityAndGroupDiv.style.display = "none";
        projectDiv.style.display = "none";
        gamingDiv.style.display = "none";
        
    }
    
    
});
}


//Friends

const friend = document.getElementById("friends");

if(friend) {

friend.addEventListener("click",()=>{
    
    const personalInformationDiv = document.querySelector(".divContainer"); 
    const albumDiv = document.querySelector(".Album");
    const friendDiv = document.querySelector(".Friends");
    const communityAndGroupDiv = document.querySelector(".Community");
    const projectDiv = document.querySelector(".Projects");
    const gamingDiv = document.querySelector(".Gaming");
    
      if( friendDiv instanceof HTMLElement){
        
        personalInformationDiv.style.display = "none";
        albumDiv.style.display = "none";
        friendDiv.style.display = "flex";
        communityAndGroupDiv.style.display = "none";
        projectDiv.style.display = "none";
        gamingDiv.style.display = "none";
        
    }
    
});
}



//Community & Group

const communityAndGroup = document.getElementById("communityAndGroup");

if(communityAndGroup){

communityAndGroup.addEventListener("click",()=>{
    
    const personalInformationDiv = document.querySelector(".divContainer"); 
    const albumDiv = document.querySelector(".Album");
    const friendDiv = document.querySelector(".Friends");
    const communityAndGroupDiv = document.querySelector(".Community");
    const projectDiv = document.querySelector(".Projects");
    const gamingDiv = document.querySelector(".Gaming");
    
      if( communityAndGroupDiv instanceof HTMLElement){
        
        personalInformationDiv.style.display = "none";
        albumDiv.style.display = "none";
        friendDiv.style.display = "none";
        communityAndGroupDiv.style.display = "flex";
        projectDiv.style.display = "none";
        gamingDiv.style.display = "none";
        
    }    
    
});

}



//Projects

const project = document.getElementById("projects");

if(project) {

project.addEventListener("click",()=>{
    
    const personalInformationDiv = document.querySelector(".divContainer"); 
    const albumDiv = document.querySelector(".Album");
    const friendDiv = document.querySelector(".Friends");
    const communityAndGroupDiv = document.querySelector(".Community");
    const projectDiv = document.querySelector(".Projects");
    const gamingDiv = document.querySelector(".Gaming");
    
      if( projectDiv instanceof HTMLElement){
        
        personalInformationDiv.style.display = "none";
        albumDiv.style.display = "none";
        friendDiv.style.display = "none";
        communityAndGroupDiv.style.display = "none";
        projectDiv.style.display = "flex";
        gamingDiv.style.display = "none";
        
    }   
    
});
}



//Gaming

const gaming = document.getElementById("gaming");

if(gaming){

gaming.addEventListener("click",()=>{
    
    const personalInformationDiv = document.querySelector(".divContainer"); 
    const albumDiv = document.querySelector(".Album");
    const friendDiv = document.querySelector(".Friends");
    const communityAndGroupDiv = document.querySelector(".Community");
    const projectDiv = document.querySelector(".Projects");
    const gamingDiv = document.querySelector(".Gaming");
    
      if( gamingDiv instanceof HTMLElement){
        
        personalInformationDiv.style.display = "none";
        albumDiv.style.display = "none";
        friendDiv.style.display = "none";
        communityAndGroupDiv.style.display = "none";
        projectDiv.style.display = "none";
        gamingDiv.style.display = "flex";
        
    }
    
    
});

}




//--------------------------------------------------------------------------------- Personal -----------------------------------------------------------------------------------------//


//Personal information
const basicInfo = document.getElementById("basicInfo"); 
const address = document.getElementById("address"); 
const education = document.getElementById("education");  



//Basic Info

//Editor
const buttonEditInfo = document.getElementById("buttonEditInfo");  
const buttonSendInfo = document.getElementById("buttonSendInfo"); 

if(basicInfo instanceof HTMLElement){

basicInfo.addEventListener("click", ()=>{
    
    const boxBasicInformation = document.querySelector(".divBasicInformation");
    const boxLocationAndAddress = document.querySelector(".divLocationAndAddress") ;
    const boxEducationAndProfession = document.querySelector(".divEducationAndProfession");

if(boxBasicInformation instanceof HTMLElement && 
   boxLocationAndAddress instanceof HTMLElement &&
   boxEducationAndProfession instanceof HTMLElement){

   boxBasicInformation.style.display = "flex";
   boxLocationAndAddress.style.display ="none";
   boxEducationAndProfession.style.display = "none";

}  
    
} );

};

if(buttonEditInfo){
    
    buttonEditInfo.addEventListener("click",() => {
        
        const buttonEdit = document.querySelector(".buttonEditInfo");
        const buttonSend = document.querySelector(".buttonSendInfo");
        const inputInfo = document.querySelectorAll(".inputInfo");
        
       if(buttonSend instanceof HTMLElement && buttonEdit instanceof HTMLElement){
               
               buttonEdit.style.display = "none";              
               buttonSend.style.display = "block";
               inputInfo.forEach((input)=>{
                   
                    if (input instanceof HTMLElement) {
          input.style.display = "block";
        }
                   
               });
               
              
                         
       } 
  
    });    
    
}



//Editor

const buttonEditLocation = document.getElementById("buttonEditLocation"); 
const buttonSendLocation = document.getElementById("buttonSendLocation");  

//Address

if(address instanceof HTMLElement){

address.addEventListener("click", ()=>{
    
    const boxBasicInformation = document.querySelector(".divBasicInformation");
    const boxLocationAndAddress = document.querySelector(".divLocationAndAddress") ;
    const boxEducationAndProfession = document.querySelector(".divEducationAndProfession");

if(boxBasicInformation instanceof HTMLElement && 
   boxLocationAndAddress instanceof HTMLElement &&
   boxEducationAndProfession instanceof HTMLElement){

   boxBasicInformation.style.display = "none";
   boxLocationAndAddress.style.display ="flex";
   boxEducationAndProfession.style.display = "none";

}  
    
} );

};

if(buttonEditLocation){
    
    buttonEditLocation.addEventListener("click",() => {
        
        const buttonEdit = document.querySelector(".buttonEditAddress");
        const buttonSend = document.querySelector(".buttonSendAddress");
        const inputInfoAddress = document.querySelectorAll(".inputInfoAddress");
        
       if(buttonSend instanceof HTMLElement && buttonEdit instanceof HTMLElement){
           
           buttonEdit.style.display = "none";
           buttonSend.style.display = "block";
           inputInfoAddress.forEach((input)=>{
               
             if (input instanceof HTMLElement) {
          input.style.display = "block";
        }
               
           });
           

       } 
  
    });    
    
}



//Editor

const buttonEditEducation = document.getElementById("buttonEditEducation"); 
const buttonSendEducation = document.getElementById("buttonSendEducation"); 

//Education

if(education instanceof HTMLElement){

education.addEventListener("click", ()=>{
    
    const boxBasicInformation = document.querySelector(".divBasicInformation");
    const boxLocationAndAddress = document.querySelector(".divLocationAndAddress") ;
    const boxEducationAndProfession = document.querySelector(".divEducationAndProfession");

if(boxBasicInformation instanceof HTMLElement && 
   boxLocationAndAddress instanceof HTMLElement &&
   boxEducationAndProfession instanceof HTMLElement){

   boxBasicInformation.style.display = "none";
   boxLocationAndAddress.style.display ="none";
   boxEducationAndProfession.style.display = "flex";

}  
    
} );

};


if(buttonEditEducation){ 
    
    buttonEditEducation.addEventListener("click",() => {
        
        const buttonEdit = document.querySelector(".buttonEditEducation");
        const buttonSend = document.querySelector(".buttonSendEducation");
        const inputInfoEducation = document.querySelectorAll(".inputInfoEducation");
        
       if(buttonSend instanceof HTMLElement && buttonEdit instanceof HTMLElement){
           
           buttonEdit.style.display = "none";
           buttonSend.style.display = "block";
           inputInfoEducation.forEach((input)=>{
               
              if (input instanceof HTMLElement) {
          input.style.display = "block";
        }
               
               
           }); 
                  
       } 
  
    });    
    
}


