package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 사용법")
    void split() {
        // when
        String[] numbers = "1,2".split(",");
        String[] number = "1".split(",");
        // then
        assertThat(numbers).hasSize(2);
        assertThat(numbers).containsExactly("1", "2");
        assertThat(number).hasSize(1);
        assertThat(number).contains("1");
    }

    @Test
    @DisplayName("substring 사용법")
    void substring() {
        // when
        String actual = "(1,2)".substring(1, 4);
        // then
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("chatAt 사용법")
    void charAt() {
        //when
        char actual = "abc".charAt(1);
        //then
        assertThat(actual).isEqualTo('b');
    }

    @Test
    @DisplayName("문자를 가져올 위치값이 벗어났을때")
    void indexOutOfBoundsException() {
        // when, then
        Exception exception = assertThrows(StringIndexOutOfBoundsException.class, () -> "123".charAt(3));
        assertThat(exception.getMessage()).contains("index out of range");
    }

}
