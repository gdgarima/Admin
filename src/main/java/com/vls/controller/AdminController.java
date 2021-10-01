package com.vls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vls.pojo.Admin;
import com.vls.service.AdminService;

@RestController
@RequestMapping("/api/rest/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	@Autowired
	AdminService adsr;
	
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin(){
		 return adsr.getAdmin();
	}
	
	@GetMapping("/adminId/{adminId}")
	public Admin searchAdmin(@PathVariable(name="adminId") int adminId)
	{
		return adsr.searchAdmin(adminId);
		
	}

}
