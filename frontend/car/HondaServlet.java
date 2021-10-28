package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HondaServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Honda</title>"
				+ "</head>"
				+ "<body>"Honda Motor Company, Ltd. is a Japanese multinational conglomerate manufacturer of automobiles, motorcycles, and power equipment, headquartered in Minato, Tokyo, Japan.
				+ "</body>"
				+ "</html>");
		writer.close();
		
	}	
}
				
	
