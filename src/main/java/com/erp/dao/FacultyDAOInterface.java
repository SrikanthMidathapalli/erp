package com.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.FacultyData;
@Repository
public interface FacultyDAOInterface extends JpaRepository<FacultyData, Long> {

}
