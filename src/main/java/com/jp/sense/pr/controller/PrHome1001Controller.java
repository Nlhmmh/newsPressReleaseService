package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jp.sense.pr.model.dto.NotificationManageDTO;
import com.jp.sense.pr.model.dto.PressReleaseNewDTO;
import com.jp.sense.pr.service.PrHome1001Service;

/**
 * --ホームページ 
 * --コントローラー
 * 
 * @author ネィ
 *
 */
@Controller
public class PrHome1001Controller {

	@Autowired
	PrHome1001Service prHome1001Service;

	/**
	 * --ホームページ
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping("/")
	public String index(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1001Service.selectPRListImaWadai(5);
		List<PressReleaseNewDTO> prList = prHome1001Service.selectPRListNew();
		List<NotificationManageDTO> notifyList = prHome1001Service.selectNotifyListForHomePage();
		model.addAttribute("prListRanking", prListRanking);
		model.addAttribute("prList", prList);
		model.addAttribute("notifyList", notifyList);
		return "pr-home-1001.html";
	}

	/**
	 * --いま話題
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/imawadai", method = RequestMethod.GET)
	public String imawadai(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1001Service.selectPRListImaWadai(5);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1001-ranking.html :: ranking";
	}

	/**
	 * --今日のランキング
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/kyou", method = RequestMethod.GET)
	public String kyou(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1001Service.selectPRListKyou(5);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1001-ranking.html :: ranking";
	}

	/**
	 * --今週のランキング
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/konshuu", method = RequestMethod.GET)
	public String konshuu(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1001Service.selectPRListKonShuu(5);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1001-ranking.html :: ranking";
	}

	/**
	 * --今月のランキング
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/kongatsu", method = RequestMethod.GET)
	public String kongatsu(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1001Service.selectPRListKonGatsu(5);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1001-ranking.html :: ranking";
	}

	// --Banner追加

}
