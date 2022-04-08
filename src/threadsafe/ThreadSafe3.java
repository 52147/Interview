package threadsafe;
/**
 * 
 * = using Atmoic variable =
 * 
 * - using an atomic variable is another way to achieve thread-safety in java.
 * - When variable are shared by multiple threads,
 *   the atomic variable ensures that threads don't crash into each other.
 *
 */

import java.util.concurrent.stomic.AtomicInteger;
public class ThreadSafe3 {
	
	// creating a variable of class type AtomicInteger
	AtomicInteger count = new AtomicInteger();
	
	
	
	

}
