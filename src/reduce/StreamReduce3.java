package reduce;

// implementation of reduce method to get the sum of all element
import java.util.*;
public class StreamReduce3 {
	
	public static void main(String[] args) {
		
		
		// creating list of integers
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
		
		// Finding sum of all elements
		int sum = array.stream().reduce(0, (element1, element2) -> element1 + element2);
		
		
		// display sum of all element
		System.out.println("The sum of all element is " + sum);
	}

}
/**
 * output:
 * 
 * The sum of all element is 16
 *
 */
