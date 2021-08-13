package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest{

    @Test
    @DisplayName("잘못된 연산자를 입력했을때")
    void should_calculate_when_WrongInput() {
        assertThrows(IllegalArgumentException.class , () -> Calculator.calculate("%" , 1 , 2  ));
    }

    @Test
    @DisplayName("숫자 표현식에 따른 계산")
    void should_calculate_when_Input() {
        int num1 = 4;
        int num2 = 2;
        assertThat(Calculator.calculate("+" , num1 , num2)).isEqualTo(6);
        assertThat(Calculator.calculate("-" , num1 , num2)).isEqualTo(2);
        assertThat(Calculator.calculate("*" , num1 , num2)).isEqualTo(8);
        assertThat(Calculator.calculate("/" , num1 , num2)).isEqualTo(2);
    }
}