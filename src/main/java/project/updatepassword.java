package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.java_database;
public class updatepassword extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String password=req.getParameter("password");
		java_database jd=new java_database();
		int a=jd.updatepassword(password);
		if(a==1) {
			res.sendRedirect("updatesuccess.jsp");
		}else {
			res.sendRedirect("fail.jsp");
		}
		
	}

}

