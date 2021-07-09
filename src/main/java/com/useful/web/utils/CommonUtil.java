package com.useful.web.utils;

import javax.servlet.http.HttpServletRequest;

public class CommonUtil {

	public static String getClientIp_bak(HttpServletRequest req) {
	    String ip = req.getHeader("X-Forwarded-For");
	    if (ip == null) ip = req.getRemoteAddr();
	    return ip;
	}
	
	public static String getClientIp(HttpServletRequest req) {
	    return req.getRemoteAddr();
	}
}
