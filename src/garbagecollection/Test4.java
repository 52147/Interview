package garbagecollection;
// = output question (Garbage collection: use finalize()) =

public class Test4 {
	
	public static void main(String[] args) {
		// how many objects are eligible for garbage collection after this line?
		m1();  // line 8
	}
	
	static void m1() {
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		
	}

}


/**
 * Question: 
 * - How many objects are eligible for garbage collection after execution of line 8?
 * 
 * Answer:
 * 
 *   2
 *   
 * Explanation:
 * - Since t1 and t2 are local objects of m1() method, 
 *   so they become eligible for garbage collection after complete execution of method 
 *   unless any of them is returned.  
 * 
 */