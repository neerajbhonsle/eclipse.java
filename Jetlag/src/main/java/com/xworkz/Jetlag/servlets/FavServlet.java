package com.xworkz.Jetlag.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FavServlet
 */
@WebServlet(loadOnStartup = 1, urlPatterns = "/beer")
public class FavServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FavServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Running do post in FavServlet");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String reason = request.getParameter("reason");
		String address = request.getParameter("address");

		System.out.println("fname " + fname);
		System.out.println("lname " + lname);
		System.out.println("gender " + gender);
		System.out.println("reason " + reason);
		System.out.println("address " + address);

		RequestDispatcher dispatcher = request.getRequestDispatcher("details.jsp");
		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);
		request.setAttribute("gender", gender);
		request.setAttribute("reason", reason);
		request.setAttribute("address", address);
		dispatcher.forward(request, response);

	}

}
