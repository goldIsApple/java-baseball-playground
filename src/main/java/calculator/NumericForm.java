package calculator;

import java.util.regex.Pattern;

public class NumericForm {

    private String value;
    private String[] values;
    public NumericForm(String value) {
        isValidate(value);
        this.values = toArrayByWhiteSpace(value);
        this.value = value;
    }

    public int getAnswer(){
        return 0;
    }

    private String[] toArrayByWhiteSpace(String value) {
        String[] split = value.split("\\s");
        Pattern pattern = Pattern.compile("^0[0-9]+");
        for (int i = 0; i < split.length; i+=2) {
            if(pattern.matcher(split[i]).matches()){
                throw new IllegalArgumentException("0으로 시작할수 없습니다.");
            }
        }
        return split;
    }

    private void isValidate(String value) {
        if(value==null){
            throw new IllegalArgumentException("문자열을 입력해주시기 바랍니다.");
        }
        Pattern pattern = Pattern.compile("(\\d+\\s[\\-+*/]\\s)+\\d+$");
        if(!pattern.matcher(value).matches()){
            throw new IllegalArgumentException("부적합한 문자열이 포함되어 있습니다.");
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
}
