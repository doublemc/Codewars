package exercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by michal on 16.02.17.
 */
public class YourOrderPleaseTest {
    @Test
    public void shouldPutWordsInOrder() {
        // given
        String wordsToOrder = "is2 Thi1s T4est 3a";

        // when
        String wordsInOrder = YourOrderPlease.order(wordsToOrder);

        // then
        assertThat(wordsInOrder).isEqualTo("Thi1s is2 3a T4est");
    }

    @Test
    public void shouldReturnEmptyString_whenEmptyStringPassed() {
        // given
        String emptyString = "";

        // when
        String wordsInOrder = YourOrderPlease.order(emptyString);

        // then
        assertThat(wordsInOrder).isEqualTo("");
    }
}
