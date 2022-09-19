let num1:number[]=[]; // memory creation in literal style
let num2: Array<number>=[];// memory creation in litral
let num3: Array<number>=new Array(); // memroy creation with new
num1.push(10);
num1.push(20);
num1.push(30);
//numl.push("Ravi");
let names:string[]=new Array();
let infos:any[]=new Array();

infos.push(100);

infos.push("Ravi");

infos.push(true);

// this interface is use to make the type of object. 
interface Employee{
    id: number;
    name: string;
    age: number;

}
let emp1:Employee = {id:100, name: "Ravi", age: 21}
let emp2: Employee = {id: 101, name: "Ramesh", age:25};
let emp5: Employee = {id:104, name: "Mahes", age: 34};
let emp3: Employee = {id:102, name: "Rajesh", age: 28}; 
let emp4: Employee = {id:103, name: "Lokesh", age: 36};

let employees: Array<Employee>=new Array();
employees.push(emp1);
employees.push(emp2);
employees.push(emp3);
employees.push(emp4);
employees.push(emp5);

employees.forEach(e=>console.log(e.id+" "+e.name+" "+e.age));

let res1 = employees.find(e=>e.id==101);
let res2 = employees.find(e=>id==1000);
let res3 = employees.findIndex(e=>id==101);
let res4 = employees.findIndex(e=>id==1000);

console.log(res3);
console.log(res4)