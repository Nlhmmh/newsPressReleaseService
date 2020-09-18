package com.jp.sense.pr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *	プレスリリースとは
 *	コントローラー
 * 
 * @author ミィン
 *
 */
@Controller
public class PrHome1009Controller {
	
	/**
	 *	プレスリリースとは画面
	 * 
	 * @param model
	 * @return　ウェブHTML
	 */
	@RequestMapping("/about")
	public String index(Model model) {
		return "pr-home-1009.html";
	}

}
