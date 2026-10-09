package String_Programs;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Java Stream API";
        long vowels = str.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count(); // print vowels only
        long consonants = str.toLowerCase()
                .chars()
                .filter(c -> Character.isLetter(c))
                .filter(c -> "aeiou".indexOf(c) == -1)
                .count();
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
// Output:-
// Vowels: 5
// Consonants: 7
