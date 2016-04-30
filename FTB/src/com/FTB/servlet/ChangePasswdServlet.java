package com.FTB.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.logical.UpdateLogical;

public class ChangePasswdServlet extends HttpServlet {

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
		String user_id = (String)request.getSession().getAttribute("user_id");
		//System.out.println("userid = "+user_id);
		String password = request.getParameter("txtPassWord");
		//String user_id = request.getAttribute("user_id");
		user_id = new String(user_id.getBytes("ISO-8859-1"),"utf-8");
		
		UpdateLogical ul = new UpdateLogical();
		boolean rt = ul.UpdatePasswd(user_id,password);
		
		if(rt){
			request.setAttribute("fInfo", "Update successful!!");
			request.getRequestDispatcher("changePasswd.jsp").forward(request, response);
		}else{
			request.setAttribute("fInfo", "Failed!!");
			request.getRequestDispatcher("changePasswd.jsp").forward(request, response);
		}
		
	}

}
