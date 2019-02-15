package df;

import java.util.function.Predicate;

public class LongestPalindrome {

    public int getLongestPalindromeLength(String[] array, Predicate<String> p) {
        int longest = 0;
        for (String s : array) {
            if ((s.length() > longest) && (p.test(s))) {
                longest = s.length();
            }
        }

        return longest;
    }

}
