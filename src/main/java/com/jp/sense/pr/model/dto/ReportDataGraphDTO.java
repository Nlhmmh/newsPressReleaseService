package com.jp.sense.pr.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportDataGraphDTO {
	
	private Date accessTime;
	private String accessTime_string1;
	private int pv;
	private int uu;

	public Date getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		setAccessTime_string1(format.format(accessTime));
	}

	public String getAccessTime_string1() {
		return accessTime_string1;
	}

	public void setAccessTime_string1(String accessTime_string1) {
		this.accessTime_string1 = accessTime_string1;
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
