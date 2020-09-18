package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.dto.MediaReproduceHistoryDTO;
import com.jp.sense.pr.service.PrCompany1024Service;

/**
 * 
 * 
 * @author tei
 *
 */
@Controller
public class PrCompany1024Controller {
	
	@Autowired
	PrCompany1024Service prCompany1024Service;

	@RequestMapping("/comp/online_media_dtl")
	public String toMediaDtl (Model model) {
		List<MediaReproduceHistoryDTO> onlineMediaDitailList = prCompany1024Service.selectOnlineMediaDitailList(1);
		model.addAttribute("onlineMediaDitailList", onlineMediaDitailList);
		return "pr-company-1024.html";
	}
	
}
