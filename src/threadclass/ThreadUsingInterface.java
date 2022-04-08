package threadclass;
// way 2: creating thread using Runnable interface
public class ThreadUsingInterface implements Runnable{
	
	// method 1
	// run() method for the thread
	public void run() {
		
		// print statement
		System.out.println("Thread is created using Runnable interface.");
	}
	
	
	// method 2:
	// main driver method
	public static void main(String[] args) {
		
		// creating object of our thread class inside main() method
		ThreadUsingInterface obj = new ThreadUsingInterface();
		
		// passing the object to thread in main()
		Thread myThread = new Thread(obj);
		
		// starting the thread
		myThread.start();
	}
	

}

/**
 * output:
 * 
 * Thread is created using Runnable interface.
 *
 */

