package trycatchfinally;
/**
 * 
 * = Control flow in try-finally =
 * 
 * - In this case, no matter whether an exception occur in try-block or not,
 *   finally will always be executed.
 * - But control flow will depend on whether exception has occured in try block or not.
 * 
 * 1. Exception raised:
 * 
 *    - If an exception has occured in try block then control flow will be finally block followed by default exception handling mechanism.
 * 
 * 
 * 2. Exception not raised:
 *    
 *    - If an exception does not occur in try block then control flow will be finally block followed by rest of the program. 
 *
 */

// 1. Exception raised:
//demonstrate control flow of try-finally clause 
// when exception occur in try block
public class ControlFlow7 {

	public static void main(String[] args) {
		// array of size 4
		int[] arr = new int[4];
		try {
			int i = arr[4];

			// this statement will never execute
			// because exception is raised by above statement
			System.out.println("Inside try block");

		} finally {
			System.out.println("finally block executed");
		}

		// rest program will not execute
		System.out.println("Outside try-finally clause");

	}

}
/**
 * output:
 * finally block executed
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
 *	at trycatchfinally.ControlFlow7.main(ControlFlow7.java:24)
 * 
 * 
 */


