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

import com.FTB.bean.OrderInfoBean;
import com.FTB.bean.flightInfoBean;
import com.FTB.bean.UserInfoBean;
import com.FTB.util.DBConnection;

public class OrderInfoLogical{
	public ArrayList getOrderInfoList(String user_id) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		ResultSet rs = null;
		OrderInfoBean oib = null;
		flightInfoBean fib = null;
		UserInfoBean uib = null;
		ArrayList oList = new ArrayList();
		ArrayList fList = new ArrayList();
		ArrayList uList = new ArrayList();
		String sql = "select * from orders,flightinfo,customers where orders.infoId=flightinfo.infoId and customers.user_id=orders.user_id and orders.user_id='"+user_id+"'";		
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()){
				oib = new OrderInfoBean();
				oib.setOrderId(rs.getInt("order_id"));
				oib.setStatus(rs.getString("status"));
				oList.add(oib);
				
				fib = new flightInfoBean();
				fib.setFlight_no(rs.getString("Flight_no"));
				fib.setOrigin(rs.getString("Origin"));
				fib.setDestination(rs.getString("Destination"));
				fib.setDate(rs.getString("Date"));
				fib.setDeparture_time(rs.getString("Departure_time"));
				fib.setArrival_time(rs.getString("Arrival_time"));
				fib.setDuration(rs.getString("Duration"));
				fib.setPrice(rs.getInt("Price"));
				fib.setRemain_ticket_no(rs.getInt("Remain_ticket_no"));
				fList.add(fib);
				
				uib = new UserInfoBean();
				uib.setBirthday(rs.getString("birthday"));
				uib.setName(rs.getString("name"));
				uib.setIdentification_no(rs.getInt("identification_no"));
				uib.setGender(rs.getString("gender"));
				uib.setEmail(rs.getString("email"));
				uList.add(uib);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				rs.close();
				stm.close();
				con.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ArrayList ALLList = new ArrayList();
		ALLList.add(oList);
		ALLList.add(fList);
		ALLList.add(uList);
		
		return ALLList;
	}
	
	public boolean DeleteOrderInfo(int order_id[]) {
		
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		int rs = 0;
		flightInfoBean fib = null;	
		String sql = "delete from orders where order_id="+order_id[0];
		for(int i=1;i<order_id.length;i++){
			sql= sql+" or order_id="+order_id[i];			
			System.out.println(sql);
		}
		try {
			stm = con.createStatement();
			rs = stm.executeUpdate(sql);
			if(rs>0)
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
		
	}
	
	 
	public boolean CreateOrderInfo(String user_id,int infoId) {		
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		int rs = 0;
		flightInfoBean fib = null;
		ArrayList SFIList = new ArrayList();
		String sql = "insert into orders values(0,'"+user_id+"',"+infoId+",'booked')";
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
	
	public ArrayList getAllOrderInfoList() {//for admin
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		ResultSet rs = null;
		OrderInfoBean oib = null;
		flightInfoBean fib = null;
		UserInfoBean uib = null;
		ArrayList oList = new ArrayList();
		ArrayList fList = new ArrayList();
		ArrayList uList = new ArrayList();
		String sql = "select * from orders,flightinfo,customers where orders.infoId=flightinfo.infoId and customers.user_id=orders.user_id ";		
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()){
				oib = new OrderInfoBean();
				oib.setOrderId(rs.getInt("order_id"));
				oib.setStatus(rs.getString("status"));
				oList.add(oib);
				
				fib = new flightInfoBean();
				fib.setFlight_no(rs.getString("Flight_no"));
				fib.setOrigin(rs.getString("Origin"));
				fib.setDestination(rs.getString("Destination"));
				fib.setDate(rs.getString("Date"));
				fib.setDeparture_time(rs.getString("Departure_time"));
				fib.setArrival_time(rs.getString("Arrival_time"));
				fib.setDuration(rs.getString("Duration"));
				fib.setPrice(rs.getInt("Price"));
				fib.setRemain_ticket_no(rs.getInt("Remain_ticket_no"));
				fList.add(fib);
				
				uib = new UserInfoBean();
				uib.setBirthday(rs.getString("birthday"));
				uib.setName(rs.getString("name"));
				uib.setIdentification_no(rs.getInt("identification_no"));
				uib.setGender(rs.getString("gender"));
				uib.setEmail(rs.getString("email"));
				uList.add(uib);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				rs.close();
				stm.close();
				con.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ArrayList ALLList = new ArrayList();
		ALLList.add(oList);
		ALLList.add(fList);
		ALLList.add(uList);
		
		return ALLList;
	}
}