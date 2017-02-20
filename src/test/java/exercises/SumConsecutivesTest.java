package exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by michal on 20.02.17.
 */
@RunWith(JUnitParamsRunner.class)
public class SumConsecutivesTest {

    private Object[] sumConsecutives() {
        return new Object[]{
            new Object[] {Arrays.asList(1,4,4,4,0,4,3,3,1), Arrays.asList(1,12,0,4,6,1)},
            new Object[] {Arrays.asList(-5,-5,7,7,12,0), Arrays.asList(-10,14,12,0)},
            new Object[] {Arrays.asList(1,1,7,7,3), Arrays.asList(2,14,3)}
        };
    }

    @Test
    @Parameters(method = "sumConsecutives")
    public void shouldSumAllTheSameAndConsecutiveNumbers(List<Integer> inputList, List<Integer> resultList) {
        // when
        List<Integer> result = SumConsecutives.sumConsecutives(inputList);

        // then
        assertThat(result).containsOnlyElementsOf(resultList);
    }
}