package com.jp.sense.pr.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.sense.pr.service.CompUserService;
import com.jp.sense.pr.service.MediaUserService;
import com.jp.sense.pr.service.PrefecturesService;


/**
 * 画面からのAJAXリクエストを処理するクラス。
 * 
 */
@RestController
@RequestMapping("/api")
public class AjaxUtils {
	
	@Autowired
	private PrefecturesService prefecturesService;
	
	@Autowired
	private CompUserService compUserService;
	
	@Autowired
	private MediaUserService mediaUserService;
	
	/**
     *	郵便番号でアドレスを取得する関数
     *	author: Li
     */
	@RequestMapping("/getaddr")
	public String getAddressByZipCode(String zipCd) {
		return prefecturesService.findByZipCd(zipCd);
	}

	/**
     *	メールアドレス存在チェック
     *	author: Li
     */
	@RequestMapping("/chkIsMailExist")
	public String mailExistCheck(String mail) {
		boolean isExist = true;
		// 両方に存在しない場合のみ「存在しない」と判定
		if( compUserService.selectByEmail(mail).isEmpty() &&
			mediaUserService.selectByEmail(mail).isEmpty()) {
			isExist = false;
		}
		return String.valueOf(isExist);
	}
		
}
