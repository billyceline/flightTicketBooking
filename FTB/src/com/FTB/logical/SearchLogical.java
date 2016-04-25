package com.FTB.logical;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.FTB.bean.flightInfoBean;
import com.FTB.util.DBConnection;

public class SearchLogical{
	public ArrayList searchFlightInfoList(String origin,String destination,String date) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		ResultSet rs = null;
		flightInfoBean fib = null;
		ArrayList SFIList = new ArrayList();
		String sql = "select * from flightinfo where ";
		sql = sql + "Origin='π„÷›'";
		System.out.println(sql);
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()){
				fib = new flightInfoBean();
				fib.setFlight_no(rs.getString("Flight_no"));
				fib.setOrigin(rs.getString("Origin"));
				fib.setDestination(rs.getString("Destination"));
				fib.setDate(rs.getString("Date"));
				fib.setDeparture_time(rs.getString("Departure_time"));
				fib.setArrival_time(rs.getString("Arrival_time"));
				fib.setDuration(rs.getString("Duration"));
				fib.setPrice(rs.getFloat("Price"));
				fib.setRemain_ticket_no(rs.getInt("Remain_ticket_no"));
				SFIList.add(fib);
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
		return SFIList;
	}
}