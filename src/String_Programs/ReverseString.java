package String_Programs;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello, Java!";
        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println(reverse);
    }
}

// Output:- !avaJ ,olleH
