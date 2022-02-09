import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ShowsfacultyService {

  constructor( private http:HttpClient) { }
  async details(){
    return await this.http.get("http://localhost:10012/ShowFaculty");
  }
}
