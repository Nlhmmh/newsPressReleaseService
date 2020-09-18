package com.jp.sense.pr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.NotificationManageDao;
import com.jp.sense.pr.dao.PressReleaseDao;
import com.jp.sense.pr.model.dto.NotificationManageDTO;
import com.jp.sense.pr.model.dto.PressReleaseNewDTO;
import com.jp.sense.pr.model.entity.NotificationManage;

/**
 * --ホームページ 
 * --サービス
 * 
 * @author ネィ
 *
 */
@Service
@Transactional
public class PrHome1001Service {

	@Autowired
	PressReleaseDao pressReleaseDao;

	@Autowired
	NotificationManageDao notificationManageDao;

	/**
	 * --新着プレスリリース
	 * 
	 * @return 新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListNew() {
		List<PressReleaseNewDTO> pressReleaseNewDTOList = pressReleaseDao.selectPRListNew();
		return pressReleaseNewDTOList;
	}

	/**
	 * --お知らせ情報
	 * 
	 * @return 新着プレスリリースリスト
	 */
	public List<NotificationManageDTO> selectNotifyListForHomePage() {
		List<NotificationManageDTO> returnList = new ArrayList<NotificationManageDTO>();
		List<NotificationManage> notifyList = notificationManageDao.selectNotifyListForHomePage();
		for (NotificationManage notify : notifyList) {
			NotificationManageDTO notifyDTO = new NotificationManageDTO();
			notifyDTO.setNotificationTitle(notify.getNotificationTitle());
			notifyDTO.setCreateDatetime(notify.getCreateDatetime());
			returnList.add(notifyDTO);
		}
		return returnList;
	}

	/**
	 * --いま話題プレスリリース
	 * 
	 * @return 新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListImaWadai(Integer count) {
		List<PressReleaseNewDTO> pressReleaseNewDTOList = pressReleaseDao.selectPRListImaWadai(count); 
		return pressReleaseNewDTOList;
	}

	/**
	 * --今日プレスリリース
	 * 
	 * @return 新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListKyou(Integer count) {
		List<PressReleaseNewDTO> pressReleaseNewDTOList = pressReleaseDao.selectPRListKyou(count); 
		return pressReleaseNewDTOList;
	}

	/**
	 * --今週プレスリリース
	 * 
	 * @return 新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListKonShuu(Integer count) {
		List<PressReleaseNewDTO> pressReleaseNewDTOList = pressReleaseDao.selectPRListKonShuu(count); 
		return pressReleaseNewDTOList;
	}

	/**
	 * --今月プレスリリース
	 * 
	 * @return 新着プレスリリースリスト
	 */
	public List<PressReleaseNewDTO> selectPRListKonGatsu(Integer count) {
		List<PressReleaseNewDTO> pressReleaseNewDTOList = pressReleaseDao.selectPRListKonGatsu(count); 
		return pressReleaseNewDTOList;
	}

}
