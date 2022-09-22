import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup, Validators } from '@angular/forms';
import { CustomService } from '../custom.service';
import { loginService } from '../loginservice';
@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {
  loginRef = new FormGroup({
    email:new FormControl("",[Validators.required]),       //first parameter is value option textfield
    pass:new FormControl("",[Validators.required])
  });

  msg:string=""
  constructor(public ls:loginService) { }

  ngOnInit(): void {
  }

  checkUser(){
    let login = this.loginRef.value;
    //console.log(login);
    // if(login.email=="raj@gmail.com" && login.pass=="123"){
    //   this.msg = "successfully login"
    // }else{
    //   this.msg = "Failure try once again"
    // }
    // let cs = new CustomService();
    // this.msg = cs.checkUserDetails(login);
    this.msg = this.ls.checkUserDetails(login);
    this.loginRef.reset();
  }

}
