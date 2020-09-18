package com.jp.sense.pr.model.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * --新着プレスリリース
 * 
 * @author ネィ
 *
 */
public class PressReleaseNewDTO extends BaseDTO {

	private String prImage;
	private String prTitle;
	private Date prDate;
	private String companyName;
	private String prDateString;	// 配信日を【⏱HH時mm分】フォーマットで表示する文字列
	private String prDateStringRanking;	// 配信日を【⏱yyyy年MM月dd日 HH時mm分】フォーマットで表示する文字列
	private String pv;
	private String uu;

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

	public Date getPrDate() throws ParseException {
		return prDate;
	}

	public void setPrDate(Date prDate) {
		this.prDate = prDate;
		SimpleDateFormat format = new SimpleDateFormat("⏱HH時mm分");
		setPrDateString(format.format(prDate));
		SimpleDateFormat format2 = new SimpleDateFormat("⏱yyyy年MM月dd日 HH時mm分");
		setPrDateStringRanking(format2.format(prDate));
	}

	public String getPrDateString() {
		return prDateString;
	}

	public void setPrDateString(String prDateString) {
		this.prDateString = prDateString;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPv() {
		return pv;
	}

	public void setPv(String pv) {
		this.pv = pv;
	}

	public String getUu() {
		return uu;
	}

	public void setUu(String uu) {
		this.uu = uu;
	}

	public String getPrDateStringRanking() {
		return prDateStringRanking;
	}

	public void setPrDateStringRanking(String prDateStringRanking) {
		this.prDateStringRanking = prDateStringRanking;
	}

}
