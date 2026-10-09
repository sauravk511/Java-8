package String_Programs;

import java.util.stream.Collectors;

public class CheckAnagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram =
                s1.chars()
                    .sorted()
                    .boxed()
                    .collect(Collectors.toList())
                .equals(s2.chars()
                                .sorted()
                                .boxed()
                                .collect(Collectors.toList()));
        System.out.println(isAnagram);
    }
}
// Output:- true
