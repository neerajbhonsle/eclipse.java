package com.xworkz.hillStation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fogg")
public class NandiHillsSevrlet extends HttpServlet {
	public NandiHillsSevrlet() {
		System.out.println("creating " + getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post in NandiHillsSevrlet");
		String userName = req.getParameter("userName");
		String userEmail = req.getParameter("userEmail");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");

		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(startPoint);
		System.out.println(destination);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (userName.length() > 3 && userEmail.length() > 3 && startPoint.length() > 3 && destination.length() > 3) {
			writer.print("<span style='color:blue;'>");
			writer.print("sign in successfully ");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("</h1>");
			writer.print("Invalid Info");
			writer.print("<br>");
			writer.print("<a href=\"index.html\">HomePage</a>");
			writer.print("<br>");
			writer.print("<a href=\"location.html\">location</a>");
			
			writer.print("</span>");
		}
		
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
	}
}
