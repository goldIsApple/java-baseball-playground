package study;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.Assertions.assertThat;

class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("크기를 확인")
    void size() {
        assertThat(numbers).as("numbers size should be equal to 3").hasSize(3);
    }

    @ParameterizedTest(name = "{0} 존재여부 : true")
    @ValueSource(ints = {1, 2, 3})
    void isTrueIfNumberContains(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest(name = "{0} 존재여부 : {1}")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void should_expected_When_numberContainsInNumbers(int number, boolean expected) {
        assertThat(numbers.contains(number)).isEqualTo(expected);
    }

}
