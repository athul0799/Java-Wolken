package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LexusServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Lexus</title>"
				+ "</head>"
				+ "<body>"The Lexus brand is marketed in more than 70 countries and territories worldwide and is Japan's largest-selling make of premium cars. It has ranked among the 10 largest Japanese global brands in market value. 
				+ "</body>"
				+ "</html>");
		writer.close();
		
	}	
}
