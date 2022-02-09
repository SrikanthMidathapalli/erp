import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShareComponent } from './share/share.component';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { StudentloginComponent } from './student/studentlogin/studentlogin.component';
import { FacultyloginComponent } from './faculty/facultylogin/facultylogin.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { StudenthomeComponent } from './student/studenthome/studenthome.component';
import { FacultyhomeComponent } from './faculty/facultyhome/facultyhome.component';
import { AddfacultyComponent } from './faculty/addfaculty/addfaculty.component';
import { ViewfacultyComponent } from './faculty/viewfaculty/viewfaculty.component';
import { AddstudentComponent } from './student/addstudent/addstudent.component';
import { FormsModule } from '@angular/forms';
import { ViewstudentComponent } from './student/viewstudent/viewstudent.component';
import { HttpClientModule } from '@angular/common/http';
import { EditstudentComponent } from './student/editstudent/editstudent.component';
import { DeletestudentComponent } from './student/deletestudent/deletestudent.component';
import { EditfacultyComponent } from './faculty/editfaculty/editfaculty.component';
import { DeletefacultyComponent } from './faculty/deletefaculty/deletefaculty.component';
import { LandingComponent } from './landing/landing.component';

@NgModule({
  declarations: [
    AppComponent,
    ShareComponent,
    AdminloginComponent,
    StudentloginComponent,
    FacultyloginComponent,
    AdminhomeComponent,
    StudenthomeComponent,
    FacultyhomeComponent,
    AddfacultyComponent,
    ViewfacultyComponent,
    AddstudentComponent,
    ViewstudentComponent,
    EditstudentComponent,
    DeletestudentComponent,
    EditfacultyComponent,
    DeletefacultyComponent,
    LandingComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
