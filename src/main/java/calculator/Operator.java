package calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (first, second) -> first + second),
    MINUS("-", (first, second) -> first - second),
    MULTIPLY("*", (first, second) -> first * second),
    DIVIDE("/", (first, second) -> first / second);

    private String symbol;
    private BiFunction<Integer,Integer,Integer> function;

    public static Operator findBySymbol(String symbol) {
        return Arrays.stream(values())
                .filter(operator -> operator.symbol.equals(symbol))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("해당 연산자는 존재하지 않습니다."));
    }

    public int operate(int first, int second) {
        return function.apply(first, second);
    }

    Operator(String symbol, BiFunction<Integer, Integer, Integer> function) {
        this.symbol = symbol;
        this.function = function;
    }
}
