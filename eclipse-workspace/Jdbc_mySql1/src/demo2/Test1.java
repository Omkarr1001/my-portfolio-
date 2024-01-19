package demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) {
		 String url = "jdbc:mysql://localhost:3307/";
		 	String dbname="db1";
	        String username = "root";
	        String password = "root";
	        Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
			con=	DriverManager.getConnection(url+dbname,username,password);
		Statement stmt=con.createStatement();
		String query="select *from login";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("Connection is establish");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		rs.close();
		stmt.close();
		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
