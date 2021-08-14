package baseball;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameServiceTest{

    @Test
    @DisplayName("입력값 과 컴퓨터값 비교")
    void comapre() throws Exception{
        // given
        BaseballGameService baseballGameService = BaseballGameService.getInstance();
        // when
        boolean oneStrike = baseballGameService.compare(123 , 154);
        boolean twoStrike = baseballGameService.compare(123 , 124);
        boolean threeStrike = baseballGameService.compare(123 , 123);

        boolean oneBall = baseballGameService.compare(123 , 345);
        boolean twoBall = baseballGameService.compare(123 , 315);
        boolean threeBall = baseballGameService.compare(123 , 312);
        boolean oneBallOneStrike = baseballGameService.compare(123 , 134);
        boolean twoBallOneStrike = baseballGameService.compare(123 , 132);
        boolean nothing = baseballGameService.compare(123 , 456);

        // then
        Assertions.assertThat(oneStrike).isFalse();
        Assertions.assertThat(twoStrike).isFalse();
        Assertions.assertThat(threeStrike).isTrue();
        Assertions.assertThat(oneBall).isFalse();
        Assertions.assertThat(twoBall).isFalse();
        Assertions.assertThat(threeBall).isFalse();
        Assertions.assertThat(oneBallOneStrike).isFalse();
        Assertions.assertThat(twoBallOneStrike).isFalse();
        Assertions.assertThat(nothing).isFalse();


    }
}