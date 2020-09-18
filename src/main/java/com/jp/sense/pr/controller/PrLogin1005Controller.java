package com.jp.sense.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrLogin1005Controller {
	
	@RequestMapping("/login/receiver")
	public String toCompLoginPage () {
		
		return "pr-login-1005.html";
	}

}
