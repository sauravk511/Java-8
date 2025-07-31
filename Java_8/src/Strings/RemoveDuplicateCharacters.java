package Strings;

import java.util.Arrays;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args) {
		
		// for character
		String s = "sauravkumar";
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
		
		System.out.println("-------------------");
		
		// for word
		String word = "my name is saurav kumar my hometown is in Patna";
		Arrays.stream(word.split(" ")).distinct().forEach(x -> System.out.print(x+" "));
	}

}
