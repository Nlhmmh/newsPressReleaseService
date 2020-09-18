package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.MediaReproduceHistoryDao;
import com.jp.sense.pr.model.dto.MediaReproduceHistoryDTO;

@Service
@Transactional
public class PrCompany1024Service {
	
	
	@Autowired
	MediaReproduceHistoryDao mediaReproduceHistoryDao;
	
	/**
	 * 検索BYprId
	 * 
	 * 朱
	 * 
	 */
	
	public List<MediaReproduceHistoryDTO>  selectOnlineMediaDitailList(Integer prId){
		
		List<MediaReproduceHistoryDTO> list = mediaReproduceHistoryDao.selectOnlineMediaDitailList(prId);
		
		return list;
	}
	
	
	

}
