package baseball;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BaseballGameResultView{

    private static BaseballGameResultView baseballGameResultView;

    private BaseballGameResultView(){}

    public static BaseballGameResultView getInstance(){
        if(baseballGameResultView==null){
            baseballGameResultView = new BaseballGameResultView();
        }
        return baseballGameResultView;
    }

}
