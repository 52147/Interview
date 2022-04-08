package trycatchfinally;
/**
 * 
 * 2. Exception not raised: 
 *    - If an exception does not occur in try block 
 *      then control flow will be finally block 
 *      followed by rest of the program
 *
 */

// demonstrate control flow of try-finally clause 
// when exception does not occur in try block
public class ControlFlow8 {
	
	public static void main(String[] args) {
		try {
			String str = "123";
			
			int num = Integer.parseInt(str);
			
			// this statement will execute 
			// because no any exception is raised by above statement
			System.out.println("Inside try block");
		}finally {
			System.out.println("finally block executed");
		}
		
		// rest program will be executed
		System.out.println("outside try-finally clause");
	}

}

/**
 * output:
 * 
 * Inside try block
 * finally block executed
 * outside try-finally clause
 */
