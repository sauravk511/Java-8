package String_Programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterFrequency {
    public static void main(String[] args) {

        String str = "programming";
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

    }
}

// Output:- {p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}
