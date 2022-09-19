var num1 = []; // memory creation in literal style
var num2 = []; // memory creation in litral
var num3 = new Array(); // memroy creation with new
num1.push(10);
num1.push(20);
num1.push(30);
//numl.push("Ravi");
var names = new Array();
var infos = new Array();
infos.push(100);
infos.push("Ravi");
infos.push(true);
var emp1 = { id: 100, name: "Ravi", age: 21 };
var emp2 = { id: 101, name: "Ramesh", age: 25 };
var emp5 = { id: 104, name: "Mahes", age: 34 };
var emp3 = { id: 102, name: "Rajesh", age: 28 };
var emp4 = { id: 103, name: "Lokesh", age: 36 };
var employees = new Array();
employees.push(emp1);
employees.push(emp2);
employees.push(emp3);
employees.push(emp4);
employees.push(emp5);
employees.forEach(function (e) { return console.log(e.id + " " + e.name + " " + e.age); });
var res1 = employees.find(function (e) { return e.id == 101; });
var res2 = employees.find(function (e) { return id == 1000; });
var res3 = employees.findIndex(function (e) { return id == 101; });
var res4 = employees.findIndex(function (e) { return id == 1000; });
console.log(res3);
console.log(res4);
