package baseball;

import java.util.Scanner;
import java.util.regex.Pattern;

import static baseball.BaseballGame.*;

public class BaseballGameInputView{

    private static BaseballGameInputView baseballGameView;
    private final Scanner scanner = new Scanner(System.in);

    private BaseballGameInputView(){}

    public static BaseballGameInputView getInstance(){
        if(baseballGameView==null){
            baseballGameView = new BaseballGameInputView();
        }
        return baseballGameView;
    }

    public int inputNumber(){
        inputPrint();
        final int number = scanner.nextInt();
        validate(number);
        return number;
    }

    public boolean isContinue(){
        gameOverPrint();
        if(scanner.nextInt() == 1){
            return true;
        }
        return false;
    }

    private void validate(int number){
        String regex = String.format("^[1-9]{%d}$" , NUMBER_SIZE);
        final Pattern pattern = Pattern.compile(regex);
        if(!pattern.matcher(String.format("%s", number)).matches()){
            throw new IllegalArgumentException("백의 자리 숫자만 입력 가능합니다.");
        }
    }

    private void inputPrint(){
        System.out.println("숫자를 입력해 주세요 : ");
    }

    private void gameOverPrint(){
        System.out.println(NUMBER_SIZE+"개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
