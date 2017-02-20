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
public class DuplicateEncoderTest {

    private Object[] valuesToEncode() {
        return new Object[]{
                new Object[]{"din", "((("},
                new Object[]{"recede", "()()()"},
                new Object[]{"bambam", "))))))"},
                new Object[]{"aaaaaa", "))))))"}
        };
    }

    @Test
    public void shouldReturnEmptyString_whenPassedEmptyString() {
        // given
        String s = "";
        // when
        String result = DuplicateEncoder.encode(s);

        // then
        assertThat(result).isEmpty();
    }

    @Test
    public void shouldReturnEmptyString_whenPassedNull() {
        // when
        String result = DuplicateEncoder.encode(null);
        // then
        assertThat(result).isEmpty();
    }

    @Test
    @Parameters(method = "valuesToEncode")
    public void shouldEncode_whenPassedCorrectStrings(String input, String result) {
        // when
        String output = DuplicateEncoder.encode(input);

        // then
        assertThat(output).isEqualTo(result);
    }

    @Test
    public void shouldIgnoreCapitalization() {
        // given
        String s = "Success";

        // when
        String result = DuplicateEncoder.encode(s);

        // then
        assertThat(result).contains(")())())");
    }

    @Test
    public void shouldEncodeProperly_whenGivenSpecialCharacters() {
        // given
        String s = "(( @";

        // when
        String result = DuplicateEncoder.encode(s);

        // then
        assertThat(result).contains("))((");
    }



}