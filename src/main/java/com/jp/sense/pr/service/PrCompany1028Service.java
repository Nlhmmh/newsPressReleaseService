package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompMediaListDao;
import com.jp.sense.pr.dao.CompUserDao;
import com.jp.sense.pr.model.dto.PressReleaseCompMediaListDTO;
import com.jp.sense.pr.model.entity.CompUser;

@Service
@Transactional
public class PrCompany1028Service {
	
	
	@Autowired
	CompUserDao compUserDao;
	
	/**
	 * 
	 * 
	　*企業ID
	 * 
	 */
	
	public List<CompUser>  selectByCompanyId(Integer cid){
		
		List<CompUser> list = compUserDao.selectByCompanyId(cid);
		
		return list;
	}
	
	
	/**
	 * 
	 * 
	　*userID
	 * 
	 */
	
	public CompUser  selectByPrimaryKey(Integer cid){
		
		CompUser user = compUserDao.selectByPrimaryKey(cid);
		
		return user;
	}
	
	
	
	public int updateDeleteFlag(Integer userId){
		
		int res = compUserDao.updateDeleteFlag(userId);
		
		return res;
	}

}
