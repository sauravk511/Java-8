package String_Programs;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringInSentence {
    public static void main(String[] args) {
        String str = "My name is Saurav Kumar";
        String longest = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt
                        (String::length))
                .orElse(null);
        System.out.println(longest);
    }
}
// Output:- Saurav