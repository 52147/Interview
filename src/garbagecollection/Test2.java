package garbagecollection;
/**
 * = output question (Garbage collection: use finalize()) =
 * 
 *
 */
public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Test2 t = new Test2();
		
		// making t eligible for garbage collection
		t = null;
		
		// calling garbage collector
		System.gc();
		
		// waiting for gc to complete
		Thread.sleep(1000);
		
		System.out.println("end main");
	}
	
	protected void finalize() {
		System.out.println("finalize method called");
		System.out.println(10/0);
	}

}


// output:
// finalize method called
// end main

/**
 * Explanation:
 * - When garbage collector calls finalize() method on an object,
 *   it ignores all the exceptions raised in the method 
 *   and program will terminate normally.
 * 
 * 
 */
