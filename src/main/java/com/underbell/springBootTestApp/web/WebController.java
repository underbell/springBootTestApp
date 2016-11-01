package com.underbell.springBootTestApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping("/welcome")
	public String welcome(String name, int age, Model model)	{
		System.out.println("____ name = " + name + " , age = " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome";
	}
}
