package excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	public static Connection getConnection()
	{
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}