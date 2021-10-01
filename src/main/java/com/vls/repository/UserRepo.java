package com.vls.repository;

import java.util.List;

import com.vls.pojo.User;

public interface UserRepo {
	
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int userId);
	public User getUser(int userId);
	public List<User> getAllUser();

}