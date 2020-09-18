package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.ServicePlanDao;
import com.jp.sense.pr.model.entity.ServicePlan;

/**
 * --料金プラン 
 * --サービス
 * 
 * @author 山内、ミィン
 */
@Service
@Transactional
public class PrHome1010Service {

	@Autowired
	ServicePlanDao servicePlanDao;

	/**
	 * --定額プラン
	 * 
	 * @return リスト
	 */
	public List<ServicePlan> selectFlatRatePlan() {
		return servicePlanDao.selectFlatRatePlan();
	}

	/**
	 * --従量課金プラン
	 * 
	 * @return リスト
	 */
	public List<ServicePlan> selectPayAsUgoPlan() {
		return servicePlanDao.selectPayAsUgoPlan();
	}

}