import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  msg:string ="HI";
  result:string="nikhil"

  constructor() { }

  ngOnInit(): void {
  }

  fun(){
    //alert("this is nikhil...")
    this.msg = "hello";
  }

  passValue(nameRef:any){
    alert(nameRef.value);
  }
  add(n1:any,n2:any){
    let sum = eval(n1.value)+eval(n2.value);
    alert(sum);
    n1.value="";
    n2.value="";
    this.result = "sum of two number is "+sum;
  }

}
