import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Loginentity } from './loginentity';

@Injectable({
  providedIn: 'root'
})
export class AloginService {
private baseurl="http://localhost:10012/adminLogin"
  constructor(private http:HttpClient) { }
  logina(admin:Loginentity){
    return this.http.post(this.baseurl,admin,{responseType: 'text' as 'json'})
    
  }
}

