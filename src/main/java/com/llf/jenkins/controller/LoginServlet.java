package com.llf.jenkins.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String pswd = request.getParameter("pswd");
		System.out.println(userName + " " + pswd);
		if(userName.equals("linfeng") && pswd.equals("xql")){
			request.setAttribute("userName", userName);
			request.getRequestDispatcher("jsp/main.jsp").forward(request, response);
		}else{
			response.sendRedirect("jsp/login.jsp");
		}
	}

}
