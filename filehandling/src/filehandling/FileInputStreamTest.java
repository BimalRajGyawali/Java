package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bufferedInputStream = null;
		
		try {
			  FileInputStream fileInputStream = new FileInputStream("user.txt");
			   bufferedInputStream = new BufferedInputStream(fileInputStream);
			  
			int i;
			
			// bufferedInputStrem.read() gives the integer equivalent of character
			// at the end of file, -1 is returned to denote EOF
			
			
			//read garda paila RAM maa lyaune tesko lagi BuffereInputStream use garne
			
			while((i=bufferedInputStream.read()) != -1)
			{
				System.out.print( (char)i);
			}
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		/// for any file format .jpg .png .txt or binary files FileInput/OutputStream is used
		
		// for text files FileReader/Writer are used
	
		finally {
			if(bufferedInputStream != null)
			       bufferedInputStream.close();
		}
		
	}
}
