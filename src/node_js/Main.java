package node_js;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection(
    		    "jdbc:mysql://localhost:3306/testdb",
    		    "root",
    		    "root"   
    		);


        
        System.out.println("Connected successfully!");
    }
}//user     = debian-sys-maint
//password = mzlPQskpulrgxQVg

