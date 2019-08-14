package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

@Id
private int id;
@Column(name="username")
  private String username;
@Column(name="password")
  private String password;
@Column(name="usertype")
  private String userType;
@Column(name="email")
  private String email;
@Column(name="mobilenumber")
  private int mobileNumber;
@Column(name="confirmed")
  private byte confirmed;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber =  mobileNumber;
}
public byte getConfirmed() {
	return confirmed;
}
public void setConfirmed(byte confirmed) {
	this.confirmed = confirmed;
}

  
}
