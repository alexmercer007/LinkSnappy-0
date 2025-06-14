
const state = document.querySelector(".state");
const province = document.querySelector(".province");
const county = document.querySelector(".county");
const country = document.getElementById("country");

const eu = "1";
const rd = "19";

function hideAll() {
  state.style.display = "none";
  province.style.display = "none";
  county.style.display = "none";
}

country.addEventListener("change", function () {
    
    console.log("Country value:", country.value);
    
  hideAll();

  if (country.value === eu) {
    state.style.display = "block";
    county.style.display = "block";
  } else if (country.value === rd) {
    province.style.display = "block";
  }
});

// Inicialmente ocultar todo al cargar la página
hideAll();



// Profession


const professionLists = {
  "1": "accountant",
  "2": "architect",
  "3": "artist",
  "4": "chef",
  "5": "designer",
  "6": "doctor",
  "7": "electrician",
  "8": "engineer",
  "9": "farmer",
  "10": "firefighter",
  "11": "lawyer",
  "12": "mechanic",
  "13": "musician",
  "14": "nurse",
  "15": "pharmacist",
  "16": "photographer",
  "17": "pilot",
  "18": "plumber",
  "19": "policeOfficer",
  "20": "programmer",
  "21": "scientist",
  "22": "teacher",
  "23": "veterinarian",
  "24": "writer"
};


const professionSelect = document.getElementById("profession");

function hideAllLists() {
  
  Object.values(professionLists).forEach(className => {
      
    const element = document.querySelector("." + className);
    
    if (element) {
     
      element.style.display = "none";
      
    } else {
    
    }
    
  });
  
}

professionSelect.addEventListener("change", () => {
    
  const selectedValue = professionSelect.value;
  

  hideAllLists();

  const selectedClass = professionLists[selectedValue];
  
  if (selectedClass) {
    
    const selectedElement = document.querySelector("." + selectedClass);
    
    if (selectedElement) {
        
      selectedElement.style.display = "block";
      
    } else {
      
    }
    
  } else {
  
  }
  
});

// Ocultar todas al iniciar
hideAllLists();

























































































