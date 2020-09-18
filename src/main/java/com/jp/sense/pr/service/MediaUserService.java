package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.entity.MediaUser;

@Service
@Transactional
public class MediaUserService {

	@Autowired
	private MediaUserDao mediaUserDao;
	
	/**
     *	認証用ユーザ取得関数
     *	author: Li
     */
	public List<MediaUser> selectByEmail(String email) {
		return mediaUserDao.selectByEmail(email);
	}
	
}
