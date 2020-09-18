package com.jp.sense.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.security.MediaUserDetails;
import com.jp.sense.pr.util.UserManager;

@Controller
public class PrMedia1035Controller {

	@RequestMapping("/media/index")
	public String toCompIndex () {
		
		System.out.println("*******************個人・メディア管理画面");
		
		MediaUserDetails loginUser = UserManager.getLoginUser(MediaUserDetails.class);
		
		System.out.println(loginUser.getName());
		
		return "pr-media-1035.html";
	}
	
}
