package com.jp.sense.pr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.dto.MediaUserRegisterFormDTO;
import com.jp.sense.pr.service.PrRegist1016Service;
import com.jp.sense.pr.service.PrefecturesService;

/**
 * --メディア登録 
 * --コントローラー
 * 
 * @author ネィ
 *
 */
@Controller
public class PrRegist1016Controller {

	@Autowired
	PrRegist1016Service prRegist1016Service;
	
	@Autowired
	PrefecturesService prefecturesService;
	
	@Autowired
	MediaUserDao mediaUserDao;
	
	/**
	 *	ログ出力
	 */
	protected final static Logger logger = LoggerFactory.getLogger(PrRegist1015Controller.class);
	
	/**
	 * --必須項目を入力画面
	 * 
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping("/regist/media")
	public String fill(Model model) {
		model.addAttribute("userInfo", new MediaUserRegisterFormDTO());
		model.addAttribute("mediumTypeList", prRegist1016Service.selectMediaTypes(153));
		return "pr-regist-1016.html";
	}

	/**
	 * --入力内容を確認画面
	 * 
	 * @param userFrom
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping("/regist/media/confirm")
	public String confirm(@ModelAttribute("userInfo") MediaUserRegisterFormDTO userFrom, Model model) {
		model.addAttribute("userInfoConfirm", userFrom);
		return "pr-regist-1016-confirm.html";
	}

	/**
	 * --完了画面
	 * 
	 * @param userFrom
	 * @return ウェーブHTML
	 */
	@RequestMapping("/regist/media/finish")
	public String finish(@ModelAttribute("userInfoConfirm") MediaUserRegisterFormDTO userFrom) {
		int status = prRegist1016Service.insertMediaUser(userFrom);
		if (status == 1) {
			logger.info("メディアユーザー登録は正常完了しました。　ユーザーメール　：　" + userFrom.getEmail());
		} else {
			logger.info("メディアユーザー登録処理は異常完了しました。　ユーザーメール　：　" + userFrom.getEmail());
		}
		return "pr-regist-1016-finish.html";
	}
	
}
