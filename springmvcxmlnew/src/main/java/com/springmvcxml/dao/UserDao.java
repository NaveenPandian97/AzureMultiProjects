package com.springmvcxml.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springmvcxml.model.User;

@Component
public class UserDao {
	
	private static List<User> userList;
	
	public UserDao() {
		userList= new ArrayList<>();
		userList.add(new User("Naveen","Pandian","12345","12345","naveen@gmail.com"));
	}
	
	public boolean addUser(User user) {
		userList.add(user);
		return true;
	}
	
	public List<User> getAllUser() {
		return userList;
	}
	
	public boolean deleteUser(String emailId) {
		return userList.removeIf(d-> d.getEmailId().equalsIgnoreCase(emailId));
	}

}
