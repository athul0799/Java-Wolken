function validateLogin()
{
    var email=$("#email").val();
    var pass=$("#pass").val();
    var emailValid = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$/;
    var letters = /^[a-z]+$/;
    var letterNum = /^[a-zA-Z0-9]+$/;
     

   if(email.match(emailValid) && email.length>=6 && email.length<18 && email.length != "") {
        $("#errEmail").html('');
          
   if(password.match(letterNum) && password.length>8 && password.length<16 && password.length !="")
        {
            $("#errPass").html('');
        } else {
   
            $("#errPass").html('Password not valid must have all types of characters');
        }
    } else {
        $("#errEmail").html('Email invalid');
    }
}
