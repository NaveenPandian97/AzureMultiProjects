package com.springmvcjava.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springmvcjava.model.MenuItem;

@Component
public class MenuItemDao {
	
	private static List<MenuItem> menuItemList;
	
	public MenuItemDao() {
		if(menuItemList==null) {
			menuItemList = new ArrayList<MenuItem>();
			menuItemList.add(new MenuItem(1, "Chicken Fried Rice", "Main Course", 150));
			menuItemList.add(new MenuItem(2, "Chicken Grill", "Starter", 300));
			menuItemList.add(new MenuItem(3, "Ice Cream", "Dessert", 50));
		}
	}
	
	public List<MenuItem> getAllMenuItem() {
		return menuItemList;
	}
	
	public boolean addMenuItem(MenuItem menuItem) {
		menuItemList.add(menuItem);
		return true;
	}
	
	public boolean isMenuItemIdExist(int id) {
		return menuItemList.stream().anyMatch(m-> m.getMenuItemId()==id);
	}

}
