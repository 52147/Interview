package reduce;
// implementation of reduce method to get the combined String
import java.util.*;
public class StreamReduce2 {
	
	public static void main(String[] args) {
		
		// String array
		String[] array = {"Hello", "from", "Taiwan"};
		
		// the result of the reduce method is Optional
		// because the list on which reduce() is called may be empty.
		Optional<String> String_combine = Arrays.stream(array)
				.reduce((str1, str2) -> str1 + "-" + str2);
		
		
		// Display the combined String
		if(String_combine.isPresent()) {
			System.out.println(String_combine.get());
		}
	}

}

/**
 * output:
 * 
 * Hello-from-Taiwan
 */


