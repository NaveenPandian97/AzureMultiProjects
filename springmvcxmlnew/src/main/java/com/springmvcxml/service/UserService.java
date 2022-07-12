package com.springmvcxml.service;

import java.util.List;

import com.springmvcxml.model.User;

public interface UserService {
	
	public List<User> getAllUser();
	
	public boolean addUser(User user);
	
	public boolean deleteUser(String emailId);

}
