package exercises;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by michal on 01.02.17.
 *
 * https://www.codewars.com/kata/5656b6906de340bd1b0000ac
 */
public class TwoToOne {
    public static String longest(String firstWord, String secondWord) {
        String addedStrings = firstWord + secondWord;
        String result = "";
        for (int i = 0; i < addedStrings.length(); i++) {
            if (!result.contains(String.valueOf(addedStrings.charAt(i)))) {
                result += addedStrings.charAt(i);
            }
        }
        return Stream.of(result.split("")).sorted().collect(Collectors.joining());
    }
}
