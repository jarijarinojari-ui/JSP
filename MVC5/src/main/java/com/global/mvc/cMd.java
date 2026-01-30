package com.global.mvc;

import jakarta.servlet.http.HttpServletRequest;

public class cMd {
	static void b(HttpServletRequest req) {
		String a = "123";
		req.setAttribute("a", a);
	}
}
