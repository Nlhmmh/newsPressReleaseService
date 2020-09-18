package com.jp.sense.pr.security;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.jp.sense.pr.model.result.ResultFactory;
import com.jp.sense.pr.util.JsonUtils;
import com.jp.sense.pr.util.ResponseUtils;

/**
 * @author Li
 *	ログイン成功遷移先処理コントローラー
　*/
public class LoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		// ロール取得
		Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
		
		String path = "";
		if (roles.contains("ROLE_COMPUSER")){// 企業ユーザの場合
			path = "/company/index";
        }
		if (roles.contains("ROLE_MEDIAUSER")){// メディア・個人ユーザの場合
			path = "/media/index";
        }
		
		String json = JsonUtils.obj2String(ResultFactory.buildSuccessResult(path));
		ResponseUtils.writeJson(response, json);
        return;
	}
}
