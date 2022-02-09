package com.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.TimeTable;
@Repository
public interface TimeTableDAOInterface extends JpaRepository<TimeTable, Integer> {

}
