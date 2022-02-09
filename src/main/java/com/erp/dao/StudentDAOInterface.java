package com.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.StudentData;
@Repository
public interface StudentDAOInterface extends JpaRepository<StudentData, Long> {

}
