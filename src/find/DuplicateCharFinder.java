package find;

import java.util.HashMap;

// find the duplicate character in a string.
// print the character that occurrence > 1.
public class DuplicateCharFinder {
	
	private static void find(String str) {
		HashMap<Character, Integer> cache = new HashMap<>();
		
		char[] arr = str.toCharArray();
		
		for(char a : arr) {
			cache.put(a, cache.getOrDefault(a, 0) + 1);
			
		}
		
		for(char k: cache.keySet()){
			if(cache.get(k) > 1) {
				System.out.println(k + " is appear " + cache.get(k) + " times.");
			}
		}
		
	}

	public static void main(String[] args) {
		
		
		find("Taiwan is my country.");
		
		
		

	}

}