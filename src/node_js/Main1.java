package node_js;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;
public class Main1 {
	public static void main(String[] args) {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/24wh1a05b1","root","root");
	    Statement statement = connection.createStatement();
	    int rs = statement.executeUpdate("UPDATE emp SET salary=20000 where name='rama'");
	    System.out.println(rs);
	    connection.close();
	    }
	catch(SQLException e) {
		e.printStackTrace();
		}
	}
}
