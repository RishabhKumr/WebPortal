package com.lti.dao;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.lti.model.UserInfo;

public class UserDao {
	Connection conn = null;
	PreparedStatement stmt=null;
	public UserDao() throws SQLException, ClassNotFoundException {
		 conn = ConnectionFactory.getConnection();
	}
	public int registerUser(UserInfo userInfo) throws SQLException {
		int temp = 0;
		
		//Class.forName("");
		 try {
		  // conn = ConnectionFactory.getConnection();
		   String sql = "insert into UserData values(userId_seq.nextval,?,?,?,?,?) ";
		   //who jdbc api will execute this query?? Statemnt interface or its child
		   stmt = conn.prepareStatement(sql);
		   stmt.setString(1, userInfo.getUserName());
		   stmt.setString(2, userInfo.getUserPassword());
		   stmt.setString(3, userInfo.getUserEmail());
		   stmt.setString(4, userInfo.getUserCity());
		   stmt.setString(5, userInfo.getUserMobile());
		   
		   int i = stmt.executeUpdate();
		   if(i!=0) {
			  System.out.println(i+" "+"User Registered!");
			 // temp = 1;
		   }
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		 try
		 {
			 String emailid =  userInfo.getUserEmail();
			 String sql = "select userId from UserData where userEmail = ?";
			 stmt = conn.prepareStatement(sql);
			 stmt.setString(1, emailid);
			 ResultSet rs = stmt.executeQuery();
			 while(rs.next()) {
		     temp = rs.getInt("userId");
			 }
		     
		 }catch(Exception e)
		 {
			 
		 }
		 return temp;
	}

	public boolean loginUser(String userName,String userPassword) throws SQLException{
		boolean status = false;
		try
		{
			System.out.println("1");
		    stmt = conn.prepareStatement("select userName,userPassword from UserData where userName = ? and userPassword = ? ");
		    System.out.println("2");
		    stmt.setString(1,userName);
			stmt.setString(2, userPassword);
			System.out.println(stmt);
			System.out.println("3");
			ResultSet rs = stmt.executeQuery();
			System.out.println("4");
			status = rs.next();
			System.out.println(status);
			System.out.println("5");

		}catch(Exception e)
		{
			System.out.println("Login Exception");
		}
		return status;
	}
}
