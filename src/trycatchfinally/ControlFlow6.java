package trycatchfinally;

// demonstrate try-catch-finally
// when exception does not occur in try block
public class ControlFlow6 {
	
	public static void main(String[] args) {
		
		try {
			String str = "123";
			
			int num = Integer.parseInt(str);
			
			// this statement will execute
			// because no exception is raised by above statement
			System.out.println("try block fully executed");
		}catch(NumberFormatException ex){
			System.out.println("catch block executed");
		}
		
		finally {
			
			System.out.println("finally block executed");
		}
		
		System.out.println("outside try-catch-finally clause");
	}

}

/**
 * output:
 * 
 * try block fully executed
 * finally block executed
 * outside try-catch-finally clause
 * 
 * 
 */
