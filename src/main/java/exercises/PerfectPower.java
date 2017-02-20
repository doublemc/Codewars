package exercises;

/**
 * Created by michal on 14.02.17.
 *
 * https://www.codewars.com/kata/54d4c8b08776e4ad92000835
 */

public class PerfectPower {
    public static int[] isPerfectPower(int number) {
        for (int m = 2; m < Math.log(number) / Math.log(2) + 1; m++) {
            for(int k = 2; Math.pow(k, m) <= number; k++) {
                if (Math.pow(k, m) == number) {
                    return new int[]{k, m};
                }
            }
        }
        return null;
    }

}
