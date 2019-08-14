package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.User;

public interface UserController {

		 public String insertUser(User user) throws ClassNotFoundException, SQLException;
	     public User updateUser(User user);
	     public List<User> getUserList();
	

}
