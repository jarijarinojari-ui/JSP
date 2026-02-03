package com.global.mvc.servlet;

import java.io.IOException;

import com.global.mvc.controller.bController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(this);
		String uri = req.getRequestURI();
		System.out.println(uri);
		if (uri.contains("NEW_MVC3/a/uuid")) {
			String view = bController.ctr(req);
			req.getRequestDispatcher(view).forward(req, resp);
		}
	}
}
