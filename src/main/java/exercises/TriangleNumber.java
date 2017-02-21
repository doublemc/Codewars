package exercises;

/**
 * Created by michal on 21.02.17.
 *
 * https://www.codewars.com/kata/557e8a141ca1f4caa70000a6
 */
public class TriangleNumber {
    public static boolean isTriangleNumber(long n) {
        if (n == 0 || n == 1) {
            return true;
        }
        // a number n is a triangular number when (8 * n) + 1 is a perfect square
        long formula = 8 * n + 1;
        return isPerfectSquare(formula);
    }

    private static boolean isPerfectSquare(long number) {
        long squareRoot = (long) (Math.sqrt(number));
        return squareRoot * squareRoot == number;
    }
}
