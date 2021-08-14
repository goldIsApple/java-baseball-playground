package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest{
    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void 야구_숫자_1_9_검증(){
        Assertions.assertThat(ValidationUtil.validNumber(1)).isTrue();
        Assertions.assertThat(ValidationUtil.validNumber(9)).isTrue();

        Assertions.assertThat(ValidationUtil.validNumber(0)).isFalse();
        Assertions.assertThat(ValidationUtil.validNumber(10)).isFalse();
    }
}
