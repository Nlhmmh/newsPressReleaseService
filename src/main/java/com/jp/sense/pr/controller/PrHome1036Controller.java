package com.jp.sense.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.sense.pr.dao.CompUserDao;
import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.dto.PasswordResetRequestFormDTO;
import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.model.entity.MediaUser;
import com.jp.sense.pr.util.MailUtils;

/**
 *	パスワードリセット
 *	コントローラー
 * 
 * @author ミィン
 *
 */
@Controller
public class PrHome1036Controller {
	
	@Autowired
	MediaUserDao mediaUserDao;
	
	@Autowired
	CompUserDao compUserDao;
	
	@Autowired
	private MailUtils mailUtils;

	/**
	 *	パスワードリセット画面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/reset_pwd")
	public String fill(Model model) {
		model.addAttribute("userEmailForm", new PasswordResetRequestFormDTO());
		return "pr-home-1036.html";
	}
	
	/**
	 *	企業ユーザー、又は、メディアユーザーの存在確認
	 * 
	 * @param userEmail
	 * @return 存在確認
	 */
	@RequestMapping(value = "/reset_pwd/checkEmailExist", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkEmailExist(@RequestParam("userEmail") String userEmail) {
		boolean isUserExist = false;
		List<CompUser> compUserList = compUserDao.selectByEmail(userEmail);
		List<MediaUser> mediaUserList = mediaUserDao.selectByEmail(userEmail);
		if (compUserList.isEmpty() && mediaUserList.isEmpty()) {
			isUserExist = false;
		} else {
			isUserExist = true;
		}
		return isUserExist;
	}

	//	社長のお話で消す
	//	@RequestMapping("/reset_pwd/confirm")
	//	public String confirm(@ModelAttribute("userEmailForm") PasswordResetRequestFormDTO userEmailForm, Model model) {
	//		model.addAttribute("userEmailFormConfirm", userEmailForm);
	//		return "pr-home-1036-confirm.html";
	//	}

	/**
	 *	メール送信完了画面
	 * 
	 * @param userEmailFormConfirm
	 * @return
	 */
	@RequestMapping("/reset_pwd/finish")
	public String finish(@ModelAttribute("userEmailForm") PasswordResetRequestFormDTO userEmailFormConfirm) {
		mailUtils.sendMail(userEmailFormConfirm.getEmail(), "【SENSE PR】パスワード再設定のご案内", "pr-home-1036-mail");
		return "pr-home-1036-finish.html";
	}

}