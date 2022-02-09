import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { FacultyloginComponent } from './faculty/facultylogin/facultylogin.component';
import { StudentloginComponent } from './student/studentlogin/studentlogin.component';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { AddfacultyComponent } from './faculty/addfaculty/addfaculty.component';
import { ViewfacultyComponent } from './faculty/viewfaculty/viewfaculty.component';
import { EditstudentComponent } from './student/editstudent/editstudent.component';
import { AddstudentComponent } from './student/addstudent/addstudent.component';
import { ViewstudentComponent } from './student/viewstudent/viewstudent.component';
import { EditfacultyComponent } from './faculty/editfaculty/editfaculty.component';

const routes: Routes = [
  {path:"adminhome", component:AdminhomeComponent},
  {path:"facultylogin", component:FacultyloginComponent},
  {path:"studentlogin", component:StudentloginComponent},
  {path:"adminlogin", component:AdminloginComponent},

  {path:"viewfaculty", component:ViewfacultyComponent},
  {path:"editstudent", component: EditstudentComponent},
  {path:"addstudent", component:AddstudentComponent},
  {path:"viewstudent", component:ViewstudentComponent},
  {path:"addfaculty", component:AddfacultyComponent},
  {path:"editfaculty", component:EditfacultyComponent},

 
  
 


  

  



  
  

  

  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
