package Palindrom;

public class Palindrom {

    public static boolean isStringPalindrom(String input) {
        if (input != null) {
            return input.replaceAll("\\W*", "")
                   .equalsIgnoreCase(new StringBuilder(input).reverse().toString()
                   .replaceAll("\\W*", ""));
        }

        return false;
    }

}
