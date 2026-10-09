package String_Programs;

public class PalindromeCheck {

    public static void main(String[] args) {

        String str = "madam";
        boolean result = str.equals(new StringBuilder(str)
                        .reverse()
                        .toString());

        System.out.println(result);
    }
}

// Output:- true
