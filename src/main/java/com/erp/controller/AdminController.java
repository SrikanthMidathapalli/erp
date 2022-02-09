package com.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.entity.Address;
import com.erp.entity.Department;
import com.erp.entity.FacultyData;
import com.erp.entity.StudentData;
import com.erp.entity.TimeTable;
import com.erp.service.AdminServiceInterface;

@RestController
public class AdminController {

	@Autowired
	private  AdminServiceInterface ts;
	
	StudentData ru;
	FacultyData du;
	Address su;
	TimeTable tt;
	

	@PostMapping("adminLogin1")
	//adminLogin
	public String adminLogin(@RequestBody FacultyData rd) throws Exception
	{
		long tmp_EmailId=rd.getF_id();
		String tmp_Pass=rd.getPassword();  

		if(tmp_EmailId !=0 && tmp_Pass!=null)
		{
			ru=ts.loginService(tmp_EmailId,tmp_Pass);
		}
		
		if(ru!=null)
		{
		return "User Signed In Successfully";
		}
		else
		{
		 throw new Exception("login failed");
		}
	}

	@PostMapping("AddStudent")
	public String AddStudent(@RequestBody StudentData de) {


		int i=ts.AddStudentService(de);
		if(i>0) {
			return " Student Added Successfully";
		}
		else {
			return "could not Add Student";
		}
	}

	@GetMapping("ShowStudent")
	public List<StudentData> showStudents(){
		List<StudentData> ll=ts.showStudentService();
		return ll;
	}
	
	@PutMapping("UpdateStudent/{s_id}")
	public String updateDealer(@PathVariable("s_id") long userid,@RequestBody StudentData fb) {
		fb.setS_id(userid);
		int i=ts.updateStudentService(fb);
		return "Updated Student Details";
	}
	
	@DeleteMapping("deleteStudent/{s_id}")
	public String deleteStudent(@PathVariable("s_id") int userid) {
		StudentData de=new StudentData();
		de.setS_id(userid);
		ts.deleteStudentService(de);
		return "Dealer deleted";
	}
	
	@PostMapping("AddFaculty")
	public String AddShop(@RequestBody FacultyData se) {
		int i=ts.AddFacultyService(se);
		if(i>0) {
			return " Faculty Added Successfully";
		}
		else {
			return "could not Add Faculty";
		}
	}
	
		@GetMapping("ShowFaculty")
		public List<FacultyData> showShops(){
			List<FacultyData> ll=ts.showFacultyService();
			return ll;
		}
		
		@PutMapping("UpdateFaculty/{f_id}")
		public String updateFaculty(@PathVariable("f_id") int userid,@RequestBody FacultyData sdd) {
			sdd.setF_id(userid);
			int i=ts.updateFacultyService(sdd);
			return "Updated Shop Deatils";
		}
		
		@DeleteMapping("deleteFaculty/{f_id}")
		public String deleteFaculty(@PathVariable("f_id") int userid) {
			FacultyData se=new FacultyData();
			 se.setF_id(userid);
			ts.deleteFacultyService(se);
			return "Faculty deleted";
		}
		
		
		@PostMapping("AssginFacultyToStudents")
		public String assginFacultyToStudent(@RequestBody FacultyData see) throws Exception
		{
			long tmp_areaCode=see.getF_id();
			if(tmp_areaCode != 0)
			{
				su=ts.assginfacultyToStudentService(tmp_areaCode);
			}
			
			if(su!=null)
			{
			return "Assigned Faculty to Students Successfully";
			}
			else
			{
			 throw new Exception("assigned failed");
			}
		}
		@PostMapping("AddAddress")
		public String AddAddress(@RequestBody Address de) {


			int i=ts.AddAddressService(de);
			if(i>0) {
				return " Address Added Successfully";
			}
			else {
				return "could not Add Address";
			}
		}

		@GetMapping("ShowAddress")
		public List<Address> showAddress(){
			List<Address> ll=ts.showAddressService();
			return ll;
		}
		
		@PutMapping("UpdateAddress/{a_id}")
		public String updateAddress(@PathVariable("a_id") long userid,@RequestBody Address fb) {
			fb.setA_id(userid);
			int i=ts.updateAddressService(fb);
			return "Updated Address Details";
		}
		
		@DeleteMapping("deleteAddress/{a_id}")
		public String deleteAddress(@PathVariable("a_id") int userid) {
			Address de=new Address();
			de.setA_id(userid);
			ts.deleteAddressService(de);
			return "Address deleted";
		}
		
		@PostMapping("AddTimeTable")
		public String Addtimetable(@RequestBody TimeTable se) {
			int i=ts.AddTimetableService(se);
			if(i>0) {
				return " Time Table Added Successfully";
			}
			else {
				return "could not Add Time Table";
			}
		}
		
			@GetMapping("ShowTimeTable")
			public List<TimeTable> showTimetable(){
				List<TimeTable> ll=ts.showTimeTableService();
				return ll;
			}
			
			@PutMapping("UpdateTimeTable/{setSerial_number}")
			public String updateFaculty(@PathVariable("setSerial_number") int userid,@RequestBody TimeTable sdd) {
				sdd.setSerial_number(userid);
				int i=ts.updateTimetableService(sdd);
				return "Updated Time Table  Deatils";
			}
			
			@DeleteMapping("deleteTimeTable/{setSerial_number}")
			public String deleteTimeTable(@PathVariable("setSerial_number") int userid) {
				TimeTable se=new TimeTable();
				 se.setSerial_number(userid);
				ts.deleteTimeTableService(se);
				return "Time Table deleted";
			}
			
		
}