package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.java_database;
public class updatecontact extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String contactnumber=req.getParameter("contact");
		java_database jd=new java_database();
		int a=jd.updatecontact(contactnumber);
		if(a==1) {
			res.sendRedirect("updatesuccess.jsp");
		}else {
			res.sendRedirect("fail.jsp");
		}
		
	}

}
