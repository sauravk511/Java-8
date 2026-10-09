package String_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Java is very powerful";
        String result = Arrays.stream(str.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), list ->
                        {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        } ));
        System.out.println(result);

        // Method 2:- Using Collections.reverse() method
        String sentence = "Python is second most popular language";
        List<String> words = Arrays.asList(sentence.split(" "));
        Collections.reverse(words);
        String res = String.join(" ", words);
        System.out.println(res);
    }
}
// Output:-
// powerful very is Java
// language popular most second is Python
