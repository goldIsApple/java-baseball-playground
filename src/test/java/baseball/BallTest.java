package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class BallTest {

    @Test
    @DisplayName("볼의 숫자는 1부터 9까지만 허용")
    void numberRange1To9() {
        assertThrows(IllegalArgumentException.class,()->new Ball(10,1));
    }

    @Test
    @DisplayName("볼의 포지션은 1부터 3까지만 허용")
    void positionRange1To3() {
        assertThrows(IllegalArgumentException.class,()->new Ball(1,4));
    }

    @Test
    @DisplayName("숫자와 포지션이 같으면 같은 볼이다.")
    void equalNumberAndPosition() {
        Ball ball = new Ball(1, 1);
        assertThat(ball).isEqualTo(new Ball(1, 1));
    }

}
