package garbagecollection;
/**
 * 
 * Q: Is there a way by which we can prevent an object from being collected by the garbage collector?
 * A: 
 * - 1. by increasing heap memory
 * - 2. by using Singleton Class 
 * - 3. using public void finalise()
 * 
 * 
 * = by using Singleton Class =
 * 
 *   - In case of a singleton class, the reference of the only object created can be stored in a static reference.
 *   - Since static members are stored in class area(a memory segment), their lifetime spans the lifetime of the program.
 *
 *
 *   - the below example show that since the object's reference has been passed into a static variable, it will never be lost.
 *   - Therefore, the object won't be deleted until the end of the program.
 *   - However, the only issue remains that only object can be created here.
 */
public class Singleton {
	
	// static class member which will store the object reference
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
