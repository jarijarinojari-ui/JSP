package com.global.mvc;

import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;

public class CouponModel {
	
	static void setCoupon(HttpServletRequest req) {
		String num = UUID.randomUUID().toString();
		req.setAttribute("num", num);
		
	}
}
