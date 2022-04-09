package nestedclass;
/**
 * 
 * Inner classes:
 *
 * - To instantiate an inner class, 
 *   you must first instantiate the outer class. 
 *   
 * - Then, create the inner object within the outer object with this syntax:
 * 
 *    OuterClass.InnerClass innerobj = outerObj.new InnerClass();
 *    
 *    
 * There are two special kinds of inner classes :
 *
 *  1. Local inner classes
 *  2. Anonymous inner classes   
 *
 */

// a program to demonstrate accessing a inner class
// outer class
class OuterClass{
	
	// static member
	static int outerx = 10;
	
	// instance non-static member
	int outery = 20;
	
	// private member
	private int outerprivate = 30;
	
	// inner class
	class InnerClass{
		
		void display() {
			
			// can access static member of outer class
			System.out.println("outer x = " + outerx);
			
			// can access non static member of outer class
			System.out.println("outer y = " + outery);
			
			// can access a private member of the outer class
			System.out.println("outer private = " + outerprivate);
			
		}
	}
}

// Driver class
public class InnerClassDemo {
	
	public static void main(String[] args) {
		
		// accessing an inner class
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass innerObj = outerObj.new InnerClass();
		
		innerObj.display();
	}

}

/**
 * output:
 * 
 * 
 * outer x = 10
 * outer y = 20
 * outer private = 30
 * 
 * 
 */


