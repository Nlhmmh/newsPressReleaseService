package com.jp.sense.pr.model.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * --企業プレスリリース一覧
 * 
 * @author テイ
 *
 */
public class PressReleaseListDTO extends BaseDTO {
	
	private Integer prId;    
	private String prImage;
	private String prTitle;
	private Date prCreateDateTime;
	private String CompCorporateName;
	private String prDateString;	// 配信日を【⏱yyyy年MM月dd日 HH時mm分】フォーマットで表示する文字列
	private Integer prBId;
	private String keyword;
	
    
	
	public Integer getPrId() {
		return prId;
	}

	public void setPrId(Integer prId) {
		this.prId = prId;
	}

	public String getPrImage() {
		return prImage;
	}

	public void setPrImage(String prImage) {
		this.prImage = prImage;
	}

	public String getPrTitle() {
		return prTitle;
	}

	public void setPrTitle(String prTitle) {
		this.prTitle = prTitle;
	}

	public Date getPrCreateDateTime() throws ParseException {
		return prCreateDateTime;
	}

	public void setPrCreateDateTime(Date prCreateDateTime) {
		this.prCreateDateTime = prCreateDateTime;
		SimpleDateFormat format = new SimpleDateFormat("⏱yyyy年MM月dd日 HH時mm分");
		setPrDateString(format.format(prCreateDateTime));
	}
    
	
	public String getCompCorporateName() {
		return CompCorporateName;
	}

	public void setCompCorporateName(String compCorporateName) {
		CompCorporateName = compCorporateName;
	}

	public String getPrDateString() {
		return prDateString;
	}

	public void setPrDateString(String prDateString) {
		this.prDateString = prDateString;
	}

	public Integer getPrBId() {
		return prBId;
	}

	public void setPrBId(Integer prBId) {
		this.prBId = prBId;
	}


	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "PressReleaseListDTO [prId=" + prId + ", prImage=" + prImage + ", prTitle="
				+ prTitle + ", prCreateDateTime=" + prCreateDateTime + ", CompCorporateName=" + CompCorporateName
				+ ", prDateString=" + prDateString + ", keyword=" + keyword + "]";
	}
}
