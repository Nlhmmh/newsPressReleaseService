package com.jp.sense.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jp.sense.pr.dao.BrowsingHistoryDao;
import com.jp.sense.pr.security.MediaUserDetails;


/**
 * Media User Browsing History
 * 
 * @author Jiafeng Liu
 *
 */
@Controller
public class PrMedia1042Controller {
	@Autowired
	BrowsingHistoryDao browsingHistoryDao;


	/**
	 * @param model holder for model attributes
	 * @return html template
	 */
	@RequestMapping(value="/media/browsing_history", method = RequestMethod.GET)
	public String init(Model model, @AuthenticationPrincipal MediaUserDetails loginUser) {
		model.addAttribute("browsingHistoryList", browsingHistoryDao.selectByMediaUserId(loginUser.getId()));

		return "pr-media-1042.html";
	}
}
