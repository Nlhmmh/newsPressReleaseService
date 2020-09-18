package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.sense.pr.model.dto.PressReleaseCompMediaListDTO;
import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.service.PrCompany1020Service;
import com.jp.sense.pr.util.CommonUtils;

/**
 * 	【企業】プレスリリース一覧
 * 
 * @author shu、ネィ
 *
 */
@Controller
public class PrCompany1020Controller {

	@Autowired
	PrCompany1020Service prCompany1020Service;
	@RequestMapping("/company/press_release_list")
	public String toCompPrPage(@AuthenticationPrincipal CompUserDetails loginUser, String startPage, String page,
			Model model) {

		int startPageCount = CommonUtils.str2Int(startPage);
		int pageCount = CommonUtils.str2Int(page);
		List<PressReleaseCompMediaListDTO> pressReleaseCompMediaList = 
			prCompany1020Service.selectPressReleaseCompMediaList(
				loginUser.getCompanyId(),
				startPage == null || page == null ? 0 : startPageCount * pageCount, 
				page == null ? 10 : pageCount
			);
		int overallCount = pressReleaseCompMediaList.size() != 0 ? pressReleaseCompMediaList.get(0).getOverallCount() : 0;

		model.addAttribute("pressReleaseCompMediaList", pressReleaseCompMediaList);
		model.addAttribute("startPageCount", startPage == null ? 0 : startPageCount);
		model.addAttribute(
			"endPageCount",
			startPage == null || page == null ? 10 : overallCount < startPageCount * pageCount + pageCount ? overallCount : startPageCount * pageCount + pageCount
		);
		model.addAttribute("pageCount", page == null ? 10 : pageCount);
		model.addAttribute("overallCount", overallCount);

		return "pr-company-1020.html";

	}


	@RequestMapping(value = "/deletePrFromComPrl", method = RequestMethod.POST)
	@ResponseBody
	public String deletePr(int prid) {
		int res = prCompany1020Service.updatePrDeleteFlag(prid);
		return res > 0 ? "削除成功" : "削除失敗";
	}

}
