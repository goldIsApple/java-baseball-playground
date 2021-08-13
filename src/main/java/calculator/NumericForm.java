package calculator;

import java.util.regex.Pattern;

public class NumericForm {

    private final String[] values;
    public NumericForm(final String value) {
        isValidate(value);
        this.values = toArrayByWhiteSpace(value);
    }

    public int getAnswer(){
        int num1 = Integer.parseInt(values[0]);
        int result= 0;
        for (int i = 1; i < values.length ; i+=2) {
            String operator = values[i];
            int num2 = Integer.parseInt(values[i + 1]);
            result = Calculator.calculate(operator , num1 , num2);
            num1 = result;
        }
        return result;
    }

    private String[] toArrayByWhiteSpace(String value) {
        final String[] split = value.split("\\s");
        final Pattern pattern = Pattern.compile("^0[0-9]+");
        for (int i = 0; i < split.length; i+=2) {
            if(pattern.matcher(split[i]).matches()){
                throw new IllegalArgumentException("0으로 시작할수 없습니다.");
            }
        }
        return split;
    }

    private void isValidate(final String value) {
        if(value==null){
            throw new IllegalArgumentException("문자열을 입력해주시기 바랍니다.");
        }
        final Pattern pattern = Pattern.compile("(\\d+\\s[\\-+*/]\\s)+\\d+$");
        if(!pattern.matcher(value).matches()){
            throw new IllegalArgumentException("부적합한 문자열이 포함되어 있습니다.");
        }
    }

    public String[] getValues() {
        return values;
    }
}
