package com.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.dao.DepatmentDAOInterface;
import com.erp.entity.Department;


@Service
@Transactional
public class DepartmentService  implements  DepartmentServiceInterface{
	@Autowired(required = true)
	private DepatmentDAOInterface fd;
	
	public int createProfileService(Department d) {
		fd.save(d);
		return 1;
	}
	public List<Department> showDepartmentService() {

		return fd.findAll();
	}
	
	public int updateDepartmentService(Department fb) {
		fd.saveAndFlush(fb);
		return 1;
	}
}