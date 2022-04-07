package garbagecollection;
/**
 * = output question (Garbage collection: use finalize()) =
 * 
 * object do not have any references to them are eligible for garbage collection.
 * 
 *
 */

public class Test {
	
	public static void main(String[] args) throws InterruptedException{
		
		String str = new String("Hello");
		
		// making str eligible for garbage collection
		str = null;
		
		// calling garbage collector
		System.gc();
		
		// waiting for gc to complete
		Thread.sleep(1000);
		
		System.out.println("end of main");
		
	}
	
	protected void finalize() {
		System.out.println("finalize method called");
	}

}

// output: end of main

/**
 * Explanation : 
 * - We know that finalize() method is called by Garbage Collector on an object before destroying it. 
 * - But here, the trick is that the str is String class object, not the Test class. 
 * - Therefore, finalize() method of String class(if overridden in String class) is called on str. 
 * 
 * - If a class doesn’t override finalize method, then by default Object class finalize() method is called.
 * 
 */
