package com.erp.service;

import java.util.List;

import com.erp.entity.Address;
import com.erp.entity.FacultyData;
import com.erp.entity.StudentData;
import com.erp.entity.TimeTable;

public interface AdminServiceInterface {

	StudentData loginService(long tmp_EmailId, String tmp_Pass);

	int AddStudentService(StudentData de);

	List<StudentData> showStudentService();

	int updateStudentService(StudentData fb);

	void deleteStudentService(StudentData de);

	int AddFacultyService(FacultyData se);

	List<FacultyData> showFacultyService();

	int updateFacultyService(FacultyData sdd);

	void deleteFacultyService(FacultyData se);

	Address assginfacultyToStudentService(long tmp_areaCode);

	int AddAddressService(Address de);

	List<Address> showAddressService();

	int updateAddressService(Address fb);

	void deleteAddressService(Address de);

	int AddTimetableService(TimeTable se);

	List<TimeTable> showTimeTableService();

	int updateTimetableService(TimeTable sdd);

	void deleteTimeTableService(TimeTable se);

}
