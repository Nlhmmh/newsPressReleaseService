package com.jp.sense.pr.model.dto;

import java.util.Date;

public class PrefecturesDTO extends BaseDTO {

	private String postCode;
	private String prefectureKatakana;
	private String cityKatakana;
	private String townKatakana;
	private String prefecture;
	private String city;
	private String town;
	private String deleteFlag;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPrefectureKatakana() {
		return prefectureKatakana;
	}
	public void setPrefectureKatakana(String prefectureKatakana) {
		this.prefectureKatakana = prefectureKatakana;
	}
	public String getCityKatakana() {
		return cityKatakana;
	}
	public void setCityKatakana(String cityKatakana) {
		this.cityKatakana = cityKatakana;
	}
	public String getTownKatakana() {
		return townKatakana;
	}
	public void setTownKatakana(String townKatakana) {
		this.townKatakana = townKatakana;
	}
	public String getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}