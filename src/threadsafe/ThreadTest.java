package threadsafe;
/**
 * = Thread Safety and how to achieve it =
 * 
 * - Java has a feature, Multithreading, which is a process of running multiple threads simultaneously.
 * 
 * - When multiple threads are working on the same data, and the value of our data is changing,
 *   then scenario is not thread-safe and we will get inconsistent results.
 * - When a thread is already working on a object and preventing another thread on working on the same object,
 *   this process is called Thread-Safety.
 *   
 * 
 * How to achieve Thread Safety?
 * 
 *   There are 4 way to achieve Thread Safety.
 *   These are:
 *   - 1. using synchronization
 *   - 2. using volatile keyword
 *   - 3. using atomatic variable
 *   - 4. using final keyword
 * 
 *
 */

/**
 * using synchronization
 * 
 * - synchronization is the process of allowing only one thread at a time to complete the particular task.
 * - It means when multiple threads executing simultaneously,
 *   and what to access the same resource at the same time,
 *   then the problem of inconsistency will occur.
 *   
 * - Therefore, synchronization is used to resolve inconsistency problem by allowing only one thread at a time.
 * 
 * - Synchronization uses a synchronized keyword.
 * - Synchronized is the modifier that creates a block of code known as a critical section.
 * 
 *
 */
class A {
	
	synchronized void sum(int n) {
		
		// creating a thread instance
		Thread t = Thread.currentThread();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + " : " + (n + i));
		}
	}

}

// class B extending thread class
class B extends Thread{
	
	// creating an object of class A
	A a = new A();
	
	public void run() {
		
		// calling sum method
		a.sum(10);
	}
}

public class ThreadTest{
	
	public static void main(String[] args) {
		
		// creating an object of class B
		B b = new B();
		
		// Initializing instance t1 of Thread
		// class with object of class B
		Thread t1 = new Thread(b);
		
		// Initializing instance t2 of Thread
		// class with object of class B
		Thread t2 = new Thread(b);
		
		// Initializing thread t1 with name
		// 'Thread A'
		t1.setName("Thread A");
		
		// Initializing thread t2 with name
		// 'Thread B'
		t2.setName("Thread B");
		
		// Starting thread instance t1 and t2
		t1.start();
		t2.start();
		
	}
}
/**
 * output:
 * 
 * Thread A : 11
 * Thread A : 12
 * Thread A : 13
 * Thread A : 14
 * Thread A : 15
 * Thread B : 11
 * Thread B : 12
 * Thread B : 13
 * Thread B : 14
 * Thread B : 15
 * 
 * 
 */
