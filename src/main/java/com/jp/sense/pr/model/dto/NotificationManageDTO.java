package com.jp.sense.pr.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * --お知らせ情報
 * 
 * @author ネィ
 *
 */
public class NotificationManageDTO extends BaseDTO {

	private String notificationTitle;
	private String notificationText;
	private String notificationUrl;
	private String releaseFlag;
	private String deleteFlag;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;
	private String createDatetimeString;
	private String updateDatetimeString;

	public String getNotificationTitle() {
		return notificationTitle;
	}

	public void setNotificationTitle(String notificationTitle) {
		this.notificationTitle = notificationTitle;
	}

	public String getNotificationText() {
		return notificationText;
	}

	public void setNotificationText(String notificationText) {
		this.notificationText = notificationText;
	}

	public String getNotificationUrl() {
		return notificationUrl;
	}

	public void setNotificationUrl(String notificationUrl) {
		this.notificationUrl = notificationUrl;
	}

	public String getReleaseFlag() {
		return releaseFlag;
	}

	public void setReleaseFlag(String releaseFlag) {
		this.releaseFlag = releaseFlag;
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
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		setCreateDatetimeString(format.format(createDatetime));
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
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		setUpdateDatetimeString(format.format(updateDatetime));
	}

	public String getCreateDatetimeString() {
		return createDatetimeString;
	}

	public void setCreateDatetimeString(String createDatetimeString) {
		this.createDatetimeString = createDatetimeString;
	}

	public String getUpdateDatetimeString() {
		return updateDatetimeString;
	}

	public void setUpdateDatetimeString(String updateDatetimeString) {
		this.updateDatetimeString = updateDatetimeString;
	}

}
