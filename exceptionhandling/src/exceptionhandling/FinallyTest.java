package exceptionhandling;

import java.util.Scanner;

public class FinallyTest {

	
	public static void main(String[] args) {
		
		new FinallyTest().getInput();
		
	}
	
	
	public void getInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Input a int value");
			int val = scanner.nextInt();
			System.out.println(val);
			
			
		} catch (ClassCastException e) {
	        
			e.printStackTrace();
		}
		
		finally {
			// Runs at any condition
			scanner.close();
			System.out.println("Scanner resource closed");
		}
		
		
	}
	
	

}
