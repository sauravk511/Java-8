package String_Programs;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str = "programming";
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity()
                        ,Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(System.out::println);
    }
}
