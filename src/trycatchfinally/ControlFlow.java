package trycatchfinally;
/**
 * 
 * = flow control in try-catch-finally =
 * 
 * 1. control flow in try-catch or try-catch-finally
 *   - case 1: exception occurs in try block and handled in catch block
 *   - case 2: exception occurs in try block is not handled in catch block
 *   - case 3: exception does not occur in try-block
 *   
 * 2. try-finally clause
 *   - case 1: exception occurs in try block
 *   - case 2: exception does not occur in try block  
 *
 */

/**
 * = control flow in try-catch =
 * = exception occurs in try block and handled in catch block =
 * 
 * - If a statement in try block raised an exception,
 *   then the rest of the try block does not execute
 *   and control passes to the corresponding catch block.
 * 
 * - After executing the catch block,
 *   the control will be transferred to finally block(if present) 
 *   and then the rest program will be executed.
 *
 */
// java program to demonstrate control flow of try-catch clause 
// when exception occur in try block
// and handled in catch block
public class ControlFlow {
	
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		try {
			int i = arr[4];
			
			// this statement will never execute as exception is raised by above statement
			System.out.println("Inside try block");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception caught in Catch block.");
		}
		
		
		// rest program will be executed
		System.out.println("Outside try-catch clause");
	}

}

/**
 * output:
 * Exception caught in Catch block.
 * Outside try-catch clause
 */
