package com.FTB.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.SearchLogical;

public class IndexServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String origin = request.getParameter("origin");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		origin = new String(origin.getBytes("ISO-8859-1"),"utf-8");
		destination = new String(destination.getBytes("ISO-8859-1"),"utf-8");
		date = new String(date.getBytes("ISO-8859-1"),"utf-8");
		System.out.println("origin="+origin);
		System.out.println("destination="+destination);
		System.out.println("date="+date);
		
		SearchLogical sl = new SearchLogical();
		ArrayList SFIList = sl.searchFlightInfoList(origin,destination,date);
		
		request.setAttribute("FlightInfoList", SFIList);
		request.getRequestDispatcher("flightInfo.jsp").forward(request,response);
		
	}

}