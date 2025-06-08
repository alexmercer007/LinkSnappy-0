
const state = document.querySelector(".state");
const province = document.querySelector(".province");
const county = document.querySelector(".county");


const country = document.getElementById("country");

const eu = "Estados Unidos";
const rd = "República Dominicana";
const nothing = "";

country.addEventListener("change", function () {

if( country.value === eu  ){
    
    state.style.display ="block";
    county.style.display ="block";
    
} else if (country.value === rd) {
    
    county.style.display = "none";
    state.style.display = "none";
    province.style.display ="block";
    
} else if (country.value === nothing ){
    
    // Ocultar todo por defecto
  state.style.display = "none";
  province.style.display = "none";
  county.style.display = "none";
    
}

});