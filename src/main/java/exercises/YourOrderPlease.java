package exercises;

/**
 * Created by michal on 16.02.17.
 *
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f
 */
public class YourOrderPlease {
    public static String order(String wordsToOrder) {
        String[] words = wordsToOrder.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i < 10; i++) {
            for (String word : words) {
                if (word.contains(String.valueOf(i))) {
                    result.append(word).append(" ");
                }
            }
        }
        return result.toString().trim();
    }
}
