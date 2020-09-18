package com.jp.sense.pr.model.dto;

/**
 * --分析データ表示
 * 
 * @author ネィ
 *
 */
public class ReportDataOverallDTO {

	private int compId;
	private int pv_overall;
	private int uu_overall;
	private int reprint_sites_overall;

	public int getCom_id() {
		return compId;
	}

	public void setCom_id(int compId) {
		this.compId = compId;
	}

	public int getPv_overall() {
		return pv_overall;
	}

	public void setPv_overall(int pv_overall) {
		this.pv_overall = pv_overall;
	}

	public int getUu_overall() {
		return uu_overall;
	}

	public void setUu_overall(int uu_overall) {
		this.uu_overall = uu_overall;
	}

	public int getReprint_sites_overall() {
		return reprint_sites_overall;
	}

	public void setReprint_sites_overall(int reprint_sites_overall) {
		this.reprint_sites_overall = reprint_sites_overall;
	}

}
