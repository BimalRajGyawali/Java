package exceptionhandling;

public class ThrowTest {

	public ThrowTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		      try {
				
		    	  validateAge(14);
		    	  
			} catch (Exception e) {
				System.out.println("You can't vote");
			}
		      
		      System.out.println("Other logic......");
		     
		
		}
	
	
	public static void validateAge(int age)
	{
		if(age<18) {
			throw new ArithmeticException("Age : "+age+" is not valid");
	
		}
		
		else {
			System.out.println("You are eligible to vote");
		}
		
	}

}
