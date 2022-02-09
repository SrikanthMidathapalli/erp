import { Component, OnInit } from '@angular/core';
import { FdetailsService } from './fdetails.service';
import { Fentity } from './fentity';

@Component({
  selector: 'app-addfaculty',
  templateUrl: './addfaculty.component.html',
  styleUrls: ['./addfaculty.component.css']
})
export class AddfacultyComponent implements OnInit {

  faculty=new Fentity();
  constructor(private ss: FdetailsService) { }


  ngOnInit(): void {
    this.addfaculty()
  }
addfaculty(){
  var result=this.ss.facultyadd(this.faculty);
  result.subscribe(data=>console.log(data));
}
}
