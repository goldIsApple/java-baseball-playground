package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("문자열을 입력받아 계산")
    void hello() throws Exception{
        Calculator calculator = new Calculator("2 / 2");
        Assertions.assertThat(calculator.calculate()).isEqualTo(1);
    }

}
