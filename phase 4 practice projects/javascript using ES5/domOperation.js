// alert("this is nikhil")
function addData(){
   // alert("Event fired....")
    var name = document.getElementById("n1").value
    var age = document.getElementById("n2").value
    var pTag = document.createElement("p");  //tag reference is ready
    var pTagContent = document.createTextNode(`name is ${name} age is ${age}`)   //tag reference is ready

    pTag.appendChild(pTagContent);           //added content inside a tag
    if(age>30){
        pTag.setAttribute("class","myClass1");
    }else{
        pTag.setAttribute("class","myClass2");
    }
    
    var aTag = document.createElement("a");  //tag reference is ready
    var aTagContent = document.createTextNode("remove");
    aTag.appendChild(aTagContent)
    aTag.setAttribute("href","#");                 //added attribute as href with value #
    aTag.setAttribute("onClick","deleteData()");   //added attribute as 
    pTag.appendChild(aTag);



    document.getElementById("out").appendChild(pTag); //added pTag inside a div tag
    document.getElementById("n1").value=""
    document.getElementById("n2").value=""

}   
function deleteData(){
    alert("Event fired...")
}      