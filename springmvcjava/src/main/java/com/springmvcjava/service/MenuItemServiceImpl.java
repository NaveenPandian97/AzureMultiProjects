package com.springmvcjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcjava.model.MenuItem;
import com.springmvcjava.repository.MenuItemDao;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	@Autowired
	private MenuItemDao menuItemDao;
	
	@Override
	public List<MenuItem> getAllMenuItem() {
		// TODO Auto-generated method stub
		return menuItemDao.getAllMenuItem();
	}

	@Override
	public boolean addMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(menuItemDao.isMenuItemIdExist(menuItem.getMenuItemId())==false) {
			result = menuItemDao.addMenuItem(menuItem);
		}
		return result;
	}

}
