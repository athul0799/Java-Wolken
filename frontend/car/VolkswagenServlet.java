package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VolkswagenServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Volkswagen</title>"
				+ "</head>"
				+ "<body>"The Volkswagen AG, known internationally as the Volkswagen Group, is a German multinational automotive manufacturing corporation headquartered in Wolfsburg, Lower Saxony, Germany
				+ "</body>"
				+ "</html>");
		writer.close();
		
	}	
}
