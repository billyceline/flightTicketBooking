package com.FTB.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.OrderInfoLogical;

public class DeleteOrderServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String arrOrders[]= request.getParameterValues("orders");
		int arr[] = new int[arrOrders.length];
		for(int i = 0; i< arrOrders.length; i++){
			arr[i]=Integer.parseInt(arrOrders[i]);
		}
		OrderInfoLogical oil = new OrderInfoLogical();
		Boolean result = oil.DeleteOrderInfo(arr);
		if(result){
			request.setAttribute("DOInfo", "Update successful!!");
			request.getRequestDispatcher("OrderServlet").forward(request, response);
		}else{
			request.setAttribute("DOInfo", "Failed!!");
			request.getRequestDispatcher("OrderServlet").forward(request, response);
		}
		//request.getRequestDispatcher("OrderServlet").forward(request,response);
	}

}