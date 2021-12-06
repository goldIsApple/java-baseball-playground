package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class BallCountTest {

    @Test
    @DisplayName("스트라이크 가 3개면 쓰리스트라이크")
    void ballCount() {
        assertThat(BallCount.isThreeStrike(0,3)).isTrue();
        assertThat(BallCount.isThreeStrike(3,0)).isFalse();
    }

}
