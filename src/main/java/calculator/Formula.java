package calculator;

import java.util.regex.Pattern;

public class Formula {
    private static final Pattern pattern = Pattern.compile("(^\\d+\\s{1}[\\-+*/]+\\s{1})*\\d$");
    private static final String WHITE_SPACE = "\\s";
    public static final String ERROR_MESSAGE = "수식 입력은 숫자 공백 연산자(+-*/) 숫자 입니다. 입력한 연산자 : %s";

    private final String formula[];
    public Formula(String input) {
        validate(input);
        formula = input.split(WHITE_SPACE);
    }

    private void validate(String input) {
        if(!pattern.matcher(input).matches()){
            throw new IllegalArgumentException(String.format(ERROR_MESSAGE,input));
        }
    }

    public int size() {
        return formula.length;
    }

    public String get(int i) {
        return formula[i];
    }
}
