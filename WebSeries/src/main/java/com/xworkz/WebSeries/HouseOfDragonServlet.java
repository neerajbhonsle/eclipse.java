package com.xworkz.WebSeries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/hotstar")
public class HouseOfDragonServlet extends HttpServlet {

	public HouseOfDragonServlet() {
		System.out.println("Created " + getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in house of dragon");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in HouseOfDragonServlet");
		System.out.println(Thread.currentThread().getName());
		String name = req.getParameter("webSeriesName");
		String laug = req.getParameter("langOfWebSeries");
		String episodes = req.getParameter("noOfEpisodes");
		String ott = req.getParameter("streamingOn");
		String budget = req.getParameter("budget");

		System.out.println(name);
		System.out.println(laug);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("webSeries " + name + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("langOfWebSeries " + laug + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:green'>");
		writer.print("noOfEpisodes " + episodes + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("streamingOn " + ott + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h1>");
		writer.print("<span style='color:green'>");
		writer.print("budget is " + budget + " is sent successfully");
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}
}
