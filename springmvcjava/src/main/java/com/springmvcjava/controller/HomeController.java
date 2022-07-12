package com.springmvcjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePage(ModelMap map) {
		map.addAttribute("msg","Welcome to SpringMVC - Java");
		return "home";
	}

}
