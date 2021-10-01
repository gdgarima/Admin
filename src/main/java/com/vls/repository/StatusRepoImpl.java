package com.vls.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vls.pojo.Admin;
import com.vls.pojo.Status;
import com.vls.pojo.User;

@Repository
public class StatusRepoImpl implements StatusRepo {

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addStatus(Status status) {
		/*
		System.out.println(status.getUser().getUserId());
		System.out.println(status.getAppStatus());
		System.out.println(status.getAdmin().getAdminId());
		*/
		eMan.merge(status);
		return true;
	}

	@Override
	public boolean updateStatus(Status status, int userId) {
		User obj=eMan.find(User.class,userId);
		status.setUser(obj);
		eMan.merge(status);
		return true;
	}

	@Override
	public Status getStatus(int userId) {
		Status status = eMan.find(Status.class, userId);
		return status;
	}
	
	@Override
	public List<Status> getAllStatus(){
		List<Status> statuses = eMan.createQuery("from Status").getResultList();
		return statuses;
	}

	@Override
	public List<Status> searchByStatus(String appStatus) {
		 Query  q = eMan.createQuery("select s from Status s where s.appStatus=:appStatus");
		 q.setParameter("appStatus", appStatus);
		 List <Status> statuses = q.getResultList();
		return statuses;
	}

	@Override
	public List<Status> searchByAdmin(int adminId) {
		Admin admin = eMan.find(Admin.class, adminId);
		Query q = eMan.createQuery("select s from Status s where s.admin=:admin");
		q.setParameter("admin",admin);
		List <Status> statuses = q.getResultList();
		System.out.println(statuses);
		return statuses;
	}

}
