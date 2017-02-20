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
public class SpinWordsTest {

    private Object[] wordsToSpin() {
        return new Object[]{
            new Object[] {"Hey fellow warriors",  "Hey wollef sroirraw"},
            new Object[] {"This is another test", "This is rehtona test"},
            new Object[] {"Yellow Submarine", "wolleY enirambuS"}
        };
    }

    @Test
    public void shouldReturnEmptyString_whenPassedNull() {
        // when
        String result = SpinWords.spinWords(null);
        // then
        assertThat(result).isEmpty();
    }

    @Test
    public void shouldNotSpinWordsWithLessThatFiveLetters() {
        // given
        String input = "This is a test";

        // when
        String result = SpinWords.spinWords(input);

        // then
        assertThat(result).contains("This is a test");
    }

    @Test
    @Parameters(method = "wordsToSpin")
    public void shouldSpinAllWordsWithFiveOrMoreLetters(String input, String result) {
        // when
        String output = SpinWords.spinWords(input);

        // then
        assertThat(output).contains(result);
    }

}