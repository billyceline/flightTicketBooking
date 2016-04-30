package com.FTB.logical;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.FTB.bean.flightInfoBean;
import com.FTB.util.DBConnection;

public class FlightInfoLogical {
	public ArrayList getNewFlightInfoList() {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		ResultSet rs = null;
		flightInfoBean fib = null;
		ArrayList aList = new ArrayList();
		String sql = "select * from FlightInfo ";

		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				fib = new flightInfoBean();
				fib.setInfoId(rs.getInt("infoId"));
				fib.setFlight_no(rs.getString("Flight_no"));
				fib.setOrigin(rs.getString("Origin"));
				fib.setDestination(rs.getString("Destination"));
				fib.setDate(rs.getString("Date"));
				fib.setDeparture_time(rs.getString("Departure_time"));
				fib.setArrival_time(rs.getString("Arrival_time"));
				fib.setDuration(rs.getString("Duration"));
				fib.setPrice(rs.getInt("Price"));
				fib.setRemain_ticket_no(rs.getInt("Remain_ticket_no"));
				aList.add(fib);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return aList;
	}

	public boolean DeleteFlightInfo(int infoId[]) {

		Connection con = DBConnection.getConnection();
		Statement stm = null;
		int rs = 0;
		flightInfoBean fib = null;
		String sql = "delete from flightinfo where infoId=" + infoId[0];
		for (int i = 1; i < infoId.length; i++) {
			sql = sql + " or order_id=" + infoId[i];
			// System.out.println(sql);
		}
		try {
			stm = con.createStatement();
			rs = stm.executeUpdate(sql);
			if (rs > 0)
				return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;

	}

	public boolean AddFlightInfo(String flight_no, String origin, String destination,String date,String departure_time,String arrival_time,String duration,int price,int remain_ticket_no) {
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		int rs = 0;
		flightInfoBean fib = null;
		ArrayList SFIList = new ArrayList();
		String sql = "insert into flightinfo values(0,'" + flight_no + "','" + origin+"','"+destination+"','"+date+"','"+departure_time+"','"+arrival_time+"','"+duration+"',"+price+","+remain_ticket_no+")";
		System.out.println(sql);
		try {
			stm = con.createStatement();
			rs = stm.executeUpdate(sql);
			//System.out.println("rs=" + rs);
			if (rs > 0)
				return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;

	}

	public boolean UpdateCustomerInfo(String user_id, String Name,
			String Gender, String Birthday, int ID_number, String Email) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		Statement stm = null;
		int rs = 0;
		flightInfoBean fib = null;
		ArrayList SFIList = new ArrayList();
		String sql = "update customers set name='" + Name
				+ "', identification_no=" + ID_number + ", birthday='"
				+ Birthday + "', gender='" + Gender + "', email='" + Email
				+ "' where user_id='" + user_id + "'";
		System.out.println(sql);
		try {
			stm = con.createStatement();
			rs = stm.executeUpdate(sql);
			System.out.println("rs=" + rs);
			if (rs > 0)
				return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;

	}
}