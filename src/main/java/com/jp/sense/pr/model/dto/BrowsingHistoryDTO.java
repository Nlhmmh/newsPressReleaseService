package com.jp.sense.pr.model.dto;

import java.util.Date;

/**
 * DTO for pr-media-1042.html
 * 
 * @author Jiafeng Liu
 *
 */
public class BrowsingHistoryDTO extends BaseDTO {
	private String imageName;
	private String releaseTitle;
	private Date createDatetime;
	private String corporateName;
	private String companyId;

	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getReleaseTitle() {
		return releaseTitle;
	}
	public void setReleaseTitle(String releaseTitle) {
		this.releaseTitle = releaseTitle;
	}
	public Date getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
}
