package trycatchfinally;
/**
 * 
 * = exception does not occur in try block =
 * 
 * - In this case, catch block never runs as they are only meant to be run when an exception occurs.
 * - finally block(if present) will be executed followed by rest of the program.
 *
 */
// demonstrate try-catch 
// when an exception doesn't occur in try block
public class ControlFlow5 {
	
	public static void main(String[] args) {
		
		try {
			String str = "123";
			
			int num = Integer.parseInt(str);
			
			// this statement will execute
			// because no exception is raised by above statement
			System.out.println("Inside try block");
		}catch(NumberFormatException ex) {
			
			System.out.println("catch block executed...");
		}
		
		System.out.println("outside try-catch clause");
	}

}
/**
 * output:
 * 
 * Inside try block
 * outside try-catch clause
 * 
 * 
 */



