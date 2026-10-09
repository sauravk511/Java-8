package String_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordFrequency {
    public static void main(String[] args) {

        List<String> items = Arrays.asList(
                "Apple", "Banana", "Apple",
                "Orange", "Banana", "Apple" );
        Map<String, Long> wordCount = items.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        System.out.println(wordCount);
    }
}
// Output:- {Apple=3, Orange=1, Banana=2}
