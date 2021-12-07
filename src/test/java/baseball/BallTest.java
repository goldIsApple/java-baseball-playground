package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {

    private Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 4);
    }
    @Test
    void strike() {
        Assertions.assertThat(com.play(new Ball(1, 4))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        Assertions.assertThat(com.play(new Ball(2, 4))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        Ball com = new Ball(1, 4);
        Assertions.assertThat(com.play(new Ball(2, 5))).isEqualTo(BallStatus.NOTHING);
    }

}
