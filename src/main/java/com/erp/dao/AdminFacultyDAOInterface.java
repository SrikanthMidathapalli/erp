package com.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.erp.entity.FacultyData;
import com.erp.entity.StudentData;

public interface AdminFacultyDAOInterface extends JpaRepository<FacultyData, Long> {
	

}
