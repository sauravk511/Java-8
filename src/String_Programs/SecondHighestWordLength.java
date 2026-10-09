package String_Programs;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestWordLength {
    public static void main(String[] args) {
        String sentence = "i love python programming";
        int s = Arrays.stream(sentence.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.print("Second highest word length: " + s);
    }
}
// Output:- Second highest word length: 6
