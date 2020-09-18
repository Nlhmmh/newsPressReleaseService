package com.jp.sense.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrLogin1004Controller {
	
	@RequestMapping("/login/comp")
	public String toCompLoginPage () {
		
		return "pr-login-1004.html";
	}

}
