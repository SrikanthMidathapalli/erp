package com.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.Department;

@Repository
public interface DepatmentDAOInterface extends JpaRepository<Department, Long>{

}