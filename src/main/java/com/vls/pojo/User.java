package com.vls.pojo;



import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "vls_tb_User")
public class User {

@Id
@Column(name="userid")
//@GeneratedValue(strategy=GenerationType.AUTO)
private int userId;

@Column(name="username")
private String userName;

@Temporal(TemporalType.DATE)
private Date dob;

private String gender;
private String password;
private String address;

@Column(name="emailid")
private String emailId;

@Column(name="mobileno")
private String mobileNo;

public int getUserId() {
return userId;
}
public void setUserId(int userId) {
this.userId = userId;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
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

public User() {
super();
}
public User(int userId, String userName, Date dob, String gender, String password, String address, String emailId,
String mobileNo) {
super();
this.userId = userId;
this.userName = userName;
this.dob = dob;
this.gender = gender;
this.password = password;
this.address = address;
this.emailId = emailId;
this.mobileNo = mobileNo;
}

@Override
public String toString() {
return "User [userId=" + userId + ", userName=" + userName + ", dob=" + dob + ", gender=" + gender
+ ", password=" + password + ", address=" + address + ", emailId=" + emailId + ", mobileNo=" + mobileNo
+ "]";
}
}
