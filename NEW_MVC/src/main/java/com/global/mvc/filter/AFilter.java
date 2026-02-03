package com.global.mvc.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		//전처리 들어올 때 처리
		chain.doFilter(request, response);
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		if ( "192.168.0.".equals(ip) ) {
			chain.doFilter(request, response);
			PrintWriter pw = response.getWriter();
			pw.print("");
		}
		//나갈때 처리
		
	}

}
