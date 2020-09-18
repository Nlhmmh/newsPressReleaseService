package com.jp.sense.pr.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.jp.sense.pr.dao.CompanyDao;
import com.jp.sense.pr.model.entity.Company;
import com.jp.sense.pr.security.BaseUserDetails;
import com.jp.sense.pr.security.CompUserDetails;

@Component // private static field Autowired failure (1/2)
public class UserManager<T extends BaseUserDetails>{
	
	private static CompanyDao companyDao;
	

	@Autowired // private static field Autowired failure (2/2)
	public void setCompanyDao(CompanyDao companyDao) {
		UserManager.companyDao = companyDao;
	}
	
	
	public static <T extends BaseUserDetails>T getLoginUser(Class<T> clazz) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authentication.getPrincipal();
		T result = safeTypeConvert(principal,clazz);

		return result;
	}
	
	public static Company getLoginCompany() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authentication.getPrincipal();

		BaseUserDetails loginuser = safeTypeConvert(principal,BaseUserDetails.class);
		
		// login check
		if (loginuser == null) {
			throw new RuntimeException("ログインユーザがありません。");
		}
		
		// role type check
		boolean isCompUser = false;
		for (GrantedAuthority role : loginuser.getAuthorities()) {
			if (role!= null && "ROLE_COMPUSER".equals(role.getAuthority())) {
				isCompUser = true;
			}
		}
		if(!isCompUser) {
			throw new RuntimeException("企業ユーザではありません。");
		}
		
		// get id
		CompUserDetails cud = (CompUserDetails)loginuser;
		int compid = cud.getCompanyId();
		
		// rtn data
		return companyDao.selectByPrimaryKey(compid);
	}
	
	private static <T> T safeTypeConvert(Object obj, Class<T> clazz) {
        if (obj == null) {
            return null;
        }
 
        T retObject = null;
        try {
            retObject = clazz.cast(obj);
        } catch (ClassCastException e) {
            // silent
        }
        return retObject;
    }
}
