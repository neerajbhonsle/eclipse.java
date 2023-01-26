package com.xworkz.Cigarettes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/advance")
public class LitesServlet extends HttpServlet {
	public LitesServlet() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in litesServlet");

		String name = req.getParameter("cigarettesName");
		String companyName = req.getParameter("cigaretteCompanyName");
		String companyOwner = req.getParameter("companyOwnerName");
		String gstNo = req.getParameter("gstNo");
		String mfgPrice = req.getParameter("mfgPrice");
		String materialUsed = req.getParameter("materialUsed");
		String ageLimit = req.getParameter("ageLimit");
		String healthEffects = req.getParameter("healthEffects");
		String inventedBy = req.getParameter("inventedBy");
		String wifeName = req.getParameter("wifeName");
		String inventedOn = req.getParameter("inventedOn");
		String countryOfinnovation = req.getParameter("countryOfinnovation");
		String noOfBrands = req.getParameter("noOfBrands");
		String type = req.getParameter("type");
		String toxic = req.getParameter("toxic");
		String length = req.getParameter("length");
		String width = req.getParameter("width");
		String price = req.getParameter("price");
		String buyerName = req.getParameter("buyerName");
		String buyerNoOfCigarettes = req.getParameter("buyerNoOfCigarettes");

		System.out.println(name);
		System.out.println(companyName);
		System.out.println(companyOwner);
		System.out.println(gstNo);
		System.out.println(mfgPrice);
		System.out.println(materialUsed);
		System.out.println(ageLimit);
		System.out.println(healthEffects);
		System.out.println(inventedBy);
		System.out.println(wifeName);
		System.out.println(inventedOn);
		System.out.println(countryOfinnovation);
		System.out.println(noOfBrands);
		System.out.println(type);
		System.out.println(toxic);
		System.out.println(length);
		System.out.println(width);
		System.out.println(price);
		System.out.println(buyerName);
		System.out.println(buyerNoOfCigarettes);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");

		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("Cigarette name " + name + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("Cigarette companyName " + companyName + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Cigarette CompanyOwnerName " + companyOwner + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:grey'>");
		writer.print("Cigarette companygstNo " + gstNo + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:pink'>");
		writer.print("Cigarette mfgPrice " + mfgPrice + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:yellow'>");
		writer.print("Cigarette materialUsed " + materialUsed + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("Cigarette name " + ageLimit + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Cigarette effects " + healthEffects + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:green'>");
		writer.print("Cigarette invented Name " + inventedBy + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("Cigarette invented Wife Name " + wifeName + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:violet'>");
		writer.print("Cigarette invented On " + inventedOn + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("Cigarette country Of innovation " + countryOfinnovation + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Cigarette no Of Brands " + noOfBrands + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:darkblue'>");
		writer.print("Cigarette type " + type + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("Cigarette toxic " + toxic + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:violet'>");
		writer.print("Cigarette length " + length + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("Cigarette width " + width + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:green'>");
		writer.print("Cigarette price " + price + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("Cigarette buyerName " + buyerName + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("buyer No Of Cigarettes " + buyerNoOfCigarettes + " sent successfully");
		writer.print("</span>");
		writer.print("</h1>");

		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}
}
