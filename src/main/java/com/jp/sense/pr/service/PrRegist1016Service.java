package com.jp.sense.pr.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.MasterManagementDao;
import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.dto.MediaUserRegisterFormDTO;
import com.jp.sense.pr.model.entity.MasterManagement;
import com.jp.sense.pr.model.entity.MediaUser;

/**
 * --メディア登録 
 * --サービス
 * 
 * @author ネィ
 *
 */
@Service
@Transactional
public class PrRegist1016Service {
	
	@Autowired
	MediaUserDao mediaUserDao;
	
	@Autowired
	MasterManagementDao masterManagementDao;
	
	/**
	 * --新しいメディアユーザー追加
	 * 
	 * @param userForm
	 * @return 処理ステータス
	 */
	public int insertMediaUser(MediaUserRegisterFormDTO userForm) {
		MediaUser mediaUser = new MediaUser();
		Date now = new Date(System.currentTimeMillis());
		mediaUser.setAccountType("1");
		mediaUser.setEmail(userForm.getEmail());
		mediaUser.setPassword(new BCryptPasswordEncoder().encode(userForm.getPassword()));
		mediaUser.setName(userForm.getName1() + userForm.getName2());
		mediaUser.setMediumCompanyName(userForm.getMediumCompanyName());
		mediaUser.setMediumType(masterManagementDao.selectMediaTypeID(userForm.getMediumType()));
		mediaUser.setMediumName(userForm.getMediumName());
		mediaUser.setMediumNameExtra(userForm.getMediumNameExtra());
		mediaUser.setAddress1(userForm.getAddress1());
		mediaUser.setAddress2(userForm.getAddress2());
		mediaUser.setAddress3(userForm.getAddress3());
		mediaUser.setPhoneNo(userForm.getPhoneNo1()+userForm.getPhoneNo2()+userForm.getPhoneNo3());
		mediaUser.setFax(userForm.getPhoneNo1()+userForm.getPhoneNo2()+userForm.getPhoneNo3());
		mediaUser.setReceiveConfigMail("1");
		mediaUser.setDeleteFlag("0");
		mediaUser.setCreateUser("system");
		mediaUser.setCreateDatetime(now);
		mediaUser.setUpdateUser("system");
		mediaUser.setUpdateDatetime(now);
		return mediaUserDao.insert(mediaUser);
	}
	
	/**
	 * --メディア種類リストを取得する
	 * 
	 * @param id
	 * @return 処理ステータス
	 */
	public List<MasterManagement> selectMediaTypes(Integer id) {
		return masterManagementDao.selectMediaTypes(id);
	}

}
