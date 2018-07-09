package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname=request.getParameter("username");
	String pass=request.getParameter("password");
	if(uname.equals("admin")&& pass.equals("password")){
		HttpSession session=request.getSession();
		session.setAttribute("username", uname);
		session.setAttribute("password", pass);
		response.sendRedirect("welcome.jsp");	
	}
	else {
		response.sendRedirect("login.jsp");
	}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
