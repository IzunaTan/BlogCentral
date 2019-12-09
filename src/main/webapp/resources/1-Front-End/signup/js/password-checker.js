var password = document.getElementById("password")
  , confirm_password = document.getElementById("confirm_password");


var isValid = false

function validatePassword(){
  if(password.value != confirm_password.value) {
    confirm_password.setCustomValidity("Passwords Don't Match");
    isValid = false;
  } else {
    confirm_password.setCustomValidity('');
    isValid = true;
  }
}

var removeChars = () => {
  validatePassword();
  if (!isValid){
    confirm_password.value = "";
    password.value = "";
  }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;
