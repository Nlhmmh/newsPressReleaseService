package com.jp.sense.pr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.PrefecturesDao;
import com.jp.sense.pr.model.dto.PrefecturesDTO;
import com.jp.sense.pr.model.entity.Prefectures;
import com.jp.sense.pr.util.BeanUtils;

@Service
@Transactional
public class PrefecturesService {

	@Autowired
	PrefecturesDao prefecturesDao;

	/**
	 * idよりデータを探す
	 */
	public PrefecturesDTO findById() {
		
		return BeanUtils.transformFrom(prefecturesDao.selectByPrimaryKey(1), PrefecturesDTO.class);
	}
	
	/**
	 * 郵便番号により住所取得
	 * 存在しない場合は"error"を返還
	 */
	public String findByZipCd(String zipCd) {
		
		String result = "error";
		Prefectures pref = prefecturesDao.selectByZipCode(zipCd);
		if(pref != null) {
			result=pref.getPrefecture()+pref.getCity()+pref.getTown();
		}
		
		return result;
	}
	
	
	
}
