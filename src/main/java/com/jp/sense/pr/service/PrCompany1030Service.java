package com.jp.sense.pr.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.CompUserDao;
import com.jp.sense.pr.model.dto.CompUserInfoFormDTO;
import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.util.CommonUtils;

/**
 * --ユーザー情報登録・詳細
 * --サービス
 * 
 * @author ネィ
 *
 */
@Service
@Transactional
public class PrCompany1030Service {
	
	@Autowired
	CompUserDao compUserDao;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	/**
	 * --企業のユーザー情報を登録する
	 * @author ネィ
	 * @param compUser
	 * @return
	 */
	public int insertCompUserInfo(int compId, CompUserInfoFormDTO compUserInfoFormDTO) {
		CompUser compUser = new CompUser();		
		Date now = new Date(System.currentTimeMillis());
		
		compUser.setName(compUserInfoFormDTO.getName1() + " " + compUserInfoFormDTO.getName2());
		compUser.setCompanyId(compId);
		compUser.setNameKana(compUserInfoFormDTO.getNameKatakana1() + " " + compUserInfoFormDTO.getNameKatakana2());
		compUser.setDepartment(compUserInfoFormDTO.getDepartment());
		compUser.setPhoneNo(compUserInfoFormDTO.getPhone1() + compUserInfoFormDTO.getPhone2() + compUserInfoFormDTO.getPhone3());
		compUser.setFax(compUserInfoFormDTO.getFax1() + compUserInfoFormDTO.getFax2() + compUserInfoFormDTO.getFax3());
		compUser.setEmail(compUserInfoFormDTO.getEmail());
		compUser.setPassword(new BCryptPasswordEncoder().encode(compUserInfoFormDTO.getPassword()));
		compUser.setWithAuthority(compUserInfoFormDTO.getReleaseDistributionAuthority() ? "1" : "0");
		compUser.setDeleteFlag("0");
		compUser.setCreateUser("system");
		compUser.setCreateDatetime(now);		
		compUser.setUpdateUser("system");
		compUser.setUpdateDatetime(now);
		
		return compUserDao.insert(compUser);
	}
	
	public CompUserInfoFormDTO selectCompUser(int compUserId) {
		CompUserInfoFormDTO compUserInfoFormDTO = new CompUserInfoFormDTO();
		
		CompUser compUser =  compUserDao.selectByPrimaryKey(compUserId);
		List<String> nameSeiMeiList = CommonUtils.splitNameSeiMeiBySpace(compUser.getName());
		List<String> nameKanaSeiMeiList = CommonUtils.splitNameSeiMeiBySpace(compUser.getNameKana());
		List<String> phoneNoList = CommonUtils.splitPhoneNo(compUser.getPhoneNo());
		List<String> faxNoList = CommonUtils.splitFaxNo(compUser.getFax());

		compUserInfoFormDTO.setId(compUser.getUserId().toString());
		compUserInfoFormDTO.setName1(nameSeiMeiList.get(0));
		compUserInfoFormDTO.setName2(nameSeiMeiList.get(1));
		compUserInfoFormDTO.setNameKatakana1(nameKanaSeiMeiList.get(0));
		compUserInfoFormDTO.setNameKatakana2(nameKanaSeiMeiList.get(1));
		compUserInfoFormDTO.setDepartment(compUser.getDepartment());
		compUserInfoFormDTO.setPhone1(phoneNoList.get(0));
		compUserInfoFormDTO.setPhone2(phoneNoList.get(1));
		compUserInfoFormDTO.setPhone3(phoneNoList.get(2));
		compUserInfoFormDTO.setFax1(faxNoList.get(0));
		compUserInfoFormDTO.setFax2(faxNoList.get(1));
		compUserInfoFormDTO.setFax3(faxNoList.get(2));
		compUserInfoFormDTO.setEmail(compUser.getEmail());
		compUserInfoFormDTO.setPassword(compUser.getPassword());
		compUserInfoFormDTO.setReleaseDistributionAuthority("1".equals(compUser.getWithAuthority()) ? true : false);
		
		return compUserInfoFormDTO;
	}
	
	/**
	 * --企業のユーザー情報を更新する
	 * @author ネィ
	 * @param compUser
	 * @return
	 */
	public int updateCompUserInfo(int compId, CompUserInfoFormDTO compUserInfoFormDTO) {
		CompUser compUser = new CompUser();		
		Date now = new Date(System.currentTimeMillis());
		
		compUser.setUserId(Integer.valueOf(compUserInfoFormDTO.getId()));
		compUser.setCompanyId(compId);
		compUser.setName(compUserInfoFormDTO.getName1() + " " + compUserInfoFormDTO.getName2());
		compUser.setNameKana(compUserInfoFormDTO.getNameKatakana1() + " " + compUserInfoFormDTO.getNameKatakana2());
		compUser.setDepartment(compUserInfoFormDTO.getDepartment());
		compUser.setPhoneNo(compUserInfoFormDTO.getPhone1() + compUserInfoFormDTO.getPhone2() + compUserInfoFormDTO.getPhone3());
		compUser.setFax(compUserInfoFormDTO.getFax1() + compUserInfoFormDTO.getFax2() + compUserInfoFormDTO.getFax3());
		compUser.setEmail(compUserInfoFormDTO.getEmail());
		compUser.setWithAuthority(compUserInfoFormDTO.getReleaseDistributionAuthority() ? "1" : "0");		
		compUser.setDeleteFlag("0");
		compUser.setUpdateUser("system");
		compUser.setUpdateDatetime(now);
		
		return compUserDao.updateByPrimaryKeySelective(compUser);
	}
	
	/**
	 * --企業のユーザー情報のパスワード更新処理
	 * @author ネィ
	 * @param oldPassword
	 * @param password
	 * @param user_id
	 * @return
	 */
	public int updatePassword(String oldPassword, String newPassword, String encryptedPassword, String userId) {
		if (passwordEncoder.matches(oldPassword, encryptedPassword)) {
			return compUserDao.updatePassword(newPassword, Integer.valueOf(userId));
		} else {
			return 0;
		}
	}

}
