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

        // Second repeating character
        // Example: "abccdde" -> 'c' is the first repeating character,
        // 'd' is the second repeating character
        Set<Character> set1 = new HashSet<>();
        Character secondRepeated = "abccdde"
                .chars()
                .mapToObj(c-> (char)c)
                .filter(c -> !set1.add(c))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second repeating character : " + secondRepeated);
    }
}
/* Output:-
First repeating character : c
Second repeating character : d
*/
