package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 27.01.17.
 *
 * https://www.codewars.com/kata/55eeddff3f64c954c2000059
 */
public class SumConsecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> result = new ArrayList<Integer>();
        int currentRepeating = 0;
        for (int i : s) {
            if (result.isEmpty() || currentRepeating != i) {
                currentRepeating = i;
                result.add(i);
            } else {
                result.set((result.size() - 1), result.get((result.size() - 1)) + i);
            }
        }
        return result;
    }
}
