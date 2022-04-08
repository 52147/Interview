package threadsafe;
/**
 * 
 * = Using volatile keyword =
 * 
 * - A volatile keyword is a field modifier 
 *   that ensures that the object can be used by multiple threads at the same time without having any problem.
 *   
 * - volatile is one good way of ensuring that the Java program is thread-safe.
 *
 */
public class ThreadTest2 {

	// Initializing volatile variables
	// a, b
	static volatile int a = 0, b = 0;

	// Defining a static void method
	static void method_one() {

		a++;
		b++;

	}

	// Defining static void method
	static void method_two() {

		System.out.println("a=" + a + " b=" + b);

	}

	public static void main(String[] args) {

		// creating an instance t1 of Thread class
		Thread t1 = new Thread() {
			public void run() {

				for (int i = 0; i < 5; i++) {
					method_one();
				}
			}
		};

		// creating an instance t2 of Thread class
		Thread t2 = new Thread() {
			public void run() {

				for (int i = 0; i < 5; i++) {
					method_two();
				}
			}
		};

		// starting instance t1 and t2
		t1.start();
		t2.start();
	}

}

/**
 * output:
 * 
 * 
 * a=5 b=5
 * a=5 b=5
 * a=5 b=5
 * a=5 b=5
 * a=5 b=5
 * 
 * 
 */




