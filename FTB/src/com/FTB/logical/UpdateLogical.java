package com.FTB.logical;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FTB.bean.flightInfoBean;
import com.FTB.util.DBConnection;

public class UpdateLogical{
	public boolean UpdateCustomerInfo(String user_id,String Name,String Gender,String Birthday,int ID_number, String Email) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		int rs = 0;
		flightInfoBean fib = null;
		ArrayList SFIList = new ArrayList();
		String sql = "update customers set name='"+Name+"', identification_no="+ID_number+", birthday='"+Birthday+"', gender='"+Gender+"', email='"+Email+"' where user_id='"+user_id+"'";
		System.out.println(sql);
		try {
			stm = con.createStatement();
			rs = stm.executeUpdate(sql);
			System.out.println("rs="+rs);
			if(rs>0)
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
		
	}
	
	public boolean UpdatePasswd(String user_id,String password) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		int rs = 0;
		flightInfoBean fib = null;
		ArrayList SFIList = new ArrayList();
		String sql = "update customers set password='"+password+"' where user_id='"+user_id+"'";
		System.out.println(sql);
		try {
			stm = con.createStatement();
			rs = stm.executeUpdate(sql);
			//System.out.println("rs="+rs);
			if(rs>0)
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
		
	}
}