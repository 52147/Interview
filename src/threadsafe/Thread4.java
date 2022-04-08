package threadsafe;
/**
 * 
 * = Using final keyword =
 * 
 * - final variables are also thread-safe in java
 *   because once assigned some reference of an object 
 *   it cannot point to reference of another object.  
 *   
 *
 */
public class Thread4 {
	
	// Initializing a string variable of final type
	final String str = new String("hello");
	
	// Defining a method to change the value of the final variable which is not possible,
	// hence the error will be shown.
	void method() {
		
		str = "world";
	}

}

/**
 * output:
 * 
 * Compilation Error in java code :- 
 * prog.java:14: error: cannot assign a value to final variable str
 *        str = "world";
 *         ^
 * 1 error
 * 
 */
