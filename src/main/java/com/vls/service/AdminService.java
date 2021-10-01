package com.vls.service;

import java.util.List;

import com.vls.pojo.Admin;

public interface AdminService {
	
	public List<Admin> getAdmin();
	public Admin searchAdmin(int adminId);

}
