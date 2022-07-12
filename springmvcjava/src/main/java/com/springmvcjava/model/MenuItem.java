package com.springmvcjava.model;

public class MenuItem {
	
	private int menuItemId;
	private String menuItemName;
	private String category;
	private int price;
	public MenuItem() {
		// TODO Auto-generated constructor stub
	}
	public MenuItem(int menuItemId, String menuItemName, String category, int price) {
		super();
		this.menuItemId = menuItemId;
		this.menuItemName = menuItemName;
		this.category = category;
		this.price = price;
	}
	
	public int getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(int menuItemId) {
		this.menuItemId = menuItemId;
	}
	public String getMenuItemName() {
		return menuItemName;
	}
	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MenuItem [menuItemId=" + menuItemId + ", menuItemName=" + menuItemName + ", category=" + category
				+ ", price=" + price + "]";
	}
	

}
