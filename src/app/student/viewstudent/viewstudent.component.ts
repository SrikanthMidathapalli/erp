import { Component, OnInit } from '@angular/core';
import { ShowstudentsService } from './showstudents.service';

@Component({
  selector: 'app-viewstudent',
  templateUrl: './viewstudent.component.html',
  styleUrls: ['./viewstudent.component.css']
})
export class ViewstudentComponent implements OnInit {
student:any=[]
  constructor(private ss:ShowstudentsService) { }

  ngOnInit(): void {
this.showstudents()

  }
showstudents(){
  var result=this.ss.details().then(response=>response.toPromise());
  result.then(dd=>this.student=dd);

}
}
