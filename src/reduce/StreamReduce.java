package reduce;
/**
 * 
 * = Stream.reduce() =
 * 
 * - Many times, we need to perform operations where a stream reduces to single resultant value,
 *   for example, maximum, minimum, sum, product, etc.
 *   
 * - reduce operation applies a binary operator to each element in the stream
 *   where the first argument to the operator is the return value of the previous application
 *   and second argument is the current stream element.
 *   
 *   
 * - sum(), min(), max(), count() etc.
 *   are some examples of reduce operations.
 * - reduce() explicitly asks you to specify how to reduce the data that made it through the stream.
 * 
 * -
 *
 */
// implemrntation of reduce method to get the longest String
import java.util.*;
public class StreamReduce {
	
	// Driver code
	public static void main(String[] args) {
		
		// creating a list of Strings
		List<String> words = Arrays.asList("a", "abc", "adv", "fwg", "Hello from Bu");
		
		// The lambda expression passed to reduce() method takes 2 strings and return the longer String.
		// The result of the reduce() method is an Optional because the list on which reduce() is called may be empty.
		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2); 
		
		// Display the longest String
		longestString.ifPresent(System.out:: println);
	}

}
/**
 * output:
 * 
 * Hello from Bu
 * 
 */

