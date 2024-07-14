package project;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.java_database;
public class updatename extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		java_database jd=new java_database();
		int a=jd.updatename(name);
		if(a==1) {
			res.sendRedirect("updatesuccess.jsp");
		}else {
			res.sendRedirect("fail.jsp");
		}
		
	}

}


