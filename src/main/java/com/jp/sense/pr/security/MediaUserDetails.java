package com.jp.sense.pr.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.jp.sense.pr.model.entity.MediaUser;

public class MediaUserDetails extends BaseUserDetails {

	/**
	 * generated.
	 */
	private static final long serialVersionUID = -3002655108095163762L;
	
	
	private final MediaUser user;
	public MediaUserDetails(MediaUser user) {// Constructor
		this.user = user;
	}
	private List<GrantedAuthority> authorities = new ArrayList<>();	// Roles
	{	// ユーザ種類 (ロール)の初期化
		authorities.add(new SimpleGrantedAuthority("ROLE_MEDIAUSER"));
	}
	//-----------------------------------------------------------------
	
	public Integer getId() {
		return user.getId();
	}
	public String getAccountType() {
		return user.getAccountType();
	}
	public String getName() {
		return user.getName();
	}
	public String getReceiveConfigMail() {
		return user.getReceiveConfigMail();
	}
	
	//-----------------------------------------------------------------
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}
	//-------------------------------------------------------------
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
