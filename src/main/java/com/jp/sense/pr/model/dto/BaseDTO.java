package com.jp.sense.pr.model.dto;

import com.jp.sense.pr.util.BeanUtils;

public class BaseDTO {
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	/** 
	 * パラメータオブジェクトのフィールド値を本オブジェクト同じ名目のフィールドにコピーする
	 * @param source コピー元オブジェクト
	 */
	public BaseDTO updateProp(Object source) {
		BeanUtils.updateProperties(source, this);
		return this;
	}
}
