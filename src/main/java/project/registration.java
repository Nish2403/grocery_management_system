package project;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.java_database;

public class registration extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	String fullname=""+req.getParameter("fullName");
	String email=""+req.getParameter("email");
	String password=""+req.getParameter("password");
	String address=""+req.getParameter("address");
	String contact=""+req.getParameter("contactNumber");
	java_database jd=new java_database();
	String reg_id;
	reg_id = jd.insert_registration_data(fullname,email,password,address,contact);
	
	req.setAttribute("id", reg_id);
	req.getRequestDispatcher("success.jsp").forward(req,res);
	}

}
