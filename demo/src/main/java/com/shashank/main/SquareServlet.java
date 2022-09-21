package com.shashank.main;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest r,HttpServletResponse rep) throws IOException {
		
		
		
		PrintWriter out =rep.getWriter();
		
		out.println((int)r.getAttribute("result"));
		
	}

}
