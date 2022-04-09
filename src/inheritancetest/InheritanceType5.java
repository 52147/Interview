package inheritancetest;
/**
 * 5. Hybrid Inheritance(Through Interfaces): 
 * 
 * - It is a mix of two or more of the above types of inheritance. 
 * - Since java doesn’t support multiple inheritances with classes, 
 *   hybrid inheritance is also not possible with classes. 
 *   
 * - In java, we can achieve hybrid inheritance only through Interfaces.
 * 
 * 
 * Java IS-A type of Relationship:
 *
 * - IS-A is a way of saying: 
 * - This object is a type of that object. 
 * - Let us see how the extends keyword is used to achieve inheritance.
 * 
 * 
 * 
 * in Object-Oriented terms, the following are true:
 *
 * - SolarSystem the superclass of Earth class.
 * - SolarSystem the superclass of Mars class.
 * - Earth and Mars are subclasses of SolarSystem class.
 * - InheritanceType5 is the subclass of both Earth and SolarSystem classes.
 * 
 */

class SolarSystem{}

class Earth extends SolarSystem{}

class Mars extends SolarSystem{}

public class InheritanceType5 extends Earth {

	public static void main(String[] args) {
		
		SolarSystem s = new SolarSystem();
		
		Earth e = new Earth();
		Mars m = new Mars();
		
		System.out.println(s instanceof SolarSystem);
		System.out.println(e instanceof Earth);
		System.out.println(m instanceof SolarSystem);

	}

}

/**
 * output:
 * 
 * true
 * true
 * true
 */
