package com.springmvcjava.service;

import java.util.List;

import com.springmvcjava.model.MenuItem;

public interface MenuItemService {
	
	public List<MenuItem> getAllMenuItem();
	public boolean addMenuItem(MenuItem menuItem) ;

}
