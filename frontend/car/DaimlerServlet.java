package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DaimlerServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Daimler AG</title>"
				+ "</head>"
				+ "<body>"Daimler AG is a German multinational automotive corporation headquartered in Stuttgart, Baden-Württemberg, Germany. It is one of the world's leading car and truck manufacturers. Daimler-Benz was formed with the merger of Benz & Cie. and Daimler Motoren Gesellschaft in 1926.
				+ "</body>"
				+ "</html>");
		writer.close();
		
	}	
}
