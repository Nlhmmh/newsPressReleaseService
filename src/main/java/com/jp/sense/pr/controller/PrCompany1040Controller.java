package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.dto.MediaReproduceHistoryDTO;
import com.jp.sense.pr.model.entity.PressRelease;
import com.jp.sense.pr.service.PrCompany1040Service;

@Controller
public class PrCompany1040Controller {
	
	@Autowired
	private PrCompany1040Service prCompany1040Service;
	
	@RequestMapping("/company/online_media")
	public String toPage(Model model) {
		
		List<PressRelease> selectByComIdPr = prCompany1040Service.selectByComId(1, 10);
		model.addAttribute("selectByComIdPr", selectByComIdPr);
		
		return "pr-company-1040.html";
	}
	
	
	
	@RequestMapping("/comp/online_media_dtl/{prId}")
	public String toMediaDtl (@PathVariable int prId , Model model) {
		List<MediaReproduceHistoryDTO> onlineMediaDitailList = prCompany1040Service.selectOnlineMediaDitailList(prId);
		model.addAttribute("onlineMediaDitailList", onlineMediaDitailList);

		
		return "pr-company-1040box.html";
	}

}
