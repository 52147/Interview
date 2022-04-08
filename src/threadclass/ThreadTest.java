package threadclass;
/**
 * Thread class method:
 * 
 * 
 * holdsLock():
 * 
 * - Returns true if and only 
 *   if the current thread holds the monitor lock on the specified object.
 *   
 * - Monitor(synchronized):
 * 
 *   - A monitor is mechanism to control concurrent access to an object.
 *   - This prevents Threads 1 and 2 accessing the monitored (synchronized) section at the same time. One will start, and monitor will prevent the other from accessing the region before the first one finishes.
 *
 *   - It's not a special object. It's synchronization mechanism placed at class hierarchy root: java.lang.Object.
 *
 *   - There are also wait and notify methods that will also use object's monitor to communication among different threads.
 *   - Monitor is a synchronization construct that allows threads to have both mutual exclusion and the ability to wait (block) for a certain condition to become true. 
 *   - Monitors also have a mechanism for signaling other threads that their condition has been met. 
 *   - It is an entity that possesses both a lock and a wait set.
 * 
 * isDaemon():
 * 
 * - checks if the thread is a daemon thread. If the thread is daemon thread, 
 *   this method will return true else it returns false.
 *   
 * - Daemon thread: 
 *   - A Daemon thread is a background service thread which runs as a low priority thread and performs background operations like garbage collection. 
 *   - JVM exits if only daemon threads are remaining. 
 *   - The setDaemon() method of the Thread class is used to mark/set a particular thread as either a daemon thread or a user thread.
 * 
 * enumerate():
 * 
 * - The enumerate() method of thread class is used to copy every active thread's thread group 
 *   and its subgroup into the specified array. 
 * - This method calls the enumerate method with the array argument. 
 * - This method uses the activeCount method to get an estimate of how big the array should be.
 * 
 */
//java program demonstrating methods of Thread class
//Class 1
//Helper class implementing Runnable interface
class Helper implements Runnable {

	
	public void run() {

		// Try block to check for exceptions
		try {

			// Print statement
			System.out.println("thread2 going to sleep for 5000");

			// Making thread sleep for 0.5 seconds
			Thread.sleep(5000);

		}

		// Catch block to handle exception
		catch (InterruptedException e) {

			// Print statement
			System.out.println("Thread2 interrupted");
		}
	}
}

//Class 2
//Helper class extensing Runnable interface
public class ThreadTest implements Runnable {

	// Method 1
	// run() method of this class
	public void run() {

		// Thread run() method
	}

	// Method 2
	// Main driver method
	public static void main(String[] args) {

		// Making objects of class 1 and 2 in main() method
		ThreadTest obj = new ThreadTest();
		Helper obj2 = new Helper();

		// Creating 2 threads in main() method
		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj2);

		// Moving thread to runnable states
		thread1.start();
		thread2.start();

		// Loading thread 1 in class 1
		ClassLoader loader = thread1.getContextClassLoader();

		// Creating 3rd thread in main() method
		Thread thread3 = new Thread(new Helper());

		// Getting number of active threads
		System.out.println(Thread.activeCount());
		thread1.checkAccess();

		// Fetching an instance of this thread
		Thread t = Thread.currentThread();

		// Print and display commands
		System.out.println(t.getName());

		System.out.println("Thread1 name: " + thread1.getName());
		System.out.println("Thread1 ID: " + thread1.getId());

		// Fetching the priority and state of thread1
		System.out.println("Priority of thread1 = " + thread1.getPriority());

		// Getting state of thread 1 using getState() method
		// and printing the same
		System.out.println(thread1.getState());

		thread2 = new Thread(obj2);
		thread2.start();
		thread2.interrupt();
		System.out.println("Is thread2 interrupted? " + thread2.interrupted());
		System.out.println("Is thread2 alive? " + thread2.isAlive());

		thread1 = new Thread(obj);
		thread1.setDaemon(true);
		System.out.println("Is thread1 a daemon thread? " + thread1.isDaemon());
		System.out.println("Is thread1 interrupted? " + thread1.isInterrupted());

		// Waiting for thread2 to complete its execution
		System.out.println("thread1 waiting for thread2 to join");

		try {
			thread2.join();
		}

		catch (InterruptedException e) {

			// Display the exception along with line number
			// using printStackTrace() method
			e.printStackTrace();
		}

		// Now setting the name of thread1
		thread1.setName("child thread xyz");

		// Print and display command
		System.out.println("New name set for thread 1" + thread1.getName());

		// Setting the priority of thread1
		thread1.setPriority(5);

		thread2.yield();

		// Fetching the string representation of thread1
		System.out.println(thread1.toString());

		// Getting list of active thread in current thread's group
		Thread[] tarray = new Thread[3];

		Thread.enumerate(tarray);

		// Display commands
		System.out.println("List of active threads:");
		System.out.printf("[");

		// Looking out using for each loop
		for (Thread thread : tarray) {

			System.out.println(thread);
		}

		// Display commands
		System.out.printf("]\n");

		System.out.println(Thread.getAllStackTraces());

		ClassLoader classLoader = thread1.getContextClassLoader();
		System.out.println(classLoader.toString());
		System.out.println(thread1.getDefaultUncaughtExceptionHandler());

		thread2.setUncaughtExceptionHandler(thread1.getDefaultUncaughtExceptionHandler());
		thread1.setContextClassLoader(thread2.getContextClassLoader());
		thread1.setDefaultUncaughtExceptionHandler(thread2.getUncaughtExceptionHandler());

		thread1 = new Thread(obj);
		StackTraceElement[] trace = thread1.getStackTrace();

		System.out.println("Printing stack trace elements for thread1:");

		for (StackTraceElement e : trace) {
			System.out.println(e);
		}

		ThreadGroup grp = thread1.getThreadGroup();
		System.out.println("ThreadGroup to which thread1 belongs " + grp.toString());
		System.out.println(thread1.getUncaughtExceptionHandler());
		System.out.println("Does thread1 holds Lock? " + thread1.holdsLock(obj2));

		Thread.dumpStack();

	}
}
/**
 * 
 * output:
 * 
 * 2
 * main
 * thread2 going to sleep for 5000
 * Thread1 name: Thread-0
 * Thread1 ID: 15
 * Priority of thread1 = 5
 * TERMINATED
 * Is thread2 interrupted? false
 * Is thread2 alive? true
 * Is thread1 a daemon thread? true
 * Is thread1 interrupted? false
 * thread1 waiting for thread2 to join
 * thread2 going to sleep for 5000
 * Thread2 interrupted
 * New name set for thread 1child thread xyz
 * Thread[child thread xyz,5,main]
 * List of active threads:
 * [Thread[main,5,main]
 * Thread[Thread-1,5,main]
 * null
 * ]
 * {Thread[Attach Listener,5,system]=[Ljava.lang.StackTraceElement;@3af49f1c, Thread[Signal Dispatcher,9,system]=[Ljava.lang.StackTraceElement;@19469ea2, Thread[main,5,main]=[Ljava.lang.StackTraceElement;@13221655, Thread[Finalizer,8,system]=[Ljava.lang.StackTraceElement;@2f2c9b19, Thread[Notification Thread,9,system]=[Ljava.lang.StackTraceElement;@31befd9f, Thread[Common-Cleaner,8,InnocuousThreadGroup]=[Ljava.lang.StackTraceElement;@1c20c684, Thread[Reference Handler,10,system]=[Ljava.lang.StackTraceElement;@1fb3ebeb, Thread[Thread-1,5,main]=[Ljava.lang.StackTraceElement;@548c4f57}
 * jdk.internal.loader.ClassLoaders$AppClassLoader@7852e922
 * null
 * Printing stack trace elements for thread1:
 * ThreadGroup to which thread1 belongs java.lang.ThreadGroup[name=main,maxpri=10]
 * java.lang.ThreadGroup[name=main,maxpri=10]
 * Does thread1 holds Lock? false
 * java.lang.Exception: Stack trace
 * 	at java.base/java.lang.Thread.dumpStack(Thread.java:1380)
 * 	at threadclass.ThreadTest.main(ThreadTest.java:167)
 * 
 * 
 */