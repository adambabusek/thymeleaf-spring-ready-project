package com.thymeleafspringready.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public String exampleView(ModelMap model) {
		model.addAttribute("name", "World");
		return "example";
	}
}
