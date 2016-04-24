package com.FTB.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		
		String userName="root";
		String password="";
		String url="jdbc:mysql://localhost:3306/ftb";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return con;
	}

}
