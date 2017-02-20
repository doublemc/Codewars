package exercises;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by michal on 20.02.17.
 * <p>
 * https://www.codewars.com/kata/5264d2b162488dc400000001
 */
public class SpinWords {
    public static String spinWords(String input) {
        if (input != null) {
            return Arrays.stream(input.split(" "))
                    .map(w -> w.length() < 5 ? w : new StringBuilder(w).reverse().toString())
                    .collect(Collectors.joining(" "));
        }
        return "";
    }
}
