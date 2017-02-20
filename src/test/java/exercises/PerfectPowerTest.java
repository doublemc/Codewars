package exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by michal on 14.02.17.
 */
@RunWith(JUnitParamsRunner.class)
public class PerfectPowerTest {
    private Object[] getNumbers() {
        return new Object[]{
            new Object[]{4, new int[] {2, 2}},
            new Object[]{9, new int[] {3, 2}},
            new Object[]{81, new int[] {9, 2}},
            new Object[]{5, null},
            new Object[]{32, new int[] {2, 5}}

        };
    }

    @Test
    @Parameters(method = "getNumbers")
    public void shouldReturnTrue_whenGivenPerfectNumber(int givenNumber, int[] answer) {
        // act
        int[] results = PerfectPower.isPerfectPower(givenNumber);

        // assert
        assertThat(results).containsExactly(answer);
    }

}
