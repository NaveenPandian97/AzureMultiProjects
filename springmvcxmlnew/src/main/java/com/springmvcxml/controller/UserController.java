package com.springmvcxml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcxml.model.User;
import com.springmvcxml.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/user")
	public ModelAndView userPage() {
		ModelAndView mv = new ModelAndView("adduser");
		List<User> userList = service.getAllUser();
		mv.addObject("userList",userList);
		mv.addObject("message","Welcome to User Profile Page");
		return mv;
	}
	
//	@RequestMapping(method=RequestMethod.POST,value="/register")
//	public ModelAndView addUser(@RequestParam("firstName") String firstName,
//			@RequestParam("lastName") String lastName,
//			@RequestParam("pass") String pass,
//			@RequestParam("confirmPass") String confirmPass,
//			@RequestParam("emailId") String emailId) {
//		User user = new User(firstName, lastName, pass, confirmPass, emailId);
//		System.out.println(user);
//		boolean result = service.addUser(user);
//		String msg = (result) ? "User added Successfully" : "User not added";
//		ModelAndView mv = new ModelAndView("adduser");
//		mv.addObject("msg", msg);
//		return mv;
//	}
	
//	@RequestMapping(method=RequestMethod.POST,value="/register")
//	public ModelAndView addUser(HttpServletRequest request) {
//		
//		String firstName = request.getParameter("firstName");
//		String lastName= request.getParameter("lastName");
//		String pass= request.getParameter("pass");
//		String confirmPass= request.getParameter("confirmPass");
//		String emailId= request.getParameter("emailId");
//		
//		User user = new User(firstName, lastName, pass, confirmPass, emailId);
//		System.out.println(user);
//		boolean result = service.addUser(user);
//		String msg = (result) ? "User added Successfully" : "User not added";
//		ModelAndView mv = new ModelAndView("adduser");
//		mv.addObject("msg", msg);
//		
//		List<User> userList = service.getAllUser();
//		mv.addObject("userList",userList);
//		mv.addObject("message","Welcome to User Profile Page");
//		return mv;
//	}
	
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String addUser(HttpServletRequest request) {
		
		String firstName = request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		String pass= request.getParameter("pass");
		String confirmPass= request.getParameter("confirmPass");
		String emailId= request.getParameter("emailId");
		
		User user = new User(firstName, lastName, pass, confirmPass, emailId);
		System.out.println(user);
		boolean result = service.addUser(user);
		return "redirect:/user";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/delete")
	public String deleteUser(@RequestParam("emailId") String emailId) {
		boolean result = service.deleteUser(emailId);
		return "redirect:/user";
	}


}
