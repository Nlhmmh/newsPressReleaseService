package com.jp.sense.pr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.dto.PersonalUserRegisterFormDTO;
import com.jp.sense.pr.service.PrRegist1015Service;

/**
 * --個人登録 
 * --コントローラー
 * 
 * @author ネィ
 *
 */
@Controller
public class PrRegist1015Controller {

	@Autowired
	PrRegist1015Service prRegist1015Service;
	
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
	@RequestMapping("/regist/personal")
	public String fill(Model model) {
		model.addAttribute("userInfo", new PersonalUserRegisterFormDTO());
		return "pr-regist-1015.html";
	}

	/**
	 * --入力内容を確認画面
	 * 
	 * @param userFrom
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping("/regist/personal/confirm")
	public String confirm(@ModelAttribute("userInfo") PersonalUserRegisterFormDTO userFrom, Model model) {
		model.addAttribute("userInfoConfirm", userFrom);
		return "pr-regist-1015-confirm.html";
	}

	/**
	 * --完了画面
	 * 
	 * @param userFrom
	 * @return ウェーブHTML
	 */
	@RequestMapping("/regist/personal/finish")
	public String finish(@ModelAttribute("userInfoConfirm") PersonalUserRegisterFormDTO userFrom) {
		int status =  prRegist1015Service.insertPersonalUser(userFrom);
		if (status == 1) {
			logger.info("個人ユーザー登録は正常完了しました。　ユーザーメール　：　" + userFrom.getEmail());
		} else {
			logger.info("個人ユーザー登録処理は異常完了しました。　ユーザーメール　：　" + userFrom.getEmail());
		}
		return "pr-regist-1015-finish.html";
	}

}
