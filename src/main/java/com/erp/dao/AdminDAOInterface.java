package com.erp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.entity.FacultyData;
import com.erp.entity.StudentData;

	@Repository
	public interface AdminDAOInterface extends JpaRepository<StudentData, Long>{
		@Query("from  com.erp.entity.FacultyData  f where f.f_id=:em and f.password=:pw")
		 public StudentData logindao(@Param("em") long tmp_EmailId,@Param("pw") String tmp_Pass);

}
