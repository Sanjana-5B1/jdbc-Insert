package node_js;
import java.sql.*;
public class ReadExample {
	public static void main(String[] args) {
	try {
	// Load JDBC driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	// Connect to database
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/24wh1a05b1",
	"root", "root");
	// Execute query and get results
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("SELECT * FROM students");
	// Print the results
	while (rs.next()) {
	System.out.println(rs.getInt(1) + " - " + rs.getString(2));
	}
	// Close connection
	con.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
}
