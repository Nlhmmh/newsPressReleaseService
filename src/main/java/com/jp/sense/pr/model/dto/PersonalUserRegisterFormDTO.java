package com.jp.sense.pr.model.dto;

/**
 * --個人登録 フォーム項目
 * 
 * @author ネィ
 *
 */
public class PersonalUserRegisterFormDTO extends BaseDTO {

	private String email;
	private String password;
	private String passwordRe;
	private String name1;
	private String name2;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRe() {
		return passwordRe;
	}

	public void setPasswordRe(String passwordRe) {
		this.passwordRe = passwordRe;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

}
