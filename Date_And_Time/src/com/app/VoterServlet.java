package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		               PrintWriter pw=null;
		               String name=null,tage=null;
		               int age=0;
		               pw=res.getWriter();
		               //set content type
		               res.setContentType("text/html");
		               //get request parameter values(form data)
		               name=req.getParameter("name");
		               tage=req.getParameter("age");
		               age=Integer.parseInt(tage);
		               if(age>=18)
		            	   pw.println("<h1 style='color:red'>you are eligible</h1>");
	
		else
		pw.println("<h1 style='color:orange'>you are not</h1>");

		               
		               //generate hyperlink
		               pw.println("<a hrer='page.html'></a>");
pw.close();
	}
}