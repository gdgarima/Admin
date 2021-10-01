package com.vls.repository;

import java.util.List;



import com.vls.pojo.Admin;


public interface AdminRepo {
	
	public List<Admin> getAdmin();
	public Admin searchAdmin(int adminId);

}
