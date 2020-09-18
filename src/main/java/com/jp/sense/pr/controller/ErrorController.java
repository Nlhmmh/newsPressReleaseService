package com.jp.sense.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	
	@RequestMapping("/errorPage")
	public String error(String msg,Model m) {
		
		return "error-page.html";
	}
}
