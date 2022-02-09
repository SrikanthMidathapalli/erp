package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.dao.AddressDAOInterface;
import com.erp.dao.AdminDAOInterface;
import com.erp.dao.AdminFacultyDAOInterface;
import com.erp.dao.AdminStudentDAOInterface;
import com.erp.dao.TimeTableDAOInterface;
import com.erp.entity.Address;
import com.erp.entity.FacultyData;
import com.erp.entity.StudentData;
import com.erp.entity.TimeTable;

@Service
@Transactional
public class AdminService implements AdminServiceInterface {

	@Autowired(required = true)
	private AdminDAOInterface adi;
	@Autowired(required = true)
	private AdminStudentDAOInterface add;
	@Autowired(required = true)
	private AdminFacultyDAOInterface sd;
	@Autowired(required = true)
	private AddressDAOInterface addr;
	@Autowired(required = true)
	private TimeTableDAOInterface ttable;

	@Override
	public StudentData loginService(long tmp_EmailId, String tmp_Pass) {
		return adi.logindao(tmp_EmailId,tmp_Pass);
	}

	@Override
	public int AddStudentService(StudentData de) {
		add.save(de);
		return 1;
	}

	@Override
	public List<StudentData> showStudentService() {
		return add.findAll();

	}

	@Override
	public int updateStudentService(StudentData fb) {
		add.saveAndFlush(fb);
		return 1;
	}

	@Override
	public void deleteStudentService(StudentData de) {
		add.delete(de);
		
	}

	@Override
	public int AddFacultyService(FacultyData se) {
		sd.save(se);
		return 1;
	}

	@Override
	public List<FacultyData> showFacultyService() {
		return sd.findAll();
	}

	@Override
	public int updateFacultyService(FacultyData sdd) {
		sd.saveAndFlush(sdd);
		return 1;
	}

	@Override
	public void deleteFacultyService(FacultyData se) {
		sd.delete(se);
		
	}

	@Override
	public Address assginfacultyToStudentService(long tmp_areaCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int AddAddressService(Address de) {
		addr.save(de);
		return 1;
	}

	@Override
	public List<Address> showAddressService() {
		return addr.findAll();
	}

	@Override
	public int updateAddressService(Address fb) {
		addr.saveAndFlush(fb);
		return 1;
	}

	@Override
	public void deleteAddressService(Address de) {
		addr.delete(de);
	}

	@Override
	public int AddTimetableService(TimeTable se) {
		ttable.save(se);
		return 1;
	}

	@Override
	public List<TimeTable> showTimeTableService() {
		return ttable.findAll();
	}

	@Override
	public int updateTimetableService(TimeTable sdd) {
		ttable.saveAndFlush(sdd);
		return 1;
	}

	@Override
	public void deleteTimeTableService(TimeTable se) {
		ttable.delete(se);
		
	}

}
