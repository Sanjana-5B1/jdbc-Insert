package node_js;
import java.sql.*;

public class InsertExample {
	public static void main(String[] args) {
	try {
	// Load JDBC driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	// Connect to database
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/24wh1a05b1",
			"root","root");
	// Create statement and execute insert query
	Statement stmt = con.createStatement();
	stmt.executeUpdate(
		    "INSERT INTO students (id, name) VALUES (2, 'Alice')"
		);

	// Close connection
	con.close();
	}
	catch (Exception e) {
		e.printStackTrace();
		}
	}
}
