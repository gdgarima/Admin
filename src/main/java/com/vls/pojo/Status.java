package com.vls.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "vls_tb_Status")
public class Status implements Serializable {
	
	@Id
	@Column(name="statusid")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int statusId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")	
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adminid")
	private Admin admin;
	
	@Column(name="appstatus")
	private String appStatus;
	
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getAppStatus() {
		return appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	
	public Status() {
		super();
	}
	public Status(int statusId, User user, Admin admin, String appStatus) {
		super();
		this.statusId = statusId;
		this.user = user;
		this.admin = admin;
		this.appStatus = appStatus;
	}
	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", user=" + user + ", admin=" + admin + ", appStatus=" + appStatus
				+ "]";
	}
}