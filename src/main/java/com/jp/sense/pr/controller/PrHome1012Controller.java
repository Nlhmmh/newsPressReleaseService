package com.jp.sense.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * --利用規約
 * 
 * @author テイ
 *
 */
@Controller
public class PrHome1012Controller {
	
	@RequestMapping("/term/")
	public String toKiyaku () {
		
		return "pr-home-1012.html";
	}

}
