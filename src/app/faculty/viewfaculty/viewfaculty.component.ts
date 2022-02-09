import { Component, OnInit } from '@angular/core';
import { ShowsfacultyService } from './showsfaculty.service';

@Component({
  selector: 'app-viewfaculty',
  templateUrl: './viewfaculty.component.html',
  styleUrls: ['./viewfaculty.component.css']
})
export class ViewfacultyComponent implements OnInit {
faculty:any=[]
  constructor(private ss:ShowsfacultyService) { }

  ngOnInit(): void {
  this.showsfaculty()
  }
  showsfaculty(){
  var result=this.ss.details().then(response=>response.toPromise());
  result.then(dd=>this.faculty=dd);

}
}