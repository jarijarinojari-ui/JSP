package com.global.mvc;

import jakarta.servlet.http.HttpServletRequest;

public class HelloModel {
	
	public static void hello(HttpServletRequest req) {
		String query = req.getParameter("query");
		String msg = String.format("입력하신 글자는 %d자 입니다.", query.length() );
		req.setAttribute("msg", msg);
	
	}

}
