package com.xworkz.King;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/bjorn")
public class KingdomServlet extends HttpServlet {
	public KingdomServlet() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in KingdomServlet");
		String name = req.getParameter("KingName");
		String region = req.getParameter("KingsRegion");
		String noOfQueens = req.getParameter("noOfQueens");
		String DOB = req.getParameter("DOB");
		String DOD = req.getParameter("DOD");

		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(DOB);
		System.out.println(DOD);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");

		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("King Name is " + name + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:grey'>");
		writer.print("King region is " + region + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:green'>");
		writer.print("Kings no of queens are " + noOfQueens + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("kings date of birth is " + DOB + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("king date of death is " + DOD + "is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}
