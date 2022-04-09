package inheritancetest;
/**
 * 
 * 2. Multilevel Inheritance: 
 * 
 * - In Multilevel Inheritance, 
 *    a derived class will be inheriting a base class 
 *    and the derived class also act as the base class to other class. 
 * - class A serves as a base class for the derived class B, 
 *   which in turn serves as a base class for the derived class C. 
 *   
 * - In Java, a class cannot directly access the grandparent’s members.
 *
 */
class oneone{
	
	public void printHello() {
		System.out.println("Hello");
	}
	
	
	
}

class twotwo extends oneone{
	public void printFor() {
		System.out.println("For");
	}
}

class threethree extends twotwo{
	public void printBu() {
		System.out.println("Bu");
	}
}

public class InheritanceType2 {
	public static void main(String[] args) {
		threethree g = new threethree();
		
		g.printHello();
		g.printFor();
		g.printBu();
	}

}

/**
 * output:
 * 
 * Hello
 * For
 * Bu
 */


