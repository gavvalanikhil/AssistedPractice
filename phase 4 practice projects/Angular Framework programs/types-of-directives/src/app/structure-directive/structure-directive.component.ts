import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
  f1:boolean=true
  f2:boolean=false
  f3:boolean=false;
  f4:boolean=false;
  b1:string="show";
  num1:number[]=[10,20,30,40,50]
  names:string[]=["ravi","nikhil","likhita","vijay","bharath","krishna"]

  employees:Array<Employee>=[];        //array object


  constructor() { }
  //it is a life cycle function or method which will ger automatically after constructer
  //this function call only once which is use to do some initialization
  ngOnInit(): void {
    // let emp1 = new Employee(100,"ravi",25000);
    // let emp2 = new Employee(101,"krishna",30000);
    // let emp3 = new Employee(102,"ravikumar",50000);
    // this.employees.push(emp1);
    // this.employees.push(emp2)
    // this.employees.push(emp3)


    //interface style model
    let emp1:Employee = {id:100,name:"ravi",salary:25000}
    let emp2:Employee = {id:101,name:"krishna",salary:30000}
    let emp3:Employee = {id:102,name:"ravikumar",salary:50000}
    this.employees.push(emp1);
    this.employees.push(emp2)
    this.employees.push(emp3)
  }
  addEmployeeDetails(idRef:any,nameRef:any,salaryRef:any){
    let idValue = idRef.value;
    let nameValue = nameRef.value;
    let salaryValue = salaryRef.value;
     
      let emp:Employee={id:idValue,name:nameValue,salary:salaryValue};
    this.employees.push(emp);
    idRef.value=""
    nameRef.value=""
    salaryRef.value=""
  }
  changeValue(){
    this.f3=true;
  }

  toggle(){
    if(this.f4){
      this.f4=false;
      this.b1="show";
    }else{
      this.f4=true;
      this.b1="hide"
    }
  }
}
