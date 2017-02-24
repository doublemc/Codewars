package exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by michalc94 on 24.02.17.
 */
@RunWith(JUnitParamsRunner.class)
public class EmirpsTest {

    private Object[] reversedPrimes() {
        return new Object[]{
            new Object[] {100, new long[] {13, 17, 31, 37, 71, 73, 79, 97}},
            new Object[] {20, new long[] {13, 17}},
            new Object[] {1000, new long[] {13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157, 167, 179,
                    199, 311, 337, 347, 359, 389, 701, 709, 733, 739, 743, 751,
                    761, 769, 907, 937, 941, 953, 967, 971, 983, 991}}
        };
    }

    private Object[] emirpValues() {
        return new Object[]{
            new Object[] {10, new long[] {0, 0, 0}},
            new Object[] {50, new long[] {4, 37, 98} },
            new Object[] {100, new long[] {8, 97, 418} },
            new Object[] {1000, new long[] {36, 991, 16788} },
        };
    }

    @Test
    public void shouldFindPrimesUpToTheLimitNumber() {
        // given
        long limit = 50;

        // when
        long[] primes = Emirps.findPrimes(limit);

        // then
        assertThat(primes).contains(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    }

    @Test
    @Parameters(method = "reversedPrimes")
    public void shouldFindOnlyPrimesThatReversedAreAlsoPrimeNumbers(long limit, long[] result) {

        // when
        long[] output = Emirps.findReversedPrimes(limit);

        // then
        assertThat(output).containsExactly(result);

    }

    // structure:
    // [number of emirps below n, largest emirp smaller than n, sum of all the emirps of the sequence bellow n]
    @Test
    @Parameters(method = "emirpValues")
    public void shouldReturnArrayWithSpecificStructure(long limit, long[] result) {
        // when
        long[] arrayEmirp = Emirps.findEmirp(limit);

        // then
        assertThat(arrayEmirp).contains(result);
    }
}
