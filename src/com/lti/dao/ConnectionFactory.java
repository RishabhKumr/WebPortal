package com.lti.dao;	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
		private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		private static final String USER="hr";
		private static final String PASSWORD = "hr";
		
		
		public static Connection getConnection() throws SQLException, ClassNotFoundException {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			return conn;
		}
		/*
		public static void main(String[] args) throws SQLException {
		
     	Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
		if(conn != null)
		{
		System.out.println("Connected");
	}
	else
	{
			System.out.println("Unable to connected..");
	}
}
*/
}