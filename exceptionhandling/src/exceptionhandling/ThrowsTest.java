package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {

	public ThrowsTest() {
		
		
		
	}
	
	public static void main(String[] args) {
		new ThrowsTest().method1();
		System.out.println("Other logic...........");
	}
	
	public void method1() {
		
		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void method2() throws FileNotFoundException {
	
		method3();
		
	}
	
	
	public void method3() throws FileNotFoundException
	{
		FileInputStream fileInputStream = new FileInputStream("temp.txt");
	}

}
