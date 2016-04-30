package com.FTB.AdminServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.FlightInfoLogical;

public class DeleteFlightServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String arrFlights[]= request.getParameterValues("flightInfo");
		int arr[] = new int[arrFlights.length];
		for(int i = 0; i< arrFlights.length; i++){
			arr[i]=Integer.parseInt(arrFlights[i]);
		}
		FlightInfoLogical fil = new FlightInfoLogical();
		Boolean result = fil.DeleteFlightInfo(arr);
		if(result){
			request.setAttribute("DOInfo", "Update successful!!");
			request.getRequestDispatcher("FlightInfoServlet").forward(request, response);
		}else{
			request.setAttribute("DOInfo", "Failed!!");
			request.getRequestDispatcher("FlightInfoServlet").forward(request, response);
		}
		//request.getRequestDispatcher("OrderServlet").forward(request,response);
	}

}