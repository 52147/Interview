package inheritancetest;
/**
 * = Inheritance in Java =
 * 
 * - Inheritance is an important pillar of OOP(object-oriented programming).
 * - It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.
 * - The keyword used for inheritance is extends.
 * 
 * terminology:
 * 
 * - super class:
 *   - The class whose features are inherited is known as superclass(or a base class or a parent class).
 *   
 * - sub class:
 *   - The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).
 *   - The subclass can add its own fields and methods in addition to the superclass fields and methods.
 *   
 * - reusability:
 *   - inheritance supports the concept of "reusability",
 *     i.e. when we want to create a new class and there is already a class that includes some of the code that we want,
 *     we can derive our new class from existing class.
 *   - By doing this, we are reusing the fields and methods of the existing class.
 *   
 *   
 *   - In this program, when an object of MountainBike class is created,
 *     a copy of all methods and fields of the superclass acquire memory in this object.
 *   - That is why by using the object of the subclass we can also access the member of a superclass.
 *   
 *   - Note that during inheritance only the object of the subclass is created, not the superclass.
 *   
 *   - In practice, inheritance and polymorphism are used together in java to achieve fast performance and readability of code.
 *   
 * 
 * Types of Inheritance 
 * 
 * 1. single inheritance:
 *    - In single inheritance, subclasses inherit the features of on superclass.
 *    - In the image below, class A serves as a base calss for the derived class B.
 * 
 * 2. Multilevel inheritance:
 *    - In Multilevel inheritance, a derived class will be inheriting a base class
 *      and the derived class also act as the base class to other class.
 *    
 *    - For example, class A serves as a base class for the derived class B,
 *      which in turn serves as a base class for the derived class C.
 *    
 *    - In java, a class cannot directly access the grandparent's members. 
 *    
 * 3. Hierarchical Inheritance:
 *    - In Hierarchical inheritance,
 *      one class serves as a superclass(base class) for more than one subclass.
 *    - For example, class A serves as a base class for the derived class B, C, D.
 *    
 *    
 * 4. Multiple Inheritance(through interfaces):
 *    - In Multiple inheritances, 
 *      one class can have more than one superclass and inherit features from all parent classes.
 *    
 *    - Note that Java does not support multiple inheritances with classes.
 *    - In Java, we can achieve multiple inheritances only through interfaces.
 *    
 *    - For example:
 *      - Class C is derived from interface A and B.
 *      
 * 5. Hybrid inheritance(through interfaces):
 *    - It is a mix of 2 or more of the above types of inheritance.
 *    - Since java does not support multiple inheritances with classes,
 *      hybrid inheritance is also not possible with classes.
 *    
 *    - In java, we can achieve hybrid inheritance only througn interfaces.
 *    
 * 
 * Important facts about Java inheritance:
 * 
 * - 1. Default superclass:
 *   - Except Object class, which has no superclass,
 *     every class has one and only one direct superclass(single inheritance).
 *     
 *   - In the absence of any other explicit superclass,
 *     every class is implicitly a subclass of the Object class.
 *     
 * - 2. Superclass can only be one:
 *   - A superclass can have any member of subclasses.
 *   - But a subclass can have only one superclass.
 *   - This is because Java does not support multiple inheritances with classes.
 *   - Althog with interfaces, multiple inheritances are supported by Java.
 *   
 * - 3. Inheriting Constructors:
 *   - A subclass inherits all the member(fields, methods, and nested classes) from it superclass.
 *   - Constructors are not members,
 *     so they are not inherited by subclasses, 
 *     but the constructor of the superclass can be invoked from the subclass.
 *     
 * - 4. Private member inheritance:
 *      - A subclass does not inherit the privatte members of its parent class.
 *      - However, if the superclasss has public or protected method(like getters and setters)
 *        for acessing its private field,
 *        these can also be used by the subclass.
 *        
 *        
 * What all can be done in a Subclass?
 * 
 * - In sub-classes we can inherit members as is, replace them, hide them, or supplement then with new members:
 * 
 *  - The inherited field can be used directly.
 *  - We can declare new fields in the subclass that not in the superclass.
 *  - The inherited methods can be used directly as they are.
 *  - We can write a new instance method in the subclass that has the same signature as the one in the superclass,
 *    thus overriding it
 *    (toString() method is overriden).
 *  - We can write a new static method in the subclass that has the same signature as the one in the superclass,
 *    thus hiding it.
 *  - We can declare new methods in the subclass that are not in the superclass.
 *  - We can write a subclass constructor that invokes the constructor of the superclass,
 *    either implicitly or by using the keyword super.
 *    
 * method signature:
 *   - method name + parameters
 *
 */

// Bicycle is a base class, MountainBike is a a derived class that extends Bicycle class
public class BicycleDriver {
	
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
	}

}

class Bicycle {
	
	// Bicyclen calss has 2 fields
	public int gear;
	public int speed;
	
	// The Bicycle class has one constructor
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// Bicycle class has 3 methods
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	// toString() method to print info of Bicycle
	public String toString() {
		return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
	}

}




// derived class
class MountainBike extends Bicycle{
	
	// MountainBike subclass add one more field
	public int seatHeight;
	
	
	// MountainBike subclass has one constructor
	public MountainBike(int gear, int speed, int startHeight) {
		// invoking base-class(Bicycle) constructor
		super(gear, speed);
		seatHeight = startHeight;
	}
	
	// MountainBike subclass adds one more method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	// overriding toString() method
	// of Bicycle to print more info
	public String toString() {
		return (super.toString() + "\nseat height is " + seatHeight);
	}
	
}


