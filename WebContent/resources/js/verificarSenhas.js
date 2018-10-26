var password = document.querySelector('#validationSenha')
  , confirm_password = document.querySelector('#validationConfirmarSenha');
var campo = password;
function validatePassword(){

	if(password.value != confirm_password.value) {
	    confirm_password.setCustomValidity("Senhas diferentes!");
	   
	} else {
	    confirm_password.setCustomValidity('');
  }
}


password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;

