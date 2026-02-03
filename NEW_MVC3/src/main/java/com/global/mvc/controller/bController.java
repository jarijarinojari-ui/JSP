package com.global.mvc.controller;

import com.global.mvc.service.bService;

import jakarta.servlet.http.HttpServletRequest;

public class bController {
	
	public static String ctr(HttpServletRequest req) {
		bService.bService(req);
		return "/WEB-INF/a/NewFile.jsp";
	}
}
