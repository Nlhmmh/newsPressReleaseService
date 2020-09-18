package com.jp.sense.pr.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.dto.PersonalUserRegisterFormDTO;
import com.jp.sense.pr.model.entity.MediaUser;

/**
 * --個人登録 
 * --サービス
 * 
 * @author ネィ
 *
 */
@Service
@Transactional
public class PrRegist1015Service {

	@Autowired
	MediaUserDao mediaUserDao;

	/**
	 * --新しい個人ユーザー追加
	 * 
	 * @param userForm
	 * @return 処理ステータス
	 */
	public int insertPersonalUser(PersonalUserRegisterFormDTO userForm) {
		MediaUser mediaUser = new MediaUser();
		Date now = new Date(System.currentTimeMillis());
		mediaUser.setAccountType("0");
		mediaUser.setEmail(userForm.getEmail());
		mediaUser.setPassword(new BCryptPasswordEncoder().encode(userForm.getPassword()));
		mediaUser.setName(userForm.getName1() + userForm.getName2());
		mediaUser.setReceiveConfigMail("1");
		mediaUser.setDeleteFlag("0");
		mediaUser.setCreateUser("system");
		mediaUser.setCreateDatetime(now);
		mediaUser.setUpdateUser("system");
		mediaUser.setUpdateDatetime(now);
		return mediaUserDao.insert(mediaUser);
	}

}
