package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompanyDao;
import com.jp.sense.pr.dao.ServicePlanDao;
import com.jp.sense.pr.model.entity.ServicePlan;

/**
 * --【企業】料金プラン 
 * --サービス
 * 
 * @author ミィン
 *
 */
@Service
@Transactional
public class PrCompany1031Service {
	
	@Autowired
	CompanyDao companyDao;
	
	@Autowired
	ServicePlanDao servicePlanDao;
	
	/**
	 * --企業が利用している料金プラン情報を取得する
	 * 
	 * @param compId
	 * @return
	 */
	public int selectServicePlanIdOfCompany(Integer compId) {
		return companyDao.selectByPrimaryKey(compId).getCompanyPlanId();
	}
	
	/**
	 * --ある料金プラン情報を取得処理
	 * 
	 * @return
	 */
	public List<ServicePlan> selectServicePlan() {
		return servicePlanDao.selectServicePlan();
	}

}
