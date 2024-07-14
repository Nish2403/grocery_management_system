package database;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class java_database {
	public static String user_name;
	public static String pass_word;
	public static String cust_id;
		
		public String insert_registration_data(String fullname,String email,String password,String address,String contact){
		
				
			try {
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				Connection connection=null;
				connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
	        	System.out.println("Hello");
	        
				String query="INSERT INTO REGISTERED_USER(FULL_NAME,EMAIL,PASSWORD,ADDRESS,CONTACT_NUMBER,CUST_ID) VALUES(?,?,?,?,?,?)";
	        	
	        	PreparedStatement stmt=connection.prepareStatement(query);
	        	stmt.setString(1, fullname);
	        	stmt.setString(2, email);
	        	stmt.setString(3, password);
	        	stmt.setString(4, address);
	        	stmt.setString(5, contact);
	        	String reg_id=""+fullname.charAt(0)+address.charAt(0)+contact.charAt(0)+contact.charAt(1)+contact.charAt(2)+contact.charAt(3);
	        	this.cust_id=reg_id;
	        	stmt.setString(6, reg_id);
	        	int r=stmt.executeUpdate();
	        	System.out.println(r);
	        	int i=0;
	        	return reg_id;
	        	
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
				
			}
			
	        
		}
		public int login(String username,String password) {
			try {
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				Connection connection=null;
				connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
				String query="SELECT EMAIL,PASSWORD FROM REGISTERED_USER";
				Statement stmt = connection.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
	
					if(username.equals(rs.getString("email"))&&password.equals(rs.getString("password"))) {
						this.user_name=username;
						this.pass_word=password;
						System.out.println(this.user_name);
						return 0;
					}
				}
				return 1;
				
			}catch (Exception e) {
				e.printStackTrace();
				return 1;
			}
		}
		public int updatecontact(String contact) {
			try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection connection=null;
			connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
			this.user_name="'"+this.user_name+"'";
			String query="UPDATE REGISTERED_USER SET CONTACT_NUMBER=? WHERE EMAIL="+this.user_name;
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.setString(1,contact);
			stmt.executeUpdate();
			return 1;
			
			}catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		public int updateemail(String email) {
			try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection connection=null;
			connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
			this.user_name="'"+this.user_name+"'";
			email="'"+email+"'";
			String query="UPDATE REGISTERED_USER SET EMAIL=? WHERE EMAIL="+this.user_name;
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.setString(1,email);
			stmt.executeUpdate();
			return 1;
			
			}catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		public int updatepassword(String password) {
			try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection connection=null;
			connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
			this.user_name="'"+this.user_name+"'";
			String query="UPDATE REGISTERED_USER SET PASSWORD=? WHERE EMAIL="+this.user_name;
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.setString(1,password);
			stmt.executeUpdate();
			return 1;
			
			}catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		public int updatename(String name) {
			try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection connection=null;
			connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
			this.user_name="'"+this.user_name+"'";
			String query="UPDATE REGISTERED_USER SET FULL_NAME=? WHERE EMAIL="+this.user_name;
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.setString(1,name);
			stmt.executeUpdate();
			return 1;
			
			}catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		public String[] retrieve(String name) {
			try {
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				Connection connection=null;
				connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
				name="'"+name+"'";
				System.out.println(name);
				String query="SELECT * FROM REGISTERED_USER WHERE FULL_NAME="+name;
				Statement stmt = connection.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				String[] stra=new String[5];
				if(rs.next()) {
				stra[0]=rs.getString("FULL_NAME");
				stra[1]=rs.getString("EMAIL");
				stra[2]=rs.getString("ADDRESS");
				stra[3]=rs.getString("CONTACT_NUMBER");
				stra[4]=""+rs.getString("FULL_NAME").charAt(0)+rs.getString("ADDRESS").charAt(0)+rs.getString("CONTACT_NUMBER").charAt(0)+rs.getString("CONTACT_NUMBER").charAt(1)+rs.getString("CONTACT_NUMBER").charAt(2)+rs.getString("CONTACT_NUMBER").charAt(3);
				}
				return stra;
				
		}catch(Exception e) {
			e.printStackTrace();
		}
			return null;
	}
		public int insert_product_data(String productid,String productname,float price,int qty,String customer_id){
			
			
			try {
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				Connection connection=null;
				connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
	        	System.out.println("Hello");
	        
				String query="INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME,PRICE,QTY,CUSTOMER_ID) VALUES(?,?,?,?,?)";
	        	
	        	PreparedStatement stmt=connection.prepareStatement(query);
	        	stmt.setString(1, productid);
	        	stmt.setString(2, productname);
	        	stmt.setFloat(3, price);
	        	stmt.setInt(4, qty);
	        	stmt.setString(5, customer_id);
	        	
	        	int r=stmt.executeUpdate();
	        	System.out.println(r);
	        	int i=0;
	        	
	        	return 0;
	        	
			} catch (Exception e) {
				e.printStackTrace();
				return 1;
				
			}
			
	        
		}
		public String[] retrieve_product(String name) {
			try {
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				Connection connection=null;
				connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
				name="'"+name+"'";
				System.out.println(name);
				String query="SELECT * FROM PRODUCT WHERE PRODUCT_NAME="+name;
				Statement stmt = connection.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				String[] stra=new String[4];
				if(rs.next()) {
				stra[0]=rs.getString("PRODUCT_ID");
				stra[1]=rs.getString("PRODUCT_NAME");
				stra[2]=Float.toString(rs.getFloat("PRICE"));
				stra[3]=Integer.toString(rs.getInt("QTY"));
				
				}
				return stra;
				
		}catch(Exception e) {
			e.printStackTrace();
		}
			return null;
	}
		public int deleteproduct(String id) {
			try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection connection=null;
			connection=DriverManager.getConnection("jdbc:derby:C:\\Users\\thund\\MyB;","anish","");
			id="'"+id+"'";
			String query="DELETE FROM PRODUCT WHERE PRODUCT_ID="+id;
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.executeUpdate();
			return 1;
			
			
}catch(Exception e) {
	e.printStackTrace();
	return 0;
	
}
		}

}