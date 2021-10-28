package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LamborghiniServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Lamborghini</title>"
				+ "</head>"
				+ "<body>"  The company is owned by the Volkswagen Group through its subsidiary Audi. It is an italian brand
				+ "</body>"
				+ "</html>");
		writer.close();
		
	}	
}
