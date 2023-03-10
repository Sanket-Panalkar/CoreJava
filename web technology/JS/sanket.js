function formValidation(){
    let name,Email,mNumber,DOB,

    names= document.newform.name.value;
    Email=document.newform.Email.value;
    mNumber=document.newform.mNumber.value;
    DOB=document.newform.DOB.value;
    PassWord=document.newform.PassWord1.value;
    newPassWord=document.newform.PassWord2.value;

    console.log('name>>',names);
    console.log('Email>>',names);
    console.log('monile number>>',mNumber);
    console.log('DOB>>',DOB);
    console.log('password>>',Password);

    if(names == null || names == " "){
        alert('name should not be null');
    }
    if(Email == null || Email.length<6){
        alert('email should be atleast 6 letter');
    }
    if(password1 == password2){
        alert('password matches')
    }else{
        alert('password doesnt match');
    }
}