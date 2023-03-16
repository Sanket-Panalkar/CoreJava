function formValidation(){
    var returnElement = true;
    var nameInput = document.forms['newFormName']['nameName'].value;

   // console.log('name >>',nameInput);
   // alert('stop');

    if(nameInput==null || nameInput.length < 3){
    document.getElementById('nameSpan').innerHTML='Name should not be null and less then 3';
   // alert('stop');
    returnElement=false;
    }
    if(returnElement==true){
        alert('Form submitted');  
    }
    return returnElement;
}
