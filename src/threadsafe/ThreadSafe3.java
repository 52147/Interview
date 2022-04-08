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

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
	
	// creating a variable of class type AtomicInteger
		java.util.concurrent.atomic.AtomicInteger count = new AtomicInteger();
		
		// Defining increment() method to change value of atomicInteger variable
		public void increment() {
			
			count.incrementAndGet();
		}
}
public class ThreadSafe3 {
	
	public static void main(String[] args) throws Exception{
		
		// creating an instance of Counter class
		Counter c = new Counter();
		
		// creating an instance t1 of Thread class
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				
				for(int i = 1; i <= 2000; i++) {
					c.increment();
				}
			}
		});
		
		// Creating an instance t2 of Thread class       
        Thread t2 = new Thread(
            new Runnable() {
                public void run()
                {
                    for (int i = 1; i <= 2000; i++) {
                        c.increment();
                    }
                }
            });
		
		// calling start() method with t1 and t2
		t1.start();
		t2.start();
		
		// calling join method with t1 and t2
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		
	}
	
	
}

/**
 * output:
 * 
 * 4000
 *
 */




