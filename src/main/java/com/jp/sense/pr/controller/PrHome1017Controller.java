package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jp.sense.pr.model.dto.PressReleaseListDTO;
import com.jp.sense.pr.model.entity.Company;
import com.jp.sense.pr.service.PrHome1017Service;

@Controller
public class PrHome1017Controller {

	@Autowired
	PrHome1017Service prHome1017Service;
    
	/**
	 * --初期表示
	 * 
	 */		
	@RequestMapping("/company_profile/{cid}")
	public String toCompPrPage(@PathVariable("cid")Integer cid,Model model) {
		List<PressReleaseListDTO> prList = prHome1017Service.selectPrList(cid);
        Company compInfo = prHome1017Service.selectByPrimaryKey(cid);
        model.addAttribute("compInfo", compInfo);
        model.addAttribute("prList", prList);
        if(compInfo.getIsDisplayedCoverImage().equals("1")) {   
		    List<PressReleaseListDTO> prImage = prHome1017Service.selectPrImage(cid);		
		    model.addAttribute("prImage", prImage);
        }
		return "pr-home-1017.html";
	}
	
	/**
	 * --検索ボタン押下
	 * 
	 */		
	@RequestMapping("/company_profile/searchKeyword/{cid}")
	public String keywordSearch(@RequestParam(name = "keyword", required = false) String keyword,@PathVariable("cid")Integer cid,Model model){		
		Company compInfo = prHome1017Service.selectByPrimaryKey(cid);
		List<PressReleaseListDTO> prList = prHome1017Service.pushKensakuBtn(keyword, cid);
		model.addAttribute("compInfo", compInfo);
		model.addAttribute("prList", prList);
		model.addAttribute("keyword", keyword);
		if(compInfo.getIsDisplayedCoverImage().equals("1")) {
		    List<PressReleaseListDTO> prImage = prHome1017Service.selectPrImage(cid);
		    model.addAttribute("prImage", prImage);
		}
		return "pr-home-1017.html";
	}
}
