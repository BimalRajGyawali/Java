package excel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentServiceImpl implements StudentService
{
	public Connection con;
	
	public  StudentServiceImpl() {
		
		con = DB.getConnection();
	}

	@Override
	public boolean addStudent(Student student) {
		
		String sqlQuery = "insert into studentexcel("
				+ "id,fname,lname,phone,address,college,gender)"
				+ "values(?,?,?,?,?,?,?)";
		
		
		try {
			  PreparedStatement stmt = con.prepareStatement(sqlQuery);
			 
			  stmt.setInt(1,student.getId() );
			  stmt.setString(2, student.getFname());
			  stmt.setString(3, student.getLname());
			  stmt.setString(4, student.getPhone());
			  stmt.setString(5, student.getAddress());
			  stmt.setString(6, student.getCollege());
			  stmt.setString(7, student.getGender());
			
			  stmt.execute();
			
			
			  return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	

}
