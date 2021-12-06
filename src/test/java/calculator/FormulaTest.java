package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class FormulaTest {

    @Test
    @DisplayName("문자열 수식을 공백으로 분리")
    void splitByWhiteSpace() throws Exception{
        Formula formula = new Formula("2 + 2");
        assertThat(formula.size()).isEqualTo(3);
    }
    @ParameterizedTest
    @ValueSource(strings = { "2 a 2", "2 $ 2",
                             "2 +2"," 2 + 2",
                             "a + 2","2 + a" })
    @DisplayName("문자열 규칙이 숫자 공백 연산자 공백 숫자 가 아닐때")
    void abnormalFormula(String input) throws Exception{
        String message = assertThrows(IllegalArgumentException.class, () -> new Formula(input)).getMessage();
        assertThat(message).contains(input);
    }


}
