package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static baseball.BaseballGame.*;

public class Computer{

    private static Computer computer;

    private Computer() { }

    public static Computer getInstance(){
        if(computer==null){
            computer = new Computer();
        }
        return computer;
    }

    public int createRandomNumber(){
        final Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size()< NUMBER_SIZE){
            numbers.add(random.nextInt(10 - 1) + 1);
        }
        int hundredDigit = toHundredDigitByNumbers(numbers);
        return hundredDigit;
    }

    private int toHundredDigitByNumbers(Set<Integer> numbers){
        String hundredDigit = numbers.stream()
                .map(String :: valueOf)
                .reduce("" , (i1 , i2) -> i1 + i2);
        return Integer.parseInt(hundredDigit);
    }

}

