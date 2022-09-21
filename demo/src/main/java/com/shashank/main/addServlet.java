package com.shashank.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest r,HttpServletResponse rep) throws IOException {
		
		
		int i= Integer.parseInt(r.getParameter("num1"));
		int j= Integer.parseInt(r.getParameter("num2"));
		
		int result =i+j;
		
		PrintWriter out =rep.getWriter();
		
		
		out.println(result);
	
		
		
	}


}
