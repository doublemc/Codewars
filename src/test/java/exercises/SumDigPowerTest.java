package exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by michal on 13.02.17.
 */
@RunWith(JUnitParamsRunner.class)
public class SumDigPowerTest {

    private Object[] numbersForSum() {
        return new Object[]{
            new Object[]{1, 1},
            new Object[]{9, 9},
            new Object[]{10, 1},
            new Object[]{15, 26},
            new Object[]{111, 3},
            new Object[]{333, 39}
        };
    }

    private Object[] valuesForEquality() {
        return new Object[]{
            new Object[]{1, true},
            new Object[]{7, true},
            new Object[]{10, false},
            new Object[]{89, true},
            new Object[]{122, false},
            new Object[]{135, true}
        };
    }

    private Object[] valuesForListWithDigitPow() {
            return new Object[]{
            new Object[]{1, 10, new Long[] {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L}},
            new Object[]{1, 100, new Long[] {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L}},
            new Object[]{90, 100, new Long[] {}},
            new Object[]{50, 150, new Long[] {89L, 135L}},
            new Object[]{10, 100,  new Long[] {89L}}
        };
    }

    @Test
    @Parameters(method = "numbersForSum")
    public void shouldReturnSumOfDigitsToTheConsecutivePower(int input, int result) {
        // act
        int sum = SumDigPower.digitPow(input);

        // assert
        assertThat(sum).isEqualTo(result);
    }

    @Test
    @Parameters(method = "valuesForEquality")
    public void shouldReturnTrue_whenNumberIsEqualToTheSumOfDigitsToTheConsecutivePower(int number, boolean result) {
        // act
        boolean isEqual = SumDigPower.isEqualToDigitPow(number);

        // assert
        assertThat(isEqual).isEqualTo(result);
    }

    @Test
    @Parameters(method = "valuesForListWithDigitPow")
    public void shouldReturnSortedListWithDigitPowNumbers(long start, long end, Long[] results) {
        // act
        List<Long> digitPowNumbers = SumDigPower.findDigitPowNumbers(start, end);

        // assert
        assertThat(digitPowNumbers).containsExactly(results);
    }

}
