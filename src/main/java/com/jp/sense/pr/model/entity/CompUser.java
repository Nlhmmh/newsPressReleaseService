package com.jp.sense.pr.model.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table comp_user
 */
public class CompUser {
	
	/**
	 *	ログインユーザの会社
	 *	@author: Li
	 */
	private Company company;

	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * Database Column Remarks: ユーザーID This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.user_id
	 * @mbg.generated
	 */
	private Integer userId;
	/**
	 * Database Column Remarks: 企業ID This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.company_id
	 * @mbg.generated
	 */
	private Integer companyId;
	/**
	 * Database Column Remarks: リリース配信権限区分:0:権限無し 1:権限あり This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.with_authority
	 * @mbg.generated
	 */
	private String withAuthority;
	/**
	 * Database Column Remarks: メールアドレス This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.email
	 * @mbg.generated
	 */
	private String email;
	/**
	 * Database Column Remarks: パスワード This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.password
	 * @mbg.generated
	 */
	private String password;
	/**
	 * Database Column Remarks: 氏名 This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * Database Column Remarks: 氏名（カナ） This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.name_kana
	 * @mbg.generated
	 */
	private String nameKana;
	/**
	 * Database Column Remarks: 所属部署 This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.department
	 * @mbg.generated
	 */
	private String department;
	/**
	 * Database Column Remarks: 電話番号 This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.phone_no
	 * @mbg.generated
	 */
	private String phoneNo;
	/**
	 * Database Column Remarks: FAX This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.fax
	 * @mbg.generated
	 */
	private String fax;
	/**
	 * Database Column Remarks: 削除フラグ This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.delete_flag
	 * @mbg.generated
	 */
	private String deleteFlag;
	/**
	 * Database Column Remarks: 作成者 This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.create_user
	 * @mbg.generated
	 */
	private String createUser;
	/**
	 * Database Column Remarks: 作成日時:yyyy/MM/dd HH:mm:ss This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.create_datetime
	 * @mbg.generated
	 */
	private Date createDatetime;
	/**
	 * Database Column Remarks: 最終更新者 This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.update_user
	 * @mbg.generated
	 */
	private String updateUser;
	/**
	 * Database Column Remarks: 最終更新日時:yyyy/MM/dd HH:mm:ss This field was generated by MyBatis Generator. This field corresponds to the database column comp_user.update_datetime
	 * @mbg.generated
	 */
	private Date updateDatetime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.user_id
	 * @return  the value of comp_user.user_id
	 * @mbg.generated
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.user_id
	 * @param userId  the value for comp_user.user_id
	 * @mbg.generated
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.company_id
	 * @return  the value of comp_user.company_id
	 * @mbg.generated
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.company_id
	 * @param companyId  the value for comp_user.company_id
	 * @mbg.generated
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.with_authority
	 * @return  the value of comp_user.with_authority
	 * @mbg.generated
	 */
	public String getWithAuthority() {
		return withAuthority;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.with_authority
	 * @param withAuthority  the value for comp_user.with_authority
	 * @mbg.generated
	 */
	public void setWithAuthority(String withAuthority) {
		this.withAuthority = withAuthority;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.email
	 * @return  the value of comp_user.email
	 * @mbg.generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.email
	 * @param email  the value for comp_user.email
	 * @mbg.generated
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.password
	 * @return  the value of comp_user.password
	 * @mbg.generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.password
	 * @param password  the value for comp_user.password
	 * @mbg.generated
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.name
	 * @return  the value of comp_user.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.name
	 * @param name  the value for comp_user.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.name_kana
	 * @return  the value of comp_user.name_kana
	 * @mbg.generated
	 */
	public String getNameKana() {
		return nameKana;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.name_kana
	 * @param nameKana  the value for comp_user.name_kana
	 * @mbg.generated
	 */
	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.department
	 * @return  the value of comp_user.department
	 * @mbg.generated
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.department
	 * @param department  the value for comp_user.department
	 * @mbg.generated
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.phone_no
	 * @return  the value of comp_user.phone_no
	 * @mbg.generated
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.phone_no
	 * @param phoneNo  the value for comp_user.phone_no
	 * @mbg.generated
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.fax
	 * @return  the value of comp_user.fax
	 * @mbg.generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.fax
	 * @param fax  the value for comp_user.fax
	 * @mbg.generated
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.delete_flag
	 * @return  the value of comp_user.delete_flag
	 * @mbg.generated
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.delete_flag
	 * @param deleteFlag  the value for comp_user.delete_flag
	 * @mbg.generated
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.create_user
	 * @return  the value of comp_user.create_user
	 * @mbg.generated
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.create_user
	 * @param createUser  the value for comp_user.create_user
	 * @mbg.generated
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.create_datetime
	 * @return  the value of comp_user.create_datetime
	 * @mbg.generated
	 */
	public Date getCreateDatetime() {
		return createDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.create_datetime
	 * @param createDatetime  the value for comp_user.create_datetime
	 * @mbg.generated
	 */
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.update_user
	 * @return  the value of comp_user.update_user
	 * @mbg.generated
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.update_user
	 * @param updateUser  the value for comp_user.update_user
	 * @mbg.generated
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comp_user.update_datetime
	 * @return  the value of comp_user.update_datetime
	 * @mbg.generated
	 */
	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comp_user.update_datetime
	 * @param updateDatetime  the value for comp_user.update_datetime
	 * @mbg.generated
	 */
	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", userId=").append(userId);
		sb.append(", companyId=").append(companyId);
		sb.append(", withAuthority=").append(withAuthority);
		sb.append(", email=").append(email);
		sb.append(", password=").append(password);
		sb.append(", name=").append(name);
		sb.append(", nameKana=").append(nameKana);
		sb.append(", department=").append(department);
		sb.append(", phoneNo=").append(phoneNo);
		sb.append(", fax=").append(fax);
		sb.append(", deleteFlag=").append(deleteFlag);
		sb.append(", createUser=").append(createUser);
		sb.append(", createDatetime=").append(createDatetime);
		sb.append(", updateUser=").append(updateUser);
		sb.append(", updateDatetime=").append(updateDatetime);
		sb.append("]");
		return sb.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		CompUser other = (CompUser) that;
		return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getCompanyId() == null ? other.getCompanyId() == null
						: this.getCompanyId().equals(other.getCompanyId()))
				&& (this.getWithAuthority() == null ? other.getWithAuthority() == null
						: this.getWithAuthority().equals(other.getWithAuthority()))
				&& (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
				&& (this.getPassword() == null ? other.getPassword() == null
						: this.getPassword().equals(other.getPassword()))
				&& (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
				&& (this.getNameKana() == null ? other.getNameKana() == null
						: this.getNameKana().equals(other.getNameKana()))
				&& (this.getDepartment() == null ? other.getDepartment() == null
						: this.getDepartment().equals(other.getDepartment()))
				&& (this.getPhoneNo() == null ? other.getPhoneNo() == null
						: this.getPhoneNo().equals(other.getPhoneNo()))
				&& (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
				&& (this.getDeleteFlag() == null ? other.getDeleteFlag() == null
						: this.getDeleteFlag().equals(other.getDeleteFlag()))
				&& (this.getCreateUser() == null ? other.getCreateUser() == null
						: this.getCreateUser().equals(other.getCreateUser()))
				&& (this.getCreateDatetime() == null ? other.getCreateDatetime() == null
						: this.getCreateDatetime().equals(other.getCreateDatetime()))
				&& (this.getUpdateUser() == null ? other.getUpdateUser() == null
						: this.getUpdateUser().equals(other.getUpdateUser()))
				&& (this.getUpdateDatetime() == null ? other.getUpdateDatetime() == null
						: this.getUpdateDatetime().equals(other.getUpdateDatetime()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comp_user
	 * @mbg.generated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
		result = prime * result + ((getWithAuthority() == null) ? 0 : getWithAuthority().hashCode());
		result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
		result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getNameKana() == null) ? 0 : getNameKana().hashCode());
		result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
		result = prime * result + ((getPhoneNo() == null) ? 0 : getPhoneNo().hashCode());
		result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
		result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
		result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
		result = prime * result + ((getCreateDatetime() == null) ? 0 : getCreateDatetime().hashCode());
		result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
		result = prime * result + ((getUpdateDatetime() == null) ? 0 : getUpdateDatetime().hashCode());
		return result;
	}
}