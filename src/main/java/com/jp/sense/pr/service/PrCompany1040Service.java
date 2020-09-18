package com.jp.sense.pr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jp.sense.pr.dao.MediaReproduceHistoryDao;
import com.jp.sense.pr.model.dto.MediaReproduceHistoryDTO;
import com.jp.sense.pr.model.entity.PressRelease;

@Service
@Transactional
public class PrCompany1040Service {

	@Autowired
	private MediaReproduceHistoryDao mediaReproduceHistoryDao;

	public List<PressRelease> selectByComId(Integer comId, Integer count) {
		List<PressRelease> list = mediaReproduceHistoryDao.selectByComId(comId, count);
		return list;
	}

	public List<MediaReproduceHistoryDTO> selectOnlineMediaDitailList(Integer prId) {
		List<MediaReproduceHistoryDTO> list = mediaReproduceHistoryDao.selectOnlineMediaDitailList(prId);
		return list;
	}
	//webで修正

}
