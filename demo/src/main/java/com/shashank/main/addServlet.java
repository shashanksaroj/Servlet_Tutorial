package com.shashank.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest r,HttpServletResponse rep) throws IOException, ServletException {
		
		
		int i= Integer.parseInt(r.getParameter("num1"));
		int j= Integer.parseInt(r.getParameter("num2"));
		
		int result =i+j;
		
	    r.setAttribute("result", result);
		
		RequestDispatcher rd = r.getRequestDispatcher("sq");
		
		rd.forward(r, rep);
		

	
		
	}


}
