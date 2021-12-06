package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class OperatorTest {

    @ParameterizedTest
    @CsvSource(value = {"+:12", "-:6", "*:27", "/:3"}, delimiter = ':')
    @DisplayName("연산자에 따른 결과값 테스트")
    void operator(String symbol,int result) throws Exception {
        Operator operator = Operator.findBySymbol(symbol);
        Assertions.assertThat(operator.operate(9, 3)).isEqualTo(result);
    }

}
