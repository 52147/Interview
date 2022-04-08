package trycatchfinally;
/**
 * 
 * = exception occur in try block is not handled in catch block =
 * 
 * - In this case, default handling mechanism is followed.
 * - If finally block is present, it will be executed followed by default handling mechanism.
 * 
 *
 */
// demonstrate control flow of try-catch clause when
// exception occurs in try block 
// but not handled in catch block
public class ControlFlow3 {
	
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		try {
			int i = arr[4];
			
			// this statement will never execute
			// as exception is raised by above statement
			System.out.println("Inside try block");
			
			
		// not a appropriate handler	
		}catch(NullPointerException ex){
			System.out.println("Exception has been caught");
		}
		
		// rest program will not execute
		System.out.println("Outside try-catch clause");
	}

}

/**
 * output:
 * (run time error)
 * 
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
 * 	at trycatchfinally.ControlFlow3.main(ControlFlow3.java:20)
 * 
 */
