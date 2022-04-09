package inheritancetest;

/**
 * 
 * 4. Multiple Inheritance (Through Interfaces):
 *  
 * - In Multiple inheritances, 
 *   one class can have more than one superclass and 
 *   inherit features from all parent classes. 
 *   
 * - Please note that Java does not support multiple inheritances with classes. In java, we can achieve multiple inheritances only through Interfaces. In the image below, Class C is derived from interface A and B.
 *
 */

interface One{
	public void printHello();
}

interface Two{
	public void printFor();
}

interface Three extends One, Two{
	public void printBu();
}

class Child implements Three{

	@Override
	public void printHello() {
		System.out.println("Hello");
	}

	@Override
	public void printFor() {
		System.out.println("For");
		
	}

	@Override
	public void printBu() {
		System.out.println("Bu");
		
	}
	
}

// Driver class
public class InheritanceType4 {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.printHello();
		c.printFor();
		c.printBu();
	}

}

/**
 * 
 * output:
 * 
 * Hello
 * For
 * Bu
 * 
 */
