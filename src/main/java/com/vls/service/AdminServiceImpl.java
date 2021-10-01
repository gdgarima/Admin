package com.vls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vls.pojo.Admin;
import com.vls.repository.AdminRepo;

@Service 
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepo adrp;

	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return adrp.getAdmin();
	}

	@Override
	public Admin searchAdmin(int adminId) {
		// TODO Auto-generated method stub
		return adrp.searchAdmin(adminId);
	}
	
	

}
