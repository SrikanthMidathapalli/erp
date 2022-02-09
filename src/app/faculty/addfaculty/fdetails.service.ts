import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Fentity } from './fentity';

@Injectable({
  providedIn: 'root'
})
export class FdetailsService {
private baseUrl="http://localhost:10012/AddFaculty"
  constructor(private http:HttpClient) { 

  }
  facultyadd(faculty:Fentity){
  return this.http.post(this.baseUrl,faculty,{ responseType:'text' as 'json'})
  }
}

