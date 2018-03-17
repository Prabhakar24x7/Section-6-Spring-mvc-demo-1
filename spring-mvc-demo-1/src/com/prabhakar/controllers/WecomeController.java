package com.prabhakar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WecomeController {
	
	@RequestMapping(value="/")
	public String welcome(){
		return "welcome";
	}

}
