package com.jp.sense.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.entity.Company;
import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.util.UserManager;

@Controller
public class PrHome1032Controller {

	@RequestMapping("/company/index")
	public String toCompIndex () {
		
		System.out.println("*******************企業管理画面");
		
		// Controllerでログインユーザの取得方法
		CompUserDetails loginUser = UserManager.getLoginUser(CompUserDetails.class);
		System.out.println(loginUser.getName());
		
		// Controllerでログインの企業の取得
		Company comp = UserManager.getLoginCompany();
		System.out.println("企業："+comp);
		
		return "pr-home-1032.html";
	}
	
}
