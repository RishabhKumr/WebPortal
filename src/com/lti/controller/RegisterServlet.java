package com.lti.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.UserDao;
import com.lti.model.UserInfo;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//accept user data
		String userName = request.getParameter("uname");
		String userPassword = request.getParameter("psw");
		String userEmail = request.getParameter("email");
		String userCity = request.getParameter("city");
		String userMobile = request.getParameter("mobile");
		
		
	//	PrintWriter out = response.getWriter();
    //		out.println("Hello"+userName);
		UserInfo userInfo = new UserInfo(userName, userPassword, userEmail, userCity, userMobile);
		userInfo.setUserName(userName);
		userInfo.setUserPassword(userPassword);
		userInfo.setUserCity(userCity);
		userInfo.setUserEmail(userEmail);
		userInfo.setUserMobile(userMobile);
		
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = null;
		try {
			UserDao userDao = new UserDao();
			int i = userDao.registerUser(userInfo);
			if(i >0) 
			{
			request.setAttribute("uid",i);
			dispatcher = request.getRequestDispatcher("success.jsp");
			}
			else
			{
				dispatcher = request.getRequestDispatcher("error.jsp");
			}
			dispatcher.forward(request, response);
			//out.println("Congratulations Your User Id is:-"+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("SQL Exception get here");
			out.println("Registration Failed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	
	}

}
