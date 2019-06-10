package serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableUser {

	public static void main(String[] args) throws Exception {
		
     
     List<User> users = new ArrayList<>();
     
     users.add(new User(1, "Ram Kumar", "pass123"));
     users.add(new User(2, "Rajesh", "pass342"));
     users.add(new User(3, "Amit", "pass345"));
     
     File file = new File("user.txt");
     
     FileOutputStream fileOutputStream = new FileOutputStream(file);
     
     ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
     
    
     out.writeObject(users);
     
     
     
     
     //Instead of writing multiple objects one by one, use ArrayList of Objects
     
     out.flush();
     out.close();
   
	//file maa write vayo but encrypted form maa
    //read garna deserialize garu paryo 
		
	}
	
	
}
