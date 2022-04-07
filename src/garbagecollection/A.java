package garbagecollection;
/**
 * = garbage collector =
 * - The garbage collector in Java is automatic
 * - the user does not have to manually free an occupied memory which was dynamically allocated.
 * 
 * - Q: how does a garbage collector decide which object is to be deleted?
 *   - A: the object which loses it's reference, is marked for deletion from the heap memory.
 *   
 * 
 *
 */



// Java code to demonstrate when an object would be deleted by the garbage collector
public class A {
	
	static void f() {
		
		A x = new A();
		// object created locally 
		// It's scope remains valid till the termination of this function
	}
	
	public static void main(String a[]) {
		f();
		// function f() terminate,
		// and hence the object 'x' gets collected by the garbage collector
	}

}
