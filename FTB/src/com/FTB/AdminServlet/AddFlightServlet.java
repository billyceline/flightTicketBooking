package com.FTB.AdminServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.FlightInfoLogical;

public class AddFlightServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		String flight_no = request.getParameter("flight_no");
		String origin = request.getParameter("origin");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		String departure_time = request.getParameter("departure_time");
		String arrival_time = request.getParameter("arrival_time");
		String duration = request.getParameter("duration");
		String price_s = request.getParameter("price");
		String remain_ticket_s = request.getParameter("remain_ticket");
		int price = Integer.parseInt(price_s);
		int remain_ticket = Integer.parseInt(remain_ticket_s);
		flight_no = new String(flight_no.getBytes("ISO-8859-1"),"utf-8");
		origin = new String(origin.getBytes("ISO-8859-1"),"utf-8");
		destination = new String(destination.getBytes("ISO-8859-1"),"utf-8");
		flight_no = new String(flight_no.getBytes("ISO-8859-1"),"utf-8");
		
		
		FlightInfoLogical fil = new FlightInfoLogical();
		Boolean result = fil.AddFlightInfo(flight_no,origin,destination,date,departure_time,arrival_time,duration,price,remain_ticket);
		if(result){
			request.getRequestDispatcher("FlightInfoServlet").forward(request, response);
		}else{
			request.setAttribute("COInfo", "Failed!!");
			request.getRequestDispatcher("FlightInfoServlet").forward(request, response);
		}
		
	}

}