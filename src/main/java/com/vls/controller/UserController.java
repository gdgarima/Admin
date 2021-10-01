package com.vls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vls.pojo.User;
import com.vls.service.UserService;

@RestController
@RequestMapping("/api/rest/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	UserService uservice;

	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable(name="userId") int userId){
		return uservice.getUser(userId);
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return uservice.getAllUser();
	}
	
	@PostMapping("/addUser")
	public boolean addUser(@RequestBody User user){
		return uservice.addUser(user);
	}
	
	@PutMapping("/updateUser")
	public boolean updateUser(@RequestBody User user) {
		return uservice.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public boolean deleteUser(@PathVariable(name="userId") int userId) {
		return uservice.deleteUser(userId);
	}
}


