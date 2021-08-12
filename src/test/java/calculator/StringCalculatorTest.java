package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class StringCalculatorTest {


    @Test
    @DisplayName("입력한 문자열이 올바르지 않을때")
    void inputWrong() throws Exception{
        // when, then
        assertThrows(IllegalArgumentException.class,() -> new NumericForm("1*2"));
        assertThrows(IllegalArgumentException.class,() -> new NumericForm("1 * 2 + "));
    }
    @Test
    @DisplayName("십의자리 이상 수에서 0으로 시작할때")
    void canNotStartZero() throws Exception{
        // when, then
        assertThrows(IllegalArgumentException.class,() -> new NumericForm("01 * 20 + "));
    }
    @Test
    @DisplayName("입력한 문자열을 공백 기준으로 분리")
    void stringToArrayByWhitespace() throws Exception{
        // given
        NumericForm stringCalculator = new NumericForm("1 * 2");
        // then
        assertThat(stringCalculator.getValues()).hasSize(3);
    }

}