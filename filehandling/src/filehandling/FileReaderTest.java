package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) throws Exception {
		
		FileReader fileReader = new FileReader("user.txt");
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		/*
		int i;
		
		while( (i= fileReader.read()) != -1)
		{
		       System.out.print((char)i);	
		}
		
		*/
		
		String row = null;
		
		while((row = bufferedReader.readLine()) != null)
		{
			System.out.println(row);
		}
		
		
		fileReader.close();
		bufferedReader.close();
	}

}
