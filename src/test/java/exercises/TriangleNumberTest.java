package exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by michal on 21.02.17.
 */
@RunWith(JUnitParamsRunner.class)
public class TriangleNumberTest {

    private Object[] triangleNumbers() {
        return new Object[]{
            new Object[] {0, true},
            new Object[] {1, true},
            new Object[] {3, true},
            new Object[] {6, true},
            new Object[] {55, true},
            new Object[] {153, true},
            new Object[] {300, true},
            new Object[] {406, true}
        };
    }

    private Object[] nonTriangleNumbers() {
        return new Object[]{
                new Object[] {5, false},
                new Object[] {8, false},
                new Object[] {51, false},
                new Object[] {142, false},
                new Object[] {277, false},
                new Object[] {644, false}
        };
    }

    @Test
    @Parameters(method = "triangleNumbers")
    public void shouldReturnTrue_whenPassedTriangleNumber(int input, boolean result) {
        // when
        boolean isTriangleNumber = TriangleNumber.isTriangleNumber(input);

        // then
        assertThat(isTriangleNumber).isEqualTo(result);
    }

    @Test
    @Parameters(method = "nonTriangleNumbers")
    public void shouldReturnFalse_whenPassedNonTriangleNumber(int input, boolean result) {
        // when
        boolean isTriangleNumber = TriangleNumber.isTriangleNumber(input);

        // then
        assertThat(isTriangleNumber).isEqualTo(result);
    }
}
