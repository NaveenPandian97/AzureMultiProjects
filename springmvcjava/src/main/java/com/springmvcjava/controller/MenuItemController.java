package com.springmvcjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvcjava.model.MenuItem;
import com.springmvcjava.service.MenuItemService;

@Controller
@RequestMapping("/menuItem/*")
public class MenuItemController {
	
	@Autowired
	MenuItemService service;
	
	@RequestMapping({"/","/home"})
	public String homePage(ModelMap map) {
		map.addAttribute("msg","Welcome to SpringMVC - Java");
		map.addAttribute("menuItemList", service.getAllMenuItem());
		return "display";
	}
	
	@RequestMapping({"/add"})
	public String displayAddPage(ModelMap map) {
		map.addAttribute("menuItem", new MenuItem());
		return "addMenuItem";
	}
	
	@RequestMapping({"/save"})
	public String saveMenuItem(ModelMap map,@ModelAttribute("menuItem")MenuItem menuItem) {
		boolean result=service.addMenuItem(menuItem);
		if(result) {
			map.addAttribute("msg1","MenuItem Added Successfully");
		}
		else {
			map.addAttribute("errMsg", "Invalid MenuItem Id");
			map.addAttribute("msg1", "MenuItem Not added");
		}
		return "addMenuItem";
	}


}
