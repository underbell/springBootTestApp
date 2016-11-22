package com.underbell.springBootTestApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.underbell.springBootTestApp.vo.User;

@Controller
public class UserController {
	
	@PostMapping("/create")
	public String create(User user)	{
		return "index";
	}
	
}
