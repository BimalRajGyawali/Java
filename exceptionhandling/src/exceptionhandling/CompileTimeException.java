package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public CompileTimeException() {
		
	}
	
	
	
	/* While using File or JDBC like classes, we have to try and
	 * catch during compile time i.e while writing code.
	 * This is called Compile Time or Checked Exception
	 */
	
     public static void main(String[] args) {
		
    	 
    	 File file = new File("temp.txt");
    	 try {
			FileInputStream fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 System.out.println("Helloo");
	}

}
