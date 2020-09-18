package com.jp.sense.pr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.sense.pr.dao.MasterManagementDao;
import com.jp.sense.pr.model.entity.MasterManagement;

@Service
public class MasterManagementService {
	
	@Autowired
	private MasterManagementDao masterManagementDao;
	
	public List<MasterManagement> getAbsoluteChildren(int pid) {
		
		
		List<MasterManagement> target  = masterManagementDao.getAbsoluteChildren(pid);
		return target;
	}

}
