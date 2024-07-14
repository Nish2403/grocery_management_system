package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.java_database;

public class searchproduct extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("productname");
		java_database jd=new java_database();
		String[] straw=jd.retrieve_product(name);
		if(straw==null) {
			res.sendRedirect("fail.jsp");
		}
		req.setAttribute("product_id",straw[0]);
		req.setAttribute("product_name",straw[1]);
		req.setAttribute("price",straw[2]);
		req.setAttribute("qty",straw[3]);
		req.getRequestDispatcher("displayproduct.jsp").forward(req,res);
		
	}

}
