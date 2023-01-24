package com.xworkz.Application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/account")
public class InstagramServlet extends HttpServlet {
	public InstagramServlet() {
		System.out.println("creating " + getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init of InstagramServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from InstagramServlet");
		String data = "create ur account";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in server");
		String data1 = "Lemon juice,orang juice,Apple juice";
		PrintWriter writer = resp.getWriter();
		writer.print(data1);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doput in server");
		String data2 = "pinapal, sapota,apple";
		PrintWriter writer = resp.getWriter();
		writer.print(data2);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doDelete in server ");
		String data3 = "MI,oppo,vivo";
		PrintWriter writer = resp.getWriter();
		writer.print(data3);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doHead in server");
		String data4 = "HP,dell,Apple";
		PrintWriter writer = resp.getWriter();
		writer.print(data4);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doOption in server");
		String data5 = "maal,pg,room,food";
		PrintWriter writer = resp.getWriter();
		writer.print(data5);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doTrace in Server");
		String data6 = "bengalur,mysure,shivmogga";
		PrintWriter writer = resp.getWriter();
		writer.print(data6);
		resp.setContentType("text/plain");
	}

}
