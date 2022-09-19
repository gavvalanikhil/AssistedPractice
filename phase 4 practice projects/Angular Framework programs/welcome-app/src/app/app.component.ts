import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'welcome-app';
  id:number = 100;
  name:string = "Nikhil"
  age:number = 21;
  result: boolean = true;
}
