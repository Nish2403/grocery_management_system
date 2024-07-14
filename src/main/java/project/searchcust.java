package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.java_database;

public class searchcust extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		java_database jd=new java_database();
		String[] straw=jd.retrieve(name);
		if(straw==null) {
			res.sendRedirect("fail.jsp");
		}
		req.setAttribute("full_name",straw[0]);
		req.setAttribute("email",straw[1]);
		req.setAttribute("address",straw[2]);
		req.setAttribute("contact_number",straw[3]);
		req.setAttribute("cust_id",straw[4]);
		req.getRequestDispatcher("displaycust.jsp").forward(req,res);
		
	}

}
