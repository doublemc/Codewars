package exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by michal on 20.02.17.
 */
@RunWith(JUnitParamsRunner.class)
public class TwoToOneTest {

    private Object[] twoToOne() {
        return new Object[]{
            new Object[] {"aretheyhere", "yestheyarehere", "aehrsty"},
            new Object[] {"loopingisfunbutdangerous", "lessdangerousthancoding", "abcdefghilnoprstu"},
            new Object[] {"inmanylanguages", "theresapairoffunctions", "acefghilmnoprstuy"},
        };
    }

    @Test
    @Parameters(method = "twoToOne")
    public void shouldReturnLongesSortedStringWithDistinctLetters(String firstWord, String secondWord, String result) {
        // when
        String output = TwoToOne.longest(firstWord, secondWord);

        // then
        assertThat(output).contains(result);
    }

}