package baseball;

import java.util.Objects;

public class Ball {

    private static final int NUMBER_MIN_SIZE = 1;
    private static final int NUMBER_MAX_SIZE = 9;
    private static final int POSITION_MIN_SIZE = 1;
    private static final int POSITION_MAX_SIZE = 3;

    private int number;
    private int position;

    public Ball(int number, int position) {
        validate(number, position);
        this.number=number;
        this.position=position;
    }

    private void validate(int number, int position) {
        if(number< NUMBER_MIN_SIZE || number > NUMBER_MAX_SIZE){
            throw new IllegalArgumentException("숫자는 1부터 9까지만 입력할수 있습니다.");
        }
        if(position< POSITION_MIN_SIZE || position > POSITION_MAX_SIZE){
            throw new IllegalArgumentException("포지션은 1부터 3까지만 가능합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return number == ball.number && position == ball.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, position);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", position=" + position +
                '}';
    }

    public boolean NumberEquals(Ball computer) {
        return this.number == computer.number && this.position!=computer.position;
    }
}
