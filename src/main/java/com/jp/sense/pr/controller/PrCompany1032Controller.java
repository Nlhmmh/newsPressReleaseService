package com.jp.sense.pr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.dto.ServicePlanUpdateFormDTO;
import com.jp.sense.pr.model.entity.ServicePlan;
import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.service.PrCompany1032Service;

/**
 *	【企業】料金プラン 変更 
 *	コントローラー
 * 
 * @author 山内
 *
 */
@Controller
public class PrCompany1032Controller {

	@Autowired
	PrCompany1032Service prCompany1032Service;

	/**
	 *	ログ出力
	 */
	protected final static Logger logger = LoggerFactory.getLogger(PrCompany1032Controller.class);

	/**
	 * --【企業】料金プラン 変更画面
	 * 
	 * @param model
	 * @return 変更画面
	 */
	@RequestMapping("/company/service_plan_change")
	public String index(@AuthenticationPrincipal CompUserDetails loginUser, int service_plan_id, Model model) {

		ServicePlan serviePlan = prCompany1032Service.selectServicePlanChange(service_plan_id);
		ServicePlanUpdateFormDTO planInfo = new ServicePlanUpdateFormDTO();
		planInfo.setId(service_plan_id);
		planInfo.setPlanName(serviePlan.getPlanName());
		planInfo.setPlanSubTitle(serviePlan.getPlanSubTitle());
		planInfo.setServiceUnit(serviePlan.getServiceUnit());
		planInfo.setDeliverCount(serviePlan.getDeliverCount());
		planInfo.setUnlimitedDeliverFlag(serviePlan.getUnlimitedDeliverFlag());
		planInfo.setPlanPrice(serviePlan.getPlanPrice());

		model.addAttribute("planInfo", planInfo);
		return "pr-company-1032.html";

	}

	/**
	 * --【企業】料金プラン 変更_確認画面
	 * 
	 * @param id
	 * @return 確認画面
	 */
	@RequestMapping("/company/service_plan_change/confirm")
	public String confirm(@AuthenticationPrincipal CompUserDetails loginUser, @ModelAttribute("planInfo") ServicePlanUpdateFormDTO planInfo, Model model) {

		int insertStatus = prCompany1032Service.insertCorporatecontractList(planInfo, loginUser);
		if (insertStatus == 1) {
			logger.info("新しい企業契約追加処理は正常完了しました。企業ID　：　" + loginUser.getCompanyId());
		} else {
			logger.warn("新しい企業契約追加処理は異常完了しました。企業ID　：　" + loginUser.getCompanyId());
		}

		int updateStatus = prCompany1032Service.updateServicePlanOfCompany(planInfo.getId(), planInfo.getAutoUpdatePlan() ? "1" : "0" , loginUser.getCompanyId());
		if (updateStatus == 1) {
			logger.info("サービスプラン自動更新区分更新処理は正常完了しました。　企業ID　：　" + loginUser.getCompanyId() + "、サービスプラン自動更新区分　：　" + planInfo.getAutoUpdatePlan());
		} else {
			logger.warn("サービスプラン自動更新区分更新処理は異常完了しました。　企業ID　：　" + loginUser.getCompanyId() + "、サービスプラン自動更新区分　：　" + planInfo.getAutoUpdatePlan());
		}

		return "pr-company-1032-confirm.html";
	}

}
