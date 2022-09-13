//literal style object creation.
let emp1 = {id:100,name:"Ravi",age:21}

document.write("<br/> Object creation in literal style")
document.write("<br/> Id is "+emp1.id)
document.write("<br/> name is "+emp1.name)
document.write("<br/> age is "+emp1.age+"<br/>")
//we have to convert object to string
let empString = JSON.stringify(emp1);
document.write("<br/> object property")
document.write("<br/> Id is "+empString.id)
document.write("<br/> name is "+empString.name)
document.write("<br/> age is "+empString.age+"<br/>")
//we havae to convert string to json
let empJSON = JSON.parse(empString);
document.write("<br/> Object property ")
document.write("<br/> Id is "+empJSON.id)
document.write("<br/> name is "+empJSON.name)
document.write("<br/> age is "+empJSON.age+"<br/>")
//converting json to string
let empStr = JSON.stringify(empJSON);
document.write("<br/> Object property ")
document.write("<br/> Id is "+empStr.id)
document.write("<br/> name is "+empStr.name)
document.write("<br/> age is "+empStr.age+"<br/>")
