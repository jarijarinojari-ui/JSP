package com.global.mvc;

import java.net.http.HttpRequest;

import jakarta.servlet.http.HttpServletRequest;

public class aModel {
	
	public static void a(HttpServletRequest req) {
		String a = "a";
		req.setAttribute("a", a);
	}

}
