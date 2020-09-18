package com.jp.sense.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.dto.PrefecturesDTO;
import com.jp.sense.pr.service.PrefecturesService;

@Controller
public class IndexController {

	@Autowired
	PrefecturesService prefecturesService;

	@RequestMapping("/index")
	public String index() {
		// DEMO、DB接続テスト用削除してください
		PrefecturesDTO findById = prefecturesService.findById();
		System.out.println("findById=========postCd:" + findById.getPostCode());

		// templates配下のファイルる名
		return "index.html";
	}
}
