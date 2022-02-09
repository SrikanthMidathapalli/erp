package com.erp.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.entity.Department;
import com.erp.service.DepartmentServiceInterface;


@RestController
public class DepartmentController {
	@Autowired(required = true)
	private DepartmentServiceInterface sf;
	
	private Logger log=Logger.getLogger("DepartmentController");
		
	@PostMapping("createdepartment1")
	public String createDepartment(@RequestBody Department d) {
		
		log.info("inside create department method at "+LocalDate.now());
		
		int i=sf.createProfileService(d);
		if(i>0) {
			return "department created";
		}
		else {
			return "could not create department";
		}
	}
	@GetMapping("ShowDepartment")
	public List<Department> showDepartment(){
		List<Department> ll=sf.showDepartmentService();
		return ll;
	}
		@PutMapping("UpdateDepartment1/{d_id}")
		public String updateDepartment(@PathVariable("d_id") Long d_id,@RequestBody Department fb) {
			fb.setD_id(d_id);
			int i=sf.updateDepartmentService(fb);
			return "Updated Department Details";
		}
	
}
