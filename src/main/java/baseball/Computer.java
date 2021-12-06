package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Computer {
    private static final Random random = new Random();

    public static String createRandomNumber() {
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size()<3){
            numbers.add(random.nextInt(9) + 1);
        }
        return numbers.stream()
                .map(String::valueOf)
                .reduce("", (i1, i2) -> i1 + i2);
    }
}
