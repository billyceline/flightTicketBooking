package com.FTB.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.OrderInfoLogical;

public class CreateOrderServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user_id = (String)request.getSession().getAttribute("user_id"); 
		String arrOrders = request.getParameter("flightInfo");		
		int infoId = Integer.parseInt(arrOrders);
		OrderInfoLogical oil = new OrderInfoLogical();
		Boolean result = oil.CreateOrderInfo(user_id,infoId);
		if(result){
			request.getRequestDispatcher("OrderServlet").forward(request, response);
		}else{
			request.setAttribute("COInfo", "Failed!!");
			request.getRequestDispatcher("flightInfo.jsp").forward(request, response);
		}
		//OrderInfoLogical oil = new OrderInfoLogical();
		//ArrayList aList = oil.CreateOrderInfo(user_id,infoId);
		//request.getRequestDispatcher("OrderServlet").forward(request,response);
	}

}