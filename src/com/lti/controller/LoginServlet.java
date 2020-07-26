package com.lti.controller;

import javax.servlet.http.HttpSession;

import com.lti.dao.UserDao;
import com.lti.model.UserInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LoginServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	            String uname = request.getParameter("uname");
	            String pass  = request.getParameter("psw");
	            System.out.println(uname+" "+pass);
	            UserInfo userInfo = new UserInfo(uname,pass);
	            userInfo.setUserName(uname);
	            userInfo.setUserPassword(pass);
	            PrintWriter out = response.getWriter();
	            HttpSession session=request.getSession(); 
					try {
						UserDao userDao = new UserDao();
					
	                if(userDao.loginUser(uname,pass)) {
	                    response.sendRedirect("index.jsp");
	                
	                
	                  session.setAttribute("userName",uname);  
	                } else {
	                	response.sendRedirect("error.jsp");
	                    out.println("Login Failed");
	                }
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	           
	           
	 }
}
