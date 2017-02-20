package exercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Created by michal on 13.02.17.
 *
 * https://www.codewars.com/kata/5626b561280a42ecc50000d1
 */
public class SumDigPower {

    public static int digitPow(long input) {
        int result = 0;
        int count = (int)(Math.log10(input) + 1); // number of digits in n

        while (count > 0) {
            result += Math.pow(input % 10, count);
            input /= 10;
            count--;
        }
        return result;
    }

    public static boolean isEqualToDigitPow(long number) {
        return number == digitPow(number);
    }

    public static List<Long> findDigitPowNumbers(long start, long end) {
        List<Long> list = LongStream.rangeClosed(start, end).boxed().collect(Collectors.toList());
        return list.stream()
                .filter(SumDigPower::isEqualToDigitPow)
                .map(Long::valueOf)
                .collect(Collectors.toList());
    }
}
