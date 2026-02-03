package com.global.mvc.controoler;

import com.global.mvc.service.AService;

import jakarta.servlet.http.HttpServletRequest;

public class AController {
	
	public static String a (HttpServletRequest req) {
		String uuid = AService.uuid();
		req.setAttribute("uuid", uuid);
		return "/WEB-INF/views/a.jsp";
	}
}
