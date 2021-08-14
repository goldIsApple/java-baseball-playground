package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RandomTest{

    @Test
    @DisplayName("1~9 까지 랜덤 숫자")
    void randomRange1_9() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(9) + 1);
        }
        Assertions.assertThat(numbers).noneMatch(n -> n.equals(10) || n.equals(0));
    }

    @Test
    @DisplayName("100의 자리 숫자 랜덤뽑기")
    void randomRange100() {
        for (int i = 0; i <1000 ; i++) {
            Random random = new Random();
            int number = random.nextInt(1000 - 100) + 100;
            System.out.println(number);
        }
    }

}
