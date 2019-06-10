package filehandling;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		
		//Instantiate file
		
		File file  = new File("file.txt");
		
	    System.out.println("file.txt is a directory : "+file.isDirectory());
	    
	    System.out.println(" File exists ? "+file.exists());
	    
	    // create directory
	    
	    File fileDirectory = new File("File Notes");
	    
	    boolean isDirCreated = fileDirectory.mkdir();
	    
	    if(isDirCreated)
	    {
	    	System.out.println("Directory created successfully");
	    }
		
		// List name of all files
	    
	    String[] fileNames = new File("/home/bimal/Documents/C").list();
	    
	    for(String fileName : fileNames)
	    {
	    	System.out.println(fileName);
	    }
	    
		// list of files
	    
	    File[] files =  new File("/home/bimal/Documents/C").listFiles();
		
	    for(File file1 : files)
	    {
	    	System.out.println(file1);
	    }
	    
	    
	}
	

}
