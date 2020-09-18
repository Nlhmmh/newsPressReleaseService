package com.jp.sense.pr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.dto.CompanyRegistPageFormDTO;
import com.jp.sense.pr.model.entity.MasterManagement;
import com.jp.sense.pr.model.result.ResultFactory;
import com.jp.sense.pr.service.CompanyService;
import com.jp.sense.pr.service.MasterManagementService;
import com.jp.sense.pr.util.JsonUtils;
import com.jp.sense.pr.util.ResponseUtils;

@Controller
public class PrCompany1006Controller {
	
	protected final static Logger logger = LoggerFactory.getLogger(PrCompany1006Controller.class);
	
	@Autowired
	private MasterManagementService masterManagementService;
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/regist/comp")
	public String toRegistPage (Model m) {
		
		// マスタデータからリストを取得
		List<MasterManagement> listingCate = masterManagementService.getAbsoluteChildren(1001);		// 上場区分
		List<MasterManagement> corporateCate = masterManagementService.getAbsoluteChildren(130);	// 企業カテゴリ
		List<MasterManagement> industryCate = masterManagementService.getAbsoluteChildren(136);		// 業種区分
		List<MasterManagement> businessCate = masterManagementService.getAbsoluteChildren(10);		// ビジネスカテゴリ
		
		m.addAttribute("listingCate", listingCate);
		m.addAttribute("industryCate", industryCate);
		m.addAttribute("corporateCate", corporateCate);
		m.addAttribute("businessCate", businessCate);
		
		return "pr-company-1006.html";
	}
	
	@RequestMapping("/regist/comp.do")
	public void regCompAndUserInfo (HttpServletResponse response, CompanyRegistPageFormDTO form) throws IOException {	
		
		String rtnJson;
		
		try {
			companyService.regCompAndUser(form);
			
			rtnJson = JsonUtils.obj2String(ResultFactory.buildSuccessResult("success"));
			
		} catch (Exception e) {
			// ThrowしたらReturn出来なくなるのでReturnせずにこのまま返還。
			rtnJson = JsonUtils.obj2String(ResultFactory.buildFailResult("登録処理中エラーが発生しました。"));
			ResponseUtils.writeJson(response, rtnJson);
			
			logger.warn("登録処理中エラーが発生しました。"+e.getMessage());
			throw e;
		}
		
		ResponseUtils.writeJson(response, rtnJson);
	}
}
