package com.vls.service;

import java.util.List;

import com.vls.pojo.Status;

public interface StatusService {
	
	public boolean addStatus(Status status);
	public boolean updateStatus(Status status,int userId);
	public Status getStatus(int userId);
	public List<Status> getAllStatus();
	public List<Status> searchByStatus(String appStatus);
	public List<Status> searchByAdmin(int adminId);

}