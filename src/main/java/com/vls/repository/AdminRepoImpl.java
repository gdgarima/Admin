package com.vls.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vls.pojo.Admin;

@Repository
public class AdminRepoImpl implements AdminRepo {
	
	@Autowired
	EntityManager eMan;



	@Override
	public List<Admin> getAdmin() {

		List<Admin> ad=eMan.createQuery("from Admin").getResultList();
		return ad;
	}



	@Override
	public Admin searchAdmin(int adminId) {
		// TODO Auto-generated method stub
		Object obj=eMan.find(Admin.class, adminId);
		if(obj==null) {
			return null;
		}
		return (Admin)obj;
	}

}
