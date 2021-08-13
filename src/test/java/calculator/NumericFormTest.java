package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class NumericFormTest{

    @Test
    @DisplayName("입력한 문자열이 올바르지 않을때")
    void inputWrong() {
        // when, then
        assertThrows(IllegalArgumentException.class,() -> new NumericForm("1*2"));
        assertThrows(IllegalArgumentException.class,() -> new NumericForm("1 * 2 + "));
    }

    @Test
    @DisplayName("십의자리 이상 수에서 0으로 시작할때")
    void canNotStartZero() {
        // when, then
        assertThrows(IllegalArgumentException.class,() -> new NumericForm("01 * 20 + "));
    }

    @Test
    @DisplayName("입력한 문자열을 공백 기준으로 분리")
    void stringToArrayByWhitespace() {
        // given
        NumericForm numericForm = new NumericForm("1 * 2");
        // then
        assertThat(numericForm.getValues()).hasSize(3);
    }

    @Test
    @DisplayName("입력한 문자열 값에 따라 사칙연산을 수행")
    void stringCalculate() {
        NumericForm numericForm = new NumericForm("1 + 2 * 3 - 5");
        assertThat(numericForm.getAnswer()).as("문자열 순서대로 계산").isEqualTo(4);
    }
}