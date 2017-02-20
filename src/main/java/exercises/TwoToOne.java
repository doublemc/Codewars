package exercises;

import java.util.Arrays;

/**
 * Created by michal on 01.02.17.
 *
 * https://www.codewars.com/kata/5656b6906de340bd1b0000ac
 */
public class TwoToOne {

    public static String longest(String s1, String s2) {
        String addedStrings = s1 + s2;
        String result = "";

        for (int i = 0; i < addedStrings.length(); i++) {
            if (!result.contains(String.valueOf(addedStrings.charAt(i)))) {
                result += addedStrings.charAt(i);
            }
        }
        char[] ch = result.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);

    }
}
