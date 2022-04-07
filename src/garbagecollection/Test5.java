package garbagecollection;

//= output question (Garbage collection: use finalize()) =
public class Test5 {
	
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		Test5 t2 = m1(t1); // line 8
		Test5 t3 = new Test5();
		t2 = t3; // line 10
	}
	
	static Test5 m1(Test5 temp) {
		temp = new Test5();
		return temp;
	}

}

/**
 * Question :
 * - How many objects are eligible for garbage collection after execution of line 8?
 * 
 * Answer :
 * 
 *   1
 *   
 * Explanation :
  * - By the time line 10 has executed, the only object without a reference is the one generated 
  *   - as a result of line 8. 
  *   - Remember that “Java is strictly pass by value” so the reference variable t1 is not affected by the m1() method. 
  *   - We can check it using finalize() method. 
  *   - The statement “System.out.println(this.hashcode())” in finalize() method print the object hashcode value on which finalize() method is called,
  *     and then just compare the value with other objects hashcode values created in main method.  
 *   
 *   
 */


