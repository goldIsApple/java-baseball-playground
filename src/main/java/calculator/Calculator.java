package calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Calculator {

    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private final String operator;
    private final BiFunction<Integer, Integer, Integer> biFunction;

    Calculator(final String operator, final BiFunction<Integer, Integer, Integer> biFunction) {
        this.operator = operator;
        this.biFunction = biFunction;
    }

    public static int calculate(final String operator,final int num1,final int num2){
        final Calculator calculator = Arrays.stream(Calculator.values())
                .filter(c -> c.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("연산자 를 정확히 입력해주시기 바랍니다."));
        return calculator.biFunction.apply(num1 , num2);
    }

}
