package reduce;

// implementation of reduce method to get the product of all numbers in given range.
import java.util.*;
import java.util.stream.IntStream;
public class StreamReduce4 {
	
	public static void main(String[] args) {
		
		 // To get the product of all elements in given range excluding the rightmost element
		int product = IntStream.range(2, 8)
				.reduce((num1, num2) -> num1 * num2)
				.orElse(-1);
		
		// displaying the product
		System.out.println("The product is: " + product);
		
		
	}

}
/**
 * output:
 * 
 * The product is: 5040
 *
 * 
 */
