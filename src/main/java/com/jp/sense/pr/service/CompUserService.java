package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompUserDao;
import com.jp.sense.pr.model.entity.CompUser;

@Service
@Transactional
public class CompUserService {
	
	@Autowired
	private CompUserDao compUserDao;
	
	/**
     *	認証用ユーザ取得関数
     *	author: Li
     */
	public List<CompUser> selectByEmail(String email) {
		return compUserDao.selectByEmail(email);
	}

}
