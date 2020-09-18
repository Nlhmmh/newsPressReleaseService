package com.jp.sense.pr.model.dto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ServicePlanUpdateFormDTO extends BaseDTO {
	
	private String planName;
	private String planSubTitle;
	private String serviceUnit;
	private Integer deliverCount;
	private String unlimitedDeliverFlag;
	private String contractPeriod;
	private Integer planPrice;
	private boolean autoUpdatePlan;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanSubTitle() {
		return planSubTitle;
	}

	public void setPlanSubTitle(String planSubTitle) {
		this.planSubTitle = planSubTitle;
	}

	public String getServiceUnit() {
		return serviceUnit;
	}

	public void setServiceUnit(String serviceUnit) {
		this.serviceUnit = serviceUnit;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date now = new Date(System.currentTimeMillis());
		
		Calendar monthAdd = Calendar.getInstance();
		monthAdd.add(Calendar.MONTH, 1);
		Date month = monthAdd.getTime();
		
		Calendar yearAdd = Calendar.getInstance();
		yearAdd.add(Calendar.MONTH, 12);
		Date year = yearAdd.getTime();
		
		Calendar halfYearAdd = Calendar.getInstance();
		halfYearAdd.add(Calendar.MONTH, 6);
		Date halfYear = yearAdd.getTime();
		
		if ("2".equals(serviceUnit)) {
			setContractPeriod(format.format(now) + "～" + format.format(month));
		} else if ("3".equals(serviceUnit)) {
			setContractPeriod(format.format(now) + "～" + format.format(year));
		} else if ("4".equals(serviceUnit)) {
			setContractPeriod(format.format(now) + "～" + format.format(halfYear));
		} else if ("1".equals(serviceUnit)) {
			setContractPeriod("なし");
		}
	}

	public Integer getDeliverCount() {
		return deliverCount;
	}

	public void setDeliverCount(Integer deliverCount) {
		this.deliverCount = deliverCount;
	}

	public String getUnlimitedDeliverFlag() {
		return unlimitedDeliverFlag;
	}

	public void setUnlimitedDeliverFlag(String unlimitedDeliverFlag) {
		this.unlimitedDeliverFlag = unlimitedDeliverFlag;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public Integer getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(Integer planPrice) {
		this.planPrice = planPrice;
	}

	public boolean getAutoUpdatePlan() {
		return autoUpdatePlan;
	}

	public void setAutoUpdatePlan(boolean autoUpdatePlan) {
		this.autoUpdatePlan = autoUpdatePlan;
	}

}
