package com.vls.pojo;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "vls_tb_Admin")
public class Admin {
	
	@Id
	@Column(name="adminid")
	private int adminId;
	@Column(name="adminname")
	private String adminName;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name="gender")
	private String gender;
	@Column(name="password")
	private String password;
	@Column(name="address")
	private String address;
	@Column(name="emailid")
	private String emailId;
	@Column(name="mobileno")
	private String mobileNo;
	
	
	
	@Override
	public String toString() {
		return "vls_tb_Admin [adminId=" + adminId + ", adminName=" + adminName + ", dob=" + dob + ", gender=" + gender
				+ ", password=" + password + ", address=" + address + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ "]";
	}
	public Admin(int adminId, String adminName, Date dob, String gender, String password, String address,
			String emailId, String mobileNo) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.dob = dob;
		this.gender = gender;
		this.password = password;
		this.address = address;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	

}

