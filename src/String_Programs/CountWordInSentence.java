package String_Programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordInSentence {
    public static void main(String[] args) {
        String str = "My name is saurav and my home is in patna";
        Map<String, Long> map = Arrays.stream(str.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting() ));
        System.out.println(map);
    }
}
// Output :- {in=1, and=1, name=1, is=2, saurav=1, my=2, patna=1, home=1}
