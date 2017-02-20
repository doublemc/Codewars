package exercises;

import java.util.BitSet;

/**
 * Created by michal on 15.01.17.
 *
 * https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
 */

public class DuplicateEncoder {
    static String encode(String word) {
        // determine if a character has been seen
        BitSet previous = new BitSet();
        // determine if a character was a duplicate
        BitSet duplicate = new BitSet();
        for (int i = 0; i < word.length(); i++) {
            char singleChar = Character.toLowerCase(word.charAt(i));
            if (previous.get(singleChar)) {
                duplicate.set(singleChar);
            } else {
                previous.set(singleChar);
            }
        }
        // create a new string in a single pass using StringBuilder
        StringBuilder sb = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            // replace duplicates with ) and non duplicates with (
            sb.append(duplicate.get(ch) ? ')' : '(');
        }
        return sb.toString();
    }
}
