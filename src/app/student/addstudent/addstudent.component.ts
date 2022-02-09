import { Component, OnInit } from '@angular/core';
import { Sentity } from './sentity';
import { Studentdetails1Service } from './studentdetails1.service';

@Component({
  selector: 'app-addstudent',
  templateUrl: './addstudent.component.html',
  styleUrls: ['./addstudent.component.css']
})
export class AddstudentComponent implements OnInit {

student=new Sentity();
constructor(private sd:Studentdetails1Service){}

  ngOnInit(): void {
  }
  addstudent(){
    var result1=this.sd.studentadd(this.student)
    result1.subscribe(data=>console.log(data));

  }
 
}
