package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.PressReleaseDao;
import com.jp.sense.pr.model.dto.PressReleaseNewDTO;

/**
 * --ランニング 
 * --サービス
 * 
 * @author ネィ
 *
 */
@Service
@Transactional
public class PrHome1008Service {
	
	@Autowired
	PressReleaseDao pressReleaseDao;
	
	/**
	 * --いま話題プレスリリース
	 * 
	 * @return　新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListImaWadai(Integer count) {
		return pressReleaseDao.selectPRListImaWadai(count);
	}
	
	
	/**
	 * --今日プレスリリース
	 * 
	 * @return　新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListKyou(Integer count) {
		return pressReleaseDao.selectPRListKyou(count);
	}
	
	
	/**
	 * --今週プレスリリース
	 * 
	 * @return　新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListKonShuu(Integer count) {
		return pressReleaseDao.selectPRListKonShuu(count);
	}
	
	
	/**
	 * --今月プレスリリース
	 * 
	 * @return　新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListKonGatsu(Integer count) {
		return pressReleaseDao.selectPRListKonGatsu(count);
	}

}
