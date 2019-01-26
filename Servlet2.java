package com.ashwani;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet2 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		System.out.println("Servlet2 begin - sop");
		PrintWriter out = response.getWriter();
		out.println("Servlet2 begin - out");
		String s1 = request.getParameter("firstName");
		String s2 = (String) request.getAttribute("someResults");
		out.println("From Servlet2 : " + s1);
		out.println("From Servlet2 : " + s2);
		out.println("Servlet2 end - out");
		System.out.println("Servlet2 end - sop");
	}
}