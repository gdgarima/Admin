package com.vls.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vls.pojo.Status;
import com.vls.repository.StatusRepo;

@Service
@Transactional
public class StatusServiceImpl implements StatusService {

	@Autowired
	StatusRepo srepo;
	
	@Override
	public boolean addStatus(Status status) {
		return srepo.addStatus(status);
	}

	@Override
	public boolean updateStatus(Status status,int userId) {
		return srepo.updateStatus(status,userId);
	}

	@Override
	public Status getStatus(int userId) {
		return srepo.getStatus(userId);
	}
	
	@Override
	public List<Status> getAllStatus() {
		return srepo.getAllStatus();
	}

	@Override
	public List<Status> searchByStatus(String appStatus) {
		return srepo.searchByStatus(appStatus);
	}

	@Override
	public List<Status> searchByAdmin(int adminId) {
		return srepo.searchByAdmin(adminId);
	}

}

