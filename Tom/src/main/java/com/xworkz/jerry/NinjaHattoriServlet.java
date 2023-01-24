package com.xworkz.jerry;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8, urlPatterns = "/ninja")

public class NinjaHattoriServlet extends HttpServlet {
	public NinjaHattoriServlet() {
		System.out.println("creating " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in Ninja Hattori");
	}

}
