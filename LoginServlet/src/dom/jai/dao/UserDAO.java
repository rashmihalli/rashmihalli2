package dom.jai.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDAO {
	
	public static Connection getcon() {
	
		Connection con=null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		 con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","orcl11g");
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
		return con ;
	}
}
