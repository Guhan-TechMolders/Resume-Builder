package com.resume.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long userId;
private String userName;
@Column(unique=true)
private String userEmail;
private String password;
private String Role;
@Column(unique=true)
private String phoneNumber;
public Login(long userId, String userName, String userEmail, String password, String role, String phoneNumber) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userEmail = userEmail;
	this.password = password;
	Role = role;
	this.phoneNumber = phoneNumber;
}
public Login() {
	super();
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

}
