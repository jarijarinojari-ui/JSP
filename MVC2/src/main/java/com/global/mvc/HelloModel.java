package com.global.mvc;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloModel{
	
	public static void hello(HttpServletRequest req) {
		// 1. UUID 객체 생성 (v4: 무작위 생성)
        UUID uuid = UUID.randomUUID();

        // 2. 문자열로 변환
        String uuidString = uuid.toString();
		String msg = String.format("쿠폰 번호는 %s 입니다.", uuidString );
		req.setAttribute("msg", msg);
	}
}
