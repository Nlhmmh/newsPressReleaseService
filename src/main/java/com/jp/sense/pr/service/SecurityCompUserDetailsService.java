package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jp.sense.pr.dao.CompUserDao;
import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.security.exception.TooMuchAccountException;

/**
 * @author Li 企業ユーザ認証処理クラス
 */
public class SecurityCompUserDetailsService implements UserDetailsService {

	@Autowired
	private CompUserDao compUserDao;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		List<CompUser> user = compUserDao.selectByEmailWithCompany(email);
		
		if (user.isEmpty()) {
			throw new UsernameNotFoundException(email + " not found");
		}
		if (user.size() > 1) {
			throw new TooMuchAccountException("there're too much accounts of: "+ email);
		}
		
		return new CompUserDetails(user.get(0));
	}

}
