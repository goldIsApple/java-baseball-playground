package baseball;

public class Umpire {
    private int ballCount;
    private int strikeCount;

    public boolean isBall(Ball player, Ball computer) {
        if(player.NumberEquals(computer)){
            ballCount++;
            return true;
        }
        return false;
    }
    public boolean isStrike(Ball player, Ball computer) {
        if(player.equals(computer)){
            strikeCount++;
            return true;
        }
        return false;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
}
