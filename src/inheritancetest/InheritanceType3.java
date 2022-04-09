package inheritancetest;
/**
 * 
 * 3. Hierarchical Inheritance: 
 * - In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. 
 * - class A serves as a base class for the derived class B, C and D.
 *
 */


class A{
	public void printA() {
		System.out.println("Class A");
	}
}

class B extends A{
	public void printB() {
		System.out.println("Class B");
	}
}

class C extends A{
	public void printC() {
		System.out.println("Class C");
	}
}

class D extends A{
	public void printD() {
		System.out.println("Class D");
	}
}
// Driver Class
public class InheritanceType3 {
	
	public static void main(String[] args) {
		
		B objB = new B();
		objB.printA();
		objB.printB();
		
		C objC = new C();
		objC.printA();
		objC.printC();
		
		D objD = new D();
		objD.printA();
		objD.printD();
			
	}
	
	

}

/**
 * output:
 * Class A
 * Class B
 * Class A
 * Class C
 * Class A
 * Class D
 */


