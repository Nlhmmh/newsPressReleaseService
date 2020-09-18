package com.jp.sense.pr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.sense.pr.model.dto.CompUserInfoFormDTO;
import com.jp.sense.pr.model.dto.CompUserInfoUpdatePasswordFormDTO;
import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.service.PrCompany1030Service;

/**
 * --ユーザー情報登録・詳細 
 * --コントローラー
 * 
 * @author ネィ
 *
 */
@Controller
public class PrCompany1030Controller {

	@Autowired
	PrCompany1030Service prCompany1030Service;
	
	/**
	 *	ログ出力
	 */
	private static final Logger logger = LoggerFactory.getLogger(PrCompany1030Controller.class);

	/**
	 * --企業のユーザー情報登録画面
	 * 
	 * @param model
	 * @return　HTML画面
	 */
	@RequestMapping("/company/user_register")
	public String register(Model model) {
		model.addAttribute("userInfo", new CompUserInfoFormDTO());
		return "pr-company-1030.html";
	}

	/**
	 * --企業のユーザー情報登録確認画面
	 * 
	 * @param compUserInfoFormDTO
	 * @param model
	 * @return　HTML画面
	 */
	@RequestMapping("/company/user_register/confirm")
	public String confirm(@ModelAttribute("userInfo") CompUserInfoFormDTO compUserInfoFormDTO, Model model) {
		model.addAttribute("userInfo", compUserInfoFormDTO);
		return "pr-company-1030-confirm.html";
	}

	/**
	 * --企業のユーザー情報登録完了処理
	 * 
	 * @param loginUser
	 * @param compUserInfoFormDTO
	 * @return 完了ステータス
	 */
	@RequestMapping("/company/user_register/success")
	@ResponseBody
	public boolean success(@AuthenticationPrincipal CompUserDetails loginUser, @ModelAttribute("userInfo") CompUserInfoFormDTO compUserInfoFormDTO) {
		int status = prCompany1030Service.insertCompUserInfo(loginUser.getCompanyId(), compUserInfoFormDTO);
		if (status == 1) {
			logger.info("企業ユーザー登録処理は正常完了しました。 CompanyId ：  " + loginUser.getCompanyId() + " 、 UserEmail ：  " + compUserInfoFormDTO.getEmail());
			return true;
		} else {
			logger.error("企業ユーザー登録処理は異常完了しました。 CompanyId ： " + loginUser.getCompanyId() + " 、 UserEmail ：  " + compUserInfoFormDTO.getEmail());
			return false;
		}
	}

	/**
	 * --企業のユーザー情報編集画面
	 * 
	 * @param compUserId
	 * @param model
	 * @return HTML画面
	 */
	@RequestMapping("/company/user_edit")
	public String edit(@RequestParam("id") String compUserId, Model model) {
		CompUserInfoFormDTO compUserInfoFormDTO = prCompany1030Service.selectCompUser(Integer.valueOf(compUserId));
		CompUserInfoUpdatePasswordFormDTO updatePasswordInfo = new CompUserInfoUpdatePasswordFormDTO();
		updatePasswordInfo.setUserId(Integer.valueOf(compUserId));
		updatePasswordInfo.setEncryptedPassword(compUserInfoFormDTO.getPassword());
		model.addAttribute("userInfo", compUserInfoFormDTO);
		model.addAttribute("updatePasswordInfo", updatePasswordInfo);
		model.addAttribute("compUserId", compUserId);
		return "pr-company-1030-edit.html";
	}
	
	/**
	 * --企業のユーザー情報編集確認画面
	 * 
	 * @param compUserInfoFormDTO
	 * @param model
	 * @return HTML画面
	 */
	@RequestMapping("/company/user_edit/confirm")
	public String editConfirm(@ModelAttribute("userInfo") CompUserInfoFormDTO compUserInfoFormDTO, Model model) {
		model.addAttribute("userInfo", compUserInfoFormDTO);
		return "pr-company-1030-edit-confirm.html";
	}
	
	/**
	 * --企業のユーザー情報更新画面
	 * 
	 * @param loginUser
	 * @param compUserInfoFormDTO
	 * @return HTML画面
	 */
	@RequestMapping("/company/user_edit/success")
	@ResponseBody
	public boolean editSuccess(@AuthenticationPrincipal CompUserDetails loginUser,
			@ModelAttribute("userInfo") CompUserInfoFormDTO compUserInfoFormDTO) {
		int status = prCompany1030Service.updateCompUserInfo(loginUser.getCompanyId(), compUserInfoFormDTO);
		if (status == 1) {
			logger.info("企業ユーザー更新処理は正常完了しました。 CompanyId ：  " + loginUser.getCompanyId() + " 、 UserEmail ：  " + compUserInfoFormDTO.getEmail());
			return true;
		} else {
			logger.error("企業ユーザー更新処理は異常完了しました。 CompanyId ：  " + loginUser.getCompanyId() + " 、 UserEmail ：  " + compUserInfoFormDTO.getEmail());
			return false;
		}
	}
	
	/**
	 * --企業のユーザー情報のパスワード更新処理
	 * 
	 * @param compUserInfoUpdatePasswordFormDTO
	 * @param model
	 * @return HTML画面
	 */
	@RequestMapping("/company/user_edit/update_password")
	@ResponseBody
	public boolean updatePassword(String oldPassword, String newPassword, String encryptedPassword, String userId, Model model) {
		int status = prCompany1030Service.updatePassword(oldPassword, newPassword, encryptedPassword, userId);
		if (status == 1) {
			logger.info("企業ユーザーパスワード更新処理は正常完了しました。 　UserID ：  " + userId);
			return true;
		} else {
			logger.error("企業ユーザーパスワード更新処理は異常完了しました。 　UserID ：  " + userId);
			return false;
		}
	}

}
