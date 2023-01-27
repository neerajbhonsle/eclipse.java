package com.xworkz.hillStation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/peace")
public class OotyServlet extends HttpServlet {
	public OotyServlet() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post in OotyServlet");
		String userName = req.getParameter("userName");
		String userEmail = req.getParameter("userEmail");
		String userNumber = req.getParameter("userNumber");
		String comments = req.getParameter("comments");

		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userNumber);
		System.out.println(comments);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (userName.length() > 3 && userEmail.length() > 3) {
			writer.print("<span style='color:green;'>");
			writer.print("Registred successfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red';>");
			writer.print("</h1>");
			writer.print("Invalid Info");
			writer.print("<br>");
			writer.print("<a href=\"index.html\">HomePage</a>");
			writer.print("<br>");
			writer.print("<a href=\"contact.html\">contactPage</a>");
			writer.print("</span>");
		}
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");
	}
}
