package inheritancetest;
/**
 * 
 * 1. Single Inheritance: 
 * - In single inheritance, subclasses inherit the features of one superclass. 
 * - class A serves as a base class for the derived class B.
 *
 */




class oneA{
	public void printHello() {
		System.out.println("Hello");
	}
}

class twoB extends oneA{
	public void printFrom() {
		System.out.println("from");
	}
}



// driver class
public class InheritanceType1 {
	
	public static void main(String[] args) {
		twoB g = new twoB();
		
		g.printHello();
		g.printFrom();
		g.printHello();
	}
	
	
	

}
/**
 * output:
 * 
 * Hello
 * from
 * Hello
 * 
 * 
 */




