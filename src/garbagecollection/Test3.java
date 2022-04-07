package garbagecollection;
/**
 * 
 * = output question (Garbage collection: use finalize()) =
 *
 */
public class Test3 {
	
	static Test3 t;
	static int count = 0;
	
	public static void main(String[] args) throws InterruptedException{
		
		Test3 t1 = new Test3();
		
		// making t1 eligible for garbage collection
		t1 = null; 
		
		// calling garbage collector
		System.gc();
		
		// waiting for gc to complete
		Thread.sleep(1000);
		
		// making t eligible for garbage collection
		t = null;
		
		// calling garbage collector
		System.gc();
		
		// waiting for gc to complete
		Thread.sleep(1000);
		
		System.out.println("finalize method called " + count + " times.");
	}
	
	protected void finalize() {
		count ++;
		t = this;
	}

}

// output:
// finalize method called 1 times.

/**
 * Explanation:
 * 
 * - After execution of line 17, t1 becomes eligible for garbage collection. 
 * - So when we call garbage collector at line 20, Garbage Collector will call finalize() method on t1 before destroying it. 
 * - But in finalize method, in line 39, 
 *   we are again referencing the same object by t, 
 *   so after execution of line 39, 
 *   this object is no longer eligible for garbage collection. 
 * - Hence, Garbage Collector will not destroy the object.
 *
 * - Now again in line 26, we are making same object eligible for garbage collection one more time. 
 * - Here, we have to clear about one fact about Garbage Collector 
 *   - i.e. it will call finalize() method on a particular object exactly one time. 
 *   - Since on this object, finalize() method is already called, so now Garbage Collector will destroy it without calling finalize() method again.
 * 
 */

