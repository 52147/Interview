package extendsvsimplement;
/**
 * 
 * = extends vs. implement =
 * 
 * - Inheritance is an important pillar of OOP(object oritented programming).
 * - It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class.
 * - There are 2 main keywords, "extends" and "implements" which are used in Java for inheritance.
 * 
 * - In this aritcle, the difference between extends and implement is discussed.
 * - Before getting into the difference,
 *   let first understand in whtat scenarios each of the keywords are used.
 *   
 * extend:
 * 
 * - The extends keyword is used to indicate that the class which is being defined
 *   is derived from the base class using inheritance.
 * - So bascially, extends keyword is used to extend the functionality of the parent class to the subclass.
 * - multiple inheritance are not allowed due to ambiguity.
 * - Therefore, a class can extend only one class to avoid ambiguity.
 * 
 * Implements:
 * 
 * - In Java, the implements keyword is used to implement an interface.
 * - An interface is a special type of class which implements a complete abstraction and only contains abstract methods.
 * 
 * - To access the interface methods,
 *   the interface must be "implemented" by another class with the implements keyword and
 *   the methods need to be implemented in the class which is inheriting the properies of the interface.
 * - Since an interface is not having the implementation of the methods,
 *   a class can implement any number of interfaces at a time.
 *   
 *   
 * The difference between the extends and interface:
 * 
 * extends:
 * 
 * 1. By using “extends” keyword a class can inherit another class, 
 *    or an interface can inherit other interfaces
 * 
 * 2. It is not compulsory that subclass that extends a superclass 
 *    override all the methods in a superclass.
 *    
 * 3. Only one superclass can be extended by a class.
 * 
 * 4. Any number of interfaces can be extended by interface.
 *    
 *   
 * 
 * 
 * 
 * 
 *
 */

class One{
	public void methodOne() {
		// some functionality
	}
}
public class Two extends One{
	public static void main(String[] args) {
		
		Two t = new Two();
		
		// calls the method one of the above class
		t.methodOne();
	}

}
