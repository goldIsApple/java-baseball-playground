package baseball;

import static baseball.BaseballGame.*;

public class BaseballGameService{
    private static BaseballGameService baseballGameService;


    private BaseballGameService(){}

    public static BaseballGameService getInstance(){
        if(baseballGameService==null){
            baseballGameService = new BaseballGameService();
        }
        return baseballGameService;
    }

    public boolean compare(int inputNumber, int computerNumber){
        final String stringInputNumber = String.valueOf(inputNumber);
        final String stringComputerNumber = String.valueOf(computerNumber);

        final int ball=getBallCount(stringInputNumber, stringComputerNumber);
        final int strike=getStrikeCount(stringInputNumber, stringComputerNumber);

        return StrikeBallCount.isThreeStrike(ball,strike);
    }

    private int getStrikeCount(String inputNumber, String computerNumber){
        int strikeCount=0;
        for (int i = 0; i < NUMBER_SIZE ; i++) {
            strikeCount += strikeYN(inputNumber, computerNumber, i);
        }
        return strikeCount;
    }

    private int getBallCount(String inputNumber, String computerNumber){
        int ballCount=0;
        for (int i = 0; i < NUMBER_SIZE ; i++) {
            ballCount += getBallCount(inputNumber, computerNumber, i);
        }
        return ballCount;
    }
    private int getBallCount(String inputNumber, String computerNumber, int i){
        int ballCount=0;
        for (int j = 0; j < NUMBER_SIZE ; j++) {
            ballCount += ballYN(inputNumber, computerNumber, i, j);
        }
        return ballCount;
    }

    private int strikeYN(String inputNumber, String computerNumber, int i){
        if(inputNumber.charAt(i) == computerNumber.charAt(i)){
            return 1;
        }
        return 0;
    }

    private int ballYN(String inputNumber, String computerNumber, int i, int j){
        if(i != j && inputNumber.charAt(i) == computerNumber.charAt(j)){
            return 1;
        }
        return 0;
    }
}
