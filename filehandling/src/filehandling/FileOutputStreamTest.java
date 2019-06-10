package filehandling;

import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
			
			String str = "Content to be written in file";
			
			byte[] b = str.getBytes();
			
			fileOutputStream.write(b);
			
			fileOutputStream.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
