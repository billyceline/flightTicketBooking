package com.FTB.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.OrderInfoLogical;

public class OrderServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		OrderInfoLogical oil = new OrderInfoLogical();
		ArrayList aList = oil.getOrderInfoList((String)request.getSession().getAttribute("user_id"));
		
		request.setAttribute("OrderInfoList", aList.get(0));
		request.setAttribute("FlightInfoList", aList.get(1));
		request.setAttribute("UserInfoList", aList.get(2));
		request.getRequestDispatcher("orders.jsp").forward(request,response);
	}

}