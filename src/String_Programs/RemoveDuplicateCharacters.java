package String_Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";

        // Method 1: Using Stream API
        String result = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Using Stream API: " + result);

        // Method 2: Using StringBuilder
        Arrays.stream(str.split(""))
                .distinct()
                .forEach(System.out::print);
    }
}

// Output:- progamin
