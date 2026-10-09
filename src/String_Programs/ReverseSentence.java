package String_Programs;

import java.util.Arrays;
import java.util.Collections;
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
    }
}
// Output:- powerful very is Java
