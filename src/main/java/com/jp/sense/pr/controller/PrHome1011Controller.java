package com.jp.sense.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * --会社概要
 * --表示
 * 
 * @author テイ
 *
 */
@Controller
public class PrHome1011Controller {
	
	@RequestMapping("/info/")
	public String toCompanyInfo () {
		
		return "pr-home-1011.html";
	}

}
