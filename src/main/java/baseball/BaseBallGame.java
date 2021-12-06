package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    public static final int NUMBER_SIZE=3;
    //private List<Ball> computerBalls = createBalls(Computer.createRandomNumber());
    private List<Ball> computerBalls = createBalls("345");
    private Umpire umpire;

    public void start(){
        boolean isStrike = false;
        System.out.println(computerBalls.get(0));
        System.out.println(computerBalls.get(1));
        System.out.println(computerBalls.get(2));
        BaseballGameInputView inputView = BaseballGameInputView.getInstance();
        while(!isStrike){
            umpire=new Umpire();
            List<Ball> playerBalls = createBalls(inputView.inputNumber());
            isStrike = isStrike(playerBalls);
        }
    }

    private boolean isStrike(List<Ball> playerBalls) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            compareTo(playerBalls.get(i));
        }
        if(BallCount.isThreeStrike(umpire.getBallCount(), umpire.getStrikeCount())){
            return true;
        }
        return false;
    }

    private void compareTo(Ball playerBall) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if(umpire.isStrike(playerBall, computerBalls.get(i))){
                break;
            }
            if(umpire.isBall(playerBall, computerBalls.get(i))){
                break;
            }
        }
    }

    private List<Ball> createBalls(String randomNumber) {
        List<Ball> balls = new ArrayList<>();;
        for (int i = 0; i <NUMBER_SIZE ; i++) {
            int number = randomNumber.charAt(i) - 48;
            balls.add(new Ball(number,i+1));
        }
        return balls;
    }
}
