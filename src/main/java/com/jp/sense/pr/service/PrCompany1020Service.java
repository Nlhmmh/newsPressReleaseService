package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompMediaListDao;
import com.jp.sense.pr.model.dto.PressReleaseCompMediaListDTO;

/**
 *	【企業】プレスリリース一覧
 * 
 * @author shu, ネィ
 *
 */
@Service
@Transactional
public class PrCompany1020Service {

	@Autowired
	CompMediaListDao compMediaListDao;

	public List<PressReleaseCompMediaListDTO> selectPressReleaseCompMediaList(Integer cid, int pageStartCount, int pageCount) {
		List<PressReleaseCompMediaListDTO> list = compMediaListDao.selectPressReleaseCompMediaList(cid, pageStartCount, pageCount);
		return list;
	}

	public int updatePrDeleteFlag(Integer prid) {
		int res = compMediaListDao.updatePrDeleteFlag(prid);
		return res;
	}

}
