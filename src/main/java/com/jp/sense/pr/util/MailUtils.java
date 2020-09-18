package com.jp.sense.pr.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 *	メール送信クラス
 * 
 * @author ネィ
 *
 */
@Scope("prototype")
@Service
public class MailUtils {

	@Autowired
	private JavaMailSender javaMailSender;

	/**
	 *	メール送信者
	 *	application.properties　参考
	 */
	@Value("${spring.mail.properties.mail.from}")
	private String fromAddress;

	/**
	 *	メール送信処理
	 * 
	 * @param userEmail
	 * @param subject
	 * @param mailTemplateHtml
	 */
	public void sendMail(String userEmail, String subject, String mailTemplateHtml) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(fromAddress);
			message.setTo(userEmail);
			message.setSubject(subject);
			message.setText(getMailText(userEmail, mailTemplateHtml));
			javaMailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *	テンプレートからメール内容取得処理
	 * 
	 * @param userEmail
	 * @param mailTemplateHtml
	 * @return メール内容
	 */
	private String getMailText(String userEmail, String mailTemplateHtml) {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(emailTemplateResolver());
		Context context = new Context();
		context.setVariable("userEmail", userEmail);
		String result = null;
		try {
			result = templateEngine.process(mailTemplateHtml, context);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private ClassLoaderTemplateResolver emailTemplateResolver() {
		ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setPrefix("templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setCacheable(true);
		return templateResolver;
	}
}