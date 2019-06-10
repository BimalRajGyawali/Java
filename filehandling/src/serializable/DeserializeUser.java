package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeUser {

	public static void main(String[] args) throws Exception{
		
		ObjectInputStream io = new ObjectInputStream(new FileInputStream(new File("user.txt")));
		
		
		/*
		 * 		For single object
	     *      
	     *      User user = (User) io.readObject();
		 *		System.out.println(user);
		 */
		
		//For reading and writing multiple objects, use ArrayList
		
		
		
		System.out.println(io.readObject());
		
		
		io.close();
		
	}
	
	
}
