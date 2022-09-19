import {Component,OnInit} from '@angular/core';

@Component({
    selector:'my-child-tag',
    templateUrl:'./child.component.html',
    styleUrls:['./child.component.css']
})
export class Child implements OnInit{
    msg:string = "This is child component";

    ngOnInit(): void{}

}