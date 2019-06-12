package excel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ExcelReading
{
	
	
	public static void main(String[] args) throws Exception {
		
	  BufferedReader bufferedReader = new BufferedReader(
			  new FileReader(
					  new File("student.csv")));
		
	  
	  
	  String row = bufferedReader.readLine(); //ignoring the column heading
	  
	  while((row = bufferedReader.readLine()) != null)
	  {
		  
		  String[] rowValues = row.split(",");
		  
		  Student student = new Student();
		  
		  student.setId(Integer.parseInt(rowValues[0]));
		  student.setFname(rowValues[1]);
		  student.setLname(rowValues[2]);
		  student.setPhone(rowValues[3]);
		  student.setAddress(rowValues[4]);
		  student.setCollege(rowValues[5]);
		  student.setGender(rowValues[6]);
		  
		  
		  StudentService studentService = new StudentServiceImpl(bufferedReader);
		  
		  studentService.addStudent(student);		

		  
		  
	  }
	  
	  
	     bufferedReader.close();
	}

}
