function validateSave()
{
    var fname=$("#name").val();
    var lname=$("#name").val();
    var email=$("#email").val();
    var password=$("#password").val();
    var conPassword=$("#conPassword").val();
    var contact=$("#contact").val();
    var country=$("#country").val();
    var gender=$("input[name='gender']:checked").val();
    var numbers = /^[0-9]+$/;
    var status=$('input[type=checkbox]:checked');
    var date=$('#dob').val();
    var gender=$("input[name='gender']:checked").val();
    
    
    
   if(fname.length !="" && fname.length>3 && fname.length<15 &&  && fname.match(letters)) {
        $("#errName").html('');
   if(lname.length !="" && lname.length>3 && lname.length<15 &&  && lname.match(letters)) {
        $("#errName").html('');
    if(email.length>=6 && email.length<18 && email.length != "" && email.match(emailVal)) {
            $("#errEmail").html('');
    if(contact.length==10 && contact!="" && contact.match(numbers)) {
                $("#errContact").html('');
    
    if(gender) {
                        $("#errGender").html('');
    if(status.length>0) {
                            $("#status").html('');
    if(date!="") {
                    $("#errDate").html('');
    if(country!="") {
    $("#errCountry").html('');
    if(password.length>8 && password.length<16 && password.length !="" && password.match(letterNum)) {
     $("#errPassword").html('');
    if(conPassword==password) {
     $("#errConPassword").html('');
     } 
     
     else {
    $("#errConPassword").html('Password does not match');
             }
     } 
     
     else {
       $("#errPassword").html('Only character allowed');
                                        }
     
       } else {
               $("#errCountry").html('Choose an option');
                                    }
       } 
                                } 
        }else {
          $("#status").html('Select status');
                            }
        } else {
                 $("#errGender").html('Select gender');
                        }
                    }
           } 
           
           else {
            $("#errName").html('Please input alphabet characters only');
                } 
                
                else {
                     $("#errEmail").html('Input valid email');
                }
            } 
            
            else {
               
               $("#errContact").html('Input valid contact');
               }else {
                        $('#errDate').html('Enter DOB');
                    }
        }
} 
