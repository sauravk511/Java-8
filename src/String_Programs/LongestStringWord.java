package String_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringWord {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Spring","Microservices");
        String longest = list.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(longest);
    }
}
// Output:- Microservices
