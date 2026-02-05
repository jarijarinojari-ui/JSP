package com.global.session.servlet;

import jakarta.servlet.http.HttpServletRequest;

public class LoginServlet {

	public static boolean login(HttpServletRequest req) {
		String userId = req.getParameter("userId");
		String userPw = req.getParameter("userPw");
		if ( "hong".equals(userId) && "1234".equals(userPw)) {
			req.getSession().setAttribute("LOGIN", true);
			req.getSession().setAttribute("userId", userId);
			return true;
		} else {
			return false;
		}
		
	}
	public static void logout(HttpServletRequest req) {
		req.getSession().removeAttribute("LOGIN");
		req.getSession().invalidate();
	}
}
