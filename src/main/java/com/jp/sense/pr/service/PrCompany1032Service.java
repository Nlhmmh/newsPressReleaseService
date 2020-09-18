package com.jp.sense.pr.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompanyDao;
import com.jp.sense.pr.dao.CorporateContractListDao;
import com.jp.sense.pr.dao.ServicePlanDao;
import com.jp.sense.pr.model.dto.ServicePlanUpdateFormDTO;
import com.jp.sense.pr.model.entity.CorporatecontractList;
import com.jp.sense.pr.model.entity.ServicePlan;
import com.jp.sense.pr.security.CompUserDetails;

/**
 * --【企業】料金プラン 変更 
 * --サービス
 * 
 * @author 山内
 *
 */
@Service
@Transactional
public class PrCompany1032Service {

	@Autowired
	CompanyDao companyDao;

	@Autowired
	ServicePlanDao servicePlanDao;

	@Autowired
	CorporateContractListDao corporateContractListDao;

	/**
	 * --変更する料金プラン取得
	 *
	 */
	public ServicePlan selectServicePlanChange(int serviceId) {
		return servicePlanDao.selectServicePlanChange(serviceId);
	}

	/**
	 * --変更する料金プラン取得
	 * 
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public int insertCorporatecontractList(ServicePlanUpdateFormDTO planInfo, CompUserDetails loginUser) {
		
		Date now = new Date(System.currentTimeMillis());
		CorporatecontractList record = new CorporatecontractList();
		
		record.setCompanyid(loginUser.getCompanyId());
		record.setStatus("2");
		record.setCompanyname(loginUser.getCompany().getCorporateName());
		record.setPlanName(planInfo.getPlanName());
		record.setPlanSubTitle(planInfo.getPlanSubTitle());
		record.setService("");
		record.setServiceUnit(planInfo.getServiceUnit());
		record.setDeliverCount(planInfo.getDeliverCount());
		record.setUnlimitedDeliverFlag(planInfo.getUnlimitedDeliverFlag());
		record.setPurchasingContent("");
		record.setPaymentNumber("");
		record.setPlanPrice(planInfo.getPlanPrice());
		record.setRequestMonth(String.valueOf(now.getMonth() + 1));
		record.setContractPeriod(planInfo.getContractPeriod());
		record.setDeleteFlag("0");
		record.setCreateUser("system");
		record.setCreateDatetime(now);
		record.setUpdateUser("system");
		record.setUpdateDatetime(now);
		
		return corporateContractListDao.insert(record);
		
	}

	/**
	 * --企業テーブルの料金プラン更新
	 * 
	 * @return
	 */
	public int updateServicePlanOfCompany(int serviceId, String planCat, int companyId) {
		return companyDao.updateServicePlanOfCompany(serviceId, planCat, companyId);
	}
}