function changeH3() {
    var abc = document.getElementById('h2Tag').innerHTML = 'DETAILS OF EDUCATION';
    document.getElementById('h2Tag').style.color = "blue";
  
    console.log('abc>>>', abc)
  }
  function image() {
    document.getElementById("img1").src = "newImg.jpg";
  }
  function form2Validation() {
    var val=true;
    var contNo=document.forms['documentForm']['phone2'].value;
  

  /* names = document.documentForm.name2.value;
    console.log('Name:', names);
    email = document.documentForm.eMail2.value;
    console.log('Email ID:', email);
    dateOfBirth = document.documentForm.birthDate.value;
    console.log('Date Of Birth:', dateOfBirth);
    schoolName = document.documentForm.school2.value;
    console.log('School Name:', schoolName);
    sslcPerc = document.documentForm.sSLCPercentage.value;
    console.log('SSLC %:', sslcPerc);
    pu = document.documentForm.pUCollege2.value;
    console.log('PUCollege:', pu);
    puPerc = document.documentForm.puPercentage2.value;
    console.log('PU %:', puPerc);
    degree = document.documentForm.degreeName.value;
    console.log('Degree:', degree);
    degreePerc = document.documentForm.degreePercentage.value;
    console.log('Degree %:', degreePerc);
    yrOfPassing = document.documentForm.yearOfPassing.value;
    console.log('Year of passing:', yrOfPassing);*/
  
    // if (name == null || name == '') {
    //   /*alert('Name must not be empty');*/
    // }
    if(contNo.length != 10){
      document.getElementById('phone1').innerHTML='*Please enter 10 digits';
      return false;
    }
  
  
   /* if (email.length < 8) {
      alert('email must contain atleast 8 characters');
    }
    if (schoolName == 'PGHS') {
      alert('It is a good school');
    }
    if (sslcPerc >= 90) {
      alert('First class');
    } if (sslcPerc >= 85 && sslcPerc < 90) {
      alert('Distinction');
    } if (sslcPerc < 85) {
      alert('Average');
    }
    if (yrOfPassing == '2022') {
      alert('Fresher');
    }
    else {
      alert('Experienced');
    }*/
    if(val==true){
      alert('Form Submitted');
      changeH3();
    }
  return val;
  
  }
  function resetValidation(){
    if(val==true){
      
    }
  }


  