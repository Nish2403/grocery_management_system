package project;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.java_database;
public class login extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	if(username.equals("admin@gmail") && password.equals("admin")) {
		res.sendRedirect("admin_index.html");
	}else {
		java_database data=new java_database();
		int q=data.login(username, password);
		if(q==0) {
			res.sendRedirect("index.html");
		}else {
			res.sendRedirect("fail.jsp");
		}
		
	}

}
}