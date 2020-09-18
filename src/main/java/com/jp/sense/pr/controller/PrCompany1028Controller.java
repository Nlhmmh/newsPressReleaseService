package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.service.PrCompany1028Service;

@Controller
public class PrCompany1028Controller {
	
	@Autowired
	PrCompany1028Service prCompany1028Service;
	@RequestMapping("/company/user_info")
	public String toPage (Model model) {
		List<CompUser> compUserList = prCompany1028Service.selectByCompanyId(1);
		//ログインのユーザー情報
		CompUser loginUser = prCompany1028Service.selectByPrimaryKey(1);
		model.addAttribute("compUser", compUserList);
		model.addAttribute("loginUser", loginUser);
		return "pr-company-1028.html";
	}
	@RequestMapping(value="/deleteUser", method = RequestMethod.POST)
    @ResponseBody
    public String deletePr(int userId){
		int res = prCompany1028Service.updateDeleteFlag(userId);
		return res > 0 ? "削除成功" : "削除失敗";
    }

}
