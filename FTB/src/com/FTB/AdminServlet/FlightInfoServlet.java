package com.FTB.AdminServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.FlightInfoLogical;

public class FlightInfoServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		FlightInfoLogical il = new FlightInfoLogical();
		ArrayList aList = il.getNewFlightInfoList();
		
		request.setAttribute("FlightInfoList", aList);
		request.getRequestDispatcher("AllFlights.jsp").forward(request,response);
	}

}

