package String_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateWords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "Pen",
                "Eraser", "Note Book", "Pen", "Pencil",
                "Pen", "Note Book", "Pencil" );

        Set<String> duplicates = list.stream()
                .filter((word) -> Collections.frequency(list, word) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}

// Output:- [Pen, Note Book, Pencil]