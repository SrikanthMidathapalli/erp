import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Sentity } from './sentity';

@Injectable({
  providedIn: 'root'
})
export class Studentdetails1Service {
private baseurl="http://localhost:10012/AddStudent"
  constructor(private http:HttpClient) { }
  studentadd(student:Sentity)
  {
    return this.http.post(this.baseurl,student,{responseType:'text' as 'json'})
  }
}
