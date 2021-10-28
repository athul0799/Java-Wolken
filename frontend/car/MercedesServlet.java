package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MercedesServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Mercedes</title>"
				+ "</head>"
				+ "<body>" Mercedes-Benz, commonly referred to as Mercedes, is a German luxury automotive brand. Mercedes-Benz produces consumer luxury vehicles and commercial vehicles.
				+ "</body>"
				+ "</html>");
		writer.close();
		
	}	
}
