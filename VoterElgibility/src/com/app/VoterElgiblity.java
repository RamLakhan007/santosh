package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterElgiblity extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	
		PrintWriter pw=null;
		pw=res.getWriter();
		res.setContentType("text/html");
		String name=null,tage=null;
		int age=0;
		
		name=req.getParameter("name");
		tage=req.getParameter("age");
		age=Integer.parseInt(tage);
		
		if(age<=18){
			pw.println("<h1><style='color:red'>you are not elgible</h1>");
		}
			else{
			pw.println("<h1><style='color:red'>you are  elgible</h1>");
			
	}
	          pw.println("<a href='input.html'>");

}
}