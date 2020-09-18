package com.jp.sense.pr.model.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table service_plan
 */
public class ServicePlan {

	/**
	 * Database Column Remarks: 料金プランID This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.ID
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * Database Column Remarks: プラン名称 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.PLAN_NAME
	 * @mbg.generated
	 */
	private String planName;
	/**
	 * Database Column Remarks: プランサブタイトル This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.PLAN_SUB_TITLE
	 * @mbg.generated
	 */
	private String planSubTitle;
	/**
	 * Database Column Remarks: サービス単位:1.回 2.月 3.年 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.SERVICE_UNIT
	 * @mbg.generated
	 */
	private String serviceUnit;
	/**
	 * Database Column Remarks: 配信回数 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.DELIVER_COUNT
	 * @mbg.generated
	 */
	private Integer deliverCount;
	/**
	 * Database Column Remarks: 配信回数無制限フラグ This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.UNLIMITED_DELIVER_FLAG
	 * @mbg.generated
	 */
	private String unlimitedDeliverFlag;
	/**
	 * Database Column Remarks: 料金 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.PLAN_PRICE
	 * @mbg.generated
	 */
	private Integer planPrice;
	/**
	 * Database Column Remarks: 削除フラグ This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.DELETE_FLAG
	 * @mbg.generated
	 */
	private String deleteFlag;
	/**
	 * Database Column Remarks: 作成者 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.CREATE_USER
	 * @mbg.generated
	 */
	private String createUser;
	/**
	 * Database Column Remarks: 作成日時 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.CREATE_DATETIME
	 * @mbg.generated
	 */
	private Date createDatetime;
	/**
	 * Database Column Remarks: 最終更新者 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.UPDATE_USER
	 * @mbg.generated
	 */
	private String updateUser;
	/**
	 * Database Column Remarks: 最終更新日時 This field was generated by MyBatis Generator. This field corresponds to the database column service_plan.UPDATE_DATETIME
	 * @mbg.generated
	 */
	private Date updateDatetime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.ID
	 * @return  the value of service_plan.ID
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.ID
	 * @param id  the value for service_plan.ID
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.PLAN_NAME
	 * @return  the value of service_plan.PLAN_NAME
	 * @mbg.generated
	 */
	public String getPlanName() {
		return planName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.PLAN_NAME
	 * @param planName  the value for service_plan.PLAN_NAME
	 * @mbg.generated
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.PLAN_SUB_TITLE
	 * @return  the value of service_plan.PLAN_SUB_TITLE
	 * @mbg.generated
	 */
	public String getPlanSubTitle() {
		return planSubTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.PLAN_SUB_TITLE
	 * @param planSubTitle  the value for service_plan.PLAN_SUB_TITLE
	 * @mbg.generated
	 */
	public void setPlanSubTitle(String planSubTitle) {
		this.planSubTitle = planSubTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.SERVICE_UNIT
	 * @return  the value of service_plan.SERVICE_UNIT
	 * @mbg.generated
	 */
	public String getServiceUnit() {
		return serviceUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.SERVICE_UNIT
	 * @param serviceUnit  the value for service_plan.SERVICE_UNIT
	 * @mbg.generated
	 */
	public void setServiceUnit(String serviceUnit) {
		this.serviceUnit = serviceUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.DELIVER_COUNT
	 * @return  the value of service_plan.DELIVER_COUNT
	 * @mbg.generated
	 */
	public Integer getDeliverCount() {
		return deliverCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.DELIVER_COUNT
	 * @param deliverCount  the value for service_plan.DELIVER_COUNT
	 * @mbg.generated
	 */
	public void setDeliverCount(Integer deliverCount) {
		this.deliverCount = deliverCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.UNLIMITED_DELIVER_FLAG
	 * @return  the value of service_plan.UNLIMITED_DELIVER_FLAG
	 * @mbg.generated
	 */
	public String getUnlimitedDeliverFlag() {
		return unlimitedDeliverFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.UNLIMITED_DELIVER_FLAG
	 * @param unlimitedDeliverFlag  the value for service_plan.UNLIMITED_DELIVER_FLAG
	 * @mbg.generated
	 */
	public void setUnlimitedDeliverFlag(String unlimitedDeliverFlag) {
		this.unlimitedDeliverFlag = unlimitedDeliverFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.PLAN_PRICE
	 * @return  the value of service_plan.PLAN_PRICE
	 * @mbg.generated
	 */
	public Integer getPlanPrice() {
		return planPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.PLAN_PRICE
	 * @param planPrice  the value for service_plan.PLAN_PRICE
	 * @mbg.generated
	 */
	public void setPlanPrice(Integer planPrice) {
		this.planPrice = planPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.DELETE_FLAG
	 * @return  the value of service_plan.DELETE_FLAG
	 * @mbg.generated
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.DELETE_FLAG
	 * @param deleteFlag  the value for service_plan.DELETE_FLAG
	 * @mbg.generated
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.CREATE_USER
	 * @return  the value of service_plan.CREATE_USER
	 * @mbg.generated
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.CREATE_USER
	 * @param createUser  the value for service_plan.CREATE_USER
	 * @mbg.generated
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.CREATE_DATETIME
	 * @return  the value of service_plan.CREATE_DATETIME
	 * @mbg.generated
	 */
	public Date getCreateDatetime() {
		return createDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.CREATE_DATETIME
	 * @param createDatetime  the value for service_plan.CREATE_DATETIME
	 * @mbg.generated
	 */
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.UPDATE_USER
	 * @return  the value of service_plan.UPDATE_USER
	 * @mbg.generated
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.UPDATE_USER
	 * @param updateUser  the value for service_plan.UPDATE_USER
	 * @mbg.generated
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column service_plan.UPDATE_DATETIME
	 * @return  the value of service_plan.UPDATE_DATETIME
	 * @mbg.generated
	 */
	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column service_plan.UPDATE_DATETIME
	 * @param updateDatetime  the value for service_plan.UPDATE_DATETIME
	 * @mbg.generated
	 */
	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table service_plan
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", planName=").append(planName);
		sb.append(", planSubTitle=").append(planSubTitle);
		sb.append(", serviceUnit=").append(serviceUnit);
		sb.append(", deliverCount=").append(deliverCount);
		sb.append(", unlimitedDeliverFlag=").append(unlimitedDeliverFlag);
		sb.append(", planPrice=").append(planPrice);
		sb.append(", deleteFlag=").append(deleteFlag);
		sb.append(", createUser=").append(createUser);
		sb.append(", createDatetime=").append(createDatetime);
		sb.append(", updateUser=").append(updateUser);
		sb.append(", updateDatetime=").append(updateDatetime);
		sb.append("]");
		return sb.toString();
	}
}