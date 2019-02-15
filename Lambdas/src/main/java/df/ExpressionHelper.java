package df;

import java.util.function.Predicate;

public class ExpressionHelper {

        public static boolean isPalindrome(String s) {

            Predicate<String> predicate = x -> {
                String cleaned = x.replaceAll("\\W*", "");
                return cleaned.equalsIgnoreCase(
                       new StringBuilder(cleaned).reverse().toString());
            };

            return predicate.test(s);
        }

        public boolean isSumEven(int n) {

            Predicate<Integer> predicate = x -> {
                char[] chars = String.valueOf(Math.abs(x)).toCharArray();
                int sum = 0;
                for (char c : chars) {
                    sum += c - '0';
                }
                return (sum % 2 == 0);
            };

            return predicate.test(n);
        }
}
