package com.simplilearn.webservice.phase3springwebservice07042022.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String indexMapping() {
		return "Welcome to Spring Boot development, Server is up and running!";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
	public String helloMapping() {
		return "Hello Everyone! Welcome to web service Learning!";
	}
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	@ResponseBody
	public String hiMapping(@RequestParam("name") String name) {
		return "Hi, "+name+" welcome to web service learning! ";
	}
}