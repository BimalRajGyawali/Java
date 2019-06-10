package filehandling;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) throws Exception {
		
		FileWriter fileWriter = new FileWriter("file.txt");
		
		fileWriter.write("FileWriter writes\nin form of char array");
		
		fileWriter.close();
		
	}

}
