package com.global.mvc.service;

import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;

public class bService {

	public static void bService(HttpServletRequest req) {
		String uuid = UUID.randomUUID().toString();
		req.setAttribute("uuid", uuid);
	}
}
