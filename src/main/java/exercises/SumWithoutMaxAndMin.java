package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by michal on 15.01.17.
 * <p>
 * https://www.codewars.com/kata/576b93db1129fcf2200001e6
 */
public class SumWithoutMaxAndMin {
    public static int sum(int[] numbers) {
        int result = 0;
        if (numbers != null && numbers.length > 1) {

            List<Integer> list = new ArrayList<Integer>();
            for (int number : numbers) {
                list.add(number);
                result += number;
            }
            int maxValue = Collections.max(list);
            int minValue = Collections.min(list);
            return (result - maxValue - minValue);
        } else {
            return 0;
        }
    }
}
