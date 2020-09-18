package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jp.sense.pr.model.dto.PressReleaseNewDTO;
import com.jp.sense.pr.service.PrHome1008Service;

/**
 * --ランキング
 * --コントローラー
 * 
 * @author ネィ
 *
 */
@Controller
public class PrHome1008Controller {
	
	@Autowired
	PrHome1008Service prHome1008Service;
	
	/**
	 * --ランキング
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/ranking", method = RequestMethod.GET)
	public String ranking(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1008Service.selectPRListImaWadai(10);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1008.html";
	}
	
	/**
	 * --いま話題
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/ranking/now", method = RequestMethod.GET)
	public String imawadai(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1008Service.selectPRListImaWadai(10);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1008-ranking.html :: ranking";
	}
	
	/**
	 * --今日のランキング
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/ranking/today", method = RequestMethod.GET)
	public String kyou(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1008Service.selectPRListKyou(10);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1008-ranking.html :: ranking";
	}
	
	/**
	 * --今週のランキング
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/ranking/thisweek", method = RequestMethod.GET)
	public String konshuu(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1008Service.selectPRListKonShuu(10);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1008-ranking.html :: ranking";
	}
	
	/**
	 * --今月のランキング
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping(value = "/ranking/thismonth", method = RequestMethod.GET)
	public String kongatsu(Model model) {
		List<PressReleaseNewDTO> prListRanking = prHome1008Service.selectPRListKonGatsu(10);
		model.addAttribute("prListRanking", prListRanking);
		return "pr-home-1008-ranking.html :: ranking";
	}

}
