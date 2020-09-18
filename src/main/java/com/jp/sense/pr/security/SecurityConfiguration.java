package com.jp.sense.pr.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jp.sense.pr.service.SecurityMediaUserDetailsService;
import com.jp.sense.pr.service.SecurityCompUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
    UserDetailsService compUserUDS() {
        return new SecurityCompUserDetailsService();
    }
	@Bean
	UserDetailsService mediaUserUDS() {
        return new SecurityMediaUserDetailsService();
    }
	@Bean
	UnauthorizedHandler unauthorizedHandler() {
        return new UnauthorizedHandler();
    }
	
    @Bean
    @Override
	protected AuthenticationManager authenticationManager() throws Exception {
    	
    	DaoAuthenticationProvider compDaoAuthProvider = new DaoAuthenticationProvider();
    	compDaoAuthProvider.setUserDetailsService(compUserUDS());
    	compDaoAuthProvider.setPasswordEncoder(passwordEncoder());
    	
    	DaoAuthenticationProvider mediaDaoAuthProvider = new DaoAuthenticationProvider();
    	mediaDaoAuthProvider.setUserDetailsService(mediaUserUDS());
    	mediaDaoAuthProvider.setPasswordEncoder(passwordEncoder());
    	
    	// 複数のDaoAuthProviderにより複数のUserDetailsServiceを配置する  >>  ProviderManager(dao1, dao2)
        ProviderManager manager = new ProviderManager(compDaoAuthProvider,mediaDaoAuthProvider);
        return manager;
	}
    
	@Override
    protected void configure(HttpSecurity http) throws Exception{
        http
        	.formLogin().loginProcessingUrl("/user/userLogin")			// login url
        				.successHandler(new LoginSuccessHandler())
        				.failureHandler(new LoginFailureHandler())
        		.and()
    		.logout().logoutSuccessUrl("/")
    			.and()
        	.authorizeRequests()										// 管理画面参照権限設定
        	.antMatchers("/company/**").hasRole("COMPUSER")
        	.antMatchers("/media/**").hasRole("MEDIAUSER")
        		.and()
        	.exceptionHandling().authenticationEntryPoint(unauthorizedHandler())// 未認証ユーザが訪問
        						.accessDeniedHandler(unauthorizedHandler())		// 認証したユーザが訪問
        		.and()
        	.httpBasic().disable()
        	.csrf().disable();
    }
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().
			antMatchers("/css/**", "/js/**");
	}

}