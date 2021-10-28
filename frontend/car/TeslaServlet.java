package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TeslaServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Tesla</title>"
				+ "</head>"
				+ "<body>" Founder of Tesla is Elon Musk. Tesla’s mission is to accelerate the world’s transition to sustainable energy.
				+ "</body>"
				+ "</html>");
		writer.close();
		
	}	
}
