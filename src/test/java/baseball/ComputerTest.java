package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.*;

class ComputerTest{

    @RepeatedTest(100)
    @DisplayName("컴퓨터의 랜덤숫자 범위는 100~999 사이")
    void createNumberBetween100And1000() {
        // given
        Computer computer = Computer.getInstance();
        // when
        int randomNumber = computer.createRandomNumber();
        // then
        assertThat(randomNumber).isGreaterThan(99).isLessThan(1000);
    }
}