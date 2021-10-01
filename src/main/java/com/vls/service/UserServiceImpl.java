package com.vls.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vls.pojo.User;
import com.vls.repository.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo urepo;
	
	@Override
	public boolean addUser(User user) {
		return urepo.addUser(user);	
	}

	@Override
	public boolean updateUser(User user) {
		return urepo.updateUser(user);
	}

	@Override
	public boolean deleteUser(int userId) {
		return urepo.deleteUser(userId);
	}

	@Override
	public User getUser(int userId) {
		return urepo.getUser(userId);
	}

	@Override
	public List<User> getAllUser() {
		return urepo.getAllUser();
	}
}