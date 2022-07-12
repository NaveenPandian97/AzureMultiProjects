package com.springmvcxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvcxml.dao.UserDao;
import com.springmvcxml.model.User;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public boolean deleteUser(String emailId) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(emailId);
	}

}
