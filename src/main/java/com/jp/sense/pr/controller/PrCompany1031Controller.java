package com.jp.sense.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.service.PrCompany1031Service;

/**
 *	【企業】料金プラン 
 *	サービス
 * 
 * @author ミィン
 *
 */
@Controller
public class PrCompany1031Controller {

	@Autowired
	PrCompany1031Service prCompany1031Service;

	/**
	 * --企業料金プラン画面
	 * 
	 * @param loginUser
	 * @param model
	 * @return
	 */
	@RequestMapping("/company/service_plan")
	public String index(@AuthenticationPrincipal CompUserDetails loginUser, Model model) {
		model.addAttribute("planlist", prCompany1031Service.selectServicePlan());
		model.addAttribute("nowplan", prCompany1031Service.selectServicePlanIdOfCompany(loginUser.getCompanyId()));
		return "pr-company-1031.html";
	}

}
