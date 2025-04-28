package example.jdbc;
//This is a utility class used or obtaining connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
public static Connection buildConnection() throws SQLException, ClassNotFoundException{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String connectionUrl="jdbc:mysql://localhost:3306/cdac";
	String userName="root";
	String password="password";
	Connection dbConnection=DriverManager.getConnection(connectionUrl, userName, password);
  return dbConnection;
}

  
}

