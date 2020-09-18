package com.jp.sense.pr.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.commons.Constants;
import com.jp.sense.pr.dao.CompBillingInfoDao;
import com.jp.sense.pr.dao.CompUserDao;
import com.jp.sense.pr.dao.CompanyCategoryDao;
import com.jp.sense.pr.dao.CompanyDao;
import com.jp.sense.pr.model.dto.CompanyRegistPageFormDTO;
import com.jp.sense.pr.model.entity.CompBillingInfo;
import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.model.entity.Company;
import com.jp.sense.pr.model.entity.CompanyCategory;
import com.jp.sense.pr.util.CommonUtils;

@Service
@Transactional
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private CompanyCategoryDao companyCategoryDao;
	
	@Autowired
	private CompUserDao compUserDao;
	
	@Autowired
	private CompBillingInfoDao compBillingInfoDao;
	
	/**
	 * 企業登録処理
	 * @author: Li
	 */
	public boolean regCompAndUser(CompanyRegistPageFormDTO form) {
		
		boolean isSuccess = false;
		
		// 企業情報登録
		Company insComp = new Company();
		regCompInfo(form,insComp);
		
		// 登録した企業のIDを取得
		Integer compId = insComp.getId();//  keyProperty="id"
		if(compId == null) {
			throw new RuntimeException("処理中エラーが発生しました。");
		}

		// 企業カテゴリ登録
		String[] corpCate = form.getCorporateCategory();
		if(corpCate != null && corpCate.length > 0) {
			regCorpCateInfo(corpCate,compId);
		}
		
		// 企業ユーザ情報登録
		CompUser insUser = new CompUser();
		regCompUserInfo(form,insUser,compId);
		
		// 企業請求先情報登録
		CompBillingInfo insCompBillInfo = new CompBillingInfo();
		regCompBillInfo(form,insCompBillInfo,compId);
			
		isSuccess = true;
		
		return isSuccess;
	}
	
	private void regCompInfo(CompanyRegistPageFormDTO form,Company insComp) {
		
		String establishmentDate = null;							// 法人設立年月
		if( !"".equals(CommonUtils.null2Blank(form.getIncorporateYear())) &&
			!"".equals(CommonUtils.null2Blank(form.getIncorporateMonth()))) {
			establishmentDate = form.getIncorporateYear()+"-"+form.getIncorporateMonth();
		}
		Date estblshmtDate = CommonUtils.str2DateByFormat(establishmentDate, "yyyy-MM");
		String representativePhoneNo = CommonUtils.null2Blank(form.getRepresentPhoneTxt1())
								+ "-" + CommonUtils.null2Blank(form.getRepresentPhoneTxt2())
								+ "-" + CommonUtils.null2Blank(form.getRepresentPhoneTxt3());
		
		String listingCategory = form.getListingCategory();
		String industryCategory = form.getIndustryCategory();
		String companyCategory1 = form.getBusinessCategory1();
		String companyCategory2 = form.getBusinessCategory2();
		String companyCategory3 = form.getBusinessCategory3();
		
		insComp.setCorporateName(form.getCorporateName());
		insComp.setCorporateNameKana(form.getCorporateNameKana());
		insComp.setRepresentativeName(form.getRepresentName());
		insComp.setRepresentativePosition(form.getRepresentPosition());
		insComp.setEstablishmentDate(estblshmtDate);
		insComp.setAddress1(form.getZipCode());
		insComp.setAddress2(form.getPrefecture());
		insComp.setAddress3(form.getBuilding());
		insComp.setRepresentativePhoneNo(representativePhoneNo);
		
//		insComp.setListingCategory(CommonUtils.str2Integer(listingCategory));// TODO：DB形がまだvarchar
		
		insComp.setSecurityCode(form.getSecurityCode());
		insComp.setCapitalAmount(form.getCapitalAmount());
		insComp.setNumOfEmployees(form.getNumOfEmployee());
		insComp.setSiteUrl(form.getSiteURL());
		insComp.setIndustryCategory(CommonUtils.str2Integer(industryCategory));
		insComp.setCompanyCategory1(CommonUtils.str2Integer(companyCategory1));
		insComp.setCompanyCategory2(CommonUtils.str2Integer(companyCategory2));
		insComp.setCompanyCategory3(CommonUtils.str2Integer(companyCategory3));
		
		insComp.setDeleteFlag(Constants.DELETE_FLG_OFF);
		insComp.setCreateUser(Constants.USER_SYSTEM);
		insComp.setCreateDatetime(new Date());
		insComp.setUpdateUser(Constants.USER_SYSTEM);
		insComp.setUpdateDatetime(new Date());
		
		companyDao.insertSelective(insComp);
	}
	private void regCorpCateInfo(String[] corpCate, Integer compId) {
		for (String cateId:corpCate) {
			CompanyCategory insCompCate = new CompanyCategory();
			insCompCate.setCompanyId(compId);
			insCompCate.setCompCateId(CommonUtils.str2Integer(cateId));
			insCompCate.setDeleteFlag(Constants.DELETE_FLG_OFF);
			insCompCate.setCreateUser(Constants.USER_SYSTEM);
			insCompCate.setCreateDatetime(new Date());
			insCompCate.setUpdateUser(Constants.USER_SYSTEM);
			insCompCate.setUpdateDatetime(new Date());
			
			companyCategoryDao.insertSelective(insCompCate);
		}
	}
	private void regCompUserInfo(CompanyRegistPageFormDTO form,CompUser insUser,int compId) {
		String name = CommonUtils.null2Blank(form.getNameTxt1())+CommonUtils.null2Blank(form.getNameTxt2());
		String nameKana = CommonUtils.null2Blank(form.getNameKanaTxt1())+CommonUtils.null2Blank(form.getNameKanaTxt2());
		String phoneNo = CommonUtils.null2Blank(form.getPhoneTxt1())
				+ "-" + CommonUtils.null2Blank(form.getPhoneTxt2())
				+ "-" + CommonUtils.null2Blank(form.getPhoneTxt3());
		String fax =  CommonUtils.null2Blank(form.getFaxTxt1())
				+ "-" + CommonUtils.null2Blank(form.getFaxTxt2())
				+ "-" + CommonUtils.null2Blank(form.getFaxTxt3());
		
		insUser.setCompanyId(compId);
		insUser.setWithAuthority(Constants.DELETE_FLG_ON);
		
		insUser.setEmail(form.getMailAddress());
		insUser.setPassword(new BCryptPasswordEncoder().encode(form.getPassword()));
		insUser.setDepartment(form.getDepartment());
		insUser.setName(name);
		insUser.setNameKana(nameKana);
		insUser.setPhoneNo(phoneNo);
		insUser.setFax(fax);
		
		insUser.setDeleteFlag(Constants.DELETE_FLG_OFF);
		insUser.setCreateUser(Constants.USER_SYSTEM);
		insUser.setCreateDatetime(new Date());
		insUser.setUpdateUser(Constants.USER_SYSTEM);
		insUser.setUpdateDatetime(new Date());
		
		compUserDao.insertSelective(insUser);
	}
	private void regCompBillInfo(CompanyRegistPageFormDTO form, CompBillingInfo insCompBillInfo, Integer compId) {
		String billingName = CommonUtils.null2Blank(form.getBillingNameTxt1())+CommonUtils.null2Blank(form.getBillingNameTxt2());
		String billingNameKana = CommonUtils.null2Blank(form.getBillingNameTxt1())+CommonUtils.null2Blank(form.getBillingNameTxt2());
		
		insCompBillInfo.setId(compId);
		insCompBillInfo.setCompanyName(form.getBillingCompanyName());
		insCompBillInfo.setBillingAddress1(form.getBillingAddressTxt1());
		insCompBillInfo.setBillingAddress2(form.getBillingAddressTxt2());
		insCompBillInfo.setBillingAddress3(form.getBillingAddressTxt3());
		insCompBillInfo.setBillingDepartment(form.getBillingDepartment());
		insCompBillInfo.setBillingName(billingName);
		insCompBillInfo.setBillingNameKana(billingNameKana);
		insCompBillInfo.setBillingEmail(form.getBillingMail());
		
		insCompBillInfo.setDeleteFlag(Constants.DELETE_FLG_OFF);
		insCompBillInfo.setCreateUser(Constants.USER_SYSTEM);
		insCompBillInfo.setCreateDatetime(new Date());
		insCompBillInfo.setUpdateUser(Constants.USER_SYSTEM);
		insCompBillInfo.setUpdateDatetime(new Date());
		
		compBillingInfoDao.insertSelectiveWithId(insCompBillInfo);
	}
}
