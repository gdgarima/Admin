package com.vls.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vls.pojo.User;

@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addUser(User user) {
		eMan.persist(user);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		eMan.merge(user);
		return true;
	}

	@Override
	public boolean deleteUser(int userId) {
		User user = eMan.find(User.class,userId);
		eMan.remove(user);
		return true;
	}

	@Override
	public User getUser(int userId) {
		User user = eMan.find(User.class, userId);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> users = eMan.createQuery("from User").getResultList();
		return users;
	}

}
