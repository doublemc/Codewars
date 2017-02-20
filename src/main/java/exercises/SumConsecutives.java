package exercises;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by michal on 27.01.17.
 *
 * https://www.codewars.com/kata/55eeddff3f64c954c2000059
 */
public class SumConsecutives {
    public static List<Integer> sumConsecutives(List<Integer> integerList) {
        // using LinkedList so have access to pollLast()
        LinkedList<Integer> result = new LinkedList<>();
        int previousNumber = 0;
        for (int number : integerList) {
            result.add(number == previousNumber ? result.pollLast() + number : number);
            previousNumber = number;
        }
        return result;
    }
}
