package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.*;

public class ComputerTest {

    @RepeatedTest(100)
    @DisplayName("임의의수 3자리 생성")
    void createRandomNumber() {
        int number = Integer.valueOf(Computer.createRandomNumber());
        assertThat(number).isGreaterThan(99).isLessThan(1000);
    }
}
