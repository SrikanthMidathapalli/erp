package com.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.erp.entity.Address;
import com.erp.entity.AdminLogin;
import com.erp.entity.FacultyData;
import com.erp.entity.StudentData;
import com.erp.entity.TimeTable;
import com.erp.service.AdminLoginServiceInterface;
import com.erp.service.AdminServiceInterface;

public class AdminLoginController {

	@Autowired
	private  AdminLoginServiceInterface ts;
	AdminLogin admin;
	@PostMapping("AdminLogincred")
	public String adminLoginlogic(@RequestBody AdminLogin rd) throws Exception
	{
		String tmp_EmailId=rd.getEmail();
		String tmp_Pass=rd.getPassword();  

		if(tmp_EmailId !=null && tmp_Pass!=null)
		{
			admin=ts.adminLoginService(tmp_EmailId,tmp_Pass);
		}
		
		if(admin!=null)
		{
		return "Admin Signed In Successfully";
		}
		else
		{
		 throw new Exception("login failed");
		}

	}
}