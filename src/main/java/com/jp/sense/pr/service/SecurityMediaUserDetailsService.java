package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.jp.sense.pr.dao.MediaUserDao;
import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.model.entity.MediaUser;
import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.security.MediaUserDetails;
import com.jp.sense.pr.security.exception.TooMuchAccountException;

/**
 * @author Li メディアユーザ認証処理クラス
 */
public class SecurityMediaUserDetailsService implements UserDetailsService {

	@Autowired
	private MediaUserDao mediaUserDao;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		List<MediaUser> user = mediaUserDao.selectByEmail(email);
		if (user.isEmpty()) {
			throw new UsernameNotFoundException(email + " not found");
		}
		if (user.size() > 1) {
			throw new TooMuchAccountException("there're too much accounts of: "+ email);
		}
		
		return new MediaUserDetails(user.get(0));
	}
}
