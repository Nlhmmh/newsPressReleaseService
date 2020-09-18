package com.jp.sense.pr.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.jp.sense.pr.model.entity.CompUser;
import com.jp.sense.pr.model.entity.Company;

public class CompUserDetails extends BaseUserDetails  {

	/**
	 * generated.
	 */
	private static final long serialVersionUID = -4671545344375752959L;
	
	//------------------fields init-----------------------------------------
	private final CompUser user;
	
	public CompUserDetails(CompUser user) {// Constructor
		this.user = user;
	}
	
	private List<GrantedAuthority> authorities = new ArrayList<>();	// Roles
	{	// ユーザ種類 (ロール)の初期化
		authorities.add(new SimpleGrantedAuthority("ROLE_COMPUSER"));
	}
	
	//------------------getters for user--------------------------------------
	public Integer getUserId() {
		return user.getUserId();
	}
	public Integer getCompanyId() {
		return user.getCompanyId();
	}
	public Company getCompany() {
		return user.getCompany();
	}
	public String getName() {
		return user.getName();
	}
	public String getWithAuthority() {
		return user.getWithAuthority();
	}
	
	//------------------methods for auth----------------------------------
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	@Override
	public String getUsername() {
		return user.getEmail();
	}
	@Override
	public String getPassword() {
		return user.getPassword();
	}
	
	//------------------other properties--------------------------------
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
