package threadclass;
/**
 * = Java.lang.Thread class =
 * 
 * - Thread a line of execution within a program.
 * - Each program can have multiple associated threads.
 * - Each threads has a priority which is used by the thread scheduler 
 *   to determine which thread must run first.
 *   
 * - Java provides a thread class that has various method calls in order to manage the behavior of threads
 *   by providing constructors and methods to perform operations on threads.  
 * 
 * 
 *  ways of creating threads:
 *  - 1. Creating own class which is extending to parent Thread class
 *  - 2. Implementing the Runnable interface.
 *  
 *  
 * = Thread class =
 * 
 * - A thread is a program that starts with a method()
 *   frequently used in this class only known as the start() method.
 * - This method looks out for the run() method
 *   which is also a method of the class and
 *   begins executing the body of the run() method.
 * 
 * - Every class that is used as thread must implement Runnable interface
 *   and override it's method
 *
 */

// way 1: creating thread by extending to thread class
public class MyThread extends Thread{
	
	// method 1
	// Run() method for our thread
	public void run() {
		
		
		// print statement
		System.out.println("Thread is running created by extending to parent thread class");
	}
	
	
	// method 2
	// main driver method
	public static void main(String[] args) {
		// creating object of our thread class inside main() method
		MyThread myThread = new MyThread();
		
		// starting the thread
		myThread.start();
	}
	

}

/**
 * output:
 * 
 * Thread is running created by extending to parent thread class
 *
 */

