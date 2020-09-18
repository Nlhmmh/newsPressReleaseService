package com.jp.sense.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.dto.PasswordRestFormDTO;
import com.jp.sense.pr.service.PrHome1041Service;

/**
 * --パスワード再設定 
 * --コントローラー
 * 
 * @author 山口、ミィン
 * 
 */
@Controller
public class PrHome1041Controller {

	@Autowired
	PrHome1041Service prHome1041Servise;

	/**
	 *	新しいパスワードを入力画面
	 * 
	 * @param userId
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping("/reset_pwd.do")
	public String index(String email, Model model) {
		PasswordRestFormDTO passwordRestFormDTO = new PasswordRestFormDTO();
		passwordRestFormDTO.setEmail(email);
		model.addAttribute("userInfo", passwordRestFormDTO);
		return "pr-home-1041.html";
	}

	/**
	 *	入力内容を確認画面
	 * 
	 * @param passwordRestFormDTO
	 * @param model
	 * @return ウェーブHTML
	 */
	@RequestMapping("/reset_pwd.do/confirm")
	public String confirm(@ModelAttribute("userInfo") PasswordRestFormDTO passwordRestFormDTO, Model model) {
		model.addAttribute("userInfo", passwordRestFormDTO);
		return "pr-home-1041-confirm.html";
	}

	/**
	 *	完了画面
	 * 
	 * @param passwordRestFormDTO
	 * @return ウェーブHTML
	 */
	@RequestMapping("/reset_pwd.do/finish")
	public String finish(@ModelAttribute("userInfo") PasswordRestFormDTO passwordRestFormDTO) {
		int status = prHome1041Servise.updateUserPassword(passwordRestFormDTO.getEmail(), passwordRestFormDTO.getPassword());
		if (status == 1) {
			System.out.println("パスワード再設定処理完了しました。" + passwordRestFormDTO.getEmail());
			return "pr-home-1041-finish.html";
		} else {
			System.out.println("パスワード再設定処理失敗しました。" + passwordRestFormDTO.getEmail());
			return "error-page.html";
		}
	}

}
