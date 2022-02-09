package com.erp.service;

import java.util.List;

import com.erp.entity.Department;

public interface DepartmentServiceInterface {

	int createProfileService(Department d);

	List<Department> showDepartmentService();

	int updateDepartmentService(Department fb);

}
