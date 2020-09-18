package com.jp.sense.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.service.PrHome1010Service;

/**
 *	料金・プラン 
 *	コントローラー
 * 
 * @author 山内、ミィン
 */
@Controller
public class PrHome1010Controller {

	@Autowired
	PrHome1010Service prHome1010Service;

	/**
	 *	料金・プラン画面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/price")
	public String toPricePage(Model model) {	
		model.addAttribute("payAsUgoPlan", prHome1010Service.selectPayAsUgoPlan());
		model.addAttribute("flatRatePlan", prHome1010Service.selectFlatRatePlan());
		return "pr-home-1010.html";
	}

}