package com.vls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vls.pojo.Status;
import com.vls.service.StatusService;

@RestController
@RequestMapping("/api/rest/status")
@CrossOrigin(origins = "http://localhost:4200")
public class StatusController {
	
	@Autowired
	StatusService sservice;
	
	@GetMapping("/getAllStatus")
	public List<Status> getAllStatus() {
		return sservice.getAllStatus();
	}
	
	@GetMapping("/getStatus/{userId}")
	public Status getStatus(@PathVariable(name="userId")int userId) {
		return sservice.getStatus(userId);
	}
	
	@PostMapping("/addStatus")
	public boolean addStatus(@RequestBody Status status) {
		return sservice.addStatus(status);
	}
	
	@PutMapping("/updateStatus/{userId}")
	public boolean updateStatus(@RequestBody Status status,@PathVariable(name="userId")int userId) {
		
		System.out.println(status);
		System.out.println(userId);
		return sservice.updateStatus(status,userId);
	}
	
	@GetMapping("/searchByStatus/{appStatus}")
	public List<Status> searchByStatus(@PathVariable(name="appStatus") String appStatus){
		return sservice.searchByStatus(appStatus);
	}

	@GetMapping("/searchByAdmin/{adminId}")
	public List<Status> searchByAdmin(@PathVariable(name="adminId") int adminId){
		return sservice.searchByAdmin(adminId);
	}

}

