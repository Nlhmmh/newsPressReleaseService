package com.jp.sense.pr.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
/**
 * Response ツールクラス
 *	@author Li
　*/
public class ResponseUtils {
	
	public static void writeJson(HttpServletResponse response, String json)throws IOException {
		
		response.setCharacterEncoding("UTF-8");    
        response.setContentType("application/json;charset=UTF8");
        
        PrintWriter writer = response.getWriter();
        writer.write(json);
        writer.close();
	}
}
