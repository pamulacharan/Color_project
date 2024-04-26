package Pamula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ColorGetServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String color = request.getParameter("color");
		response.setContentType("index");
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<title>");
		pw.println("</title>");
		pw.println("<style>");
		pw.println("body {");
		pw.println("    font-family: Arial, sans-serif;");
		// pw.println(" background-color: #ccc;");
		pw.println("    display: flex;");
		pw.println("    align-items: center;");
		pw.println("    justify-content: center;");
		pw.println("    height: 100vh;");
		pw.println("    margin: 0;");
		pw.println("    padding: 20px;");
		pw.println("}");
		pw.println("h1 {");
		pw.println("background-color: #ff1818f0;");
		pw.println("}");
		pw.println("h2 {");
		pw.println("background-color: #10ec47d4;");
		pw.println("}");
		pw.println("h3 {");
		pw.println("background-color: #1900ffd4;");
		pw.println("}");
		pw.println("</style>");
		pw.println("<body>");
		pw.println("<center>");
		pw.println("<p><B>The selected color is: </p>");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(color));
		String s = color;
		String a = "Red";
		String b = "Green";
		String c = "Blue";
		// pw.println("<h1>"+color+"</h1>");
		if (s.length() == a.length()) {
			pw.println("<h1>" + color + "</h1>");
		} else if (s.length() == b.length()) {
			pw.println("<h2>" + color + "</h2>");
		} else if (s.length() == c.length()) {
			pw.println("<h3>" + color + "</h3>");
		}
		pw.println("<form action=\"index.html\">");
		pw.println("<center><p>\n\n\n\n\n \t\t\t\t\t\t <input class=\"button\" type=\"submit\" value=\"Run Again\""+ "</p><center>");
		pw.close();
		pw.println("<center>");
		pw.println("/body");
		pw.println("</html>");
	}

}
