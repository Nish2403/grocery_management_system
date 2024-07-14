package project;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.java_database;

public class delete extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String product_id=req.getParameter("productid");
		java_database jd=new java_database();
		int a=jd.deleteproduct(product_id);
		if(a==1) {
			res.sendRedirect("deletesuccess.jsp");
		}else {
			res.sendRedirect("fail.jsp");
		}
		
	}

}
