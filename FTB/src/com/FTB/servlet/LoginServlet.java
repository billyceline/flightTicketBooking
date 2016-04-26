package com.FTB.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.LoginLogical;

public class LoginServlet extends HttpServlet {

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

		String user_id = request.getParameter("user_id");
		String password = request.getParameter("password");		
		user_id = new String(user_id.getBytes("ISO-8859-1"),"utf-8");
		
		LoginLogical ll = new LoginLogical();
		boolean rt = ll.checkUser(user_id,password);
		
		if(rt){
			request.getSession().setAttribute("user_id", user_id);//set login id
			response.sendRedirect("FlightInfoServlet");
		}else{
			request.setAttribute("rInfo", "The username/password is wrong!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
