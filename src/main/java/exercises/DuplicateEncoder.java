package exercises;

/**
 * Created by michal on 15.01.17.
 *
 * https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
 */

public class DuplicateEncoder {
    static String encode(String word) {
        StringBuilder result = new StringBuilder("");
        if (word != null) {
        String inputToLower = word.toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char singleChar = inputToLower.charAt(i);
                result.append(inputToLower.lastIndexOf(singleChar) == inputToLower.indexOf(singleChar) ? '(' : ')');
            }
        }
        return result.toString();
    }
}
