package com.chainsys.jdbc.JDBC;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class JDBC {

	
	   public static void main(String[] args) throws Exception {
	       sambleJDBC();
//	       imageJDBC();
	   }
	   public static void sambleJDBC() {
	    try {
	           Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vetripavi"); 
	           java.sql.Statement stat = con.createStatement();
	           ResultSet rs  = stat.executeQuery("select * from employees");
	           while(rs.next()) {
	               System.out.println(rs.getString("last_name") + ", " +rs.getString("first_name"));
	           }
	           con.close();
	       }catch(Exception err) {
	           err.printStackTrace();
	       }
	
	   }
}

