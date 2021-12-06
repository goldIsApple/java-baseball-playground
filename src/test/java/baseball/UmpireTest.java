package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UmpireTest {

    @Test
    @DisplayName("숫자와 포지션이 같으면 스트라이크")
    void NumberAndPositionEquals(){
        Ball player = new Ball(1, 1);
        Ball computer = new Ball(1, 1);

        Umpire umpire = new Umpire();
        umpire.isStrike(player, computer);

        Assertions.assertThat(umpire.getStrikeCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("숫자 만 같으면 스트라이크")
    void NumberEquals(){
        Ball player = new Ball(1, 1);
        Ball computer = new Ball(1, 2);

        Umpire umpire = new Umpire();
        umpire.isBall(player, computer);

        Assertions.assertThat(umpire.getBallCount()).isEqualTo(1);
    }
    @Test
    @DisplayName("숫자와 포지션 둘다 같지 않으면 낫싱")
    void NumberAndPositionNotEquals(){
        Ball player = new Ball(1, 1);
        Ball computer = new Ball(2, 2);

        Umpire umpire = new Umpire();
        umpire.isStrike(player, computer);
        umpire.isBall(player, computer);

        Assertions.assertThat(umpire.getStrikeCount()).isEqualTo(0);
        Assertions.assertThat(umpire.getBallCount()).isEqualTo(0);
    }
}
