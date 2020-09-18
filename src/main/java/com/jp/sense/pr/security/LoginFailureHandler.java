package com.jp.sense.pr.security;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import com.jp.sense.pr.model.result.ResultFactory;
import com.jp.sense.pr.util.JsonUtils;
import com.jp.sense.pr.util.ResponseUtils;

/**
 * @author Li
 *	ログイン失敗処理コントローラー
　*/
public class LoginFailureHandler  extends SimpleUrlAuthenticationFailureHandler {
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
	
		// エラーメッセージをJSON で返還
		String json = JsonUtils.obj2String(ResultFactory.buildFailResult(exception.getMessage()));
		ResponseUtils.writeJson(response, json);
		
        return;
	}
}
