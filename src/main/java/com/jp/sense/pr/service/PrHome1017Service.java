package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompanyDao;
import com.jp.sense.pr.dao.PressReleaseDao;
import com.jp.sense.pr.model.dto.PressReleaseListDTO;
import com.jp.sense.pr.model.entity.Company;

@Service
@Transactional
public class PrHome1017Service {
	
	
	@Autowired
	PressReleaseDao pressReleaseDao;
	
	@Autowired
	CompanyDao companyeDao;
	
	
	/**
	 * --プレスリリース画像取得
	 * 
	 * @return プレスリリース画像リスト
	 * 
	 */	
	public List<PressReleaseListDTO>  selectPrImage(Integer cid){
		
		List<PressReleaseListDTO> list = pressReleaseDao.selectPrImage(cid);
		
		return list;
	}
	
	/**
	 * --プレスリリース一覧取得
	 * 
	 * @return プレスリリースリスト
	 * 
	 */	
	public List<PressReleaseListDTO>  selectPrList(Integer cid){
		
		List<PressReleaseListDTO> list = pressReleaseDao.selectPrList(cid);
		
		return list;
	}

	/**
	 * --検索ボタン押下
	 * 
	 * @return プレスリリースリスト
	 * 
	 */	
	public List<PressReleaseListDTO>  pushKensakuBtn(String keyword, Integer cid){
		
		List<PressReleaseListDTO> list = pressReleaseDao.pushKensakuBtn(keyword, cid);
				
		return list;
	}

	/**
	 * --もっと見るボタン押下
	 * 
	 * @return プレスリリースリスト
	 * 
	 */	
	public List<PressReleaseListDTO>  selectPrListMore(Integer cid,Integer count){
		
		List<PressReleaseListDTO> list = pressReleaseDao.selectPrListMore(cid,count);
		return list;
	}
	
	/**
	 * --企業情報取得
	 * 
	 * @return 企業情報
	 * 
	 */	
	public Company selectByPrimaryKey(Integer cid) {
		
		Company comp =  companyeDao.selectByPrimaryKey(cid);

		return comp;
	}

}
