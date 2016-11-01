package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {

	@RequestMapping(value = "login")
	public String login()
	{
		return "system/login";
	}
	
	@RequestMapping(value = "")
	public String index()
	{
		return "index";
	}
	
}
