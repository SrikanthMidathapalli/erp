package com.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.dao.AdminDAOInterface;
import com.erp.dao.AdminLoginDAOInterface;
import com.erp.entity.AdminLogin;
@Service
@Transactional
public class AdminLoginService implements AdminLoginServiceInterface{

	@Autowired(required = true)
	private AdminLoginDAOInterface adi;
	@Override
	public AdminLogin adminLoginService(String tmp_EmailId, String tmp_Pass) {
		return adi.logindao(tmp_EmailId,tmp_Pass);
	}

}
