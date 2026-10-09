package String_Programs;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {

        String sentence = "Java Stream API is powerful and flexible";

        // Method 1: Using split() method
        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);

        // Method 2: Using Stream API
        long count = Arrays.stream(sentence
                        .split(" "))
                .count();
        System.out.println("Number of words (using Stream API): " + count);
    }
}
// Output:-
// Number of words: 7
// Number of words (using Stream API): 7
