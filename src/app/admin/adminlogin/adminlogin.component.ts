import { Component, OnInit } from '@angular/core';
import { Loginentity } from './loginentity';
import { AloginService } from './alogin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
admin=new Loginentity();
isUserError: boolean = false;
  errorMsg: string = '';
  constructor(private ss:AloginService,
    private rooter:Router) { }

  ngOnInit(): void {
    this.adminlogin();
  }
adminlogin(){
  if (this.admin.email === undefined || this.admin.password === undefined) {
    this.isUserError = true;
    this.errorMsg = 'Please enter Username and Password.';
    return true;
  }
  try {
    this.ss.logina(this.admin).subscribe(
      (data: any) => {
        this.rooter.navigateByUrl('/adminhome');
        this.isUserError = false;
        return false;
      },
      (error) => {
        this.isUserError = true;
        this.errorMsg = 'Invalid UserId/Password';
        return false;
      }
    );
    return false;
  } catch {
    this.isUserError = true;
    this.errorMsg = 'Services are down, Please try after some time.';
    return false;
  }

}
}
