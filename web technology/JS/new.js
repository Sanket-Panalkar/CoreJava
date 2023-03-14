function changeH1(){
    document.getElementById('h1Id').innerHTML='Form Registered';
    document.getElementById('h1Id').style.color='red';
}
function formValidation(){
    var val=true;
    var names=document.newForm.name.value;
    var dob=document.newForm.dob.value;
    var email=document.newForm.email.value;
    var pass1=document.newForm.pass1.value;
    var pass2=document.newForm.pass2.value;
    var regNo=document.newForm.reg.value;
    var branch=document.newForm.branch.value;
    var mob=document.newForm.numb.value;
    var college=document.newForm.college.value;
    var add=document.newForm.add.value;

    console.log("Name>>>",names);
    console.log("DOB>>>",dob);
    console.log("Email>>>",email);
    console.log("Password>>>",pass1);
    console.log("Confirm Password>>>",pass2);
    console.log("Reg No>>>",regNo);
    console.log("Branch>>>",branch);
    console.log("Mob No>>>",mob);
    console.log("College>>>",college);
    console.log("Address>>>",add);

    if(names==null || names.length<6){
        setError('name','Name is null');
        val=false;
    }
    if(mob.length!=10){
        // setError('numb','*Please enter 10 digit valid phone number');
        document.getElementById('numb').innerHTML='*Please enter 10 digit valid phone number';
        val=false;
    }
    if(email==null || email.length<6){
        setError('email','*Please enter minimum 6 characters emial');
        val=false;
    }
    if(pass1!=pass2){
        setError('pass2','*Pasword Not Matching');
        val=false;
    }
    if(val==true){
        alert('Form Submitted');
        changeH1();
    }
    return val;

}
function setError(id,errorMessage){
    element=document.getElementById(id);
    element.getElementByClassName('errorClass')[0].innerHTML=errorMessage;
}