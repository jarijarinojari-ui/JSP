package com.global.mvc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/coupon")
public class CouponController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("CouponController.doGet");
		CouponModel.generateNumber(req);
		req.getRequestDispatcher("/WEB-INF/NewFile.jsp").forward(req, resp);
		
	}
}
