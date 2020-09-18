package com.jp.sense.pr.model.dto;

import java.util.Date;

public class PressReleaseCompMediaListDTO extends BaseDTO {

	/*	
	 * pr.id
	 * pr.release_title	
	 * pr.release_type	
	 * ml.media_list_name	
	 * ml.media_list_id	
	 * pr.release_status	
	 * create_datetime
	*/											

	private Integer prId;
	private String prReleaseTitle;
	private String prReleaseType;
	private String mlMediaListName;
	private Integer mlMediaListId;
	private String prReleaseStatus;
	private Date prCreateDateTime;
	private int overallCount;

	public Integer getPrId() {
		return prId;
	}

	public void setPrId(Integer prId) {
		this.prId = prId;
	}

	public String getPrReleaseTitle() {
		return prReleaseTitle;
	}

	public void setPrReleaseTitle(String prReleaseTitle) {
		this.prReleaseTitle = prReleaseTitle;
	}

	public String getPrReleaseType() {
		return prReleaseType;
	}

	public void setPrReleaseType(String prReleaseType) {
		this.prReleaseType = prReleaseType;
	}

	public String getMlMediaListName() {
		return mlMediaListName;
	}

	public void setMlMediaListName(String mlMediaListName) {
		this.mlMediaListName = mlMediaListName;
	}

	public Integer getMlMediaListId() {
		return mlMediaListId;
	}

	public void setMlMediaListId(Integer mlMediaListId) {
		this.mlMediaListId = mlMediaListId;
	}

	public String getPrReleaseStatus() {
		return prReleaseStatus;
	}

	public void setPrReleaseStatus(String prReleaseStatus) {
		this.prReleaseStatus = prReleaseStatus;
	}

	public Date getPrCreateDateTime() {
		return prCreateDateTime;
	}

	public void setPrCreateDateTime(Date prCreateDateTime) {
		this.prCreateDateTime = prCreateDateTime;
	}
	
	

	public int getOverallCount() {
		return overallCount;
	}

	public void setOverallCount(int overallCount) {
		this.overallCount = overallCount;
	}
	
	
	@Override
	public String toString() {
		return "PressReleaseCompMediaListDTO [prId=" + prId + ", prReleaseTitle=" + prReleaseTitle + ", prReleaseType="
				+ prReleaseType + ", mlMediaListName=" + mlMediaListName + ", mlMediaListId=" + mlMediaListId
				+ ", prReleaseStatus=" + prReleaseStatus + ", prCreateDateTime=" + prCreateDateTime + ", overallCount="
				+ overallCount + "]";
	}

}
