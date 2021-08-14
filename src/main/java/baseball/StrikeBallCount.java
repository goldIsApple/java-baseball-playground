package baseball;

import java.util.Arrays;

public enum StrikeBallCount{
    ONE_STRIKE(0,1,() -> System.out.println("1스트라이크")),
    TWO_STRIKE(0,2,() -> System.out.println("2스트라이크")),
    THREE_STRIKE(0,3,() -> System.out.println("3스트라이크")),
    ONE_BALL(1,0,()-> System.out.println("1볼")),
    TWO_BALL(2,0,()-> System.out.println("2볼")),
    THREE_BALL(3,0,() -> System.out.println("3볼")),
    ONE_BALL_ONE_STRIKE_(1,1,() -> System.out.println("1볼 1스트라이크")),
    TWO_BALL_ONE_STRIKE_(2,1,() -> System.out.println("2볼 1스트라이크")),
    NOTHING(0,0,() -> System.out.println("낫싱"));

    private final int ball;
    private final int strike;
    private final Executable executable;

    StrikeBallCount(int ball , int strike , Executable executable){
        this.ball = ball;
        this.strike = strike;
        this.executable = executable;
    }

    public static boolean isThreeStrike(int ball, int strike){
        StrikeBallCount strikeBallCount = Arrays.stream(StrikeBallCount.values())
                .filter(sb -> sb.getBall() == ball && sb.getStrike() == strike)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("잘못된 접근입니다."));
        strikeBallCount.getExecutable().execute();

        if(strikeBallCount == StrikeBallCount.THREE_STRIKE){
            return true;
        }
        return false;
    }

    public int getBall(){
        return ball;
    }

    public int getStrike(){
        return strike;
    }

    public Executable getExecutable(){
        return executable;
    }
}
