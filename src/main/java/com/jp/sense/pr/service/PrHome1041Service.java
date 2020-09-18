package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompUserDao;
import com.jp.sense.pr.dao.MasterManagementDao;
import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.model.entity.MasterManagement;
import com.jp.sense.pr.model.entity.MediaUser;

/**
 * --パスワード再設定 
 * --サービス
 * 
 * @author 山内
 *
 */
@Service
@Transactional
public class PrHome1041Service {
	
	@Autowired
	MediaUserDao mediaUserDao;
	
	@Autowired
	CompUserDao compuserDao;
	
	@Autowired
	MasterManagementDao masterManagementDao;
	
	/**
	 * --メディア種類リストを取得する
	 * 
	 * @param id
	 * @return 処理ステータス
	 */
	public List<MasterManagement> selectMediaTypes(Integer id) {
		return masterManagementDao.selectMediaTypes(id);
	}	
	
	/**
	 *	パスワードリセット処理
	 * 
	 * @param userId
	 * @return
	 */
	public int updateUserPassword(String email, String resetPassword){
		List<CompUser> compUserList = compuserDao.selectByEmail(email);
		List<MediaUser> mediaUserList = mediaUserDao.selectByEmail(email);
		if (!compUserList.isEmpty()) {
			return compuserDao.updateCompUserPassword(compUserList.get(0).getUserId(), new BCryptPasswordEncoder().encode(resetPassword));
		} else {
			if (!mediaUserList.isEmpty()) {
				return mediaUserDao.updateMediaUserPassword(mediaUserList.get(0).getId(), new BCryptPasswordEncoder().encode(resetPassword));
			} else {
				return 0;
			}
		}
	}

}
