package com.FTB.logical;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.FTB.util.DBConnection;

public class LoginLogical {

	public boolean checkUser(String userId, String password) {
		// TODO Auto-generated method stub
		
		try {
			userId = new String(userId.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		//System.out.println("user_id3=" + userId);
		
		Connection con = DBConnection.getConnection();//获取数据库的链接对象
		String sql = "select user_id from customers where ";
		sql = sql + "user_id='" + userId + "' and password='" + password + "'";
		System.out.println(sql);
		Statement stm = null;
		
		try {
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}


}
