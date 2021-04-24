package demo;

public class ExceptionHandlingDemo {
	public static void main(String[] args)  {
		try {
			System.out.println(" Hello world....!");
			int i =1/0;
			System.out.println("Completed");

		} catch (Exception exp) {
			System.out.println(" Message is : "+exp.getMessage());
			System.out.println(" Cause is : "+exp.getCause());
					
			exp.printStackTrace();
		}
		
		
	finally {
		System.out.println(" this is finally block");
	}
	
		
			
			
		}
}
			
			
		



