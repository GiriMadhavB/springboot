package com.wipro.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/home") 
	//@ResponseBody
	public String home() {

		System.out.println("hai this states city ");

		return "home";
	}


}
