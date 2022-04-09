package extendsvsimplement;
/**
 * 
 * 
 *
 */

// defining an interface
interface A{
	public void methodA();
}


// defining the second interface
interface B{
	public void methodB();
}
public class Three implements A, B{
	public void methodA() {
		// implementation of the method
	};
	public void methodB() {
		// implementation of the method
	};

}
