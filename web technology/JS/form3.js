function Validation(){
    let names,EmailIDs,password1,password2,phone;

    names=document.newform.name.value;
    EmailIDs=document.newform.EmailID.value;
    password1=document.newform.password1.value;
    password2=document.newform.password2.value;
    phonenum=document.newform.num1.value;

    console.log("name>>", names);
    console.log("Email Id>>", EmailIDs);
    console.log("Password>>", password1);
    console.log("conform password>>", password2);
    console.log("Mobile No:>>",phonenum);


    if(contNo.length != 10){
        document.getElementById('phone1').innerHTML='*Please enter 10 digits';
        return false;
    }
    
    if(isNaN(phonenum) || phonenum.length>10 && phonenum.length<20){
        alert('mobile number is valid and in between 10 and 20');
    }else{
        alert('please enter valid mobile number..');
    }

    if(names == null || names == ""){
        alert('name should not be null');
    }
    if(EmailIDs == null || EmailIDs.length<6){
        alert('Email should be atleatst 6 letters..');
    }

    if(password1==password2){
        alert('password matchs');
    }else{
        alert('password doesnt matchs');
    }


}