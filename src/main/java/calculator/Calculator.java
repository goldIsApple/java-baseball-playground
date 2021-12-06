package calculator;

public class Calculator {

    private final Formula formula;
    private Operator operator = Operator.PLUS;

    public Calculator(String input) {
        formula = new Formula(input);
    }
    public int calculate() {
        int result = 0;
        for (int i = 0; i < formula.size(); i++) {
            String input = formula.get(i);
            if(isEven(i)){
                result = operator.operate(result, Integer.parseInt(input));
                continue;
            }
            operator = Operator.findBySymbol(input);
        }
        return result;
    }

    private boolean isEven(int i) {
        return i % 2==0;
    }
}
