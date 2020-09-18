package com.jp.sense.pr.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * --分析データ一覧
 * 
 * @author ネィ
 *
 */
public class ReportDataDTO {

	private int overallCount;
	private String title;
	private Date pr_published_date;
	private String pr_published_date_string1;
	private String pr_published_date_string2;
	private String pr_published_date_string3;
	private int pr_ID;
	private int access_pc;
	private int access_phone;
	private int access_tablet;
	private double access_pc_per;
	private double access_phone_per;
	private double access_tablet_per;
	private int reprint_sites;
	private int pv;
	private int uu;

	public int getOverallCount() {
		return overallCount;
	}

	public void setOverallCount(int overallCount) {
		this.overallCount = overallCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPr_published_date() {
		return pr_published_date;
	}

	public void setPr_published_date(Date pr_published_date) {
		this.pr_published_date = pr_published_date;
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		setPr_published_date_string1(format.format(pr_published_date));
		SimpleDateFormat format2 = new SimpleDateFormat("HH時mm分");
		setPr_published_date_string2(format2.format(pr_published_date));
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy/MM/dd");
		setPr_published_date_string3(format3.format(pr_published_date));
	}

	public String getPr_published_date_string1() {
		return pr_published_date_string1;
	}

	public void setPr_published_date_string1(String pr_published_date_string1) {
		this.pr_published_date_string1 = pr_published_date_string1;
	}

	public String getPr_published_date_string2() {
		return pr_published_date_string2;
	}

	public void setPr_published_date_string2(String pr_published_date_string2) {
		this.pr_published_date_string2 = pr_published_date_string2;
	}

	public String getPr_published_date_string3() {
		return pr_published_date_string3;
	}

	public void setPr_published_date_string3(String pr_published_date_string3) {
		this.pr_published_date_string3 = pr_published_date_string3;
	}

	public int getPr_ID() {
		return pr_ID;
	}

	public void setPr_ID(int pr_ID) {
		this.pr_ID = pr_ID;
	}

	public int getAccess_pc() {
		return access_pc;
	}

	public void setAccess_pc(int access_pc) {
		this.access_pc = access_pc;
	}

	public int getAccess_phone() {
		return access_phone;
	}

	public void setAccess_phone(int access_phone) {
		this.access_phone = access_phone;
	}

	public int getAccess_tablet() {
		return access_tablet;
	}

	public void setAccess_tablet(int access_tablet) {
		this.access_tablet = access_tablet;
	}

	public double getAccess_pc_per() {
		return access_pc_per;
	}

	public void setAccess_pc_per(double access_pc_per) {
		this.access_pc_per = access_pc_per;
	}

	public double getAccess_phone_per() {
		return access_phone_per;
	}

	public void setAccess_phone_per(double access_phone_per) {
		this.access_phone_per = access_phone_per;
	}

	public double getAccess_tablet_per() {
		return access_tablet_per;
	}

	public void setAccess_tablet_per(double access_tablet_per) {
		this.access_tablet_per = access_tablet_per;
	}

	public int getReprint_sites() {
		return reprint_sites;
	}

	public void setReprint_sites(int reprint_sites) {
		this.reprint_sites = reprint_sites;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getUu() {
		return uu;
	}

	public void setUu(int uu) {
		this.uu = uu;
	}

}
