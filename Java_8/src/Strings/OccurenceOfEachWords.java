package Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachWords {
	
	public static void main(String[] args) {
		
		String str = "Hi my name is saurav kumar and my latop name is MAC";
		
		Map<String, Long> wordOccurence = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),	
						 Collectors.counting()));
		System.out.println(wordOccurence);
		
	}

}
