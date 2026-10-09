package String_Programs;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Character repeated = "abccde"
                .chars()
                .mapToObj(c-> (char)c)
                .filter(c -> !set.add(c))
                .findFirst()
                .orElse(null);
        System.out.println("First repeating character : " + repeated);
    }
}
// Output:- First repeating character : c
