package exercises;

/**
 * Created by michal on 20.02.17.
 *
 * https://www.codewars.com/kata/5264d2b162488dc400000001
 */
public class SpinWords {
    public static String spinWords(String sentence) {
        String[] splitWords = sentence.split(" ");
        String reversedSentence = "";
        for (String str : splitWords) {
            if (str.length() >= 5) {
                str = reverse(str);
            }
            reversedSentence += " " + str;
        }
        return reversedSentence.trim();
    }
    
    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
