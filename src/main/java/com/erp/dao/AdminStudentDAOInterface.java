package com.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.erp.entity.Address;
import com.erp.entity.StudentData;


public interface AdminStudentDAOInterface extends JpaRepository<StudentData, Long> {

	void save(Address de);

	void saveAndFlush(Address fb);
	
}
