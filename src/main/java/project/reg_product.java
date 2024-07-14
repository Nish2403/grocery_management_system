package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.java_database;

public class reg_product extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String productid=req.getParameter("productid");
		String productname=req.getParameter("productname");
		float price=Float.parseFloat(req.getParameter("productprice"));
		int qty=Integer.parseInt(req.getParameter("productqty"));
		String customer_id=req.getParameter("customerid");
		java_database jd=new java_database();
		int q=jd.insert_product_data(productid, productname, price, qty,customer_id);
		if(q==1) {
			res.sendRedirect("fail.jsp");
		}else {
			res.sendRedirect("product_success.jsp");
		}
	}

}
